package tests.day06;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RadioButton {

    // a. Verilen web sayfasına gidin.
    // https://facebook.com
    // b. Cookies’i kabul edin
    // c. Create an account buton’una basin
    // d. Radio button elementlerini locate edin ve size uygun olani secin
    // e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin


    WebDriver driver;
    @Before
    public void setup(){ // setup methodu driver'i baslatir
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void face(){ // face methodu testi yapar
        driver.get("http://facebook.com");
        WebElement create = driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
        create.click();
        WebElement erkek = driver.findElement(By.xpath("(//*[@value=\"2\"])[3]"));
        erkek.click();
        WebElement kadin = driver.findElement(By.xpath("//*[text()=\"Kadın\"]"));
        WebElement ozel = driver.findElement(By.xpath("//*[text()=\"Özel\"]"));

        Assert.assertTrue(erkek.isSelected());
        Assert.assertFalse(kadin.isSelected());

        Assert.assertFalse(ozel.isSelected());
  //    Assert.assertTrue(!ozel.isSelected()); // Bu da aynı işlemi yapar

    }

    @After
    public void tearDown(){ // tearDown methodu driver.quit() yapar
        driver.close();
    }

}
