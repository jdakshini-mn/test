package Firefox;

import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.Slicing;



public class testFirefox {

	public static  void main(Slicing[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/jdakshini/eclipse-workspace/Jars/geckodriver⁩⁩");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");

	}

}
