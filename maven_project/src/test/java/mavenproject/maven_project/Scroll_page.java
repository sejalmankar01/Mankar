package mavenproject.maven_project;


import org.openqa.selenium.JavascriptExecutor;

public class Scroll_page extends Dynamic_code{

	public static void main(String[] args) throws Throwable    {
		launchbrowser("chrome");
		takescreenshot("Launchbrowser");
		
		
			hiturl("https://www.jeevansathi.com/");
			
				takescreenshot("Jeevansathi Webpage");
			
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,700)");
				
					takescreenshot("after scroll");
						
						
						
						
						js.executeScript("window.scrollBy(0,-700)");
						takescreenshot("scroll to bottom");
						js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
						takescreenshot("scroll to bottom");
						
					}
				
				}
			

