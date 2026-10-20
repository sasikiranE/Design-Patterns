package behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class JsonDataImporter extends DataImporter {
    @Override
    List<String> parseFile(byte[] fileBytes) {
        List<String> parsedData = new ArrayList<>(0);
        parsedData.add("JSON data");
        return parsedData;
    }
}
