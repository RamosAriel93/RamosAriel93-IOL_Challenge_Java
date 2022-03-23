package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;
import java.util.List;


public class BasePage extends TestBase {

    public static WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        super();
        webDriverWait = new WebDriverWait(driver,10);
    }

    public void clickButton(By locator){
        WebElement button = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        button.click();
    }

    public void sendKeys(By locator,String text){
        WebElement textOfResult = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        textOfResult.sendKeys(text);
    }

    public void clickThreeElement(By locator) {
        List<WebElement> elementList = driver.findElements(locator);
        elementList.get(2).click();
    }

    public void findAdd(By locator){
        try {
            driver.findElement(locator).isDisplayed();
            System.out.println("Hay stock del producto");
        }
        catch (NoSuchElementException e){
            System.out.println("Sin stock por el momento");
        }
    }

}
