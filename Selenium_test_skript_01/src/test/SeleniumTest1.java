package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1; i<4; i++){
			//***NAPOMENA za selenium 2.53.0. mora firefox 46.0 ... zapamti!!!
			WebDriver driver = new FirefoxDriver();
		
			//kod za pokretanje veb stranice www.tutorialspoint.com/selenium_online_training
			driver.get("https://www.tutorialspoint.com/selenium_online_training/index.asp");
			System.out.print("I test korak prosao OK");
			Thread.sleep(2000);
		
			//kod za klik na dugme Selenium - Advantages
			driver.findElement(By.xpath(".//*[@id='16']/a")).click();		
			System.out.print("\nII test korak prosao OK");
			Thread.sleep(2000);
		
			//kod za klik na dugme Selenium - IDE introduction
			driver.findElement(By.xpath(".//*[@id='18']/a")).click();			
			System.out.print("\nIII test korak prosao OK");
			Thread.sleep(2000);
		
			//kod za klik na dugme HOME
			driver.findElement(By.xpath(".//*[@id='mainMenu']/li[1]/a")).click();			
			System.out.println("\nIV test korak prosao OK");
			Thread.sleep(2000);
		
			//kod za zatvaranje brovsera
			driver.close();
			System.out.println("Put:" + i );
		}
		
		System.out.println("\n\nTestiranje zavrseno uspesno!!!");
	}

}