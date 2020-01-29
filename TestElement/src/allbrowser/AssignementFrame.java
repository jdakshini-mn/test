package allbrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementFrame {

	public static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
			//Maximize window or FullScreen
			driver.manage().window().maximize(); 
			//implicitlyWait for 10 second before element is available
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
				
			//Total number of iframes
			System.out.println("Total iFrames" + frames.size());

					int i = 0;

					for (WebElement frame: frames) {

						driver.switchTo().frame(frame);
						//Printing out current iframe
						System.out.println("Switched to iframe" + (++i));
						//defaultContent() method selects either the first frame on the page, or the main document when a page contains iframes.
						driver.switchTo().defaultContent();
						
	}
					


	}

	
}
