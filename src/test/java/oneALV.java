import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class oneALV {

    @Test
    public void oneAlv() {
        String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");

        driver.findElement(By.id("q")).sendKeys("Lenovo");
        //driver.findElement(By.className("main-search-submit")).click(); 1.variants
        driver.findElement(By.cssSelector(".main-search-submit")).click(); //2.variants
       // driver.findElement(By.xpath("//button[@class='main-search-submit']")).click(); 3,variants


    }
}
