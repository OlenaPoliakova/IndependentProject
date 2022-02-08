package Pages.MainPage.FantasticPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FantasticPage {
    public final WebDriver driver;

    public FantasticPage(WebDriver driver) {this.driver = driver;}

    private final By QingQingInMyHeartDoram = By.xpath("//a[@href='https://doramy.club/29228-cincin-v-moyom-serdce.html']");

    public void clickDoramsName(){driver.findElement(QingQingInMyHeartDoram).click();}
}
