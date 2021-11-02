package StepDefinitions;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.ItemPage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import com.ecommerce.qa.pages.WomenCategoryPage;
import cucumber.api.java.en.*;
import org.testng.Assert;

public class AddItemsToCartSteps extends TestBase {
    LoginPage loginPage;
    WomenCategoryPage womenCategoryPage;
    ProfilePage profilePage;
    ItemPage itemPage;

    @Given("^user logged in$")
    public void user_logged_in() throws Throwable {
        System.out.println("Inside Step : user logged in");

        initialization();
        loginPage = new LoginPage();
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @And("^page validated$")
    public void page_validated() throws Throwable {
        System.out.println("Inside Step : page validated");

        womenCategoryPage = profilePage.GoToWomensCategory();
        String title = womenCategoryPage.validateWomenCategoryPageTitle();
        Assert.assertEquals(title, "Women - My Store");
        boolean flag = womenCategoryPage.validateImg();
        Assert.assertTrue(flag);
    }

    @When("^all items are selected$")
    public void all_items_are_selected() throws Throwable {
        System.out.println("Inside Step : all items are selected");

        itemPage = womenCategoryPage.selectItem();
        womenCategoryPage.proceedToCheckout();
    }

    @Then("^proceed to checkout$")
    public void proceed_to_checkout() throws Throwable {
        System.out.println("Inside Step : proceed to checkout");

        String status = womenCategoryPage.validatePayment();
        Assert.assertEquals(status, "Your order on My Store is complete.");
        womenCategoryPage.proceedToCheckout();
    }
}