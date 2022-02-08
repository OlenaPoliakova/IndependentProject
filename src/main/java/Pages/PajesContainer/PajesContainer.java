package Pages.PajesContainer;

import Pages.MainPage.FantasticPage.FantasticPageContainer.FantasticPageContainer;
import Pages.MainPage.MainPage;
import Pages.MainPageContainer.MainPageContainer;
import SeleniumTest.SeleniumTest;
import SeleniumTest.Services.Properties;
import org.openqa.selenium.WebDriver;



public class PajesContainer extends SeleniumTest {

    public MainPage mainPage = new MainPage(driver);
    public MainPageContainer mainPageContainer = new MainPageContainer();
}
