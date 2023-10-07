package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageScreenShort {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//Webpage ScreenShort 
        
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File Desticationfile1 = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\Screenshotspics2\\joy.jpeg");
		FileUtils.copyFile(scr, Desticationfile1);
		Thread.sleep(60000);
		driver.close();
		
		//webpage part Screenshort
		
		/*WebElement partele = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-large'])[1]"));
		 File src = partele.getScreenshotAs(OutputType.FILE);
		 File Desticationfile = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\Screenshotspics2\\suhial.jpeg");
		 
		 FileUtils.copyFile(src, Desticationfile);
		Thread.sleep(5000);
		driver.close();*/
		
		/*Web ElementScreenShort
		String localtimeanddate = LocalDateTime.now().toString().replace(':', '-');
		
		WebElement partele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		 File src = partele.getScreenshotAs(OutputType.FILE);
		 File Desticationfile = new File("C:\\Users\\hp\\eclipse-workspace\\SELENIUJM_APRIL\\Screenshotspics2\\pavan"+localtimeanddate+".jpeg");
		 
		 FileUtils.copyFile(src, Desticationfile);
		Thread.sleep(5000);
		driver.close();*/
		
		

	}

}
