package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RigthClickMethod {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	     WebElement searctextfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	     
	     
	     Actions a = new Actions(driver);
		a.contextClick(searctextfield).perform();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
