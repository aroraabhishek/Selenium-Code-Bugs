package redbus.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus_automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.getTitle().compareToIgnoreCase("Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus");
		Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.className("selected")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal table tbody tr:nth-child(6) td:nth-child(4)")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".bnr-message")).getText().contains("Buses in this route have Live Tracking enabled");
		
		//for unique number go for epochd
		
	}
}