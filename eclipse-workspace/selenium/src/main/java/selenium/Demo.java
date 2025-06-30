package selenium;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "percorso/del/chromedriver");
        WebDriver driver = new ChromeDriver();

    	for (int i = 0; i < 30; i++) {
    		// Apri una pagina web
    		driver.get("http://localhost:8080/add");
    		 Thread.sleep(1000);
    		caricaDati(driver);
    		Thread.sleep(1000);
    		 
		}
        
        
        // Chiudi il browser alla fine
        //driver.quit();
    }

	private static void caricaDati(WebDriver driver) {
		
		String[] frutti = {"Mela ", "Pera ", "Banana ", "Fragola ",
				"Arancia ", "Limone ", "Mandarino ", "Anguria ",};
		String[] dispo = {"Alta", "Media", "Bassa"};
		String[] regione = {"Irlanda", "Brasile", "Canada", "Giappone"};
		String[] studenti = {"Leonardo", "Marco", "Youssef", "Andrea", "Andrea", "Andrea", "Alessio", "Michelangelo", "Stefano", "Sara", "Andrea", "Ashna", "Andrea", "Mattia", "Matteo", "Giada", "noemi", "Alessia", "valentina", "Robert", "Elia", "Glalganie Clevatte", "Romina", "Fabio", "Walter", "Giorgio", "David", "federico", "Samuele"}; 
		Random r = new Random();
		// Trova un elemento tramite il selettore CSS e cliccaci sopra
        WebElement nome = driver.findElement(By.id("nome"));
        nome.sendKeys(frutti[r.nextInt(0, frutti.length)] + studenti[r.nextInt(0, studenti.length)]);
        WebElement categoria = driver.findElement(By.id("categoria"));
        categoria.sendKeys("Frutta");
        WebElement origine = driver.findElement(By.id("origine"));
        origine.sendKeys(regione[r.nextInt(0, regione.length)]);
        WebElement prezzo = driver.findElement(By.id("prezzoKg"));
        prezzo.sendKeys("1.5");
        WebElement disponibilita = driver.findElement(By.id("disponibilita"));
        disponibilita.sendKeys(dispo[r.nextInt(0, dispo.length)]);
        WebElement button = driver.findElement(By.cssSelector("button"));
        button.click();
	}

}
