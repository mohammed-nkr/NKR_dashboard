package NKRPakage;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DonorRegistration1C {
	public static void main(String []args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		//WebDriver driver = new ChromeDriver(opt);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nkr.donorscreen.fail/register/now");
		driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("Carlos");
		driver.findElement(By.id("LastName")).sendKeys("Romirez");
		driver.findElement(By.name("Email")).sendKeys("carlosromirez@kidneyregistry.org");
		
		WebElement ddown = driver.findElement(By.name("PreferredLanguage"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id = 'AgreedToHipaa']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@class = 'intake-form']")).click();
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();  //CONTINUE
		Thread.sleep(15000);
		//Alert alert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();//captcha
		
		driver.get("http://173.251.53.123:5000/");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//tr[@class = 'el-table__row read']")).click();
		driver.findElement(By.xpath("//div[@id='app-root']")).click();
		driver.get("https://nkr.donorscreen.fail/register/donate/226633/5DF5CCE6D8444F28");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@title='Start the Questionnaire']")).click();   //'Start the Questionnaire'  
		//driver.findElement(By.xpath("//a[contains(text(),'Start the Questionnaire')]")).click();    		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();	
		driver.findElement(By.xpath("//a[@class='btn btn-success dash-step-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("3478881234");
		driver.findElement(By.xpath("//input[@name = 'PostalCode']")).sendKeys("11373");
		driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		driver.findElement(By.xpath("//input[@name = 'BirthDate']")).sendKeys("06/15/1990");
		WebElement ddown1 = driver.findElement(By.xpath("//select[@name = 'HeightFeet']"));
		Select select1 = new Select(ddown1);
		select1.selectByIndex(2);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name = 'HeightInches']"));
		Select select2 = new Select(dropdown);
		select2.selectByIndex(8);
		driver.findElement(By.xpath("//input[@id = 'WeightLbs']")).sendKeys("165");
		driver.findElement(By.xpath("//input [@data-target = '{\"#IsNotResidingInUSA\":false}']")).click();
		driver.findElement(By.xpath("//input[@id='IsCurrentlyIncarcerated' and @value='False']")).click(); //incarcerated
		driver.findElement(By.xpath("//button[@class ='btn btn-primary btn-lg']")).click();  //continue
		
		driver.findElement(By.xpath("//input[@id='WillAcceptTransfusions' and @value='True']")).click(); //in an emergency
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		//driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();  //Yes, that's correct 
		driver.findElement(By.xpath("//input[@id='HasHadOrganDisease' and@value='False']")).click(); 	//Diagnosed kidney diseasese
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
	
		driver.findElement(By.xpath("//input[@id='HasHadHeartAttack' and @value='False']")).click(); 					 //heart attack
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasDiabetes' and @value='False']")).click(); 					 //diabetes
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasHadCancer'and @value = 'False']")).click();  				  //cancer
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']]")).click(); //continue
		
		driver.findElement(By.xpath("//input[@id='HasHadKidneyStones' and@value='False']")).click();	//kidney stone
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();  //continue
		
		/*driver.findElement(By.xpath("//input[@name = 'HasBeenPregnant' and @type = 'radio' and @value = 'True']")).click(); //ever been
		driver.findElement(By.xpath("//input[@value = 'False' and @id = 'IsPlanningOnPregnancy']")).click();				//becoming
		driver.findElement(By.xpath("//input[@name = 'IsTakingBirthControl' and @value = 'True']")).click();	//taking
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//continue*/
		driver.findElement(By.xpath("//input[@value = 'False' and@ id = 'HasUsedTobacco']")).click();	//used Tobaco?
		driver.findElement(By.xpath("//button[@ class = 'btn btn-primary btn-lg']")).click();	//continue
		
		driver.findElement(By.xpath("//input[@id = 'HasHiv' and @value = 'No']")).click();	//HIV
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//continue
		
		//driver.findElement(By.xpath("//input[@name = 'HasIntendedRecipient' and @value = 'False']")).click();	//current situation
		//driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();	//Continue
		
		driver.findElement(By.xpath("//input[@name = 'HasIntendedRecipient' and @value = 'False']")).click();	//donation details
		driver.findElement(By.xpath("//input[@id='VoucherEducationChoice' and @value='WantsToLearnMore']")).click();	//learn more about fam voucher
		driver.findElement(By.className("//button[@class = 'btn btn-primary btn-lg']")).click();	//continue
		//Screening Summary
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg']")).click();
		//Start Medical Question:
		//driver.findElement(By.xpath("//a[contains(text(),'Start the Medical Questionnaire')]")).click();	//Start the Medical Question or
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		//Medical History:
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		
		//Demogr/Per
		WebElement drdown = driver.findElement(By.xpath("//select[@id = 'countryOfResidence']"));
		Select select3 = new Select(drdown);
		select.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name = 'AddressLine1' ]")).sendKeys("89-19 171 ST.");
		driver.findElement(By.xpath("//input[@name = 'City']")).sendKeys("Jamaica");
		
		WebElement droppdown = driver.findElement(By.xpath("//select[@id = 'state']"));
		Select select4 = new Select(droppdown);
		select.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name = 'PostalCode']")).sendKeys("11432");
		
		WebElement dropppdown = driver.findElement(By.xpath("//select[@id = 'Ethnicity']"));
		Select select5 = new Select(dropppdown);
		select.selectByIndex(3);
		WebElement droppppdown = driver.findElement(By.xpath("//select[@id = 'ContactBestStartHour']"));	//best time
		Select select6 = new Select(droppppdown);
		select.selectByIndex(1);	
		WebElement dropppppdown = driver.findElement(By.className("//select[@id = 'ContactBestEndHour']"));
		Select select7 = new Select(dropppppdown);
		select.deselectByVisibleText("3");
		driver.findElement(By.xpath("//input[@id = 'EmergencyContact']")).sendKeys("Bellia"); //Emergency Contact Name
		driver.findElement(By.xpath("")).sendKeys("3475676666");	//Emergency Contact Number
		WebElement element = driver.findElement(By.xpath("//select[@id = 'EmergencyContactRelationship']"));	//Relationship
		Select sel = new Select(element);
		select.selectByVisibleText("1");
		WebElement element1 = driver.findElement(By.xpath("//select[@id = 'MaritalStatus']"));	//marital Status
		Select sel1= new Select(element1);
		select.selectByVisibleText("1");
		
		WebElement element2 = driver.findElement(By.xpath("//select[@name = 'EmploymentStatus']"));		//Work Status
		Select sel2 = new Select(element2);
		select.selectByVisibleText("1");	//Work Status
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id = 'ExerciseRoutine']"));	//Exercise
		Select sel3 = new Select(element3);
		select.selectByVisibleText("3");
		
		WebElement element4 = driver.findElement(By.xpath("//select[@id = 'EducationLevel']"));		//Education
		Select sel4 = new Select(element4);
		select.selectByVisibleText("4");
		
		driver.findElement(By.xpath("//input[@name = 'HasHealthInsurance' and @value = 'True']")).click();		//Helth Insurance
		driver.findElement(By.xpath("//input[@id = 'PhysicianName']")).sendKeys("Dr. Jacob");				//Physician's Name
		driver.findElement(By.xpath("//input[@name = 'PhysicianCity']")).sendKeys("Elmhurts, NY");		//Physician's City
		
		WebElement element5 = driver.findElement(By.xpath("//select[@name = 'PhysicianState']"));		//Physicians State
		Select sel5 = new Select(element5);
		select.selectByVisibleText("New York");	
		
		driver.findElement(By.xpath("//textarea[@id = 'MotivationToDonate']")).sendKeys("I'm serious to save live!");	//text
		driver.findElement(By.xpath("//button[@class= 'btn btn-primary btn-lg']")).click();		//Continue
		
		//Recommended Address
		driver.findElement(By.xpath("//button[@id  = 'useRecommendedBtn']")).click();
		//Medical history What's your blood type
		driver.findElement(By.className("//input[@value = 'Unknown' and @id = 'AboType']")).click();	//blood type
		driver.findElement(By.xpath("//input[@id = 'HasHistoryOfHighBp' and @value = 'No']")).click();  //blood preassure
		driver.findElement(By.xpath("//input[@id = 'HasHadCabg' and @value = 'No']")).click();			//bypass grafting
		driver.findElement(By.xpath("//input[@id = 'HasHistoryOfBloodClots' and @value = 'No']")).click();//blood clots
		driver.findElement(By.xpath("//input[@id = 'HasHistoryOfCoronaryDisease' and @value = 'No']")).click();//artery disease
		driver.findElement(By.xpath("//input[@id = 'HasHistoryOfHighCholOrTg' and @value = 'No']")).click();//high cholesterol
		driver.findElement(By.xpath("//input[@id = 'HasStents' and @value = 'No']")).click();	//coronary stents implanted
		driver.findElement(By.xpath("//input[@id = 'HistoryChestPainExercise' and @ value = 'No']")).click();
		driver.findElement(By.xpath("//input[@id = 'HistoryChestPainExercise' and @ value = 'No']")).click();  // chest pain
		WebElement Elemet6 = driver.findElement(By.xpath("//select[@id = 'ResultsOfClimbingStairs']"));	//if you walk 2 flights
		Select sel6 = new Select(Elemet6);
		select.selectByIndex('1');
		driver.findElement(By.xpath("//input[@id = 'HadStressTestWithinYear' and @value = 'No']")).click();	//stress test
		driver.findElement(By.xpath("//input[@id = 'HasHadStroke' and @value = 'No']")).click();	//had a stroke?
		driver.findElement(By.xpath("//input[@id = 'HasHadLegBypass' and@value = 'No']")).click();  //surgery on leg
		driver.findElement(By.xpath("//input[@name = 'HistoryLungDisease' and @value = 'No']")).click(); //lung disease
		driver.findElement(By.xpath("//input [@id = 'HasCopd' and @value = 'No']")).click();	//COPD
		driver.findElement(By.xpath("//input[@id = 'HasTb' and @value = 'No']")).click();		//Tuberculosis
		driver.findElement(By.xpath("//input[@id = 'HistoryPneumonia' and @value = 'No']")).click(); //Pneumonia
		driver.findElement(By.xpath("//input[@name = 'HasRespiratoryIssues' and @Value = 'No']")).click();	//Respiratory Disease
		driver.findElement(By.xpath("//input[@id = 'HasGastroIssues' and @value = 'No']")).click();	//Gastrointestinal
		driver.findElement(By.xpath("//input[@id = 'HistoryGallstones' and @value = 'No']")).click();	//Gallbladder
		driver.findElement(By.xpath("//input[@name = 'HistoryPancreatitis' and @value = 'No']")).click();	//Pancreatitis
		driver.findElement(By.xpath("//input[@id = 'HistoryLiverDisease' and @value = 'No']")).click();	//History of liverDisease
		driver.findElement(By.xpath("//input[@id = 'HasHepB' and @value = 'No']")).click(); 	//Hepatitis B
		driver.findElement(By.xpath("//input[@name = 'HasHepC' and @value = 'No']")).click();	//Hepatitis C
		driver.findElement(By.xpath("//input[@name = 'HasBleedingProblem' and @value = 'No']")).click();	//bleeding problem
		driver.findElement(By.xpath("//input[@id = 'HasHadUti' and @value = 'No']")).click();	//UTI
		driver.findElement(By.xpath("//input[@name = 'HistoryKidneyDamage' and @value = 'No']")).click();	//injury to kidney
		driver.findElement(By.xpath("//input[@id = 'HistoryProteinuria'and @value = 'No']")).click();	//portein in urine
		driver.findElement(By.xpath("//input[@name = 'HistoryHematuria' and @value = 'No']")).click();	//blood in Urine
		driver.findElement(By.xpath("//input[@name = 'HistoryNeuroDisease' and @value = 'No']")).click();	//Neorological disease
		driver.findElement(By.xpath("//input[@name = 'HistorySeizure' and @value ='No']")).click();	//seizure
		driver.findElement(By.xpath("//input[@id = 'HasLupus' and @value = 'No']")).click();	//Lupus
		driver.findElement(By.xpath("//input[@name = 'HistoryParalysis' and @value = 'No']")).click();	//paralysis
		driver.findElement(By.xpath("//input[@id = 'HasArthritis' and @value = 'No']")).click();	//arthritis
		driver.findElement(By.xpath("//input[@id = 'HistoryNeuropathy' and @value = 'No']")).click();	//neuropathy
		driver.findElement(By.xpath("//input[@id = 'HistoryDepression' and @value = 'No']")).click();	//depression
		driver.findElement(By.xpath("//input[@name = 'HistoryAnxiety' and @value = 'No']")).click();	//Anxiety
		driver.findElement(By.xpath("//input[@id = 'HasHistoryOfPsychiatric' and @value='No']")).click();	//Psychiatric
		/*For Female
		driver.findElement(By.xpath("//input[@id='HistoryFibroidUterus' and @value='No']")).click();	//Fibriod Uterus
		//driver.findElement(By.xpath("//input[@id='HistoryEndometriosis' and @value='No']")).click();	//Endometriosis
		//driver.findElement(By.xpath("//input[@id='HistoryPolycysticOvaries' and @value='No']")).click();	//HistoryPolycysticOvaries
		//driver.findElement(By.xpath("//input[@id='HasHadMiscarriages' and @value='No']")).click();	//miscrraiage
		//driver.findElement(By.xpath("//input[@id='HasHadAbortions'and @Value ='No']")).click();	//Abortions*/
		driver.findElement(By.xpath("//input[@id='HasReceivedTransfusion' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasHistoryOfObesity' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@name='HasFabrys' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasSickleCell' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasSickleCellTrait' and@value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasSarcoidosis' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasAutoImmune' and@value='No']")).click();
		driver.findElement(By.xpath("//input[@name='HasHadPhysicalExam' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasHadMammogram' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='HasHadPapSmear' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@name='HasHadColonoscopy' and @value='No']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
		
		//Next Family History
		//https://nkr.donorscreen.fail/register/continue/226633/5DF5CCE6D8444F28
		driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyDisease' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryLiverDisease' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryHeartDisease' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryCad' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodPressure' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryBloodDisorder' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryCancer' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryKidneyCancer' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryDiabetes' and @value='No']")).click();
		driver.findElement(By.xpath("//input[@id='FamilyHistoryDiabetes' and @value='Yes']")).click();
		driver.findElement(By.xpath("//*[@id=\"MothersLastAge\"]")).sendKeys("60");
		driver.findElement(By.xpath("//input[@id='FathersLastAge']")).sendKeys("62");
		driver.findElement(By.xpath("//input[@id='HowManySiblings']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='HowManyAdultChildren']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='HowManyUnderAgeChildren']")).sendKeys("1");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		//Allergies,Surgery, and Meds
		driver.findElement(By.xpath("//input[@id='HasAllergies' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='HasHadSurgeries' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='TakesMedication' and @value='False']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//Continue
		//Social History
		driver.findElement(By.xpath("//input[@id='HasUsedAlcohol' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='HasUsedDrugs' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='HasHadLegalIssues' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='HasTraveledLastYear' and @value='False']")).click();
		driver.findElement(By.xpath("//input[@id='HasHadSuicidalThoughtsAttempts' and @value='False']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();	//continue
		//I'm almost done
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		//Pre work up lab, Continue
		driver.findElement(By.xpath("//a[@class='btn btn-success dash-step-btn']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.quit();
		
		
	}
	
	}



		
	


