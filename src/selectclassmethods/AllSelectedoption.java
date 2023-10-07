package selectclassmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllSelectedoption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s = new Select(dropdown);
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
				for (WebElement singleoption : option) {
					System.out.println(singleoption.getText());
					
				}
		 s.selectByIndex(2);
		 s.selectByValue("99");
		 s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		   
		 List<WebElement> opt = s.getAllSelectedOptions();
		 System.out.println(opt.size());

		 for (WebElement single: opt) {
			 System.out.println(single.getText());
			
		}
		
	}

}
