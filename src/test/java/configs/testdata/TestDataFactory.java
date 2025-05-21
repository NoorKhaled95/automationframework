package configs.testdata;

public class TestDataFactory {

    public static TestData getTestData(String branch, String language) {
        String testDataFileName;
        if (branch.equalsIgnoreCase("staging")) {
            if (language.equalsIgnoreCase("arabic")) {
                testDataFileName = "stagingArabic.json";
            } else {
                testDataFileName = "stagingEnglish.json";
            }
        } else {
            if (language.equalsIgnoreCase("arabic")) {
                testDataFileName = "productionArabic.json";
            } else {
                testDataFileName = "productionEnglish.json";
            }
        }
        return new TestData(testDataFileName);
    }
}
