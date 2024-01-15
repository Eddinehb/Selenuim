package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOb {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouverture navig
		WebDriver driver;
		driver = new ChromeDriver();
		
		// maximaze window
		driver.manage().window().maximize();
		
		//delet coockies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/menu#");
		Thread.sleep(5000);
		
		// iden et dcl Vr
		WebElement Mainitem2;
		WebElement SUBSUBLIST;
			 
		Mainitem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		SUBSUBLIST=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		
		//action
		Actions action = new Actions(driver);
		action.moveToElement(Mainitem2).perform();
		action.moveToElement(SUBSUBLIST).perform();
		
		
	
	
	}

}
