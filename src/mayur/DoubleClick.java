package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Login"));
		WebElement target1 = driver.findElement(By.xpath("//span[@id = 'loginspan']"));
		a.doubleClick(target1).perform();
		String text = driver.getCurrentUrl();
		System.out.println(text);
		String text1 = driver.getTitle();
		System.out.println(text1);
		if(text1.equals("Login - Vtiger"))
		{
			System.out.println("page is displayed");
		}
		
		
		
	}
}
