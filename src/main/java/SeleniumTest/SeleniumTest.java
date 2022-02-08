package SeleniumTest;

import Pages.PajesContainer.PajesContainer;
import SeleniumTest.Services.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static WebDriver driver = new ChromeDriver();
    public PajesContainer pajesContainer = new PajesContainer();
    private static String webdriverPath;
    private static String startURL;
    private final String getWebdriverPath = webdriverPath;
    private final String getStartURL = startURL;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void  seleniumTestInit(){
        System.setProperty("webdriver.chrome.driver", webdriverPath);
        getDriver().manage().window().maximize();
        String.format(startURL);
        getDriver().get(startURL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeWebDriver(){
        getDriver().quit();
    }




}
