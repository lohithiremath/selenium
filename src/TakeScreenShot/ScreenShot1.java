package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot1 {
	public static void main(String[] args) throws IOException, Throwable {
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement EmailID = driver.findElement(By.id("email"));
		
		TakesScreenshot EmailID1=(TakesScreenshot)driver;
		 String Dateandtime = LocalDateTime.now().toString().replace(':', '-');
		File temp = EmailID1.getScreenshotAs(OutputType.FILE);
		
		File DestinationFile = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\Screenshorts\\lohit123"+Dateandtime+".jpeg");
		FileUtils.copyFile(temp, DestinationFile);
		
	}
	

}
