package creational.simplefactory;

public class ExportService {

    public void export(String type, String message) {
        FileExporter fileExporter = FileExporterCreator.create(type);
        fileExporter.export(message);
    }
}