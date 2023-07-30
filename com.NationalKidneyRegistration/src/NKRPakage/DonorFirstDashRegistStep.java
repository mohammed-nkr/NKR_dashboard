package NKRPakage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DonorFirstDashRegistStep {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver();
		//Test Case_1:
		driver.get("https://nkr.donorscreen.fail/register/now");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("Govind");
		driver.findElement(By.id("LastName")).sendKeys("Panwar");
		driver.findElement(By.name("Email")).sendKeys("gpanwar@kidneyregistry.org");
		
		WebElement ddown = driver.findElement(By.name("PreferredLanguage"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id = 'AgreedToHipaa']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//body[@class = 'intake-form']")).click();
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();  //CONTINUE
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();//Yes, that is correct and, go to smtp4dev
		driver.get("http://173.251.53.123:5000/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr[1]/td/a/table/tbody/tr/td")).click();
		Thread.sleep(8000);
		//WebElement link = driver.findElement(By.linkText("Start the Questionnaire"));
		//link.click();
		/*Actions actions = new Actions();
		WebElement Messages = driver.findElement(By.xpath("//body[@style='height: 100%; width: 100%;']"));
		actions.moveToElement(Messages);
		driver.findElement(By.xpath("//td[@valign='middle']")).click();*/
		
		/*Actions actions1 = new Actions();
		WebElement View= driver.findElement(By.xpath("//body[@style='height: 100%; width: 100%;']"));
		actions1.moveToElement(View);
		driver.findElement(By.xpath("//a[@title='Start the Questionnaire']")).click();*/
		driver.quit();
		
	}

}
