package task3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewCategoryPage {

    private EventFiringWebDriver driver;
    private By NewCategoryInput = By.cssSelector("input#name_1");
    private By saveBtn = By.cssSelector("button#category_form_submit_btn");
    private By result = By.cssSelector("div[class*='alert-success']");
    private String nameCategory = "NewCategory1";

    public CreateNewCategoryPage(EventFiringWebDriver driver){
        this.driver = driver;
    }


    public void fillNewCategoryInput(){
        driver.findElement(NewCategoryInput).sendKeys(nameCategory);
    }

    public void clickSaveButton()  {
        driver.findElement(saveBtn).click();
/*
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(result));
*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean present = false;
        try {
            driver.findElement(result);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        System.out.println("Подтверждение создания: "+present);
    }



}
