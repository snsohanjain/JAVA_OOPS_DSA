import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SOHANJAIN", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("sohanjain!");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("Match Not Found");
        }
    }
}
