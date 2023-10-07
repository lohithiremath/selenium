package selectclassmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mehtods1 {

	public static void main(String[] args) throws Throwable {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement dropdown = driver.findElement(By.id("gh-cat"));
	  
	  Select ele = new Select(dropdown);
	  Thread.sleep(3000);
	  ele.selectByIndex(3);
	  Thread.sleep(3000);
	  ele.selectByValue("619");
	  Thread.sleep(3000);
	  ele.selectByVisibleText("Health & Beauty");
	  
	  List<WebElement> listosele = ele.getOptions();
	 System.out.println(listosele.size());
	  
	  for (WebElement singleelement: listosele) {
		
		   System.out.println(singleelement.getText());
		
	}

	}

}
