package java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Registration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Projectwork\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" http://automationpractice.com/index.php");
		
		  
		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  
		  //Enter email address
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("test1249@test.com");
		  
		  //Click on "Create an account"
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  
		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  
		  // Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Test User");
		  driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  
		  // Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("51838");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		  driver.findElement(By.name("submitAccount")).click();
		  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();

		  // Validate that user has created
		  if(userText.contains("Vsoft")) {
		   System.out.println("User Verified,Test case Passed");
		  }
		  else {
		   System.out.println("User Verification Failed,Test case Failed");
		  }
	}
	

}
