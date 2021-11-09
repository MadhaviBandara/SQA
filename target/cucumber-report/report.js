$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddItemsToCart.feature");
formatter.feature({
  "line": 1,
  "name": "Test Add items to the cart and Obtain Invoice functionality",
  "description": "",
  "id": "test-add-items-to-the-cart-and-obtain-invoice-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Background:"
    }
  ],
  "line": 4,
  "name": "Check all selected items are added successfully and obtained the invoice",
  "description": "",
  "id": "test-add-items-to-the-cart-and-obtain-invoice-functionality;check-all-selected-items-are-added-successfully-and-obtained-the-invoice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user logged to the system",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to item page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user selects all items and adds to cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "cart table is successfully updated",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user accepts the order summary",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user checks shipping address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "agreed to terms",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user checks whether the agreement was accepted",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user checks shipping option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects payment method",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user confirms order",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user checks whether payment is successful",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "generates invoice as a pdf",
  "keyword": "Then "
});
formatter.match({
  "location": "AddItemsToCartSteps.user_logged_in()"
});
formatter.result({
  "duration": 36956311900,
  "status": "passed"
});
formatter.match({
  "location": "AddItemsToCartSteps.page_validated()"
});
formatter.result({
  "duration": 14323258600,
  "status": "passed"
});
formatter.match({
  "location": "AddItemsToCartSteps.all_items_are_selected()"
});
formatter.result({
  "duration": 6328150300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on WINDOWS (2543766985fcf210a48bd24a43e8d4f5)] -\u003e xpath: //*[@id\u003d\u0027layer_cart\u0027]/div[1]/div[2]/div[4]/span] (tried for 5 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RAVEESHAPC\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_302\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.69, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\ravee\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65333}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2543766985fcf210a48bd24a43e8d4f5\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.ecommerce.qa.pages.WomenCategoryPage.addItemToCart(WomenCategoryPage.java:75)\r\n\tat com.ecommerce.qa.pages.WomenCategoryPage.selectItems(WomenCategoryPage.java:79)\r\n\tat StepDefinitions.AddItemsToCartSteps.all_items_are_selected(AddItemsToCartSteps.java:40)\r\n\tat ✽.And user selects all items and adds to cart(AddItemsToCart.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddItemsToCartSteps.obtain_invoice()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.accept_summary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.check_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.agree_to_terms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.validate_agreement()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.check_shipping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.select_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.order_confirm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.validate_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddItemsToCartSteps.obtained_invoice()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test the login functionality",
  "description": "",
  "id": "test-the-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check whether user logs in successfully",
  "description": "",
  "id": "test-the-login-functionality;check-whether-user-logs-in-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "login page title validated",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "login image validated",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "login credentials provided",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "navigate to profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.navigated_to_the_login_page()"
});
formatter.result({
  "duration": 11016516800,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_page_title_validated()"
});
formatter.result({
  "duration": 99558800,
  "error_message": "java.lang.AssertionError: expected [Login - My Store] but found [508 Resource Limit Is Reached]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat StepDefinitions.Login.login_page_title_validated(Login.java:26)\r\n\tat ✽.And login page title validated(Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.login_image_validated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.login_credentials_provided()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.navigate_to_profile()"
});
formatter.result({
  "status": "skipped"
});
});