package com.myfirstproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day01_FirstSeleniumClass {
    public static void main(String[] args) {
//        this is one way to create an automation script
//        We will not use main method later on
//        Windows : .exe extension is required
//        Mac : do not use .exe extension
//        MAC
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");//LATER WE WILL NOT USE THIS METHOD
//        WINDOWS
//        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");//LATER WE WILL NOT USE THIS METHOD
//        create driver
        WebDriver driver = new ChromeDriver();
//        navigate to techpro
        driver.get("https://www.techproeducation.com");
    }

     /*
    1. WebDriver
WebDriver is an important API in selenium
We use WebDriver to create driver object(chrome driver, safari, edge, firefox, headless,..)
2. Job title
-QA Engineer, Quality Assurance, SDET, …..
-If there is Selenium keyword in job description, you can apply
3. Framework
It is a combination of packages, classes, methods to keep our codes organized.
4. Manual vs Automation
Automation is simply done for keeping the test step stable and execution test cases faster
5. Advantages & Disadvantages
Selenium is number 1 WEB APPLICATION TESTING TOOL, open source, has large user base, works with multiple browsers, and languages
Cannot automate mobile and desktop applications with out 3rd party tools such as Appium and Auto IT, cannot handle captcha, no professional customer support
6. Functional & Non Functional Testing
Functionality is the answer of what should be done(button click, search, check out,…), non - functional is the answer of how should be done(performance, security,…)
7. Testing Types
Static: done without code such as document review
Dynamic(non-static): done with some type of coding(functional and non functional)
8. Selenium Architecture
W3C protocol
There is request and response between client side (selenium binding) and server side(drivers)
9. Selenium framework installation
We need to be organized to create a framework
We use dependencies in MAVEN project to add selenium, WebDriver, junit, testNG, cucumber,….
     */

}

