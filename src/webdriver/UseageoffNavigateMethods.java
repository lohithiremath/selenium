package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class UseageoffNavigateMethods {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(8000);
	   driver.navigate().forward();
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	}
		
	}
	


