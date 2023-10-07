package mayur;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.partialLinkText("Resources"));
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String phno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
	System.out.println(phno);
	driver.close();
}
}