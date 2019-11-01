package allbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printlinks {

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
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[8]/div[3]"));
		//List<WebElement> links1 = block.findElements(By.tagName("a"));
		
		
		select.selectByVisibleText("Eesti");
		//System.out.println(select.getOptions());
		List<WebElement> links2 = block.findElements(By.tagName("a"));

		//System.out.println(links.get(7).getText());
		
		for(WebElement link:links2) {
			System.out.println(link.getText()+"  --URL is --"+link.getAttribute("href"));
		
			
			
			
		}
		System.out.println("Size is - "+links2.size());
		//driver.close();
	}

	


		
	

}