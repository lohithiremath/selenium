package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouserHoverAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    WebElement element = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
	     
	    Actions a = new Actions(driver);
	    a.moveToElement(element).perform();
	    driver.findElement(By.xpath("(//a[text()='Jackets'])[2]")).click();
		

	}

}
