package AmazonTestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class AmzonHomePage {

	@FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]") private WebElement searchbox;
	@FindBy(xpath = "//input[@type=\"submit\"]") private WebElement searchbtn;
	public AmzonHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void enterProductname() throws EncryptedDocumentException, IOException {
		searchbox.click();
		searchbox.sendKeys(UtilityClass.getexceldata(0, 0));
	}
	public void clickSearchbtn() {
		searchbtn.click();
	}
}
