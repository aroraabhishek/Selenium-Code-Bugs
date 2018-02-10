package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot_Session {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\EclipseWorkspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/RanveerOfficial?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("ranveer.png"));
		driver.quit();
	}
}