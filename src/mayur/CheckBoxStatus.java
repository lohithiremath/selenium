package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxStatus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean res = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		System.out.println(res);
	}
}
