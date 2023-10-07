package WEBELEMENT;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsSelectedMethos {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	     checkBox.click();
		if(checkBox.isSelected())
		{
			System.out.println("it is selected");
		}
		else
		{
			System.out.println("it is not selected");
		}
		
	}

}
