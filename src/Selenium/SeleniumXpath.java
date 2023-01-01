package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.diver","C:\\\\Users\\\\Tekarsh\\\\eclipse-workspace\\\\Introduction\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//*[@id="email"]
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arafat");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@id='non']"));
		jdfgdfdgkdfhgjkdfhgskjdfhgksdfhg;
	}

}
