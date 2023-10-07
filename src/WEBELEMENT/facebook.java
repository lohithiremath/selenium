package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.browser.model.Bucket;

public class facebook {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	}

}
