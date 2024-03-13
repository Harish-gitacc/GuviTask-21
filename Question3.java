package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		 // Switch to the top frame
		driver.switchTo().frame("frame-top");
		// Verify there are three frames on the page
		int FrameCount = driver.findElements(By.xpath("/html[contains(.,'TOP')]")).size();
		if(FrameCount ==3)
		{
			System.out.println("There are three frames");
		}
		else
		{
			System.out.println("There are no three frames ");
			
		}
		
		 driver.switchTo().frame("frame-left");
	        
	        // Verify the left frame has a text "LEFT"
	        String leftFrameText = driver.findElement(By.xpath("/html[contains(.,'LEFT')]")).getText();
	        if (leftFrameText.contains("LEFT"))
	        {
	            System.out.println("We are in Left frame and it contains text 'LEFT'");
	        } 
	        else 
	        {
	            System.out.println("We are not in Left frame and it dosen't contain text 'LEFT'");
	        }
	        
	        // Switch back to the top frame
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("frame-top");
	        
	        // Switch to the middle frame
	      driver.switchTo().frame("frame-middle");
	        
	         // Verify the middle frame has a text "MIDDLE"
	         String middleFrameText = driver.findElement(By.xpath("//body/div[contains(.,'MIDDLE')]")).getText();
	         
	        if (middleFrameText.contains("MIDDLE")) 
	        {
	            System.out.println("We are in Middle frame and it contains text 'MIDDLE'");
	        } 
	        else
	        {
	            System.out.println("We are not in Middle frame and it dosen't contain text 'MIDDLE'");
	        }
	        
	        // Switch back to the top frame
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("frame-top");
	        
	        // Switch to the right frame
	        driver.switchTo().frame("frame-right");
	        
	        // Verify the right frame has a text "RIGHT"
	        String rightFrameText = driver.findElement(By.xpath("/html[contains(.,'RIGHT')]")).getText();
	        
	       if (rightFrameText.contains("RIGHT")) 
	        {
	            System.out.println("We are in Right frame and it contains text 'RIGHT'.");
	        } 
	        else
	        {
	            System.out.println("We are not in Right frame and it dosen't contain text 'RIGHT'.");
	        }
	        
	        // Switch back to the top frame
	       driver.switchTo().defaultContent();
			driver.switchTo().frame("frame-bottom");
			WebElement BottomFrameText=driver.findElement(By.xpath("/html[contains(.,'BOTTOM')]"));
			String bottom=BottomFrameText.getText();
			System.out.println("We are in Bottom frame asn it contains text "+bottom);
	        
			String pageTitle = driver.getTitle();
	        if (pageTitle.equals("Frames"))
	        {
	            System.out.println("Page title is 'Frames'.");
	        }
	        else
	        {
	            System.out.println("Page title is not 'Frames'.");
	        }
	        driver.quit();
	}

}

OUTPUT:
There are no three frames 
We are in Left frame and it contains text 'LEFT'
We are in Middle frame and it contains text 'MIDDLE'
We are in Right frame and it contains text 'RIGHT'.
We are in Bottom frame asn it contains text BOTTOM
Page title is not 'Frames'.
