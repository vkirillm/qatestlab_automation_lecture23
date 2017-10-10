package task3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
    private EventFiringWebDriver driver;
    private By addButton = By.cssSelector("a#page-header-desc-category-new_category");


    public CategoryPage(EventFiringWebDriver driver){
        this.driver = driver;
    }

    public void clickNewCategories(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions. elementToBeClickable(addButton));
        driver.findElement(addButton).click();
    }
}
