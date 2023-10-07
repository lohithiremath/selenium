package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddendivsionpopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
