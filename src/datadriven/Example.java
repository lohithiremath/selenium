package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws IOException {
		
		Properties pdata= new Properties();
		FileInputStream fis=new FileInputStream("./data.Properties");
		pdata.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.get(pdata.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));
	   driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));
	}
9
}
