package pages;

import org.openqa.selenium.By;

public class ItemPageTwo extends BasePage{

    By filterItem = By.className("s-image");

    public ItemPageTwo(){
        super(driver);
    }
    public void ThreeElement(){
        clickThreeElement(filterItem);
    }
}
