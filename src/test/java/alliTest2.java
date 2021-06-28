import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alliTest2 {

    @Test
    public void tattooFiltration() {

        String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
//    driver.switchTo().frame("pc_1455_24317_20200925");
        driver.findElement(By.xpath("/html/body/div[5]/div/div/img[2]")).click();
//    driver.switchTo().parentFrame();
//    driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("tattoo");
//    driver.findElement(By.xpath("//input[@class='search-button']")).click();
//    driver.findElement(By.xpath("//input[@placeholder='min']")).click();
//    driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
//    driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
//    driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
//    driver.quit();


    }

}
