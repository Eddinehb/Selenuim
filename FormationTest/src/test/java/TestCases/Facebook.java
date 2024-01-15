package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouverture navig
		WebDriver driver;
		driver = new ChromeDriver();
		
			// maximaze window
		driver.manage().window().maximize();
		
		// ovr url
		driver.navigate().to("https://www.facebook.com/");
		
		//imlicty wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//action
		WebElement creercomptefacebook;
		creercomptefacebook =driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		creercomptefacebook.click();
		 //decl vr et ident
	
		WebElement prenom;
		WebElement nomdefamille;
		WebElement Adressemail;
		WebElement motdepasse;
		WebElement jours;
		WebElement mois;
		WebElement Année;
		WebElement Genre;
		
		prenom =driver.findElement(By.xpath("//input[@placeholder='Prénom']"));
		nomdefamille =driver.findElement(By.xpath("//input[@name='lastname']"));
		Adressemail =driver.findElement(By.xpath("//input[@name='reg_email__']"));
		motdepasse =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		jours =driver.findElement(By.xpath("//select[@title='Jour']"));
		mois =driver.findElement(By.xpath("//select[@title='Mois']"));
		Année =driver.findElement(By.xpath("//select[@title='Année']"));
		Genre =driver.findElement(By.xpath("//input[@value='2']"));
		// Remplir les champs du formulaire
        prenom.sendKeys("poj");
        nomdefamille.sendKeys("heb");
        Adressemail.sendKeys("heb@gmail.fr");
        motdepasse.sendKeys("fb2024");

        // Remplir la date de naissance et sélectionner le genre (vous devrez ajuster les valeurs)
        jours.sendKeys("20");
        mois.sendKeys("Jan");
        Année.sendKeys("1994");
       
        
        // Trouver et cliquer sur le lien "S'inscrire"
        WebElement sincrire = driver.findElement(By.xpath("//button[@name='websubmit']"));
        sincrire.click();
        Genre.click();
		
		
		

	}

}
