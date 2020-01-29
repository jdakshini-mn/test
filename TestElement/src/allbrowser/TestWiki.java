package allbrowser;

//import IO.GITHUB.BONIGARCIA.WDM.WEBDRIVERMANAGER;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWiki {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window or FullScreen
		//driver.get("https://login.salesforce.com/");
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Eesti");
		//System.out.println(select.getOptions());
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(7).getText());
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i).getAttribute("value"));
		
			
			
			
			
		}
		
		//driver.close();
	}

	


		
	

}