import helpers.Common;
import org.junit.Test;
import pages.DogsPage;
import pages.HomePage;
import pages.CarsPage;

public class SSlvDemoPom {

    Common common = new Common();
    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();
    CarsPage carsPage = new CarsPage();

    @Test
    public void suniUnKuceniTest() {
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Dogs");
        dogsPage.fillMinPriceAndMaxPrice("1", "100");
        dogsPage.fillMinAgeAndMaxAge("2", "12");
        dogsPage.pressSearchButton();
        common.stopChrome();
    }

    @Test
    public void carsFilterTest(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openSpecificTab("Cars");
        carsPage.fillMinAndMaxYear("2000", "2020");
        carsPage.fillEngineType("Hybrid");
        carsPage.enginePowerMinAndMax("1.0","3.0");
        carsPage.fillGearShift("Automats");
        carsPage.fillCarsColor("Balta");
        carsPage.fillModelType("Apvidus");
        common.stopChrome();
    }


}
