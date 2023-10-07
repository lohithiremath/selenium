package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofToString {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://en-gb.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
	}

}
