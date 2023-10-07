package selectclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAndDeselectMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapp.skillrary.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement dropdown = driver.findElement(By.id("cars"));
	  
	  Select selectelement = new Select(dropdown);
	  
	    selectelement.selectByIndex(2);
	    Thread.sleep(2000);
	    selectelement.selectByValue("99");
	    Thread.sleep(2000);
	    selectelement.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
	    Thread.sleep(2000);
	    
	    selectelement.deselectByIndex(2);
	    Thread.sleep(2000);
	    selectelement.deselectByValue("99");
	    Thread.sleep(2000);
	    selectelement.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
	    
	    
	  
	  
	  
			
	}

}
