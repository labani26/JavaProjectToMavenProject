import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        driver.findElement(By.xpath("//th[@role='columnheader'][1]"));
        
       List<WebElement> tableRows = driver.findElements(By.xpath("//tr/td[1]"));
       
        
        List<String> tableList = tableRows.stream().map(check -> check.getText()).collect(Collectors.toList());
        
        System.out.println(tableList);
        
        List<String> sortedList = tableList.stream().sorted().collect(Collectors.toList());
        
        System.out.println(sortedList);
        
        Assert.assertEquals(tableList, sortedList);
        
	}
}
