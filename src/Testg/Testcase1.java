package Testg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase1 {
	
	@BeforeMethod
	 public WebDriver driver;
	public void openApp() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@org.testng.annotations.Test
		public void login()
		{
			driver.findElement(By.xpath("//input[@id='username']"));
			driver.findElement(By.xpath("//input[@name='pwd']"));
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			
		}
		
		@AfterMethod{
			driver.close();
			driver.quit();
		}
		
		
		
	}


