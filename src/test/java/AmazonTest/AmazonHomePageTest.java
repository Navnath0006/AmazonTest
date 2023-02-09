package AmazonTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AmazonTestPages.AmzonHomePage;
import AmazonTestPages.ProductResultPage;
import LibraryFiles.BaseClass;

	
public class AmazonHomePageTest extends BaseClass {
	
	AmzonHomePage home1;
	ProductResultPage result;

	
	@BeforeClass
	public void openSite() throws IOException {
		openBrowser();
		home1 = new AmzonHomePage(driver);
		result = new ProductResultPage(driver);
	}
	@Test
	public void searchProduct() throws EncryptedDocumentException, IOException {
		home1.enterProductname();
		home1.clickSearchbtn();
	}
	@Test
	public void selectBrands() {
		result.clickSeeMore();
		result.selectbrands();
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
