package scenariowiseselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdownpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver92\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		By multiselect = By.id("second");
		
		/*Select select = new Select(driver.findElement(multiselect));
		select.selectByValue("pizza");
		select.selectByValue("burger");*/
		
		List<WebElement> elements =driver.findElements(By.xpath("//select[@id='second']/option"));
		
		for (WebElement element:elements) {
			if (element.getText().equals("Donut") || element.getText().equals("Bonda")) {
				element.click();
				
			}
		}
		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath(null)))
//		action.
		
	}

}
