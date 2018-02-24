package Testng_session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Selenium {

	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	}
	
	@AfterTest
	public void quit(){
		driver.quit();
	}
	
	@Test(dataProvider="celebrityList")
	public void searchTest(String key, String result){
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(key);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String name=driver.findElement(By.cssSelector("div[data-local-attribute='d3bn']")).getText();
		Assert.assertEquals(name, result);
	}
	
	@DataProvider
	public String[][] celebrityList(){
		String[][] data={
				{"Neha","Neha Kakkar"},
				{"Amitabh","Amitabh Bachchan"},
				{"Sachin","Sachin Tendulkar"}
		};
		return data;
	}
}