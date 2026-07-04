import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfCloumnAndRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        
        Js.executeScript("window.scrollBy(0, 600);");
        
        Js.executeScript("document.querySelector('.tableFixHead').scrollTop = 500;");
        
        WebElement ThirdRow = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)"));
        
        System.out.print("ThirdRow - "+ThirdRow);
        
        WebElement TotalColumn = driver.findElement(By.cssSelector(".table-display tbody tr"));
        
        System.out.println("TotalColumn - "+TotalColumn);
        
        WebElement TotalRow = driver.findElement(By.cssSelector(".table-display td"));
        
        System.out.println("TotalRow - "+TotalRow);
             
        
	}

}


//Complete the Assignment and Post the code here
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;


//public class NoOfCloumnAndRow {

//	public static void main(String[] args) {		
// TODO Auto-generated method stub

//WebDriver driver = new ChromeDriver();        

//driver.manage().window().maximize();   

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

//driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 

//JavascriptExecutor Js = (JavascriptExecutor)driver;               
//Js.executeScript("window.scrollBy(0, 600);");               
//Js.executeScript("document.querySelector('.tableFixHead').scrollTop = 500;");               
//WebElement ThirdRow = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)"));               
//System.out.print("ThirdRow - "+ThirdRow);                
//WebElement TotalColumn = driver.findElement(By.cssSelector(".table-display tbody tr"));              
//System.out.println("TotalColumn - "+TotalColumn);               
//WebElement TotalRow = driver.findElement(By.cssSelector(".table-display td"));              
//System.out.println("TotalRow - "+TotalRow);                     	}
//}