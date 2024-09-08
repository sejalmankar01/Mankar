package mavenproject.maven_project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

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
			          public static void takescreenshot(String screenshot_name)   {
			        	  
			          
			          
			          TakesScreenshot st=(TakesScreenshot) driver;
			 		 File Source12 = st.getScreenshotAs(OutputType.FILE);
			 		 File target12 = new File("./Screenshot/"+screenshot_name+".png");
					 
						
			 			try {
							FileHandler.copy(Source12, target12);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			          }
			          public static void  screenshot(String ss_name)  {
			        	  String Projectpath = System.getProperty("user.dir");
							TakesScreenshot ts4=(TakesScreenshot) driver;
							 File Source4 = ts4.getScreenshotAs(OutputType.FILE);
							 File target4 = new File(Projectpath +"\\evidences\\"+ ss_name+".png");
								try {
									FileHandler.copy(Source4, target4);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
					}
		}
	
	
	