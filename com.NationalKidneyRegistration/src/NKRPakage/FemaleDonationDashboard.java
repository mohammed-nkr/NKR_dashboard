package NKRPakage;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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

public class FemaleDonationDashboard {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nkr.donorscreen.fail/register/continue/226784/6CE50F7709D9CC9A");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Test Case_3: Screening Summary
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9298996363");
		driver.findElement(By.xpath("//input[@id='PostalCode']")).sendKeys("11412");
		
		WebElement radio1 = driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@id='Gender']"));
		radio1.click();
		//System.out.println(radio1.isSelected());
		driver.findElement(By.xpath("//input[@name = 'BirthDate']")).sendKeys("09/15/1978");
		WebElement ddown1 = driver.findElement(By.xpath("//select[@name = 'HeightFeet']"));
		Select select1 = new Select(ddown1);
		select1.selectByIndex(2);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name = 'HeightInches']"));
		Select select2 = new Select(dropdown);
		select2.selectByIndex(4);
		driver.findElement(By.xpath("//input[@id = 'WeightLbs']")).sendKeys("155");
		
		WebElement ele= driver.findElement(By.xpath("//input[@id='IsResidingInUSA' and @value='True']"));
		ele.click();
		//System.out.println(ele.isSelected());
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='IsCurrentlyIncarcerated' and @value='False']")); //incarcerated
		ele1.click();
		//System.out.println(ele1.isSelected());
		
		driver.findElement(By.xpath("//button[@class ='btn btn-primary btn-lg']")).click();  //continue
		Thread.sleep(5000);
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='WillAcceptTransfusions' and @value='True']")); //transfusions in an emergency
		ele2.click();
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); // //Yes, that's correct, continue
		Thread.sleep(5000);
		
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='HasHadOrganDisease' and@value='False']")); 	//Diagnosed kidney diseasese
		ele3.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
		
		Thread.sleep(5000);
		WebElement ele4 = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/label[2]/input[1]")); 	//heart attack
		ele4.click();
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		Thread.sleep(8000);
		
		WebElement ele5 = driver.findElement(By.xpath("//input[@id='HasDiabetes' and @value='False']")); 	//diabetes
		ele5.click();
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		Thread.sleep(5000);
		WebElement ele6 = driver.findElement(By.xpath("//input[@id='HasHadCancer'and @value = 'False']"));  //cancer
		ele6.click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click(); //continue
		Thread.sleep(1000);
		
		WebElement rad = driver.findElement(By.xpath("//input[@id='HasHadKidneyStones' and @value='False']"));	//kidney stone
		rad.click();
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();  //continue
		WebElement rbn = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='HasBeenPregnant']"));//ever been preg
		rbn.click();
		WebElement rbn0 = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='IsPlanningOnPregnancy']"));//plan becoming?
		rbn0.click();
		WebElement rbn1 = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='IsTakingBirthControl']"));//taking birth control?
		rbn1.click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();//continue
		
		Thread.sleep(1000);		
		WebElement rad1 = driver.findElement(By.xpath("//input[@name='HasUsedTobacco' and @value='False']"));	//used Tobaco?
		rad1.click();
		driver.findElement(By.xpath("//button[@ class = 'btn btn-primary btn-lg']")).click();	//continue
		Thread.sleep(1000);
		WebElement rad0 = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='HasHiv']"));//HIV
		rad0.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
		Thread.sleep(5000);
		WebElement rad3 = driver.findElement(By.xpath("//input[@name = 'HasIntendedRecipient' and @value = 'False']"));	//donatio details/current situatin
		rad3.click();
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//Continue
		Thread.sleep(5000);
		//WebElement rad4 = driver.findElement(By.xpath("//input[@id='VoucherEducationChoice' and @value='WantsToLearnMore']"));	//learn more about fam voucher
		//rad4.click();
		//driver.findElement(By.xpath("//button[@id='continue']")).click();	//continue
		//Thread.sleep(5000);
		
		//Screening Summary
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();//done
		Thread.sleep(5000);
		
		//TestCase_4: Start Medical Question:
		driver.findElement(By.xpath("//a[contains(text(),'Start the Medical Questionnaire')]")).click();	//Start the Medical Question or
	
		Thread.sleep(5000);
		
		//Medical History:
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();//continue
		Thread.sleep(5000);
		
		//TestCase_5: Demogr/Per
		WebElement drdown = driver.findElement(By.xpath("//select[@id = 'countryOfResidence']"));
		Select select3 = new Select(drdown);
		select3.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("200-15 110 av.");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Saint Albans");
		
		WebElement droppdown = driver.findElement(By.xpath("//select[@id='state']"));
		Select select4 = new Select(droppdown);
		select4.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name = 'PostalCode']")).sendKeys("11412");
		
		WebElement dropppdown = driver.findElement(By.xpath("//select[@id = 'Ethnicity']"));
		Select select5 = new Select(dropppdown);
		select5.selectByIndex(3);
		WebElement droppppdown = driver.findElement(By.xpath("//select[@id = 'ContactBestStartHour']"));	//best time
		Select select6 = new Select(droppppdown);
		select6.selectByIndex(1);	
		WebElement dropppppdown = driver.findElement(By.xpath("//select[@id='ContactBestEndHour']"));
		Select select7 = new Select(dropppppdown);
		select7.selectByIndex(4);
		driver.findElement(By.xpath("//input[@id = 'EmergencyContact']")).sendKeys("Hakea"); //Emergency Contact Name
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
		sel4.selectByIndex(4);
		
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
		WebElement ele7 = driver.findElement(By.xpath("//input[@value='A']"));	//blood type A
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
		WebElement Elemet6 = driver.findElement(By.xpath("//select[@id = 'ResultsOfClimbingStairs']"));	//if you walk 2 flights
		Select sel6 = new Select(Elemet6);
		sel6.selectByIndex(1);
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
		//For Female-TestCase_7
		WebElement rdbttn = driver.findElement(By.xpath("//input[@id='HistoryFibroidUterus' and @value='No']"));	//Fibroid Uterus
		rdbttn.click();
		WebElement rdbttn0 = driver.findElement(By.xpath("//input[@id='HistoryEndometriosis' and @value='No']"));	//Endometriosis
		rdbttn0.click();
		WebElement rdbttn1 = driver.findElement(By.xpath("//input[@id='HistoryPolycysticOvaries' and @value='No']"));	//HistoryPolycysticOvaries
		rdbttn1.click();
		WebElement rdbttn2 = driver.findElement(By.xpath("//input[@id='HasHadMiscarriages' and @value='No']"));	//miscrraiage
		rdbttn2.click();
		WebElement rdbttn3 = driver.findElement(By.xpath("//input[@id='HasHadAbortions'and @Value ='No']"));	//Abortions
		rdbttn3.click();
		
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
		WebElement radbtn3 = driver.findElement(By.xpath("//input[@id='HasSarcoidosis' and @value='No']")); //Sarcoidosis
		radbtn3.click();
		WebElement radbtn4 = driver.findElement(By.xpath("//input[@id='HasAutoImmune' and@value='No']"));//immune disease
		radbtn4.click();
		
		WebElement radbtn5 = driver.findElement(By.xpath("//input[@name='HasHadPhysicalExam' and @value='No']"));
		radbtn5.click();
		WebElement radbtn6 = driver.findElement(By.xpath("//input[@id='HasHadMammogram' and @value='No']"));
		radbtn6.click();
		WebElement radbtn7 = driver.findElement(By.xpath("//input[@id='HasHadPapSmear' and @value='No']"));
		radbtn7.click();
		//WebElement radbtn8 = driver.findElement(By.xpath("//input[@id='HasHadPsaTest' and @value='No']"));
		//radbtn8.click();
		WebElement radbtn9 = driver.findElement(By.xpath("//label[normalize-space()='No']//input[@id='HasHadColonoscopy']"));
		radbtn9.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
		Thread.sleep(1000);
		//TestCase_8: Next Family History
		
		WebElement rbtn10 = driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyDisease' and @value='No']"));//kidney disease
		rbtn10.click();
		WebElement rbtn11 = driver.findElement(By.xpath("//input[@id='FamilyHistoryLiverDisease' and @value='No']"));//liver disease
		rbtn11.click();
		WebElement rbutn = driver.findElement(By.xpath("//input[@id='FamilyHistoryHeartDisease' and @value='No']"));//heart disease
		rbutn.click();
		WebElement rbutn0 = driver.findElement(By.xpath("//input[@id='FamilyHistoryCad' and @value='No']"));//Coronary Artery Disease
		rbutn0.click();
		WebElement rbutn1 = driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodPressure' and @value='No']"));//History of blood disease
		rbutn1.click();
		WebElement rbutn2 = driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodDisorder' and @value='No']"));//blood disorder
		rbutn2.click();
		WebElement rbutn3 = driver.findElement(By.xpath("//input[@id='FamilyHistoryCancer' and @value='No']"));//History of cancer
		rbutn3.click();
		WebElement rbutn4 = driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyCancer' and @value='No']"));//History of kidney caancer
		rbutn4.click();
		WebElement rbutn5 = driver.findElement(By.xpath("//input[@id='FamilyHistoryDiabetes' and @value='No']"));//History of diabetes
		rbutn5.click();
		WebElement rbtun14 = driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@id='IsMotherAlive']"));
		rbtun14.click();
		driver.findElement(By.xpath("//input[@id='MothersLastAge']")).sendKeys("60");
		
		WebElement rbutn15 = driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@id='IsFatherAlive']"));
		rbutn15.click();
		driver.findElement(By.xpath("//input[@id='FathersLastAge']")).sendKeys("62");
		
		driver.findElement(By.xpath("//input[@id='HowManySiblings']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='HowManyAdultChildren']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='HowManyUnderAgeChildren']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		Thread.sleep(500);
		//TestCase_9: Allergies,Surgery, and Meds
		WebElement rbutn6 = driver.findElement(By.xpath("//input[@id='HasAllergies' and @value='False']"));
		rbutn6.click();
		WebElement rbutn7 = driver.findElement(By.xpath("//input[@id='HasHadSurgeries' and @value='False']"));
		rbutn7.click();
		WebElement rbutn8 = driver.findElement(By.xpath("//input[@id='TakesMedication' and @value='False']"));
		rbutn8.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//Continue
		Thread.sleep(500);
		//Test Case_10: Social History
		WebElement rbutn9 = driver.findElement(By.xpath("//input[@id='HasUsedAlcohol' and @value='False']"));//Has Used Alcohol
		rbutn9.click();
		WebElement rbutn10 = driver.findElement(By.xpath("//input[@id='HasUsedDrugs' and @value='False']"));//Used Drugs
		rbutn10.click();
		WebElement rbutn11 = driver.findElement(By.xpath("//input[@id='HasHadLegalIssues' and @value='False']"));//Legal Issue
		rbutn11.click();
		WebElement rbutn12 = driver.findElement(By.xpath("//input[@id='HasTraveledLastYear' and @value='False']"));//Traveled year
		rbutn12.click();
		WebElement rbutn13 = driver.findElement(By.xpath("//input[@id='HasHadSuicidalThoughtsAttempts' and @value='False']"));//HasHadSuicidalThoughtsAttempts
		rbutn13.click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue, Pre Workup Labs
		Thread.sleep(5000);
		//I'm almost done
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();//I'm Done with Medical History
		Thread.sleep(5);
		driver.findElement(By.xpath("//a[@class='btn btn-success dash-step-btn']")).click();// Continue, Pre-Workup Labs_End
		
		//Need to get the text,
		//driver.close();
		driver.quit();
		
	//File fscreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Files.copy(fscreenshotFile, new File(".//screenshot/screen.png"));

		}
}