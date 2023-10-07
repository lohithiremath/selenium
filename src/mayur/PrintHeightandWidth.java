package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightandWidth {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		int height = login.getSize().height;
		int width = login.getSize().width;
		System.out.println(height);
		System.out.println(width);
		
	}
}
