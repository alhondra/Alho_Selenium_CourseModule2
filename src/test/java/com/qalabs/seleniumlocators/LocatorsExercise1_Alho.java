package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class LocatorsExercise1_Alho {

    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.mercadolibre.com.mx/");
        driverAlho.findElement(By.name("as_word")).sendKeys("Selenium");
        driverAlho.findElement(By.className("nav-search-btn")).click();
        driverAlho.findElement(By.className("main-title")).click();
        Thread.sleep(5000);
        driverAlho.close();
    }
}
