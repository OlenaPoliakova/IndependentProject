package TestFindQingQingDoram;

import SeleniumTest.SeleniumTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestFindQingQingDoram extends SeleniumTest {


    @Test
    public void checkDoramasName(){

        pajesContainer.mainPage.clickFantasticPage();
        pajesContainer.mainPageContainer.fantasticPage.clickDoramsName();
        pajesContainer.mainPageContainer.fantasticPageContainer.qingQingInMyHeart.compareNames();
    }
}
