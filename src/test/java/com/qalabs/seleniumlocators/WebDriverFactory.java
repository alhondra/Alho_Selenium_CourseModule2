package com.qalabs.seleniumlocators;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class WebDriverFactory {
    private static File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");

    private static WebDriver getChrome() {
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefox() {
        File firefoxFilePath = new File(rootPath, "geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-foreground");
        options.setLogLevel(FirefoxDriverLogLevel.FATAL);
        return new FirefoxDriver();
    }

    public static WebDriver getDriver(String browser) {
        if(browser.toLowerCase().equals("chrome")) {
            return getChrome();
        } else if (browser.toLowerCase().equals("firefox")) {
            return getFirefox();
        } else {
            throw new InvalidArgumentException(String.format("Invalid browser %s", browser));
        }
    }
}
