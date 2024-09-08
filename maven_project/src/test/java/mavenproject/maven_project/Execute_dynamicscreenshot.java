package mavenproject.maven_project;

import java.io.IOException;

public class Execute_dynamicscreenshot extends Dynamic_code {
	
	public static void main(String[]args) throws IOException   {
		launchbrowser("chrome");
		takescreenshot("browser_chrome");
		
		hiturl("https://www.amazon.in/");
		takescreenshot("Amazon webpage");
	}

}
