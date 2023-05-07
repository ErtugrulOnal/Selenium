package com.myfirstproject.pactices.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01_Navigations {


    public static void main(String[] args) throws InterruptedException {

        // Set Driver Path
        System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();


        // Create chrome driver object
        WebDriver driver = new ChromeDriver();


        // Maximize the window

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // Navigate to techproeducation home page https://techproeducation.com/
        driver.navigate().to("https://techproeducation.com/");

        // Navigate back to google
        Thread.sleep(3000);
        driver.navigate().back();

        // Navigate forward to techproeducation
        Thread.sleep(3000);
        driver.navigate().forward();

        // Refresh the page
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.close();//driver.quit();


        //and last step: print "all ok"
        System.out.println("ALL OK");
    }
}
