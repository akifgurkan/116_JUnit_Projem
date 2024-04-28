package tests.day12_screenshot_isExecutor;

import org.junit.Assert;
import org.junit.Test;
import utilities.ReusableMethods;
import utilities.TestBase;
public class C01_ReusableMethodsTumSayfaSS extends TestBase {

    @Test
    public void test01(){

        // linkedin profil sayfasına gidin
        driver.get("https://www.linkedin.com/in/akifgurkan/");

        // url'in wise akifgurkan test edin
        String expectedUrlIcerik="akifgurkan";
        String actualUrl= driver.getCurrentUrl();
        System.out.println("actualUrl : " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // tum sayfa screenshot alin
       ReusableMethods.tumSayfaFotoCek(driver);

    }
}
