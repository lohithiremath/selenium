package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x = driver.findElement(By.name("username")).getLocation().getX();
		int x2 = driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println(x);
		System.out.println(x2);
		if(x==x2)
			System.out.println("Un and password are aligned properly");
		else
			System.out.println("UN and password are not aligned properly");
		}

}
