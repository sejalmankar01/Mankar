package mavenproject.maven_project;

import java.io.IOException;

public class Execute_dynamicscreenshot extends Dynamic_code {
	
	public static void main(String[]args)   {
		launchbrowser("chrome");
		try {
			takescreenshot("browser_chrome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hiturl("https://www.amazon.in/");
		try {
			takescreenshot("Amazon webpage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
