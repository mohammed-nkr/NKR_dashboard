package NKRPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.internal.StringUtils;

public class DonorScreeningQuestions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nkr.donorscreen.fail/register/donate/226698/D8E45EE2D0FB6E12");
		Thread.sleep(15000);

		driver.findElement(By.xpath("//a[@class='btn btn-success dash-step-btn']")).click();
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("3471234532");
		driver.findElement(By.xpath("//input[@name = 'PostalCode']")).sendKeys("11412");
		driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		driver.findElement(By.xpath("//input[@name = 'BirthDate']")).sendKeys("5/7/1973");
		WebElement ddown1 = driver.findElement(By.xpath("//select[@name = 'HeightFeet']"));
		Select select1 = new Select(ddown1);
		select1.selectByIndex(2);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name = 'HeightInches']"));
		Select select2 = new Select(dropdown);
		select2.selectByIndex(8);
		driver.findElement(By.xpath("//input[@id = 'WeightLbs']")).sendKeys("166");
		driver.findElement(By.xpath("//input[@id='IsResidingInUSA' and @value='True']")).click();
		driver.findElement(By.xpath("//input[@id='IsCurrentlyIncarcerated' and @value='False']")).click(); //incarcerated
		driver.findElement(By.xpath("//button[@class ='btn btn-primary btn-lg']")).click();  //continue
		
		driver.findElement(By.xpath("//input[@id='WillAcceptTransfusions' and @value='True']")).click(); //transfusions in an emergency
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		//driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();  //Yes, that's correct 
		driver.findElement(By.xpath("//input[@id='HasHadOrganDisease' and@value='False']")).click(); 	//Diagnosed kidney diseasese
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
	
		driver.findElement(By.xpath("//input[@id='HasHadHeartAttack' and @value='False']")).click(); 	//heart attack
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasDiabetes' and @value='False']")).click(); 		//diabetes
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasHadCancer'and @value = 'False']")).click();  	//cancer
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']]")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasHadKidneyStones' and@value='False']")).click();	//kidney stone
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();  //continue
		
		driver.findElement(By.xpath("//input[@value = 'False' and@ id = 'HasUsedTobacco']")).click();	//used Tobaco?
		driver.findElement(By.xpath("//button[@ class = 'btn btn-primary btn-lg']")).click();	//continue
		
		driver.findElement(By.xpath("//input[@id = 'HasHiv' and @value = 'No']")).click();	//HIV
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//continue
		
		driver.findElement(By.xpath("//input[@name = 'HasIntendedRecipient' and @value = 'False']")).click();	//current situation
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//Continue
		
		driver.findElement(By.xpath("//input[@id='VoucherEducationChoice' and @value='WantsToLearnMore']")).click();	//learn more about fam voucher
		driver.findElement(By.className("//button[@class = 'btn btn-primary btn-lg']")).click();	//continue
		//Screening Summary
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();//done
		
		
		
		
		
		
	}

}
