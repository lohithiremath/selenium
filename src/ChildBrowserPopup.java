import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
   public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.navigate().to("https://www.flipkart.com/");
	   
	    
	   
	   
	   
}

}
