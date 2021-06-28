package pages;

import helpers.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {

    private final By dogsTab  = By.id("mtd_300");
    private final By carsTab  = By.id("mtd_97");

    public void openHomePage(){
        driver.get("https://www.ss.lv/");

    }

    public void openSpecificTab(String tabName) {
        if("Dogs".equals(tabName)) {
        driver.findElement(dogsTab).click();
    }   else if("Cars".equals(tabName)) {
            driver.findElement(carsTab).click();
        }

    }
}

