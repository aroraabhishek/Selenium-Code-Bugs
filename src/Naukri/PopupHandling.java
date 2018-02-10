package Naukri;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		String mainWindow = driver.getWindowHandle();
		//System.out.println(mainWindow);
		Set<String> allWindow = driver.getWindowHandles();
		for(String s : allWindow){
			driver.switchTo().window(s);
			if(!s.equals(mainWindow)){
				driver.close();
			}
		}

		//driver.switchTo().defaultContent();
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());	
	}
}