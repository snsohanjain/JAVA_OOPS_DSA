package Encapsulation;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone7plus = new Iphone(IphoneModel.IPHONE_7_PLUS,55000,false);
        Iphone iphone8 = new Iphone(IphoneModel.IPHONE_8,30000,false);
        Iphone iphone14 = new Iphone(IphoneModel.IPHONE_14,120000,true);

        System.out.println(iphone7plus);
        System.out.println(iphone8);
        System.out.println(iphone14);

        System.out.println(iphone14.getModel().getModelStr());
        iphone7plus.setPrice(52000);

        System.out.println(iphone7plus.getModel());
        System.out.println(iphone7plus.getPrice());
        System.out.println(iphone7plus.isWaterResistant());

    }
}
