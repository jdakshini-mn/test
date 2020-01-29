package allbrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Poll {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://timesofindia.indiatimes.com/poll.cms");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String captcha = driver.findElement(By.id("mathq2")).getText();
		
		String capta = driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='mathq2']")).getText());
		
		System.out.println("The capta is " + ": " + capta + " :");

		//System.out.println("The capta is " + ": " + captcha + " :");

		//13, 15, 17

		//String[] splitstring=captcha.split(" ");
		
		String[] splitstring=capta.split(" ");

		int num1 =Integer.parseInt(splitstring[0]);

		int num2 =Integer.parseInt(splitstring[2]);

		char operand = splitstring[1].charAt(0);

		System.out.println("First value is "+ num1);

		System.out.println("Second value is "+ num2);

		if(operand == '+') {
			//int i = (num1+num2);
			//driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys("(num1+num2)");

		System.out.println("The sum is " +(num1+num2));

		}else if(operand == '-') {

		System.out.println("The sub is"+(num1-num2));

		}else if(operand == '*') {

		System.out.println("The mul is "+(num1*num2));

		}else if(operand == '/') {

		System.out.println("The div is "+(num1/num2));

		}

		//driver.quit();
			

	}
	
}