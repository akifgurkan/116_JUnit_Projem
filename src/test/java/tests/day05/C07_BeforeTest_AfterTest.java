package tests.day05;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_BeforeTest_AfterTest {

    /*
  @Before ile isaretlenmis method her test methodundan once calisir
  @After ile isaretlenmis method her test methodundan sonra calisir
     */
    WebDriver driver;

    @Test
    public void amazonTesti() {

        // amazon'a gidelim ve url'in amazon icerdigini test edip
        driver.get("https://www.amazon.com");

        String expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Amazon url testi PASSED");
        } else {
            System.out.println("Amazon url testi FAILED");
        }

    }

    @Test
    public void youtubeTesti() {
        //youtube anasayfaya gidin toutube titlenin YouTube olduğunu test edin


        driver.get("https://www.youtube.com");
        driver.getTitle();

        // Title'in YouTube icerdigini test edin
        String expectedTitleIcerik = "YouTube";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("youtube title testi PASSED");
        } else {
            System.out.println("youtube title testi FAILED");

        }
    }

    @Before
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() {

        driver.close();
    }
}

