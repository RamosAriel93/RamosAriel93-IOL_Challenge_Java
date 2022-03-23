package pages;
import org.openqa.selenium.By;

public class IndexPage extends BasePage{


    By inputSearch = By.id("twotabsearchtextbox");
    By buttonSearch = By.id("nav-search-submit-button");


    public IndexPage(){
        super(driver);
    }

    public void sendInput(String text){
        sendKeys(inputSearch, text);
    }

    public void clickButtonSearch() {
        clickButton(buttonSearch);
    }

}
