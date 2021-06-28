package pages;

import helpers.Common;
import org.openqa.selenium.By;

public class DogsPage extends Common {

    private final By minPrice = By.xpath("//*[@id=\"f_o_8_min\"]");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minAge = By.id("f_o_1276_min");
    private final By maxAge = By.id("f_o_1276_max");
    private final By searchButton = By.xpath("//input[@class='b s12']");

    public void fillMinPriceAndMaxPrice(String min, String max) {
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }

    public void fillMinAgeAndMaxAge(String min, String max) {
        driver.findElement(minAge).sendKeys(min);
        driver.findElement(maxAge).sendKeys(max);
    }

    public void pressSearchButton(){
        driver.findElement(searchButton).click();
    }


}
