package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
	w.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
}
}
