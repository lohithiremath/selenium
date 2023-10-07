package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandal {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demoqa.com/browser-windows");
		//String MainWindow= driver.getWindowHandle();
		//System.out.println(MainWindow);
	    WebElement newWindowButton = driver.findElement(By.id("windowButton"));
	    System.out.println(newWindowButton.getSize());
	    //newWindowButton.click();
	    //Set<String> Windowids = driver.getWindowHandles();
	   // System.out.println("total no of windowids"+ Windowids.size());
		
	}
		

}
