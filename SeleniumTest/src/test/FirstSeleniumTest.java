package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/Selenium/chromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumhq.org/");
		driver.quit();
	}
}
