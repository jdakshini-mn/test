package allbrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOnNaukri {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> iterate = windowHandles.iterator();

		String First_window = iterate.next();

		String Second_Window = iterate.next();

		String Third_Window = iterate.next();

		driver.switchTo().window(Second_Window);

		System.out.println(driver.getTitle());

		driver.switchTo().window(Third_Window);

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(Second_Window).close();

		driver.switchTo().window(First_window).close();
	}
}