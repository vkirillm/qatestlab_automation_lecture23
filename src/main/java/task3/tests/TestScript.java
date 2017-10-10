package task3.tests;

import task3.BaseTest;
import task3.pages.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestScript extends BaseTest {

    public static void main(String[] args) {
        EventFiringWebDriver driver = getConfiguredDriver();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickLoginButton();

        MenuCategory menuCategory = new MenuCategory(driver);
        menuCategory.clickCategories();

        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.clickNewCategories();

        CreateNewCategoryPage newPage = new CreateNewCategoryPage(driver);
        newPage.fillNewCategoryInput();
        newPage.clickSaveButton();

        //DashboardPage dashboardPage = new DashboardPage(driver);

        //dashboardPage.clickLogoutImage();
        //dashboardPage.clicklogoutButton();

        //dashboardPage.scrollPageDown();

        //dashboardPage.selectOrdersItem();



        //dashboardPage.clicklogoutButtonWithJS();

        categoryPage.clickIconCaretDown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        quitDriver(driver);
    }
}