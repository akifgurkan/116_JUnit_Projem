package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
import utilities.TestBaseQuit;

import java.sql.Driver;

public class P10_SwichTo extends TestBase {
    /*
    1. Gerekli ayarlamaları yapın
    2. google.com adresine gidin
    3. Google Titlesinin Google içerdiğini test edelim
    4. Yeni bir pencerede wiswquarter sayfasına gidin
    5. wiswquarter sayfasinın wise icerdiğini test edelim
         */
    @Test
    public void titleTest() throws InterruptedException {

     // 1. Gerekli ayarlamaları yapın

     // 2. google.com adresine gidin
     driver.get("https://www.google.com");
     String ilkSayfaWHD= driver.getWindowHandle();
        System.out.println("ilk sayfa whd: "+ ilkSayfaWHD);

        // 3. Google Titlesinin Google içerdiğini test edelim
        String expectedWord = "Google";
        String actualTitle = driver.getTitle();

      //  Assert.assertTrue(actualTitle.contains(expectedWord));
       Assert.assertTrue(expectedWord.contains(actualTitle));

     // 4. Yeni bir pencerede wisequarter sayfasına gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");

        String ikinciSayfaWHD= driver.getWindowHandle();
        System.out.println("ikinci WHD : "+ ikinciSayfaWHD);

        // 5. wiswquarter sayfasinın wise icerdiğini test edelim
        String expectedWord2 = "Wise Quarter";
        String actualTitle2 = driver.getTitle();

        Assert.assertTrue(actualTitle2.contains(expectedWord2));

    }

}
