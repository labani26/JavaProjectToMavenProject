import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
//		Chrome - ChromeDriver exten -> Method close get
//		Firefox - FireforDriver -> Method close get
//		Safari - SafariDriver -> Method close get
//		WebDriver close get
//		WebDriver method + class name 
		
//		
//		Chromedriver.exe -> Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Labani sardar\\Downloads\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//FirefoxDriver - use webdriver.gecko.driver
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Labani sardar\\Downloads\\geckodriver-v0.37.0-win64.exe");
		WebDriver driver1 = new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Labani sardar\\Downloads\\edgedriver_win64.exe");
		WebDriver driver2 = new EdgeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Close - means only close that particular tab where are you working on
		driver.close();
		//quit - means close all those tab which are being used by selenium(autamiton tools) for your working purpose
		driver.quit();
		
		
		
	}

}
