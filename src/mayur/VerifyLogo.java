package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(logo);
		if(logo==true)
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		
	}
}
