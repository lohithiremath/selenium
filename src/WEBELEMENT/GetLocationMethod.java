package WEBELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetLocationMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement Searchtextfield = driver.findElement(By.id("twotabsearchtextbox"));
		Point Locationofsearchtextfield = Searchtextfield.getLocation();
		int x = Locationofsearchtextfield.getX();
				System.out.println("X co-ordinates"+ x);
				int y=Locationofsearchtextfield.getY();
				System.out.println("Y co oridbates"+ y);
	}    

}
