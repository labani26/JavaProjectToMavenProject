import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;



public class EndToEndSpiceJetExmpl2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.spicejet.com/");

        // Source
        driver.findElement(By.xpath("//div[text()='From']")).click();
        driver.findElement(By.xpath("//*[text()='BLR']")).click();

        Thread.sleep(2000);

        // Destination
        driver.findElement(By.xpath("//div[normalize-space()='To']")).click();
        driver.findElement(By.xpath("//*[text()='MAA']")).click();

        Thread.sleep(2000);

        // One Way
        driver.findElement(
                By.xpath("//div[@data-testid='one-way-radio-button']"))
                .click();

        // Departure Date
        driver.findElement(By.xpath("//div[.//div[text()='Select Date']]//*[name()='svg']")).click();
        
        System.out.println(
        	    driver.findElements(By.xpath("//div[text()='21']")).size()
        	);

        // Verify Return Date status
//        boolean status = driver.findElement(
//                By.xpath("//div[.//div[text()='Select Date']]"))
//                .isEnabled();
//
//        if (status) {
//            System.out.println("Return Date Enabled");
//            Assert.assertTrue(true);
//            
//        } else {
//            System.out.println("Return Date Disabled");
//            Assert.assertFalse(false);
//        }

        // Family and Friends
//        driver.findElement(
//                By.xpath("//div[text()='Family & Friends']"));
//
//        System.out.println("Senior Citizen option clicked successfully.");

        // Count radio buttons
        int count = driver.findElements(
                By.xpath("//*[local-name()='circle' and @cx='9' and @cy='9' and @r='8']"))
                .size();

        System.out.println("Total circle buttons: " + count);

        // Travellers
        driver.findElement(
                By.xpath("//div[normalize-space()='1 Adult']"))
                .click();

        // Add 2 Adults
        int i = 1;
        while (i < 3) {
            driver.findElement(
                    By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']"))
                    .click();
            i++;
        }

        // Add 5 Children
        int j = 0;
        while (j < 5) {
            driver.findElement(
                    By.cssSelector("div[data-testid='Children-testID-plus-one-cta']"))
                    .click();
            j++;
        }

        // Add 4 Infants
        for (int k = 0; k < 4; k++) {
            driver.findElement(
                    By.cssSelector("div[data-testid='Infant-testID-plus-one-cta']"))
                    .click();
        }

        // Done
        driver.findElement(
                By.cssSelector("[data-testid='home-page-travellers-done-cta']"))
                .click();

        Thread.sleep(2000);
        
        //search
        
        driver.findElement(
        	    By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
        	).click();

        	System.out.println("Clicked on Search");
       // driver.quit();

	}

}
