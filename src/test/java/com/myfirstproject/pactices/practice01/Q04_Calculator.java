package com.myfirstproject.pactices.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04_Calculator {

    // Create chrome driver by using @Before annotation and WebDriverManager
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculator under Micro Apps
// Type any number in the first input
// Type any number in the second input
// Click on Calculate
// Get the result
// Verify the result
// Print the result
// Close the browser by using @After annotation

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test02(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("calculatest")).click();

        driver.findElement(By.id("number1")).sendKeys("4");

        driver.findElement(By.id("number2")).sendKeys("6");

        driver.findElement(By.id("calculate")).click();
    }

}
