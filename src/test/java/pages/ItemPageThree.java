package pages;

import org.openqa.selenium.By;

public class ItemPageThree extends BasePage{

    By buttonAddCar = By.id("add-to-cart-button");


    public ItemPageThree(){
        super(driver);
    }
    public void findButtonAdd(){
        findAdd(buttonAddCar);
    }
}