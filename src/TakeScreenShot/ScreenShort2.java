package TakeScreenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShort2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		TakesScreenshot homePage=(TakesScreenshot)driver;
	    File temp = homePage.getScreenshotAs(OutputType.FILE);
	    System.out.println(temp);
	    Thread.sleep(50000);
	    String DateandTime = LocalDateTime.now().toString().replace(':','-');
	    
//	    File destination = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\DestinationScreenshor\\joy.420"+DateandTime+".jpeg");
//	    FileUtils.copyFile(temp, destination);
//		 Thread.sleep(5000);
//		 
	}

}
