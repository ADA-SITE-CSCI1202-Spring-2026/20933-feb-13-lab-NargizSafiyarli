package week03.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(double pricePerItem, int quantity, String partDescription, String partNumber) {
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.partDescription = partDescription;
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}


