package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSIze {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension windowsize = driver.manage().window().getSize();
		 int WindowHight = windowsize.getHeight();
		   System.out.println(WindowHight);
		   int windowWidth = windowsize.getWidth();
//		   System.out.println(windowWidtq);
		
		

	}

}
