package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ItemPage extends TestBase {

    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
    WebElement proceedSummary;

    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    WebElement proceedAddress;

    @FindBy(xpath = "//*[@id='form']/div/p[2]/label")
    WebElement termsAndConditions;

    @FindBy(xpath = "//*[@id='form']/p/button")
    WebElement proceedShipping;

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    WebElement payByBank;

    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    WebElement confirmPayment;

    @FindBy(xpath = "//*[@id='center_column']/p/a")
    WebElement orderHistory;

    @FindBy(xpath = "//*[contains(@class,'ajax_block_products')]")
    List<WebElement> allHovers;

    @FindBy(xpath = "//*[contains(@class,'ajax_add_to_cart_button')]")
    List<WebElement> allItems;

    @FindBy(xpath = "//*[contains(@class,'cart_product')]")
    List<WebElement> cartItems;

    public boolean validateCart(){
        int cartCount = cartItems.size();
        int allCount = allItems.size();
        boolean validationCheck;
        validationCheck = allCount==cartCount ;
        return validationCheck;
    }

    public void obtainInvoice(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedSummary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedAddress)).click();
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedShipping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(payByBank)).click();

//        confirmPayment.click();
//        orderHistory.click();
    }
}
