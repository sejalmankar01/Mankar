package mavenproject.maven_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_code {

	public static WebDriver driver;
	
			public static void launchbrowser(String browser) {
				if(browser.equalsIgnoreCase("chrome")) {
		           driver =new ChromeDriver();			
				}else if(browser.equalsIgnoreCase("edge")) {
					 driver =new EdgeDriver();
					
				}else if(browser.equalsIgnoreCase("firefox")) {
					 driver =new FirefoxDriver();
					
				}
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				System.out.println("Launched browser is: "+ browser);
			}
			          public static void hiturl(String url) {
			        	  driver.get(url);
			        	  System.out.println(driver.getTitle());
			        	  
				
			}
		
		}
	
	
	