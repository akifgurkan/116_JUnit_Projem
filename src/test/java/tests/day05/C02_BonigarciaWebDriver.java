package tests.day05;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BonigarciaWebDriver {
    public static void main(String[] args) throws InterruptedException {

           /*
        ***************************************************************************************
        NOT: selenium-java 4.11.0 versiyonundan itibaren bonigarciaya gerek kalmadan
       " WebDriver driver = new ChromeDriver(); " gibi  kullanarak driverları yükleyebiliriz.
       ***************************************************************************************

            */



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com.tr");
        System.out.println("Title actual :"+driver.getTitle());


        // Do While loop ile title'i belirtilen title'a esit olana kadar yazdirin
        do {
            System.out.println(driver.getTitle());
            Thread.sleep(1000);
        } while (!driver.getTitle().equals("Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi"));



        Thread.sleep(3000);
        driver.close();
    }
}