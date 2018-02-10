package Windows_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsSession {

	/**
	 * 1. Window Popup
	 * 2. Alert
	 * 3. Iframe
	 * 4. CUstom <Ignore>
	 * @throws InterruptedException 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("button[onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent(); //main html/body
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("a[title=\"Change Orientation\"]")).click();
	}
}