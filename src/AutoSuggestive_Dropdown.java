import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AutoSuggestive_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		
		driver.findElement(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']")).sendKeys("BASIC");
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("BASIC"))
//				Option.getText() → Gets the visible text of the Option web element.
//				.equalsIgnoreCase("South Africa") → Compares that text with "South Africa" without considering uppercase or lowercase letters.
			{
				System.out.println(option.getText());
				option.click();
				break;
				
			}
			
		}
	
	}

}
