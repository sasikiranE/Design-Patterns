package creational.simplefactory;

public class XLSXExporter implements FileExporter {
    public void export(String message) {
        System.out.println("XLSX export :" + message + " Successful");
    }
}