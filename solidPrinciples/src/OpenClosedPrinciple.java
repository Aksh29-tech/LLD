//class InvoiceDao1 {
//    Invoice invoice;
//    public InvoiceDao1(Invoice invoice) {
//        this.invoice = invoice;
//    }
//    public void saveToDB() {
//        //save the data into DB
//    }
//    public void saveToFile(String filename) {
//        //save the data int the file with the given name
//    }
//}

//It is not following the principle because we modified the class and according to principle we can extend but can't
//modify the existing class.

interface InvoiceDao1 {
    public void save(Invoice invoice);
}
class DatabaseInvoiceDao implements InvoiceDao1 {
    @Override
    public void save(Invoice invoice) {
        //save to DB
    }
}
class FileInvoiceDao implements InvoiceDao1 {
    @Override
    public void save(Invoice invoice) {
        //save to file
    }
}
public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}
