package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File file = new File("C:\\Users\\Daytona\\IdeaProjects\\dockerizeApiAutomation\\src\\main\\resources\\Application.Properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
    }

    public String getEndpointUrl(){
        return properties.getProperty("petInfoForId");
    }
}
