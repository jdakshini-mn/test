package allbrowser;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragnDrop {

	public static WebDriver driver;
	
	/*public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			return false;
		}
		
		int size = driver.findElements(by).size();
		if(size==0) 
			return false;
		 else {
			return true;
		 }
	}*/
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//driver.manage().window().maximize(); //Maximize window or FullScreen
		
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
				
		Actions action = new Actions(driver);
		
		action.dragAndDrop(draggable, droppable).perform();
		
		action.dragAndDropBy(draggable, 500, 600).perform();
		
	}
}

