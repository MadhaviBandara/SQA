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

    @Given("^user logged to the system$")
    public void user_logged_in() throws Throwable {
        System.out.println("Inside Step : user logged to the system");

        initialization();
        loginPage = new LoginPage();
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @And("^user navigates to item page$")
    public void page_validated() throws Throwable {
        System.out.println("Inside Step : user navigates to item page");

        womenCategoryPage = profilePage.GoToWomensCategory();
        String title = womenCategoryPage.validateWomenCategoryPageTitle();
        Assert.assertEquals(title, "Women - My Store");
        boolean flag = womenCategoryPage.validateImg();
        Assert.assertTrue(flag);
    }

    @When("^user selects all items and adds to cart$")
    public void all_items_are_selected() throws Throwable {
        System.out.println("Inside Step : user selects all items and adds to cart");
        womenCategoryPage.selectItems();
    }

    @And("^cart table is successfully updated$")
    public void obtain_invoice() throws Throwable {
        System.out.println("Inside Step : cart table is successfully updated");
        womenCategoryPage.validateCart();
    }

    @And("^user accepts the order summary$")
    public void accept_summary() throws Throwable {
        System.out.println("Inside Step : user accepts the order summary");
        womenCategoryPage.proceedToAddress();
    }

    @And("^user checks shipping address$")
    public void check_address() throws Throwable {
        System.out.println("Inside Step : user checks shipping address");
        womenCategoryPage.proceedToShipping();
    }

    @And("^agreed to terms$")
    public void agree_to_terms() throws Throwable {
        System.out.println("Inside Step : agreed to terms");
        womenCategoryPage.agreeToTerms();
    }

    @And("^user checks whether the agreement was accepted$")
    public void validate_agreement() throws Throwable {
        System.out.println("Inside Step : user checks whether the agreement was accepted");
        womenCategoryPage.validateAgreeToTerms();
    }

    @And("^user checks shipping option$")
    public void check_shipping() throws Throwable {
        System.out.println("Inside Step : user checks shipping option");
        womenCategoryPage.proceedToPayment();
    }

    @And("^user selects payment method$")
    public void select_payment() throws Throwable {
        System.out.println("Inside Step : user selects payment method");
        womenCategoryPage.orderPayment();
    }

    @And("^user confirms order$")
    public void order_confirm() throws Throwable {
        System.out.println("Inside Step : user confirms order");
        womenCategoryPage.confirmOrder();
    }

    @And("^user checks whether payment is successful$")
    public void validate_payment() throws Throwable {
        System.out.println("Inside Step : user checks whether payment is successful");
        womenCategoryPage.checkPaymentStatus();
    }

    @And("^generates invoice as a pdf$")
    public void obtained_invoice() throws Throwable {
        System.out.println("Inside Step : generates invoice as a pdf");
        womenCategoryPage.obtainInvoice();
        driver.quit();
    }
}