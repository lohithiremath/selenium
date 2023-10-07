package selectclassmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonappliction {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new  WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement alldropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select ele = new Select(alldropdown);
		ele.selectByIndex(11);
		Thread.sleep(2000);
		ele.selectByValue("search-alias=beauty");
		Thread.sleep(2000);
		ele.selectByVisibleText("Luggage & Bags");
		
		List<WebElement> list = ele.getOptions();
		  System.out.println(list.size());
		  
	for (WebElement single : list) {
		System.out.println(single.getText());
		
	}
		
		
	}

}
