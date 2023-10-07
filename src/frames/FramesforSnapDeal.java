package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesforSnapDeal {
   public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.snapdeal.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 
	 WebElement singup = driver.findElement(By.xpath("//div[@class='accountInner']"));
	
	 
	Actions a = new Actions(driver);
	a.moveToElement(singup).perform();
	//Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='login']")).click();
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='userName']]")).sendKeys("9742926010");
	
	
	
}
}
