package mavenproject.maven_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Windows_handler extends Dynamic_code {

	public static void main(String[] args) throws Exception  {
		launchbrowser("chrome");
		hiturl("https://www.naukri.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement About_us = driver.findElement(By.xpath("//a[text()=\"About us\"]"));
		About_us.click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		
		String parent_windowid = it.next();
		System.out.println("parent window id:"+parent_windowid);
		
		
		String child_windowid = it.next();	
		System.out.println("child window id:"+ child_windowid);
		
		
		driver.switchTo().window(child_windowid);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]"));
		
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_windowid);
		//driver.switchTo().defaultContent();
	
		
		

	}
}
		