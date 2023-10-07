package webdriver;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageOfToUrl {
	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(5000);
		URL mainURL=new URL("https://www.dassault-aviation.com/en/");
		URL groupPageUrl = new URL(mainURL,"group/");
		driver.navigate().to(groupPageUrl);
		
		
		
		
	}

}
