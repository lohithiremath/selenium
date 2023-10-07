package WEBELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement Searchbutton = driver.findElement(By.id("twotabsearchtextbox"));
		if(Searchbutton.isDisplayed())
		{
			System.out.println("pass");
			Searchbutton.sendKeys("tshits");
		}
		else{
			System.out.println("fail");
			
			
		}
		
	}

}
