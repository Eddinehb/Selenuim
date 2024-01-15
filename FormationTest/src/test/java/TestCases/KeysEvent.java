package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEvent {

	public static void main(String[] args) {
		// chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouverture navig
		WebDriver driver;
		driver = new ChromeDriver();
		
		//imlicty wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// maximaze window
		driver.manage().window().maximize();
		
		//delet coockies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/text-box");
		
		
		
		// iden et dcl Vr
		WebElement currentadress;
		WebElement permanentadress;
		currentadress = driver.findElement(By.id("currentAddress"));
		permanentadress = driver.findElement(By.id("permanentAddress"));
		//action
		Actions action = new Actions(driver);
				
		currentadress.sendKeys("1 rue de moi");
		action.keyDown(currentadress,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(permanentadress,Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
