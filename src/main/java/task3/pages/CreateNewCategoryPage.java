package task3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CreateNewCategoryPage {

    private EventFiringWebDriver driver;
    private By NewCategoryInput = By.cssSelector("input#name_1");
    private By saveBtn = By.cssSelector("button#category_form_submit_btn");
    private String nameCategory = "NewCategory1";


    public CreateNewCategoryPage(EventFiringWebDriver driver){
        this.driver = driver;
    }


    public void fillNewCategoryInput(){
        driver.findElement(NewCategoryInput).sendKeys(nameCategory);
    }

    public void clickSaveButton(){
        driver.findElement(saveBtn).click();
    }

}
