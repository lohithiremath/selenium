package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlterPopup {

	public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoapp.skillrary.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	      WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
	      
	      Actions a = new Actions(driver);
	      a.moveToElement(course).perform();
	      
	      driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	      
	      driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
	      
	      Alert alert = driver.switchTo().alert();
	      alert.accept();
	      alert.dismiss();

	}

}
