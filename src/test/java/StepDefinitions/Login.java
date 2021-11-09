package StepDefinitions;

import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import cucumber.api.java.en.*;
import com.ecommerce.qa.base.TestBase;
import org.testng.Assert;

public class Login extends TestBase {
    LoginPage loginPage;
    ProfilePage profilePage;

    @Given("^navigated to the login page$")
    public void navigated_to_the_login_page() throws Throwable {
        System.out.println("Inside Step : navigated to the login page");

        initialization();
        loginPage = new LoginPage();
    }

    @And("^login page title validated$")
    public void login_page_title_validated() throws Throwable {
        System.out.println("Inside Step : login page title validated");

        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Login - My Store");
    }

    @And("^login image validated$")
    public void login_image_validated() throws Throwable {
        boolean flag = loginPage.validateLogo();
        Assert.assertTrue(flag);

        System.out.println("Inside Step : login image validated");
    }

    @When("^login credentials provided$")
    public void login_credentials_provided() throws Throwable {
        System.out.println("Inside Step : login credentials provided");

        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Then("^navigate to profile$")
    public void navigate_to_profile() throws Throwable {
        System.out.println("Inside Step : navigated to profile");

        String ProfilePageTitle = profilePage.verifyProfilePageTitle();
        Assert.assertEquals(ProfilePageTitle,"My account - My Store", "Title of the profile page not matched");
    }
}
