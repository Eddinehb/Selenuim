package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ClickMe {

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
		WebElement Clickmetn;
		Clickmetn = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		
		
		//action doublec click (ctrl,espace)
		Actions action= new Actions(driver);
		
		action.doubleClick(Clickmetn).perform();
		Thread.sleep(5000);
		
		
		//verification
		WebElement message;
		message = driver.findElement(By.id("dynamicClickMessage"));
	
		
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte, "You have done a dynamic click");
		
		System.out.println("ClickMe done");

	}

}
