package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass {

	public WebDriver driver;
	
	public void openBrowser() throws IOException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(UtilityClass.getpropfile("URL"));
	}
}
