package pages;

import org.openqa.selenium.By;

public class ItemPageThree extends BasePage{

    By buttonAddCart = By.id("add-to-cart-button");
    By textButtonAddCart = By.id("submit.add-to-cart-announce");



    public ItemPageThree(){
        super(driver);
    }
    public void findButtonAdd(){
        findAdd(buttonAddCart);
    }
    public String textAddCart(){
        return getText(textButtonAddCart);
    }

}