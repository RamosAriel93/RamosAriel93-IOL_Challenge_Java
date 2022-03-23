package pages;

import org.openqa.selenium.By;

public class ItemPageOne extends BasePage{

    By nextButton = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[28]/div/div/span/a[1]");


    public ItemPageOne(){
        super(driver);
    }

    public void clickButtonNext(){
        clickButton(nextButton);
    }

}
