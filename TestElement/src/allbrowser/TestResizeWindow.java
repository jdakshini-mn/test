package allbrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestResizeWindow {
 
	public static void main(String[] args) {
 
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	for(int i=300;i<=1000;i++)
	{
		Dimension dimension = new Dimension(i, i);
		driver.manage().window().setSize(dimension);
	}
	driver.quit();
	}
}
