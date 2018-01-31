package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_sessions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		Actions act = new Actions(driver);
		act.dragAndDropBy(driver.findElement(By.id("draggable")), 100, 100).build().perform();
		//act.clickAndHold(driver.findElement(By.id("draggable"))).moveByOffset(100, 100).release().contextClick().build().perform();
	}
}