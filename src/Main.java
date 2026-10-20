import behavioral.templatemethod.CsvDataImporter;
import behavioral.templatemethod.DataImporter;
import behavioral.templatemethod.JsonDataImporter;

public class Main {
    public static void main(String[] args) {
        DataImporter jsonDataImporter = new JsonDataImporter();
        jsonDataImporter.importFile("json file path");
        DataImporter csvDataImporter = new CsvDataImporter();
        csvDataImporter.importFile("csv file path");
    }
}