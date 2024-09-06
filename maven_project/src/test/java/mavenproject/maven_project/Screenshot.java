package mavenproject.maven_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends  Dynamic_code{

	public static void main(String[] args) throws IOException {
		 launchbrowser("chrome");
		
		 
		 // tell driver to take screenshot(need to create object)
		 TakesScreenshot ss=(TakesScreenshot) driver;
		 
		 
		 //with the help of ref.var of takescreenshot interface use getscreenshot method
		  
		File Source = ss.getScreenshotAs(OutputType.FILE);
		
		//directly with foldername and filename
		
		File target = new File("./evidences/Browser_launched.png");
		FileHandler.copy(Source, target);
		
		
		hiturl("https://snapdeal.com/");
		 TakesScreenshot st=(TakesScreenshot) driver;
		 File Source12 = st.getScreenshotAs(OutputType.FILE);
		 File target12 = new File("./evidences/Snapdeal.png");
			FileHandler.copy(Source12, target12);
			driver.findElement(By.cssSelector("input#inputValEnter"));
	}

}
