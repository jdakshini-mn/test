package allbrowser;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSliders {

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
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize(); //Maximize window or FullScreen
		
		//implicitlyWait for 10 second before element is available
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mainslider = driver.findElement(By.id("slider"));
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']"));
		
		int width = mainslider.getSize().width/2;
				
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, width, 0).perform();
		
		
		
	}
}

