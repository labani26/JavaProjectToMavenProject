import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.spicejet.com/");
        
        driver.findElement(By.xpath("//div[text()='From']")).click();
        
     // Select Ahmedabad
        driver.findElement(By.xpath("//*[text()='BLR']")).click();
        
        Thread.sleep(2000);

        // Open Destination
        driver.findElement(By.xpath("//div[normalize-space()='To']")).click(); 
        
        driver.findElement(By.xpath("//*[text()='MAA']")).click();

        // Open Calendar
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//*[contains(text(),'Select Date')]")))
//                .click();
//
//        // Click visible date 20
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("(//*[@data-testid='undefined-calendar-day-20'])[last()]")))
//                .click();

        // Open Travellers
        driver.findElement(
        	    By.xpath("//div[.//svg[@data-testid='svg-img']]")
        	).click();

        // Add 2 Adults
        int i = 1; 
        while(i<3) { 
        	driver.findElement( By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']") ).click(); 
        i++;
        }
        
        // Add 5 Children
        int j = 0;
        while(j<5){
        	driver.findElement(By.cssSelector("div[data-testid='Children-testID-plus-one-cta']")).click(); 
        	// driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click(); 
        	j++; 
        }
        
        // Add 4 Infants
        for(int k = 0; k < 4 ; k++) { 
        	driver.findElement(By.xpath("//*[@data-testid='Infant-testID-plus-one-cta']")).click();
        	}

        // Done
        driver.findElement(By.cssSelector("[data-testid='home-page-travellers-done-cta']"))
        .click();

        // Search Flights
       driver.findElement(By.cssSelector("[data-testid='home-page-flight-cta']")).click();
    }
}