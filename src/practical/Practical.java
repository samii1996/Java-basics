package practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.get("http://127.0.0.1:5555/index.html");

		String myTitle = driver.getTitle();

		System.out.println(myTitle);

		List<WebElement> myListOfOptions = driver.findElements(By.tagName("option"));

		for (int i = 0; i < myListOfOptions.size(); i++) {

			System.out.println(myListOfOptions.get(i).getText());
		}

	}

}
