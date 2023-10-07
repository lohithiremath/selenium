package WEBELEMENT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListofwebElement {
	public static void main(String[] args) throws Throwable {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys("M S Dohni");
	 Thread.sleep(5000);
	 List<WebElement> suggetions = driver.findElements(By.xpath("//li[@role='presentation']"));
	 System.out.println(suggetions.size());
	 
	 
	for (WebElement single : suggetions) {
		      System.out.println(single.getText());
		
	}
	 
	 
	}

}
