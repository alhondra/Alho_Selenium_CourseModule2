package com.qalabs.seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise3_Alho {
    public static void main(String[] args){
        String browser="chrome";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.nasa.gov/");
        driverAlho.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        WebElement missions= driverAlho.findElement(By.linkText("Missions"));
        System.out.println(missions.getAttribute("href"));
        WebElement nasaTv= driverAlho.findElement(By.partialLinkText("NASA TV"));
        System.out.println(nasaTv.getAttribute("href"));
        WebElement mars= driverAlho.findElement(By.partialLinkText("Mars"));
        System.out.println(mars.getAttribute("href"));
        driverAlho.close();

    }
}
