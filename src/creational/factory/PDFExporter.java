package creational.factory;

public class PDFExporter implements FileExporter {
    public void export(String message) {
        System.out.println("PDF export :" + message + " Successful");
    }
}