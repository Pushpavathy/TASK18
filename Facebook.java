package methodaction;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Launch chrome browser
		
	WebDriver driver = new ChromeDriver();

// launch the URL
	driver.get("https://www.facebook.com/");

// maximize the browser
	driver.manage().window().maximize();
	
//implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Verifying the launched website details.
	String title = driver.getTitle();
	
	System.out.println(title);
	
	if (title.contains("Facebook"))
	{
		System.out.println("website has been redirected to Facebook Homepage ");
		
	}
	else
	{
		System.out.println("website is not redirected to Facebook Homepage");
	}
// Click on create new account option	
	WebElement newacc = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
	newacc.click();

//Enter the name details, mobile,password details
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("Mandoes");
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	lastname.sendKeys("Kaniya");
	
	WebElement mail = driver.findElement(By.name("reg_email__"));
	mail.sendKeys("whitesnow12@gmail.com");
	
	WebElement confirmail = driver.findElement(By.name("reg_email_confirmation__"));
	confirmail.sendKeys("whitesnow12@gmail.com");
	
	WebElement passwrd = driver.findElement(By.name("reg_passwd__"));
	passwrd.sendKeys("Qwertyuiop@123");
	
// Selecting birthday
	
	WebElement bdate = driver.findElement(By.name("birthday_day"));
	Select bdaydate = new Select(bdate);
	bdaydate.selectByValue("11");
	
	WebElement bmonth = driver.findElement(By.name("birthday_month"));
	Select bdaymonth = new Select(bmonth);
	bdaymonth.selectByValue("5");
	
	WebElement byear = driver.findElement(By.name("birthday_year"));
	Select bdayyear = new Select(byear);
	bdayyear.selectByValue("1985");
	
// Selecting gender
	
	WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
	radio.click();
	
//Click on Signup
	
	WebElement signup = driver.findElement(By.name("websubmit"));
	signup.click();	
	
	}

}
