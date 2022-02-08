package Pages.MainPage.FantasticPage.QingQingInMyHeart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QingQingInMyHeart {
    public final WebDriver driver;

    public QingQingInMyHeart(WebDriver driver) {this.driver = driver;}

    private final By actualDoramsName = By.xpath("//h1");

    private String getActualDoramsName(){return driver.findElement(actualDoramsName).getText();}

    public boolean compareNames(){
        String expectedDoramasName = "Цинцин в моём сердце дорама (2021)";
        if(!expectedDoramasName.equals(getActualDoramsName())) {
            return false;
        }
        else {
            return true;
        }
    }
}
