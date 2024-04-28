package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P12_KeyboardActions extends TestBase {

    @Test
    public void test01() {
      // amazon.com adresine gidin
      driver.get("https://www.amazon.com");

     // iPhone XR araması yapın
        Actions actions = new Actions(driver);
      WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
 actions.click(aramaKutusu).keyUp(Keys.SHIFT).sendKeys("i").keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("hone").sendKeys(Keys.ENTER).perform();
WebElement ak= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));
        System.out.println(ak.getText());


    }
}
