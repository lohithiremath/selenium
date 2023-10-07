package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement res = driver.findElement(By.name("username"));
		int h1 = res.getSize().getHeight();
		int w1 = res.getSize().getWidth();
		WebElement res1 = driver.findElement(By.name("pwd"));
		int h2 = res1.getSize().getHeight();
		int w2 = res1.getSize().getWidth();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(w1);
		System.out.println(w2);
		if(h1==h2 && w1==w2)
			System.out.println("UN and Pass textfield are equal in size");
		else
			System.out.println("UN and Pass Textfiels are not equal in size");
		
		Dimension size = res1.getSize();
		System.out.println(size);
		Rectangle rect = res1.getRect();
		System.out.println(rect);
		int h = rect.getHeight();
		System.out.println(h);
	}
}
