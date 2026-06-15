import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"]")).click();
        
        Thread.sleep(3000);
        
        int i = 1;
        while(i<3) {
        	driver.findElement(By.xpath("//div[@class=\"r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n\"]")).click();
            i++;
        }
        
        int j = 0;
        while(j<5){
        	
        	driver.findElement(By.cssSelector("path[fill-rule='nonzero']")).click();
        	j++;
        }
        
//        for(i=0;i<5;i++) {
//        	driver.findElement(By.cssSelector("path[fill-rule='nonzero']")).click();
//        }
        
	}

}
