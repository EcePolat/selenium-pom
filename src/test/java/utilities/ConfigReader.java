package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties = new Properties();

    static {
        String dosyaYolu = "src/test/resources/config.properties";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties.load(fis); // 🔹 Eksik kısım burası
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
