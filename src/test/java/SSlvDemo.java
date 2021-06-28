
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SSlvDemo {

    @Test
    public void suniUnKuceni() throws InterruptedException {
        String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_300")).click();
        //driver.findElement(By.id("f_o_8_min")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"f_o_8_min\"]")).sendKeys("11");
        driver.findElement(By.id("f_o_8_max")).sendKeys("2");
        Thread.sleep(3000); // wait time
        driver.findElement(By.id("f_o_1276_min")).sendKeys("3");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("4");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();
    }

    @Test
    public void carsTest() {
        String driverPath = "C:\\Users\\Priedza\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_97")).click();

        Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
        yearMin.selectByVisibleText("2007");
        Select yearMax = new Select(driver.findElement(By.id("f_o_18_max")));
        yearMax.selectByVisibleText("2014");
        Select enginePowerMin = new Select(driver.findElement(By.id("f_o_15_min")));
        enginePowerMin.selectByVisibleText("1.1");
        Select enginePoerMax = new Select(driver.findElement(By.id("f_o_15_max")));
        enginePoerMax.selectByValue("3.0");
        Select carType = new Select(driver.findElement(By.id("f_o_34")));
        carType.selectByValue("7434");
        Select gearsift = new Select(driver.findElement(By.id("f_o_35")));
        gearsift.selectByVisibleText("Automāts");
        Select modelType = new Select(driver.findElement(By.id("f_o_32")));
        modelType.selectByVisibleText("Apvidus");
        Select carColor = new Select(driver.findElement(By.id("f_o_17")));
        carColor.selectByVisibleText("Balta");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();
    }

}
