package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShort2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		 TakesScreenshot homePageLinkedIn = (TakesScreenshot)driver;
		 File temp = homePageLinkedIn.getScreenshotAs(OutputType.FILE);
		 String DateandTime = LocalDateTime.now().toString().replace(';','-');
		   
		 
		 File Destination = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\DestinationScreenshor\\joy.420"+DateandTime+".jpeg");
		 FileUtils.copyFile(temp, Destination);
		 Thread.sleep(50000);
		 
	}
	

}
