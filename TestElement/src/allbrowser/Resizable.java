package allbrowser;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			return false;
		}*/
		
		int size = driver.findElements(by).size();
		if(size==0) 
			return false;
		 else {
			return true;
		 }
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		//driver.manage().window().maximize(); //Maximize window or FullScreen
		
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mainresizablebox = driver.findElement(By.id("resizable"));
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
				
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(resizable, 200, 200).perform();
		
		
		
	}
}

