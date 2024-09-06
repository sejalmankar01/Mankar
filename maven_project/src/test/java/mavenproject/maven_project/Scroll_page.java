package mavenproject.maven_project;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

public class Scroll_page extends Dynamic_code{

	public static void main(String[] args)  {
		launchbrowser("chrome");
		try {
			takescreenshot("Browser launch");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			hiturl("https://www.jeevansathi.com/");
			try {
				takescreenshot("jeevansathi webpage");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("Window.scrollBY(0, 700)");
				try {
					takescreenshot("after scroll");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
		
	}

}
