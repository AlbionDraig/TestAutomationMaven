package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigIni {
    private Properties properties;

    public ConfigIni(String configFile) {
        properties = load(configFile);
    }

    public String getElementLocator(String elementName) {
        return properties.getProperty(elementName);
    }

    private Properties load(String configFile) {
        Properties properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configFile)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not load configuration file: " + configFile);
        }
        return properties;
    }
}