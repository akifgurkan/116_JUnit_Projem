package tests.day05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        ***************************************************************************************
        NOT: selenium-java 4.11.0 versiyonundan itibaren bonigarciaya gerek kalmadan
       " WebDriver driver = new ChromeDriver(); " gibi  kullanarak driverları yükleyebiliriz.
       ***************************************************************************************

            Tum sirketler Selenium WebDriver'i kullanmayabilir
            Sirketlerde eskiden beri kullanilan bir WebDriver varsa
            onu projemize eklememiz ve kullanmamiz istenebilir

            Boyle bir durumda istenen WebDriver'i da
            pom.xml'e eklememiz gerekir
            pom.xml'e ekledikten sonra her class'da
            WebDriver objesi olusturmadan once
            yukledigimiz WebDriver ile ilgili setup'i calistirmaliyiz
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.close();
    }
}