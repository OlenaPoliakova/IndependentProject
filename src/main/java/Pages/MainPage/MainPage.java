package Pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public final WebDriver driver;

    public MainPage(WebDriver driver) {this.driver = driver;}

    private final By fantasticPage = By.xpath("//a[@href='/genre/fantastika']");

    public void clickFantasticPage(){driver.findElement(fantasticPage).click();}
}
