package NKRPakage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DonorRegistration1A {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver();
		//Test Case_1:
		driver.get("https://nkr.donorscreen.fail/register/now");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("kbc");
		driver.findElement(By.id("LastName")).sendKeys("xym");
		driver.findElement(By.xpath("//input[@id='PreferredName']")).sendKeys("zxc");
		driver.findElement(By.name("Email")).sendKeys("klm@kidneyregistry.org");
		
		WebElement ddown = driver.findElement(By.name("PreferredLanguage"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id = 'AgreedToHipaa']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();  //CONTINUE
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();//Yes, that is correct and, go to smtp4dev
		//TestCase_2:
		driver.get("http://173.251.53.123:5000/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/div[1]")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//td[@style='font-family: Arial; font-size: 16px; padding: 18px;']")).click(); //Start Questionnaire
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		
		driver.get("https://nkr.donorscreen.fail/register/donate/226736/16DBB17BE9ADCBAD");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		Thread.sleep(1000);
		//Test Case_3: Screening Summary
		driver.close();
		//driver.quit();
		
	File fscreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(fscreenshotFile, new File(".//screenshot/screen.png"));
	}
	
	}


