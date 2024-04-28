package practice;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
//     BeforeClass ile driver'i oluşturun ve class icinde static yapin
//     Maximize edin ve 10 sn bekletin
//     http://www.qooqle.com adresine gidin
//   1-arama kutusuna "12 Angry Men" yaz ip, cikan sonuc şayisini yazdinin
//   2-arama kutusuna "Vizontele" yaz ip, cikan sonuc şayisini yazdirin
//   3-arama kutusuna "Saving Private Ryan" yaz4p, cikan sonuc şayisini yazdirin//  AfterClass ile kapatin.

    static WebDriver driver;
    WebElement searchbox;
    WebElement result;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Before
    public void before() {
        driver.get("https://www.google.com");
        searchbox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
    }

    @After
    public void after() {
        result = driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println(result.getText());
    }


    @Test
    public void test1() {
searchbox.sendKeys("12 angry mans"+ Keys.ENTER);
    }

    @Test
    public void test2() {
        searchbox.sendKeys("Vizontele"+Keys.ENTER);
    }

    @Test
    public void test3() {
        searchbox.sendKeys("saving private"+Keys.ENTER);
    }
}

