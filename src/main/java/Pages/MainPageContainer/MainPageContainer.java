package Pages.MainPageContainer;

import Pages.MainPage.FantasticPage.FantasticPage;
import Pages.MainPage.FantasticPage.FantasticPageContainer.FantasticPageContainer;
import SeleniumTest.SeleniumTest;
import org.openqa.selenium.WebDriver;


public class MainPageContainer extends SeleniumTest {

    public FantasticPage fantasticPage = new FantasticPage(driver);
    public FantasticPageContainer fantasticPageContainer = new FantasticPageContainer();
}
