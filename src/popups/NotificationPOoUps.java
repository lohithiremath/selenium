package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPOoUps {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		
	 WebDriver driver=new ChromeDriver(option);
       driver.manage().window().maximize();
       driver.get("https://www.irctc.co.in/nget/train-search");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
       
       driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
       driver.findElement(By.xpath("//span[text()='31']")).click();
       
	}

}
