import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElements(By.tagName("a")).size();
        
        WebElement Footer = driver.findElement(By.id("gf-BIG"));
        
        System.out.println(Footer.findElements(By.tagName("a")).size());
        
        WebElement FooterSection1 = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        
        System.out.println(FooterSection1.findElements(By.tagName("a")).size());
        
      // click on each link in the column and check if the pages are opening-
        for(int i = 0; i < FooterSection1.findElements(By.tagName("a")).size(); i++) {
        	
        	String ClickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
        	
        	FooterSection1.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
        	
        }
        
        Set<String> windowHandles = driver.getWindowHandles();

        Iterator<String> iterator = windowHandles.iterator();
        
//        driver.getWindowHandles() returns all browser window IDs.
//        Iterator lets you go through them one by one.
//        hasNext() checks if another window ID exists.
//        next() returns that window ID and moves the iterator to the next one.

//        hasNext() asks: "Is there another song after the current one?"
//        	next() says: "Play the next song and move to it."
        
        while (iterator.hasNext()) {
            String window = iterator.next();
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
            
//            driver.quit();
        }

	}

}
