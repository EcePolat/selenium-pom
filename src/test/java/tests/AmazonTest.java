package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("arananKelime") + Keys.ENTER);

        String aramaSonucu = amazonPage.aramaSonucElementi.getText();
    }

}
