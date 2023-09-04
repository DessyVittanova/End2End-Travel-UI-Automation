import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/programs/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); // using sendKeys when we need to input some text - which in these case is ind
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // FINDELEMENTS because we want all the option to be extracted
	
		for(WebElement option :options ) {
			if(option.getText().equalsIgnoreCase("India")) // we are creating a object to find the word india 
					{
				      option.click();
				      break; // to turn off the loop when the name is found
				     
					}
		}
		
		
		
	}

}
