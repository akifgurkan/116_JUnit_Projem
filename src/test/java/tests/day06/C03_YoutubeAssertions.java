package tests.day06;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C03_YoutubeAssertions {
    //  2) https://www.youtube.com adresine gidin
    //  3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    //  ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    static WebDriver driver;
    @BeforeClass
    public static void setup(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }

    @Test
    public void titleTest(){
        //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Test
    public void imageTest(){
        //  ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement logoElementi = driver.findElement(By.xpath("(//a[@id = 'logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }
    @Test
    public void searchBoxTest(){
        //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'search']"));
        Assert.assertTrue(searchBox.isEnabled());
    }
    @Test
    public void wrongTitleTest(){
        //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String unUxpectedTitle = "youtube";
        String actualTitle = driver.getTitle();
       Assert.assertFalse(unUxpectedTitle.equals(actualTitle));

       // Assert.assertNotEquals(unUxpectedTitle,actualTitle);
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
}