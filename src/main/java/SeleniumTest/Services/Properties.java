package SeleniumTest.Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

    private static String webdriverPath;
    private static String startURL;

    static {
        assert false;
        System.setProperty("webdriver.chrome.driver", webdriverPath);}
    public WebDriver webDriver = new ChromeDriver();

    public Properties(){
        Properties.startURL = startURL;
    }







}
