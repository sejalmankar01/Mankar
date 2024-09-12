package mavenproject.maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//click
		Searchbox.click();
		//sendkeys
		Searchbox.sendKeys("mobiles");
		
		Thread.sleep(3000);
		
		//clear
		Searchbox.clear();
		Searchbox.sendKeys("books");
		//get text
		System.out.println(Searchbox.getText());
		
		//get attribute
		System.out.println(Searchbox.getAttribute("value"));
		
		//get location
		System.out.println("The x coordinate of searchbox lies at :"+Searchbox.getLocation().x);
		System.out.println("The y coordinate of searchbox lies at :"+ Searchbox.getLocation().y);
		
		//get size
		System.out.println(" size of searchbox is:"+Searchbox.getSize());
		
		//get tagname
		System.out.println(Searchbox.getTagName());
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
