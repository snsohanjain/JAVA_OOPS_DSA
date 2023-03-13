package FileReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {

        //File Writer --> 1
        String fileName = "src/FileReadAndWrite/data.csv";
        File file = new File(fileName);

        if(!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " Created");
            } catch (IOException e) {
                System.out.println("Error wile creating file");
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("id,name,email");
            printWriter.println("1,Sohan, snsohanjain@gmail.com");
            printWriter.println("2,Jain, snsohanjain@gmail.com");
            printWriter.close();
            printWriter.flush();
            System.out.println("Contents added to the file");
        }catch (IOException e){
            System.out.println(e);
        }

        //File Reader --> Method for Terminal
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String contents = "";
            while ((contents = reader.readLine()) != null){
                System.out.println(contents);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //File Reader --> Method for User class
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = "";
            // This will Split the top Line of the File -->
            System.out.println("header = " + reader.readLine());
            List<User> users = new ArrayList<>();

            //This Will Execute the file reader to the user class
            while ((line = reader.readLine()) != null){
                String [] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];
                User user = new User(id,name,email);
                users.add(user);
            }
            reader.read();
            System.out.println("Looping Through the user");
            users.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
