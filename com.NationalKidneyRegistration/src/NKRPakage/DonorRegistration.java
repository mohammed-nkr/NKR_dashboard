package NKRPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DonorRegistration {

		
	
	
public static void main(String[]args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://nkr.donorscreen.fail/register/now");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("Robin");
	driver.findElement(By.id("LastName")).sendKeys("Miller");
	driver.findElement(By.name("Email")).sendKeys("abcd.1234@kidneyregistry.org");
	
	WebElement ddown = driver.findElement(By.name("PreferredLanguage"));
	Select select = new Select(ddown);
	select.selectByIndex(1);

	
	driver.findElement(By.xpath("//input[@id = 'AgreedToHipaa']")).click();
	driver.findElement(By.xpath("//body[@class = 'intake-form']")).click();
	driver.findElement(By.xpath("//button[@type = 'submit']")).click();  //CONTINUE
	//driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();//Continue
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();//captcha
	
	//driver.getTitle();
	//Thread.sleep(5000);
	driver.quit();
	
}
}
