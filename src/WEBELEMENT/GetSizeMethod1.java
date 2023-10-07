package WEBELEMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetSizeMethod1 {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(5));
      WebElement username = driver.findElement(By.id("email"));
       Dimension size = username.getSize();
       int height = size.getHeight();
       System.out.println(height);
       int width = size.getWidth();
       System.out.println(width);
      
  }

}
