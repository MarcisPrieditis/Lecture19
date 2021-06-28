package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends Common {

    private final By minYear = By.id("f_o_18_min");
    private final By maxYear = By.id("f_o_18_max");
    private final By engineTypeSelector = By.id("f_o_34");
    private final By minPower = By.id("f_o_15_min");
    private final By maxPower = By.id("f_o_15_max");
    private final By gearShiftSelector = By.id("f_o_35");
    private final By modelType = By.id("f_o_32");
    private final By carsColorSelector = By.id("f_o_17");


    public void fillMinAndMaxYear(String min, String max){
        Select yearMin = new Select(driver.findElement(minYear));
        yearMin.selectByVisibleText(min);
        Select yearMax = new Select(driver.findElement(maxYear));
        yearMax.selectByVisibleText(max);

    }

    public void fillEngineType(String chooseEngineType){
        Select engineType = new Select(driver.findElement(engineTypeSelector));
        if("Hybrid".equals(chooseEngineType)) {
            engineType.selectByValue("7434");
        } else if("Benzins".equals(chooseEngineType)){
            engineType.selectByValue("493");
        }
    }

    public void enginePowerMinAndMax(String min, String max) {
        Select enginePowerMin = new Select(driver.findElement(minPower));
        enginePowerMin.selectByVisibleText(min);
        Select enginePoerMax = new Select(driver.findElement(maxPower));
        enginePoerMax.selectByValue(max);
    }

    public void fillGearShift(String chooseGearShift){
        Select gearShiftStyle = new Select(driver.findElement(gearShiftSelector));
        if("Automats".equals(chooseGearShift)) {
            gearShiftStyle.selectByValue("497"); //automāts
        } else if("Manuals".equals(chooseGearShift)){
            gearShiftStyle.selectByValue("496");; //manuāls
        }
    }

    public void fillModelType(String chooseModelType){
        Select carsType = new Select(driver.findElement(modelType));
        if("Apvidus".equals(chooseModelType)) {
            carsType.selectByValue("477");
        } else if("Kupeja".equals(chooseModelType)){
            carsType.selectByValue("487");;
        } else if("Minivens".equals(chooseModelType)){
            carsType.selectByValue("476");;
        }
    }

    public void fillCarsColor(String chooseCarsColor){
        Select carsColor = new Select(driver.findElement(carsColorSelector));
        if("Balta".equals(chooseCarsColor)) {
            carsColor.selectByValue("6318");
        } else if("Brūna".equals(chooseCarsColor)){
            carsColor.selectByValue("6319");;
        } else if("Dzeltena".equals(chooseCarsColor)){
            carsColor.selectByValue("6311");;
        }
    }

}
