package homework_nr_6;

public class Invoice {

    private String modelName;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String modelName, String description, int quantity, double price) {
        this.modelName = modelName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        double Amount = price * quantity;
        if (price < 0) Amount = 0D;
        if (quantity < 0) Amount = 0D;
        return Amount;

    }
}
