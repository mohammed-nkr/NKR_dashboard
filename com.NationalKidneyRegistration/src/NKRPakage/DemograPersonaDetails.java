package NKRPakage;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemograPersonaDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nkr.donorscreen.fail/register/continue/226733/9D49145E98DF6DD1");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		//TestCase_5: Demogr/Per
				WebElement drdown = driver.findElement(By.xpath("//select[@id = 'countryOfResidence']"));
				Select select3 = new Select(drdown);
				select3.selectByVisibleText("United States");
				driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("112-16 206 ST.");
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Saint Albans");
				
				WebElement droppdown = driver.findElement(By.xpath("//select[@id='state']"));
				Select select4 = new Select(droppdown);
				select4.selectByVisibleText("New York");
				
				driver.findElement(By.xpath("//input[@name = 'PostalCode']")).sendKeys("11412");
				
				WebElement dropppdown = driver.findElement(By.xpath("//select[@id='Ethnicity']"));
				Select select5 = new Select(dropppdown);
				select5.selectByIndex(3);
				WebElement droppppdown = driver.findElement(By.xpath("//select[@id='ContactBestStartHour']"));	//best time
				Select select6 = new Select(droppppdown);
				select6.selectByIndex(1);	
				WebElement dropppppdown = driver.findElement(By.xpath("//select[@id='ContactBestEndHour']"));
				Select select7 = new Select(dropppppdown);
				select7.selectByIndex(4);
				driver.findElement(By.xpath("//input[@id='EmergencyContact']")).sendKeys("Kiran"); //Emergency Contact Name
				driver.findElement(By.xpath("//input[@id='EmergencyContactPhone']")).sendKeys("3475401230");	//Emergency Contact Number
				WebElement element = driver.findElement(By.xpath("//select[@id='EmergencyContactRelationship']"));	//Relationship
				Select sel = new Select(element);
				sel.selectByIndex(1);
				WebElement element1 = driver.findElement(By.xpath("//select[@id = 'MaritalStatus']"));	//marital Status
				Select sel1= new Select(element1);
				sel1.selectByIndex(1);
				
				WebElement element2 = driver.findElement(By.xpath("//select[@name='EmploymentStatus']"));		//Work Status
				Select sel2 = new Select(element2);
				sel2.selectByVisibleText("Unemployed");	//Work Status
				
				WebElement element3 = driver.findElement(By.xpath("//select[@id='ExerciseRoutine']"));	//Exercise
				Select sel3 = new Select(element3);
				sel3.selectByIndex(3);
				
				WebElement element4 = driver.findElement(By.xpath("//select[@id='EducationLevel']"));		//Education
				Select sel4 = new Select(element4);
				sel4.selectByIndex(3);
				
				WebElement raad = driver.findElement(By.xpath("//input[@name = 'HasHealthInsurance' and @value = 'True']"));		//Helth Insurance
				raad.click();
				
				driver.findElement(By.xpath("//input[@id = 'PhysicianName']")).sendKeys("Dr. Rahman");				//Physician's Name
				driver.findElement(By.xpath("//input[@name = 'PhysicianCity']")).sendKeys("Jamaica, NY");		//Physician's City
				
				WebElement element5 = driver.findElement(By.xpath("//select[@id='PhysicianState']"));		//Physicians State
				Select sel5 = new Select(element5);
				sel5.selectByVisibleText("New York");	
				
				driver.findElement(By.xpath("//textarea[@id='MotivationToDonate']")).sendKeys("Like to save lives!");	//text
				driver.findElement(By.xpath("//button[@id='submitBtn']")).click();		//Continue
				Thread.sleep(1200);
				
				//pop-up on address. No,this is correct,//Submited Address
				driver.findElement(By.xpath("//button[@id='useSubmittedBtn']")).click();
				
				//TestCase_6: Medical history What's your blood type
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
				WebElement radi2 = driver.findElement(By.xpath("//input[@id='HistoryChestPainExercise' and @value='No']"));  // chest pain
				radi2.click();
				WebElement Elemet6 = driver.findElement(By.xpath("//select[@id = 'ResultsOfClimbingStairs']"));	//if you walk 2 flights
				Select sel6 = new Select(Elemet6);
				sel6.selectByIndex(0);
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
				TestCase_7
				WebElement rdbttn = driver.findElement(By.xpath("//input[@id='HistoryFibroidUterus' and @value='No']"));	//Fibriod Uterus
				rdbttn.click();
				WebElement rdbttn0 = driver.findElement(By.xpath("//input[@id='HistoryEndometriosis' and @value='No']"));	//Endometriosis
				rdbttn0.click();
				WebElement rdbttn1 = driver.findElement(By.xpath("//input[@id='HistoryPolycysticOvaries' and @value='No']"));	//HistoryPolycysticOvaries
				rdbttn.click();
				WebElement rdbttn2 = driver.findElement(By.xpath("//input[@id='HasHadMiscarriages' and @value='No']"));	//miscrraiage
				rdbttn2.click();
				WebElement rdbttn3 = driver.findElement(By.xpath("//input[@id='HasHadAbortions'and @Value ='No']"));	//Abortions
				rdbttn3.click();*/
				
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
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
				Thread.sleep(1500);
				//TestCase_8:
				//Next Family History
				driver.get("https://nkr.donorscreen.fail/register/continue/226686/CF586639D1F28957");
				driver.manage().window().maximize();
				WebElement rbtn10 = driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyDisease' and @value='No']"));
				rbtn10.click();
				WebElement rbtn11 = driver.findElement(By.xpath("//input[@id='FamilyHistoryLiverDisease' and @value='No']"));
				rbtn11.click();
				WebElement rbutn = driver.findElement(By.xpath("//input[@id='FamilyHistoryHeartDisease' and @value='No']"));
				rbutn.click();
				WebElement rbutn0 = driver.findElement(By.xpath("//input[@id='FamilyHistoryCad' and @value='No']"));
				rbutn0.click();
				WebElement rbutn1 = driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodPressure' and @value='No']"));
				rbutn1.click();
				WebElement rbutn2 = driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodDisorder' and @value='No']"));
				rbutn2.click();
				WebElement rbutn3 = driver.findElement(By.xpath("//input[@id='FamilyHistoryCancer' and @value='No']"));
				rbutn3.click();
				WebElement rbutn4 = driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyCancer' and @value='No']"));
				rbutn4.click();
				WebElement rbutn5 = driver.findElement(By.xpath("//input[@id='FamilyHistoryDiabetes' and @value='No']"));
				rbutn5.click();
				driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@id='IsMotherAlive']")).sendKeys("60");
				driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@id='IsFatherAlive']")).sendKeys("62");
				driver.findElement(By.xpath("//input[@id='HowManySiblings']")).sendKeys("2");
				driver.findElement(By.xpath("//input[@id='HowManyAdultChildren']")).sendKeys("1");
				driver.findElement(By.xpath("//input[@id='HowManyUnderAgeChildren']")).sendKeys("2");
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
				Thread.sleep(1000);
				//TestCase_9: Allergies,Surgery, and Meds
				WebElement rbutn6 = driver.findElement(By.xpath("//input[@id='HasAllergies' and @value='False']"));
				rbutn6.click();
				WebElement rbutn7 = driver.findElement(By.xpath("//input[@id='HasHadSurgeries' and @value='False']"));
				rbutn7.click();
				WebElement rbutn8 = driver.findElement(By.xpath("//input[@id='TakesMedication' and @value='False']"));
				rbutn8.click();
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//Continue
				Thread.sleep(1000);
				//Test Case_10: Social History
				WebElement rbutn9 = driver.findElement(By.xpath("//input[@id='HasUsedAlcohol' and @value='False']"));
				rbutn9.click();
				WebElement rbutn10 = driver.findElement(By.xpath("//input[@id='HasUsedDrugs' and @value='False']"));
				rbutn10.click();
				WebElement rbutn11 = driver.findElement(By.xpath("//input[@id='HasHadLegalIssues' and @value='False']"));
				rbutn11.click();
				WebElement rbutn12 = driver.findElement(By.xpath("//input[@id='HasTraveledLastYear' and @value='False']"));
				rbutn12.click();
				WebElement rbutn13 = driver.findElement(By.xpath("//input[@id='HasHadSuicidalThoughtsAttempts' and @value='False']"));
				rbutn13.click();
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
				Thread.sleep(5000);
				//I'm almost done
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();//I'm done with Medical History
				Thread.sleep(5);
				driver.findElement(By.xpath("//a[@class='btn btn-success dash-step-btn']")).click();
				
				//last manual execution
				
				
			//File fscreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Files.copy(fscreenshotFile, new File(".//screenshot/screen.png"));
				//End of Friday 07/07/2003. Next start from below
				driver.getTitle();
				driver.close();
	}

}
