package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColour {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("colour");
		System.out.println("hello");
		System.out.println(colour);
	}
}
