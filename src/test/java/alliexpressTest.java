import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit; //wait time

// !!!!MAJAS DARBA KLUDU LABOJUMS IR KODA APAKSA, meginaju vnk kaut ko pilno versiju sataisit, neko nemaku, nesanak nekas.

public class alliexpressTest {



    @Test
        public void tattooSearch() {
            String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            ChromeDriver driver = new ChromeDriver();
            //driver.get("https://best.aliexpress.com/?lan=en&aff_fcid=136b1004f26441dab56a6269dce3b399-1622124207635-05150-nAeYz7Y&aff_fsk=nAeYz7Y&aff_platform=link-c-tool&sk=nAeYz7Y&aff_trace_key=136b1004f26441dab56a6269dce3b399-1622124207635-05150-nAeYz7Y&dp=43c6e4feee3212087a315b3d454e6fd9&terminal_id=0e068f3803484f33b41db8a158817504");
            driver.get("https://www.aliexpress.com");
        driver.switchTo().frame("pc_1455_24317_20200925").findElement(By.xpath("//*[@id=\"6216442440\"]/div/div/img")).click();
       // driver.manage().window().maximize(); // this command maximize window
//        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[9]/div/div")));
//        WebElement iFrame= driver.findElement(By.tagName("iframe"));
    // driver.switchTo().frame("/html/body/div[5]/div/div/img[1]");


       // driver.switchTo().defaultContent();
       // new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[9]/div/div/img[2]"))).click();

//  Meklesana, filtru selekciju
//        driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("tattoo");
//        driver.findElement(By.xpath("//input[@class='search-button']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='min']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
//        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
//        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
//        driver.quit();



        }
    }

//********************MAJAS DARBA KLUDU LABOJUMS*****************
//@Test
//public void TattooSearch() {
//    String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
//    System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
//    ChromeDriver driver = new ChromeDriver();
//
//    driver.get("https://www.aliexpress.com/");
//    driver.switchTo().frame("pc_1455_24317_20200925").findElement(By.xpath("//*[@id=\"6216442440\"]/div/div/img")).click();
//    driver.switchTo().parentFrame();
//    driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("tattoo");
//    driver.findElement(By.xpath("//input[@class='search-button']")).click();
//    driver.findElement(By.xpath("//input[@placeholder='min']")).click();
//    driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
//    driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
//    driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
//    driver.quit();
//}