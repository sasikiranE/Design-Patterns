package creational.simplefactory;

public class CSVExporter implements FileExporter {
    public void export(String message) {
        System.out.println("CSV export :" + message + " Successful");
    }
}