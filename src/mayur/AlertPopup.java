package mayur;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display')]")).click();
		Alert a= driver.switchTo().alert();
		Thread.sleep(5000);
		String text = a.getText();
		System.out.println(text);
		a.accept();
		Thread.sleep(2000);
		
	}
}
