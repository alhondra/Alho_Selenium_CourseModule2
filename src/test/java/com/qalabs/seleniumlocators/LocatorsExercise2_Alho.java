package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2_Alho {

    public static void main(String[] args){
        String browser="chrome";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.google.com.mx");
        driverAlho.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driverAlho.findElement(By.xpath("//*[@id=\'ladsfa']"));
        driverAlho.close();
        System.out.println("Lo encontre");
    }
}
