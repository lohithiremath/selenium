package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(@class,'s-headerMessageBanner__close e-button e-button-close')]")).click();
		
	}
}
