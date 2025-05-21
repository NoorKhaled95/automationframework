package configs.testdata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TestData {
    private JsonNode testData;

    public TestData(String fileName){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            testData = objectMapper.readTree(new File("src/test/java/configs/testdata/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JsonNode getUserData(String validUser) {
        return testData;
    }

    public String getBaseUrl(String branch, String language) { // e.g., "sellenvo_staging"
        if (testData != null && testData.has("baseUrl") && testData.get("baseUrl").has(branch) && testData.get("baseUrl").get(branch).has(language)) {
            return testData.get("baseUrl").get(branch).get(language).asText();
        }
        return null;
    }
}

