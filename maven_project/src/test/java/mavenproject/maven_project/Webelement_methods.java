package mavenproject.maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Webelement_methods {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		
		  WebElement Searchbox = driver.findElement(By.cssSelector("unifiedLocation1ClickAddress"));
		//click
		 (Searchbox).click();		 
		
		//senkeys
		 ( Searchbox).sendKeys("Mobiles");
		 Thread.sleep(3000);
		 //clear
		 
		}

}
