package NKRPakage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfWebElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kidneyregistry.org/");
		driver.manage().window().maximize();
		//follow this link: https://www.youtube.com/watch?v=lx-B1PVTRmQ
		List<WebElement> tabs = driver.findElements(By.xpath("//a[@target='_blank']"));
		WebElement q;
		for(int i=0;i<tabs.size();i++) {
			q = tabs.get(i);
			System.out.println(q.getText());
		}
		for(WebElement j :tabs) {
			System.out.println(j.getText());
		}
	}

	private char[] getText() {
		
		return null;
	}
	

}
