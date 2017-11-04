package com.qalabs.seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise5_Alho {
    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho=WebDriverFactory.getDriver(browser);
        driverAlho.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverAlho.get("https://www.amazon.com.mx/");

        WebElement dropdownAlho = driverAlho.findElement(By.id("searchDropdownBox"));
        Select selectAlho = new Select(dropdownAlho);

        System.out.println("Available options: "+selectAlho.getOptions());
        System.out.println("Is it Multiple? "+selectAlho.isMultiple());
        System.out.println("The first selected option is: "+selectAlho.getFirstSelectedOption().getText());
        Thread.sleep(5000);

        selectAlho.selectByIndex(0);
        System.out.println("The Selected option by Index 0 is: "+selectAlho.getFirstSelectedOption().getText());
        selectAlho.selectByValue("Auto");
        Thread.sleep(5000);

        System.out.println("The First Selected option searching by auto is: "+selectAlho.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        driverAlho.close();
    }
}
