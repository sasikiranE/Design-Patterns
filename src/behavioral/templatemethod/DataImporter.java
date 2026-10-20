package behavioral.templatemethod;

import java.util.List;

public abstract class DataImporter {

    // template method
    public final void importFile(String filePath) {
        byte[] fileData = readFile(filePath);
        List<String> parsedData = parseFile(fileData);
        System.out.println(summary(parsedData));
    }

    // hook
    private byte[] readFile(String filePath) {
        // default reading file implementation
        return new byte[0];
    }

    // abstract method
    abstract List<String> parseFile(byte[] fileBytes);

    // hook
    private String summary(List<String> data) {
        return String.format("Summary : %s", data);
    }

}
