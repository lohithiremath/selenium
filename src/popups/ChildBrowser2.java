package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowser2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.skillrary.com/freeCourses?page=18");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  String parent = driver.getWindowHandle();
	  
	  driver.findElement(By.xpath("//a[contains(.,' GEARS ')] ")).click();
	  driver.findElement(By.xpath("(//a[contains(.,' SkillRary Essay')])[2]")).click();
	  
	  Set<String> child = driver.getWindowHandles();
	  System.out.println(child);
	  for (String c : child) {
		  driver.switchTo().window(c);
		
	}
	   
	   driver.findElement(By.id("mytext")).sendKeys("RCB");
	  
	}

}
