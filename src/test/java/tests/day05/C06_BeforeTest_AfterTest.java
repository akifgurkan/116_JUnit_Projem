package tests.day05;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_BeforeTest_AfterTest {
    WebDriver driver;

    @Test
    public void amazonTesti() {

        // amazon'a gidelim ve url'in amazon icerdigini test edip
        setup();

        driver.get("https://www.amazon.com");

        String expectedUrlIcerik = "ramazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Amazon url testi PASSED");
        } else {
            System.out.println("Amazon url testi FAILED");
        }

        // sayfayi kapatin
        driver.close();
    }


@Test
    public void youtubeTesti() {
        //youtube anasayfaya gidin toutube titlenin YouTube olduğunu test edin
        setup();

        driver.get("https://www.youtube.com");
        driver.getTitle();

        // Title'in youtube icerdigini test edin
        String expectedTitleIcerik = "YouTube";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("youtube title testi PASSED");
        } else {
            System.out.println("youtube title testi FAILED");
        }
    // sayfayi kapatin
    driver.close();
    }

    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
