package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver chrome() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	
	public static void urllaunch(String url) {
		driver.get(url);
		
		
	}

	public static void sendkeys(WebElement w,String s ) {
		w.sendKeys(s);
	}
	public static void click(WebElement e) {
       e.click();
	}
	public static void max() {
		driver.manage().window().maximize();

	}
	public static void implicitwait(int sec ) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
	
}
