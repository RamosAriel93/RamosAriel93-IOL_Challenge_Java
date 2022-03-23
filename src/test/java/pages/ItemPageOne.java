package pages;

import org.openqa.selenium.By;

public class ItemPageOne extends BasePage{

    By nextButton = By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(28) > div > div > span > a:nth-child(3)");


    public ItemPageOne(){
        super(driver);
    }

    public void clickButtonNext(){
        clickButton(nextButton);
    }

}
