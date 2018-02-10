package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowFileUpload {

	public static void getWebsite(String website, WebDriver driver){
		driver.get(website);
		driver.findElement(By.id("file")).click();
	}
		
	public static void selectFile(String fileLocation) {
        try {
    		StringSelection selection = new StringSelection(fileLocation);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
         	Robot robot=new Robot();
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
	
	public static void uploadFile(WebDriver driver){
		driver.findElement(By.id("submit_button")).click();
	}
	
	//Using AutoIT
	//Runtime.getRuntime().exec("exe file");
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		getWebsite("https://image.online-convert.com/convert-to-png",driver);
		selectFile("C:\\EclipseWorkspace\\ayushman.jpg");
		uploadFile(driver);
	}
}