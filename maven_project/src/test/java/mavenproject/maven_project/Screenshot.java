package mavenproject.maven_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Screenshot extends  Dynamic_code{

	public static void main(String[] args) throws Throwable  {
		 launchbrowser("chrome");
		
		 
		 // tell driver to take screenshot(need to create object)
		 TakesScreenshot ss=(TakesScreenshot) driver;
		 
		 
		 //with the help of ref.var of takescreenshot interface use getscreenshot method
		  
		File Source = ss.getScreenshotAs(OutputType.FILE);
		
		//directly with foldername and filename
		
		File target = new File("./evidences/Browser_launched_1.png");
		
		
		
		hiturl("https://snapdeal.com/");
		 TakesScreenshot st=(TakesScreenshot) driver;
		 File Source12 = st.getScreenshotAs(OutputType.FILE);
		 File target12 = new File("./evidences/Snapdeal_1.png");
			FileHandler.copy(Source12, target12);
			
			driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("Kitchen Products");
			
				
				//by declaring projectpath
				 String Projectpath = System.getProperty("user.dir");
				System.out.println(Projectpath);
				TakesScreenshot ts4=(TakesScreenshot) driver;
				 File Source4 = ts4.getScreenshotAs(OutputType.FILE);
				 File target4 = new File(Projectpath +"\\evidences\\Search_Product.png");
					FileHandler.copy(Source4, target4);
				
			
	}
	
	

}
