package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tekarsh\\eclipse-workspace\\Introduction\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // whatever you are landed on current URL
		driver.get("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
 
	}

} 
