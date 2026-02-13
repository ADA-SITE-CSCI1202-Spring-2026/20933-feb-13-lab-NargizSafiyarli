package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("20288NS", "Dress", 2, 79.99);

        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getPricePerItem());
        System.out.println("Total Amount: " + invoice1.getInvoiceAmount());
        System.out.println();

        Invoice inv2 = new Invoice("10888SS", "Trousers", -7, -29.99);

        System.out.println("Invoice 2 (invalid inputs):");
        System.out.println("Part Number: " + inv2.getPartNumber());
        System.out.println("Description: " + inv2.getPartDescription());
        System.out.println("Quantity: " + inv2.getQuantity());
        System.out.println("Price per item: " + inv2.getPricePerItem());
        System.out.println("Total Amount: " + inv2.getInvoiceAmount());
        System.out.println();
    }
}
