class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}
//class Invoice {
//    private Marker marker;
//    private int quantity;
//
//    public Invoice(Marker marker, int quantity) {
//        this.marker = marker;
//        this.quantity = quantity;
//    }
//    public int calculateTotal() {
//        int price = ((marker.price) * this.quantity);
//        return price;
//    }
//    public void printInvoice() {
//        //print the invoice
//    }
//
//    public void saveToDB() {
//        //save the data into DB
//    }
//
//}

//Now this class have multiple reason to change but to satisy the principle there is only one reason.
//we can divide the above clas in three different class.
class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }
}

class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveToDB() {
        //save the data into DB
    }
}

class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void printInvoice() {
        //print the invoice
    }

}
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

    }
}
