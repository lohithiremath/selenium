package WEBELEMENT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigetMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iphone 14 pro max");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//   List<WebElement> allmobiles = driver.findElements(By.cssSelector("a[rel='noopener noreferrer']"));
		//  for (WebElement single  : allmobiles) {
		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		int count=allPhones.size();
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../../div/div[2]/div[1]/div[1]/div[1]"));
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println("Name of the phone: "+allPhones.get(i).getText()+" and Price is: "+allPrice.get(i).getText());
		}



	}


}


