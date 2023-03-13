package Encapsulation;

public class Iphone {
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    public Iphone() {
        this(IphoneModel.IPHONE_7_PLUS,0,false);
    }
    public Iphone(IphoneModel model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public Iphone(IphoneModel model) {
        this(model,0,false);
        this.model = model;
    }

    public Iphone(IphoneModel model, double price) {
        this(model,price,false);
        this.model = model;
        this.price = price;
    }

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone.Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
