package com.training.real;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Program1 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver =  WebCapability();
		//driver.get("http://www.google.com");
		//driver.findElement(MobileBy.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		/*driver.get("http://www.facebook.com");
		driver.findElement(MobileBy.xpath("//input[@name='email']")).sendKeys("leela@gmail.com");
		driver.findElement(MobileBy.xpath("//input[@id='m_login_password']")).sendKeys("welcome");
		driver.findElement(MobileBy.xpath("//button[@name='login']")).click();*/
		
		driver.get("http://www.cricbuzz.com");
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[contains(text(),'Menu')]")).click();
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url + " and " + title);
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Top Stories')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
	}

}
