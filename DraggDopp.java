package methodaction;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggDopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// Launch Browser
		
		WebDriver driver = new ChromeDriver();
		
// get the url
		driver.get("https://jqueryui.com/droppable/");
		
//Maximize the browser
		driver.manage().window().maximize();

//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//Switch to frames.
		driver.switchTo().frame(0);
		
//Get the Drag and Drop drop element.
		WebElement dragg = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		String droppp = drop.getText();
		System.out.println("Text of the target before drop:" + droppp);
		
//Action class and perform dragg
		
		Actions droppped = new Actions(driver);
		droppped.dragAndDrop(dragg, drop).perform();
		
//Verify the Dropped message
		String dropped = drop.getText();
		System.out.println("Text of the target after dropped is : " +dropped );
		 String colour = drop.getCssValue("background-color");
		System.out.println("Colour of the Target" +colour);
		
		
		
		
	}

}
