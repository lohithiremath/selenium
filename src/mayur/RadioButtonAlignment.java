package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAlignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		int y1=driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		if(y1==y2 && y2==y3)
			System.out.println("Radio button of gender are properly in x axis");
		else
			System.out.println("Radio button of gender are not properly in x axis");
	}
}
