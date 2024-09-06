package mavenproject.maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Browser_launch {

	public static void main(String[] args) {
		// WebDriver driver= new ChromeDriver();
		//WebDriver drive = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
         
        
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.amazon.in/");
        // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        // wait.until(ExpectedConditions.visibilityOfElementLocated("null"));
         
         FluentWait<WebDriver>wait=new  FluentWait<WebDriver>(driver);
         System.out.println(driver.getTitle());
         
         driver.findElement(By.xpath(null)) ;
         System.out.println(driver.getTitle());
        
	}

}
