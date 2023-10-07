package WEBELEMENT;

import java.io.Serial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListofWebElement1 {

	public static void main(String[] args) throws Throwable   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("tiffin box");
	    Thread.sleep(5000);
	    
	    List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	    System.out.println(list.size());
	    for (WebElement singleElement: list) {
	    	   System.out.println(singleElement.getText());
			
		}
		
		
		
	}

}
