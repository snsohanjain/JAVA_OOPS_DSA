package Encapsulation;

public enum IphoneModel {
    IPHONE_7_PLUS("Iphone.Iphone 7+"),
    IPHONE_8("Iphone.Iphone 8"),
    IPHONE_14("Iphone.Iphone 8");
    private String modelStr;
    IphoneModel(String modelStr) {
        this.modelStr = modelStr;
    }
    public String getModelStr() {
        return modelStr;
    }
}
