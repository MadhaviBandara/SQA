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
  "duration": 29284585700,
  "status": "passed"
});
formatter.match({
  "location": "AddItemsToCartSteps.page_validated()"
});
formatter.result({
  "duration": 10310214200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027block_top_menu\u0027]/ul/li[1]/a\"}\n  (Session info: chrome\u003d94.0.4606.81)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027MADHI\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.81, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57308}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d108788b3cb4cf58559d64274377bb76\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027block_top_menu\u0027]/ul/li[1]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.ecommerce.qa.pages.ProfilePage.GoToWomensCategory(ProfilePage.java:38)\r\n\tat StepDefinitions.AddItemsToCartSteps.page_validated(AddItemsToCartSteps.java:30)\r\n\tat ✽.Then user navigates to item page(AddItemsToCart.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddItemsToCartSteps.all_items_are_selected()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 16301661000,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_page_title_validated()"
});
formatter.result({
  "duration": 100038300,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_image_validated()"
});
formatter.result({
  "duration": 292955600,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_credentials_provided()"
});
formatter.result({
  "duration": 10230819300,
  "status": "passed"
});
formatter.match({
  "location": "Login.navigate_to_profile()"
});
formatter.result({
  "duration": 14350000,
  "status": "passed"
});
});