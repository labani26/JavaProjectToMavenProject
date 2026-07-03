import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Automate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Date = "15";
		String Month = "6";
		String Year = "2027";
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
     // Open calendar
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

        // Click twice to reach Year selection
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        // Select Year
        driver.findElement(By.xpath("//button[text()='" + Year + "']")).click();

        // Select Month
        WebElement monthElement = driver.findElements(By.cssSelector(".react-calendar__tile"))
                .get(Integer.parseInt(Month) - 1);

        System.out.println(monthElement.getText());

        monthElement.click();

        // Select Day
        List<WebElement> Days = driver.findElements(By.xpath("//abbr[text()='" + Date + "']"));

        for(WebElement D : Days) {
        	if(D.isDisplayed()) {
        		D.click();
        	}
        	else {
        		break;
        	}
        }
        
        System.out.println("Date :"+Date+"/"+Month+"/"+Year);        
        ;
	}

}
