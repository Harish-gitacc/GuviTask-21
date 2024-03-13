package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); 
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		Thread.sleep(50);
		driver.findElement(By.xpath("//p")).sendKeys("Hellow people");

	}

}
