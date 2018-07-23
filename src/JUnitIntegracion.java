
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitIntegracion {
	WebDriver driver = new ChromeDriver();
	static {
		System.setProperty(Configuracion.NAME_CHROME_DRIVER, Configuracion.PATH_CHROME_DRIVER);
	}

	@BeforeAll
	public void setUp() {
		driver.get("https://github.com/login");
	}

	@Test
	public void findElementbyID() throws InterruptedException {

		driver.get("https://github.com/login");
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys("darwinguz");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("tempadsf");

		WebElement signIn = driver.findElement(By.name("commit"));
		signIn.click();

		assertEquals("https://github.com/session2", driver.getCurrentUrl());

	}

	@AfterAll
	public void doThis() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
