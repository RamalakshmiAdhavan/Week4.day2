package week4day2;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class UniqueErail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//td[@id='tdDateOnly']/input")).click();
		
		//clear and type in the source station 
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("MSB");
		from.sendKeys(Keys.TAB);
	}

}
