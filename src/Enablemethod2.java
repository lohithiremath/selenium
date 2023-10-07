


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enablemethod2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement NewaccountuButton=driver.findElement(By.linkText("Create new account"));
		NewaccountuButton.click();
		WebElement radiobutton = driver.findElement(By.cssSelector("input[type='radio']"));
		if(radiobutton.isEnabled())
		{
			System.out.println("pass");
			radiobutton.click();
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}
}

	