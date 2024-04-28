package tests.day05;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_JUnitOtomatikRaporlama {
/*
Junit Frameworkunda bir class veya test metodu çalıştırıldığında Junit tüm class veya istenen methodun sorunsuz olarak
sonuna kadar çaılışıp çalışmadığını kontrol eder.
sorunsuz çalışırsa Test Passed, değilse Failed olur.

Eğer if-else ile yaptığımız testlerde JUnitin raporlarının
 */

    @Test
    public void amazonTesti() {
        // amazon'a gidelim ve url'in amazon icerdigini test edip

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        String expectedUrlIcerik = "amazon";
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
    public void wisequarterTesti() {
        // Wise quarter anasayfaya gidip

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.wisequarter.com");
        // Title'in Wise Quarter icerdigini test edin
        String expectedTitleIcerik = "Wise Quarter";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Wise Quarter title testi PASSED");
        } else {
            System.out.println("Wise Quarter title testi FAILED");
        }
        // ve sayfayi kapatin
        driver.close();
    }
}
