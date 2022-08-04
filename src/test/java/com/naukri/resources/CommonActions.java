package com.naukri.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
    public void browserLaunch() {
    WebDriverManager.chromedriver().setup();
    driver = new  ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    }
    public void name() {
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("Thamizhselvan");
    }	
    public void email() {
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("tamilselvankarthi9578@gmail.com");
    }
    public void password() {
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("thamizhselvan");
    }
    public void mobileNumber() {
	WebElement mobile = driver.findElement(By.id("mobile"));
	mobile.sendKeys("8438734337");
    }
    public void Exp() {
	WebElement work = driver.findElement(By.xpath("(//h2[@class='main-3'])[1]"));
	work.click();
    }
    public void register() {
    WebElement register= driver.findElement(By.xpath("//button[@type='submit']"));
    register.click();
    }
    public void quit() {
    	driver.quit();
    }
}
