package cloadHosting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RunTest {
	
	@Test
	public void runTest() { // for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://3.6.37.253:8080/webapp/");
		String text = driver.findElement(By.linkText("Get in touch")).getText();
		if(text.equals("Get in touch"))
			System.out.println(text);
		String title = driver.getTitle();
		if(title.equals("myHost - Cloud Hosting"))
			System.out.println(title);
		driver.close();
	}
	
}
