import creational.factory.ExportService;

public class Main {
    public static void main(String[] args) {
        ExportService exportService = new ExportService();
        exportService.export("PDF", "Design patterns");
    }
}