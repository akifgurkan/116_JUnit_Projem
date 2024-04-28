package tests.day08_iFrame_windovs_actionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C_Dene extends TestBase {

    @Test
            public void test1(){
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        // 2) Sayfadaki iframe sayısını bulunuz
        int iframeCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeCount);

        // 3) İlk iframe'deki (Youtube) play butonuna tıklayınız
        driver.switchTo().frame(0); // İlk iframe'e geçiş yapma
        WebElement playButton = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button"));
        playButton.click();
        bekle(3);

        // 4) İlk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent(); // Ana sayfaya geri dönme

        // 5) İkinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().frame(1); // İkinci iframe'e geçiş yapma
        WebElement link = driver.findElement(By.xpath("/html/body/a/img"));
        link.click();

        driver.quit();
    }

}