package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		   Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
	   Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='Pause']")).click();
		
	
		
	}

}
