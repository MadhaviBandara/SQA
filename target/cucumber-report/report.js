$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddItemsToCart.feature");
formatter.feature({
  "line": 1,
  "name": "Test Add items to the cart and Obtain Invoice functionality",
  "description": "",
  "id": "test-add-items-to-the-cart-and-obtain-invoice-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check all selected items are added successfully",
  "description": "",
  "id": "test-add-items-to-the-cart-and-obtain-invoice-functionality;check-all-selected-items-are-added-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "page validated",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "all items are selected",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "AddItemsToCartSteps.user_logged_in()"
});
formatter.result({
  "duration": 49707211200,
  "status": "passed"
});
formatter.match({
  "location": "AddItemsToCartSteps.page_validated()"
});
formatter.result({
  "duration": 13959158700,
  "status": "passed"
});
formatter.match({
  "location": "AddItemsToCartSteps.all_items_are_selected()"
});
formatter.result({
  "duration": 6497246500,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on WINDOWS (0831d1eabc627faf0f3df601c5c1eba1)] -\u003e xpath: //*[@id\u003d\"layer_cart\"]/div[1]/div[2]/div[4]/span] (tried for 5 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027MADHI\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.81, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55397}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0831d1eabc627faf0f3df601c5c1eba1\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.ecommerce.qa.pages.WomenCategoryPage.addItemToCart(WomenCategoryPage.java:87)\r\n\tat com.ecommerce.qa.pages.WomenCategoryPage.selectItem(WomenCategoryPage.java:91)\r\n\tat StepDefinitions.AddItemsToCartSteps.all_items_are_selected(AddItemsToCartSteps.java:41)\r\n\tat ✽.When all items are selected(AddItemsToCart.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddItemsToCartSteps.proceed_to_checkout()"
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
  "duration": 21496023400,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_page_title_validated()"
});
formatter.result({
  "duration": 8536400,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_image_validated()"
});
formatter.result({
  "duration": 81507900,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_credentials_provided()"
});
formatter.result({
  "duration": 15247783300,
  "status": "passed"
});
formatter.match({
  "location": "Login.navigate_to_profile()"
});
formatter.result({
  "duration": 318300,
  "status": "passed"
});
});