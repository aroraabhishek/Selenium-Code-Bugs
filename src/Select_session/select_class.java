package Select_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");	
	Select ss=new Select(driver.findElement(By.id("sort")));
	ss.selectByValue("dfs");
	
	ss.isMultiple(); // to find if drop-down is multiple select-able
	
	}
}
