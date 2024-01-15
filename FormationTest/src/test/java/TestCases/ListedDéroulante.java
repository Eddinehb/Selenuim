package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListedDéroulante {

	public static void main(String[] args) throws InterruptedException {
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
		driver.navigate().to("https://demoqa.com/select-menu");
		
		// iden et dcl Vr
		WebElement couleur;
		couleur = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select (couleur);
		select.selectByValue("5");
		driver.close();
		
		
	
		
	

	}

}
