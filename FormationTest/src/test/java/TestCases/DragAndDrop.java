package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouverture navig
		WebDriver driver = new ChromeDriver();
		
		// maximaze window
		driver.manage().window().maximize();
		
		//delet coockies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		// iden et dcl Vr
		WebElement Dragme;
		WebElement Drophere;
		 
		Dragme = driver.findElement(By.id("draggable"));
		Drophere = driver.findElement(By.id("droppable"));
		 //Action 
		Actions actions = new Actions (driver);
		actions.dragAndDrop(Dragme, Drophere).perform();
		// verf
		String texte;
		texte=Drophere.getText();
		Assert.assertEquals(texte,"Dropped!");
		System.out.println("test ok");
		driver.close();
		
		
		
		
		
		
		
	}

}
