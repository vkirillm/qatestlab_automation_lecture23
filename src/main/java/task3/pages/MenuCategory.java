package task3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuCategory {
    private EventFiringWebDriver driver;
    private By menuItemCatalog = By.cssSelector("li#subtab-AdminCatalog > a:nth-child(1)");
    private By menuItemCategories = By.cssSelector("li[id^='subtab-AdminCategories'] > a");


    public MenuCategory(EventFiringWebDriver driver){
        this.driver = driver;
    }

    public void clickCategories(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions. elementToBeClickable(menuItemCatalog));
        Actions actions = new Actions(driver);
        WebElement elem = driver.findElement(menuItemCatalog);
        actions.moveToElement(elem).perform();

        wait.until(ExpectedConditions. elementToBeClickable(menuItemCategories));
        driver.findElement(menuItemCategories).click();
    }
}
