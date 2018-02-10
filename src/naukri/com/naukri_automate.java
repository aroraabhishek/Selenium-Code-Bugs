package naukri.com;

//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_automate {

//	WebDriver driver=null;
//	ChromeOptions options = new ChromeOptions();
//	WebDriver driver = new ChromeDriver(options);
//	options.addArguments("-incognito");
//	options.addExtensions(new File("C:\\Users\\RAJAT\\Downloads\\extension_1_14_24_0.crx"));
//	DesiredCapabilities capabilities = new DesiredCapabilities();
//	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//	driver = new ChromeDriver(capabilities);
			
	
	void openWebsite(WebDriver driver){
		driver.get("http://www.naukri.com");
	}
	
	
	void login(WebDriver driver){
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.name("email")).sendKeys("abhishek.arora22@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("akshitanaman");
		driver.findElement(By.id("pLogin")).sendKeys(Keys.ENTER);
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		naukri_automate na=new naukri_automate();
		na.openWebsite(driver);
		na.login(driver);
	}
}
