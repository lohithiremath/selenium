package WEBELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnableMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement NewaccountuButton = driver.findElement(By.linkText("Create new account"));
		if(NewaccountuButton.isEnabled())
		{
			System.out.println("Button is enable");
			NewaccountuButton.click();
		}
		else {
			System.out.println("Button is disable");
		}
	}

}
