package practice;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class P13_FakerClass extends TestBase {
    @Test
    public void test01() {
        // https://automationexercise.com/ adresine gidin
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[@href='/login']")).click();

       WebElement emailKutusu= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
       WebElement isimKutusu= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));

        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String isim = faker.name().fullName();


        Actions actions = new Actions(driver);
        actions.click(isimKutusu);

        Select select = new Select(isimKutusu);


    }

}
