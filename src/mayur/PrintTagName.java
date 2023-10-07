package mayur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement res = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		String tag=res.getTagName();
		String att=res.getAttribute("href");
		String att1=res.getAttribute("onclick");
		String att2=res.getAttribute("id");
		System.out.println(tag);
		System.out.println(att);
		System.out.println(att1);
		System.out.println(att2);
	}
}
