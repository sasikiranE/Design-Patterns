package creational.simplefactory;

public class FileExporterCreator {
    public static FileExporter create(String type) {
        return switch (type) {
            case "PDF" -> new PDFExporter();
            case "CSV" -> new CSVExporter();
            case "XLSX" -> new XLSXExporter();
            case null, default -> throw new IllegalArgumentException("Invalid argument passed");
        };
    }
}
