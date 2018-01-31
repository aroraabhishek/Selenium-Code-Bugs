package MakemyTrip;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytrip_automation {

	public static String getNextDate(int addDate){
		SimpleDateFormat formattedDate = new SimpleDateFormat("d"); 
		Calendar c = Calendar.getInstance();        
		c.add(Calendar.DATE, addDate);  // number of days to add      
		String nextDate = (String)(formattedDate.format(c.getTime()));
//		System.out.println(nextDate);
		return nextDate;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);	
		driver.findElement(By.cssSelector("label[for='switch__input_2']")).click();
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Pune");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[aria-label=\"Top Cities : Pune, India\"]")));
		driver.findElement(By.cssSelector("li[aria-label=\"Top Cities : Pune, India\"]")).click();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Mumbai");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[aria-label=\"Top Cities : Mumbai, India\"]")));
		driver.findElement(By.cssSelector("li[aria-label=\"Top Cities : Mumbai, India\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(getNextDate(1))));
		driver.findElement(By.linkText(getNextDate(1))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(getNextDate(20))));
		driver.findElement(By.linkText(getNextDate(20))).click();
		driver.findElement(By.id("hp-widget__paxCounter")).click();
		driver.findElements(By.cssSelector("#js-adult_counter li")).get(1).click();
		driver.findElements(By.cssSelector("#js-child_counter li")).get(1).click();
		driver.findElement(By.cssSelector(".close_pax")).click();
		driver.findElement(By.id("hp-widget__class")).click();
		driver.findElement(By.cssSelector("label[for=\"classBTN__input_1\"]")).click();
		driver.findElement(By.id("searchBtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".wrap-dep div[data-flt-index='0'] .splt_orgnl_prce")));
		driver.findElement(By.cssSelector(".wrap-dep div[data-flt-index=\"0\"]")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();	
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".wrap-ret div[data-flt-index='1'] .splt_orgnl_prce")));
		driver.findElement(By.cssSelector(".wrap-ret div[data-flt-index=\"1\"]")).click();
		driver.findElement(By.linkText("Book")).click();
	}
}