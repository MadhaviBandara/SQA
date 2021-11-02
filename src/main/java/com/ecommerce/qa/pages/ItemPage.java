package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage extends TestBase {

    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 5);

//    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
//    WebElement cartHover ;
//    @FindBy(xpath = "//*[@id=\"button_order_cart\"]")
//    WebElement proceed;

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

    @FindBy(xpath ="//*[@id=\"center_column\"]/div/p/strong" )
    WebElement paymentStatus;

    @FindBy(xpath = "//*[@id='center_column']/p/a")
    WebElement orderHistory;
    @FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a")
    WebElement invoice;

    public void proceedToCheckout(){
//        actions.moveToElement(cartHover).perform();
//        wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();

        wait.until(ExpectedConditions.elementToBeClickable(proceedSummary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedAddress)).click();
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedShipping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(payByBank)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confirmPayment)).click();
    }

    public String validatePayment(){
        return paymentStatus.getText();
    }

    public void obtainInvoice(){
        wait.until(ExpectedConditions.elementToBeClickable(orderHistory)).click();
        wait.until(ExpectedConditions.elementToBeClickable(invoice)).click();
    }
}