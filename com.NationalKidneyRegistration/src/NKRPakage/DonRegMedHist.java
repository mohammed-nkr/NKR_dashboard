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

public class DonRegMedHist {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver();
		//Test Case_1:
		driver.get("https://nkr.donorscreen.fail/register/continue/226686/CF586639D1F28957");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//TestCase_6: Medical history What's your blood type
				Thread.sleep(5000);
				WebElement ele7 = driver.findElement(By.xpath("//input[@value = 'Unknown' and @id = 'AboType']"));	//blood type
				ele7.click();
				WebElement ele8 = driver.findElement(By.xpath("//input[@id = 'HasHistoryOfHighBp' and @value = 'No']"));  //blood preassure
				ele8.click();
				WebElement ele9 = driver.findElement(By.xpath("//input[@id = 'HasHadCabg' and @value = 'No']"));			//bypass grafting
				ele9.click();
				WebElement rad7 = driver.findElement(By.xpath("//input[@id = 'HasHistoryOfBloodClots' and @value = 'No']"));//blood clots
				rad7.click();
				WebElement rad8= driver.findElement(By.xpath("//input[@id = 'HasHistoryOfCoronaryDisease' and @value = 'No']"));//artery disease
				rad8.click();
				WebElement rad9 = driver.findElement(By.xpath("//input[@id = 'HasHistoryOfHighCholOrTg' and @value = 'No']"));//high cholesterol
				rad9.click();
				WebElement radi = driver.findElement(By.xpath("//input[@id = 'HasStents' and @value = 'No']"));	//coronary stents implanted
				radi.click();
				WebElement radi1 = driver.findElement(By.xpath("//input[@id = 'HistoryChestPainExercise' and @ value = 'No']"));  // chest pain
				radi1.click();
				WebElement radi2 = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='HistoryChestPainOther']"));  // chest pain
				radi2.click();
				WebElement dropdown = driver.findElement(By.xpath("//select[@id='ResultsOfClimbingStairs']"));	//if you walk 2 flights
				Select sel6 = new Select(dropdown);
				sel6.selectByIndex(4);
				//sel6.deselectByValue("0");
				WebElement radi3 = driver.findElement(By.xpath("//input[@id = 'HadStressTestWithinYear' and @value = 'No']"));	//stress test
				radi3.click();
				WebElement radi4 = driver.findElement(By.xpath("//input[@id = 'HasHadStroke' and @value = 'No']"));	//had a stroke?
				radi4.click();
				WebElement radi5 = driver.findElement(By.xpath("//input[@id = 'HasHadLegBypass' and@value = 'No']"));  //surgery on leg
				radi5.click();
				WebElement radi6 = driver.findElement(By.xpath("//input[@name = 'HistoryLungDisease' and @value = 'No']")); //lung disease
				radi6.click();
				WebElement radi7 = driver.findElement(By.xpath("//input [@id = 'HasCopd' and @value = 'No']"));	//COPD
				radi7.click();
				WebElement radi8 = driver.findElement(By.xpath("//input[@id = 'HasTb' and @value = 'No']"));		//Tuberculosis
				radi8.click();
				WebElement radi9 = driver.findElement(By.xpath("//input[@id = 'HistoryPneumonia' and @value = 'No']")); //Pneumonia
				radi9.click();
				WebElement rbtn = driver.findElement(By.xpath("//input[@name = 'HasRespiratoryIssues' and @Value = 'No']"));	//Respiratory Disease
				rbtn.click();
				WebElement rbtn0 = driver.findElement(By.xpath("//input[@id = 'HasGastroIssues' and @value = 'No']"));	//Gastrointestinal
				rbtn0.click();
				WebElement rbtn1 = driver.findElement(By.xpath("//input[@id = 'HistoryGallstones' and @value = 'No']"));	//Gallbladder
				rbtn1.click();
				WebElement rbtn2 = driver.findElement(By.xpath("//input[@name = 'HistoryPancreatitis' and @value = 'No']"));	//Pancreatitis
				rbtn2.click();
				WebElement rbtn3 = driver.findElement(By.xpath("//input[@id = 'HistoryLiverDisease' and @value = 'No']"));	//History of liverDisease
				rbtn3.click();
				WebElement rbtn4 = driver.findElement(By.xpath("//input[@id = 'HasHepB' and @value = 'No']")); 	//Hepatitis B
				rbtn4.click();
				WebElement rbtn5 = driver.findElement(By.xpath("//input[@name = 'HasHepC' and @value = 'No']"));	//Hepatitis C
				rbtn5.click();
				WebElement rbtn6 = driver.findElement(By.xpath("//input[@name = 'HasBleedingProblem' and @value = 'No']"));	//bleeding problem
				rbtn6.click();
				WebElement rbtn7 = driver.findElement(By.xpath("//input[@id = 'HasHadUti' and @value = 'No']"));	//UTI
				rbtn7.click();
				WebElement rbtn8 = driver.findElement(By.xpath("//input[@name = 'HistoryKidneyDamage' and @value = 'No']"));	//injury to kidney
				rbtn8.click();
				WebElement rbtn9 = driver.findElement(By.xpath("//input[@id = 'HistoryProteinuria'and @value = 'No']"));	//portein in urine
				rbtn9.click();
				WebElement rdbtn = driver.findElement(By.xpath("//input[@name = 'HistoryHematuria' and @value = 'No']"));	//blood in Urine
				rdbtn.click();
				WebElement rdbtn0 = driver.findElement(By.xpath("//input[@name = 'HistoryNeuroDisease' and @value = 'No']"));	//Neorological disease
				rdbtn0.click();
				WebElement rdbtn1 = driver.findElement(By.xpath("//input[@name = 'HistorySeizure' and @value ='No']"));	//seizure
				rdbtn1.click();
				WebElement rdbtn2 = driver.findElement(By.xpath("//input[@id = 'HasLupus' and @value = 'No']"));	//Lupus
				rdbtn2.click();
				WebElement rdbtn3 = driver.findElement(By.xpath("//input[@name = 'HistoryParalysis' and @value = 'No']"));	//paralysis
				rdbtn3.click();
				WebElement rdbtn4 = driver.findElement(By.xpath("//input[@id = 'HasArthritis' and @value = 'No']"));	//arthritis
				rdbtn4.click();
				WebElement rdbtn5 = driver.findElement(By.xpath("//input[@id = 'HistoryNeuropathy' and @value = 'No']"));	//neuropathy
				rdbtn5.click();
				WebElement rdbtn6 = driver.findElement(By.xpath("//input[@id = 'HistoryDepression' and @value = 'No']"));	//depression
				rdbtn6.click();
				WebElement rdbtn7 = driver.findElement(By.xpath("//input[@name = 'HistoryAnxiety' and @value = 'No']"));	//Anxiety
				rdbtn7.click();
				WebElement rdbtn8 = driver.findElement(By.xpath("//input[@id = 'HasHistoryOfPsychiatric' and @value='No']"));	//Psychiatric
				rdbtn8.click();
				/*For Female
				 //TestCase_7
				driver.findElement(By.xpath("//input[@id='HistoryFibroidUterus' and @value='No']")).click();	//Fibriod Uterus
				//driver.findElement(By.xpath("//input[@id='HistoryEndometriosis' and @value='No']")).click();	//Endometriosis
				//driver.findElement(By.xpath("//input[@id='HistoryPolycysticOvaries' and @value='No']")).click();	//HistoryPolycysticOvaries
				//driver.findElement(By.xpath("//input[@id='HasHadMiscarriages' and @value='No']")).click();	//miscrraiage
				//driver.findElement(By.xpath("//input[@id='HasHadAbortions'and @Value ='No']")).click();	//Abortions*/
				
				WebElement rdbtn9 = driver.findElement(By.xpath("//input[@id='HasReceivedTransfusion' and @value='No']"));//tranfusions
				rdbtn9.click();
				WebElement radbtn = driver.findElement(By.xpath("//input[@id='HasHistoryOfObesity' and @value='No']"));//obesity
				radbtn.click();
				WebElement radbtn0 = driver.findElement(By.xpath("//input[@name='HasFabrys' and @value='No']")); //fabry's diseases
				radbtn0.click();
				WebElement radbtn1 = driver.findElement(By.xpath("//input[@id='HasSickleCell' and @value='No']")); //sickle cell diseases
				radbtn1.click();
				WebElement radbtn2 = driver.findElement(By.xpath("//input[@id='HasSickleCellTrait' and@value='No']")); //sickle cell trait
				radbtn2.click();
				WebElement radbtn3 = driver.findElement(By.xpath("//input[@id='HasSarcoidosis' and @value='No']")); //
				radbtn3.click();
				WebElement radbtn4 = driver.findElement(By.xpath("//input[@id='HasAutoImmune' and@value='No']"));
				radbtn4.click();
				
				WebElement radbtn5 = driver.findElement(By.xpath("//input[@name='HasHadPhysicalExam' and @value='No']"));
				radbtn5.click();
				WebElement radbtn6 = driver.findElement(By.xpath("//input[@id='HasHadMammogram' and @value='No']"));
				radbtn6.click();
				WebElement radbtn7 = driver.findElement(By.xpath("//input[@id='HasHadPapSmear' and @value='No']"));
				radbtn7.click();
				WebElement radbtn8 = driver.findElement(By.xpath("//input[@id='HasHadPsaTest' and @value='No']"));//newly added
				radbtn8.click();
				WebElement radbtn9 = driver.findElement(By.xpath("//input[@name='HasHadColonoscopy' and @value='No']"));
				radbtn9.click();
				driver.findElement(By.xpath("//textarea[@id='AdditionalComments']")).sendKeys("No more medical history to added. Let's go to next page.");
				//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
				Thread.sleep(5000);
				
				driver.quit();
		
		
	}

}
