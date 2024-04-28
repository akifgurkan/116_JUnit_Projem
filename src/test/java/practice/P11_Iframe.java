package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.TestBaseQuit;

public class P11_Iframe extends TestBaseQuit {
    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement sayfadakiYazielementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(sayfadakiYazielementi.isDisplayed());
        System.out.println(sayfadakiYazielementi.getText());

        // ifarme olan sayfada ifame içindeki bir şeyi test edebilmek için önce iframe çercevesine geçmeliyiz
        WebElement iframeElementi = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElementi);

        WebElement ifameYazisi = driver.findElement(By.tagName("p"));
        String ifameYazisiText = ifameYazisi.getText();
        System.out.println(ifameYazisiText);

    }

}
