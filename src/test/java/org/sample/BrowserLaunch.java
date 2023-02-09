package org.sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
				
		chrome();
		max();
		implicitwait(10);
		
		urllaunch("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		sendkeys(username,"Magizhini");
		
		WebElement password = driver.findElement(By.id("pass"));
		sendkeys(password,"JagaAni");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		click(loginbutton);
		}

}
