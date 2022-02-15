package com.falabella.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver chrome(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("test-type=browser");
        options.addArguments("-incognito");
        options.addArguments("disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("webdriver.load.strategy", "none");
        options.addArguments("pageLoadStrategy", "none");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }

}
