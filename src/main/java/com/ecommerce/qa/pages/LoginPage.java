package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page Factory - Object Repository
    @FindBy(name="email")
    WebElement email;

    @FindBy(name="passwd")
    WebElement password;

    @FindBy(name="email_create")
    WebElement registerEmail;

    @FindBy(name= "SubmitLogin")
    WebElement loginBtn;

    @FindBy(xpath= "//input[@name='SubmitCreate']")
    WebElement signUpBtn;

    @FindBy(xpath="//img[contains(@class, 'logo img-responsive')]")
    WebElement Logo;

    //Initializing the page objects using Driver
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Defining functions on Login Page
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public boolean validateLogo(){
        return Logo.isDisplayed();
    }

    public ProfilePage Login(String un, String pw){
        email.sendKeys(un);
        password.sendKeys(pw);
        loginBtn.click();
        return new ProfilePage();
    }


}
