
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccionElementos {
	static {
		System.setProperty(Configuracion.NAME_CHROME_DRIVER, Configuracion.PATH_CHROME_DRIVER);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(1000);

		try {

			// id input text
			WebElement inputText = driver.findElement(By.id("lst-ib"));
			inputText.sendKeys("Calidad de Software");

			// name button
			WebElement button = driver.findElement(By.name("btnK"));
			button.click();
			// button.submit();

			Thread.sleep(2000);
			WebElement inputText2 = driver.findElement(By.id("lst-ib"));
			inputText2.clear();

			// link text
			WebElement linkText = driver
					.findElement(By.linkText("Calidad de software - Wikipedia, la enciclopedia libre"));
			linkText.click();

			System.out.println(driver.getCurrentUrl());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			Thread.sleep(5000);
			driver.close();
		}
	}
}
