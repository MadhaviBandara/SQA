package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class WomenCategoryPage extends TestBase {
    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 5);

    List<WebElement> listOfItems ;
    List<WebElement> listOfCartItems ;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/div/p[1]/strong")
    WebElement womenImg;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]")
    WebElement onHover;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[2]/div/div[2]")
    WebElement onHover2;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]")
    WebElement onHover3;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[4]/div/div[2]")
    WebElement onHover4;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[5]/div/div[2]")
    WebElement onHover5;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[6]/div/div[2]")
    WebElement onHover6;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[7]/div/div[2]")
    WebElement onHover7;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]")
    WebElement item;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]")
    WebElement item2;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]")
    WebElement item3;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]")
    WebElement item4;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[5]/div/div[2]/div[2]/a[1]")
    WebElement item5;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[6]/div/div[2]/div[2]/a[1]")
    WebElement item6;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[7]/div/div[2]/div[2]/a[1]")
    WebElement item7;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement proceed;

    public WomenCategoryPage(){
        PageFactory.initElements(driver, this);
    }
    public String validateWomenCategoryPageTitle(){
        return driver.getTitle();
    }
    public boolean validateImg(){
        return womenImg.isDisplayed();
    }


    private void addItemToCart(WebElement hover , WebElement itemVal){
        actions.moveToElement(hover).perform();
        wait.until(ExpectedConditions.elementToBeClickable(itemVal)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();
    }

    public void selectItems(){
        addItemToCart(onHover,item);
        addItemToCart(onHover2,item2);
        addItemToCart(onHover3,item3);
        addItemToCart(onHover4,item4);
        addItemToCart(onHover5,item5);
        addItemToCart(onHover6,item6);
        actions.moveToElement(onHover7).perform();
        wait.until(ExpectedConditions.elementToBeClickable(item7)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();
        getPageItems();
    }

    public void getPageItems(){
        listOfItems = driver.findElements(By.cssSelector("div[class='right-block'] h5 a[class='product-name']"));
        for (WebElement pageItem : listOfItems) {
            System.out.println(pageItem.getText());
        }
    }

    public void validateCart(){
        listOfCartItems = driver.findElements(By.className("label-success"));
        Assert.assertEquals(listOfCartItems.size(), 7);
    }

    public void proceedToAddress(){
        WebElement proceedAddress = driver.findElement(By.xpath("//*[@id='center_column']/p/a[1]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(proceedAddress)).click();
    }

    public void proceedToShipping(){
        WebElement proceedShipping = driver.findElement(By.xpath("//*[@id='center_column']/form/p/button"));
        wait.until(ExpectedConditions.elementToBeClickable(proceedShipping)).click();
    }

    public void agreeToTerms(){
        WebElement agreeTerms = driver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label"));
        wait.until(ExpectedConditions.elementToBeClickable(agreeTerms)).click();
    }

    public void validateAgreeToTerms(){
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
        Assert.assertTrue(checkbox.isSelected());
    }

    public void proceedToPayment(){
        WebElement proceedPayment = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
        wait.until(ExpectedConditions.elementToBeClickable(proceedPayment)).click();
    }

    public void orderPayment(){
        WebElement payByBank = driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
        wait.until(ExpectedConditions.elementToBeClickable(payByBank)).click();
    }

    public void confirmOrder(){
        WebElement orderConfirm = driver.findElement(By.xpath("//*[@id='cart_navigation']/button"));
        wait.until(ExpectedConditions.elementToBeClickable(orderConfirm)).click();
    }

    public void checkPaymentStatus(){
        WebElement paymentStatus = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
        String status = paymentStatus.getText() ;
        Assert.assertEquals(status, "Your order on My Store is complete.");
    }

    public void obtainInvoice(){
        WebElement goToProfile = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(goToProfile)).click();
        WebElement history = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(history)).click();

//        WebElement orderHistory = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a"));
        //*[@id="order-list"]/tbody/tr[1]/td[6]/a
        WebElement invoice =  driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a"));
//        wait.until(ExpectedConditions.elementToBeClickable(orderHistory)).click();
        wait.until(ExpectedConditions.elementToBeClickable(invoice)).click();
    }
}