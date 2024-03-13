package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		String homewindow = driver.getWindowHandle();
		System.out.println("Home window is : "+homewindow);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		//shows all opened window
		Set<String> TotalWindow = driver.getWindowHandles();
		System.out.println("TotalWindow are :" +TotalWindow);
		
		List<String> list = new ArrayList<String>(TotalWindow);
		driver.switchTo().window(list.get(1));
		
		//switching the WebDriver focus to the second window 
		String text = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		System.out.println(text);
		System.out.println("1st window URL is :" +driver.getCurrentUrl());
		
		Set<String> TotalWindow1 = driver.getWindowHandles();
		list.clear();
		list.addAll(TotalWindow1);
		driver.switchTo().window(list.get(0));
		
		System.out.println("Home Window URL is :" + driver.getCurrentUrl());

	}

}

OUTPUT:
Home window is : 12F678264EBAEBD2BB7D4C0671C7FDCB
TotalWindow are :[12F678264EBAEBD2BB7D4C0671C7FDCB, B33352AED46E7C35E239EABD7EF25A09]
New Window
1st window URL is :https://the-internet.herokuapp.com/windows/new
Home Window URL is :https://the-internet.herokuapp.com/windows
