package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedrivre
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouverture chrome
		WebDriver driver;
		driver = new ChromeDriver();
		
		// maximaze window
		driver.manage().window().maximize();
		
		//delet coockies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//declaration et identification 
		WebElement Righttn;
		Righttn = driver.findElement(By.id("rightClickBtn"));
		
		
		//action doublec click (ctrl,espace)
		Actions action= new Actions(driver);
		
		action.contextClick(Righttn).perform();
		Thread.sleep(5000);
		
		
		//verification
		WebElement message;
		message = driver.findElement(By.id("rightClickMessage"));
	
		
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte, "You have done a right click");
		
		System.out.println("Right click done");
		driver.close();
	}

}
