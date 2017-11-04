package com.qalabs.seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class HandsOn1_Alho {

    public static void main(String[] args) throws InterruptedException{
        String browser="chrome";
        WebDriver driverAlho = WebDriverFactory.getDriver(browser);
        driverAlho.get("https://www.amazon.com.mx");
        Thread.sleep(5000);
        driverAlho.findElement(By.xpath("//a[text()='Promociones']")).click();
        System.out.println("Encontre el link Promociones");
        Thread.sleep(5000);
        System.out.println("Se abrio la siguiente pagina para abrir departamento");
        Thread.sleep(5000);
        driverAlho.findElement(By.xpath("//*[@id=\'widgetFilters\']/div[1]/div[2]/span[1]/div/label/input")).click();
        System.out.println("Di check a Accesorios electronicos");
        driverAlho.findElement(By.xpath("//span[text()='Ofertas destacadas']")).click();
        System.out.println("Di check a Ofertas destacadas");
        Thread.sleep(1000);
        driverAlho.close();
    }
}
