package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class P14_fileUpload extends TestBase {

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).click();
    }
}
