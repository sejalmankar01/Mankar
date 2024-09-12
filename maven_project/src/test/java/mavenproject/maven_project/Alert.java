package mavenproject.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Dynamic_code {

	public static void main(String[] args) throws InterruptedException {
		launchbrowser("chrome");
		hiturl("https://demo.automationtesting.in/Alerts.html");
		//ok-accept()
		//cancel-dismiss()
		//text-sendkeys("")
		//get text
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert simple_alert = driver.switchTo().alert();
		Thread.sleep(3000);
		simple_alert.accept();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert confirmation_alert = driver.switchTo().alert();
		confirmation_alert.dismiss();
		WebElement confirm_msg = driver.findElement(By.cssSelector("p#demo"));
		System.out.println(confirm_msg.getText());
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		org.openqa.selenium.Alert prompt_alert = driver.switchTo().alert();
		Thread.sleep(3000);
		prompt_alert.sendKeys("automation batch");
		Thread.sleep(2000);
		prompt_alert.accept();
		driver.findElement(By.cssSelector("p#demo1"));
		System.out.println();
		
		
		
		
		
	}

}
