package tests.day05;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_JUnitTestNotasyonu {
    /*
          Junit'in bize kazandirdigi en onemli yeniliklerden biri
          @Test notasyonudur.

          Notasyon (annotation) kucuk bilgiler(meta data) barindiran yapilardir.
          sadece bir yazi ya da gosterim degillerdir
          yaptiklari islemler vardir

          @Test notasyonu siradan bir method'u
          tek basina calistirilabilir bir test method'una donusturur

          JUnit ile test method'lari istersek tek basina,
          istersek de class level'dan calistirilip
          tum testlerin birlikte calisabilecegi bir yapiya donusur.

          JUnit class icerisindeki test method'larini
          belirsiz bir sirada calistirir.
          Test method'larinin hangi sira ile calisacagini
          ONGOREMEYIZ ve DUZENLEYEMEYIZ
       */
    // Bir class'da 3 farkli test olsa
    // ve ben testleri istersem toplu, istersem bagimsiz olarak calistirabilirim
    // bunun icin test methodlarini ayirt etmek icin @Test notasyonu kullanilir
    // @Test notasyonu test methodu oldugunu belirtir
    // @Test notasyonu import edilirken org.junit.Test seklinde import edilmelidir
    // @Test notasyonu her test methodu icin tek tek yazilmalidir
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
        // https://www.linkedin.com/in/akifgurkan/ sayfaya gidip

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.linkedin.com/in/akifgurkan/");
        // Title'in Akif Gürkan icerdigini test edin
        String expectedTitleIcerik = "Akif G.";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Akif Gürkan title testi PASSED");
        } else {
            System.out.println("Akif Gürkan title testi FAILED");
        }
        // ve sayfayi kapatin
        driver.close();
    }
}
