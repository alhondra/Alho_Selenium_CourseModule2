package com.qalabs.seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise4_Alho {

    public static void main(String[]args) {
        String browser = "chrome";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driverAlho.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement portada = driverAlho.findElement(By.linkText("Portada"));
        System.out.println(portada.getAttribute("href"));
        //WebElement pagina = driverAlho.findElement(By.linkText("Página"));
        //System.out.println(pagina.getAttribute("href"));

    }

}
