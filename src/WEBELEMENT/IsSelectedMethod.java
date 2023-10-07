package WEBELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsSelectedMethod {
	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement radio = driver.findElement(By.xpath(""));
	 if(radio.isSelected())
	 {
		 System.out.println("it is selected");
	 }
	 else {
		 System.out.println("it is not selected");
	 }
	 
	 
	 
	 
	 
	}

}
