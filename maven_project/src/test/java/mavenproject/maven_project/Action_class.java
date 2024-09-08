package mavenproject.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_class extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		//action class:it provides user action like mouse and keyboards actions
		//step :
		//create object of action class,it acceots the argument  as ref.var of webdriver interface
		//with the help of ref.var of action class object you can perform different operations
		
		//mouse action
		//move to element():mouse cursor to specific web element
		//click():it clicks on current location
		//context click:right click
		//double click()double click
		//drag and drop(source,target):
		//click and hold():
		// release():
		//drag and drop(source,x offset,y offset)
		
		//act.movetoelement().click().build().perform();
		
		launchbrowser("Chrome");
		hiturl("https://jqueryui.com/slider//");
	 //WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
	 Actions act=new Actions(driver);
	// act.moveToElement(Draggable).click().build().perform();
	 System.out.println("after click on draggable:"+driver.getTitle());
	 //WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
	// act.moveToElement(Themes).contextClick().build().perform();
	// act.moveToElement(Themes).doubleClick(Themes).build().perform();
	WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
	 driver.switchTo().frame(frame);
	WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
	act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
	Thread.sleep(3000);
	act.dragAndDropBy(slider, -300, 0).build().perform();
	
	
	driver.switchTo().defaultContent();
	WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
	act.moveToElement(Droppable).click().build().perform();
	System.out.println("after clicking on droppable:"+driver.getTitle());
	
	WebElement frame_1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	driver.switchTo().frame(frame_1);
	WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	
	//act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	
	
	
	}

}
