package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia 1100");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		//System.out.println(driver.findElement(By.id("s-result-count")).getText());
		//driver.findElement(By.linkText("Nokia 105 (Black)")).click();
		driver.findElement(By.partialLinkText("Hello. Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9899982622");
		driver.findElement(By.id("continue")).click();;
		driver.findElement(By.id("ap_password")).sendKeys("akshitanaman");
		driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
		driver.wait(1000);
//		driver.findElement(By.className("a-button-input")).click();
//		driver.findElement(By.cssSelector("#nav-logo .nav-logo-tagline")).click();
		driver.quit();	
	}
}