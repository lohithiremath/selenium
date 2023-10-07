package frames;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmenu {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	     
	     WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	     
	     Actions a = new Actions(driver);
	     a.contextClick(gmail).perform();
	     
	     Robot r = new Robot();
	     
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_ENTER);
	}

}
