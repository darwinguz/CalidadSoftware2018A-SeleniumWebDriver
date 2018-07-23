
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccesoElementos {
	static {
		System.setProperty(Configuracion.NAME_CHROME_DRIVER, Configuracion.PATH_CHROME_DRIVER);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

		try {

			// id input text
			System.out.println("\n\n|-------|INPUT TEXT|-------|");
			WebElement inputText = driver.findElement(By.id("lst-ib"));
			System.out.println("TAG NAME: " + inputText.getTagName());
			System.out.println("TEXT: " + inputText.getText());
			System.out.println("LOCATION: " + inputText.getLocation());
			System.out.println("DISPLAYED: " + inputText.isDisplayed());
			System.out.println("ENABLED: " + inputText.isEnabled());
			System.out.println("SELECTED: " + inputText.isSelected());
			System.out.println("ATTRIBUTE CLASS: " + inputText.getAttribute("class"));
			System.out.println("ATTRIBUTE NAME: " + inputText.getAttribute("name"));
			System.out.println("ATTRIBUTE STYLE: " + inputText.getAttribute("style"));
			System.out.println("ATTRIBUTE TYPE: " + inputText.getAttribute("type"));
			System.out.println("ATTRIBUTE MAXLENGTH: " + inputText.getAttribute("maxlength"));

			System.out.println("\n\n|-------|BUTTON|-------|");
			// name button
			WebElement button = driver.findElement(By.name("btnK"));
			System.out.println("TAG NAME: " + button.getTagName());
			System.out.println("TEXT: " + button.getText());
			System.out.println("LOCATION: " + button.getLocation());
			System.out.println("DISPLAYED: " + button.isDisplayed());
			System.out.println("ENABLED: " + button.isEnabled());
			System.out.println("SELECTED: " + button.isSelected());
			System.out.println("ATTRIBUTE CLASS: " + button.getAttribute("class"));
			System.out.println("ATTRIBUTE NAME: " + button.getAttribute("name"));
			System.out.println("ATTRIBUTE STYLE: " + button.getAttribute("style"));
			System.out.println("ATTRIBUTE TYPE: " + button.getAttribute("type"));
			System.out.println("ATTRIBUTE MAXLENGTH: " + button.getAttribute("maxlength"));

			System.out.println("\n\n|-------|LINK TEXT|-------|");
			// name button
			WebElement linkText = driver.findElement(By.linkText("Español (Latinoamérica)"));
			System.out.println("TAG NAME: " + linkText.getTagName());
			System.out.println("TEXT: " + linkText.getText());
			System.out.println("LOCATION: " + linkText.getLocation());
			System.out.println("DISPLAYED: " + linkText.isDisplayed());
			System.out.println("ENABLED: " + linkText.isEnabled());
			System.out.println("SELECTED: " + linkText.isSelected());
			System.out.println("ATTRIBUTE CLASS: " + linkText.getAttribute("class"));
			System.out.println("ATTRIBUTE NAME: " + linkText.getAttribute("name"));
			System.out.println("ATTRIBUTE STYLE: " + linkText.getAttribute("style"));
			System.out.println("ATTRIBUTE TYPE: " + linkText.getAttribute("type"));
			System.out.println("ATTRIBUTE MAXLENGTH: " + linkText.getAttribute("maxlength"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			Thread.sleep(5000);
			driver.close();
		}
	}
}
