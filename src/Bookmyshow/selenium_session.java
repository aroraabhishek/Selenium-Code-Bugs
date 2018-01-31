package Bookmyshow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_session {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookmyshow.com");
		driver.findElement(By.partialLinkText("Pune")).click();
		Thread.sleep(4000);
//		driver.findElement(By.id("wzrk-confirm")).click();
		driver.findElement(By.linkText("MOVIES")).click();
		
		//element[attr='value']
		driver.findElement(By.cssSelector("input[placeholder='Book Tickets for Movies, Events, Plays & Sports']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Book Tickets for Movies, Events, Plays & Sports']")).sendKeys("Jumanji");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".tt-suggestion")).click();
		driver.findElement(By.cssSelector("[data-showtime-code='0930'][data-venue-code='PVPN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pop_10")).click();
		driver.findElement(By.cssSelector("#layout table tr:last-child ._available")).click();
		driver.findElement(By.id("btmcntbook")).click();
	}
}