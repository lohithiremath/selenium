package Testg;

import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
