package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Arrays;
public class dragdrop{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		Thread.sleep(5000);
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
}
