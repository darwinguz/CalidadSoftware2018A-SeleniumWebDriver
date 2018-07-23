
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirUrl {
	static {
		System.setProperty(Configuracion.NAME_CHROME_DRIVER, Configuracion.PATH_CHROME_DRIVER);
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		// Thread.sleep(5000);
		// driver.close();

		driver.get("https://www.netflix.com/ec-en/login");
		Thread.sleep(2000);
		driver.get("https://saew.epn.edu.ec/");
		Thread.sleep(2000);
		// para abrir una nueva instancia de chrome
		// driver = new ChromeDriver();
		// driver.get("https://www.youtube.com/");
		// Thread.sleep(2000);

		// para cerrar instancia de chrome
		// driver.close();
	}
}
