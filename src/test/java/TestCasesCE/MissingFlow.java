package TestCasesCE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.WebDriverWaits;
import POMCE.MissingFlowUtils;

public class MissingFlow extends Dashboard {

	public static By ContactList = By.xpath(MissingFlowUtils.contactList);

	@Test(priority = 01)
	public static void MissingFlow_ContactsTileSearchAndAdd() throws InterruptedException {
		extentTest = extent.startTest(" CCP_OpenCreateAContactPopup ");
		Thread.sleep(2000);
		List<WebElement> BeforeAdding = driver.findElements(CountContact);
		int a = BeforeAdding.size();
		WebDriverWaits.ClickOn(AddContactFld);
		WebDriverWaits.SendKeys(AddContactFld, "a");
		WebDriverWaits.ClickOn(ContactList);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(PropertyOwnerOption);
		WebDriverWaits.ClickOn(ApplyButton);
		List<WebElement> AfterAdding = WebDriverWaits.WaitUntilVisibleList(CountContact);
		int b = AfterAdding.size();
		if ((b > a) == false) {
			SoftAssert s41 = new SoftAssert();
			s41.assertEquals(false, true);
			s41.assertAll();
		}
	}

	@Test(priority = 64)
	public static void VerifyAcceptedFileType() throws InterruptedException {
		extentTest = extent.startTest("VerifyAcceptedFileType  ");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ImageIcon);
		WebElement UploadFile = driver.findElement(By.xpath("//label[text()='Browse file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/dummy-comct.postman_collection");
		String ToastMsgAttachValidate = WebDriverWaits.GetText(ToasterMSGAttachment);
		Thread.sleep(1000);
		SoftAssert s63 = new SoftAssert();
		s63.assertEquals(ToastMsgAttachValidate, "One/more files with unsupported format is/are discarded.");
		s63.assertAll();
		Thread.sleep(3000);
	}

	@Test(priority = 65)
	public static void VerifyAcceptedFileSize() throws InterruptedException {
		extentTest = extent.startTest(" VerifyAcceptedFileSize ");
		// WebDriverWaits.ClickOn(ImageIcon);
		WebElement UploadFile = driver.findElement(By.xpath("//label[text()='Browse file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/pkpadmin,+840-4082-1-CE.pdf");
		String ToastMsgSizehValidate = WebDriverWaits.GetText(ToasterMSGSize);
		Thread.sleep(1000);
		SoftAssert s64 = new SoftAssert();
		s64.assertEquals(ToastMsgSizehValidate, "File size cannot exceed 15MB");
		s64.assertAll();
		Thread.sleep(3000);
	}

	@Test(priority = 66)
	public static void AttachmentInfo() throws InterruptedException {
		extentTest = extent.startTest(" AttachmentInfo ");
		// WebDriverWaits.ClickOn(ImageIcon);
		WebElement UploadFile = driver.findElement(By.xpath("//label[text()='Browse file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/cow.jpg");

		String ImgTitle = WebDriverWaits.GetText(UploadedImgTitle);
		Thread.sleep(2000);
		String ImgName = WebDriverWaits.GetText(UploadedImgNameA);
		Thread.sleep(1000);
		SoftAssert s64 = new SoftAssert();
		s64.assertEquals(ImgTitle, ImgName);
		s64.assertAll();

		WebDriverWaits.SendKeys(Description, "Demo Description");
		WebDriverWaits.SendKeys(UploadedImgLoc, "Demo Loc");

		Thread.sleep(1000);
		String ImageDescription = WebDriverWaits.GetText(Description);
		String ImageLOcation = WebDriverWaits.GetText(UploadedImgLoc);

		WebDriverWaits.ClickOn(AddButton2);

		String IMGTitleonCCP = WebDriverWaits.GetText(ImgTitleonCCP);
		SoftAssert s65 = new SoftAssert();
		s65.assertEquals(ImgTitle, IMGTitleonCCP);
		s65.assertAll();

		Thread.sleep(2000);
		String IMGDesconCCP = WebDriverWaits.GetText(ImgDesconCCP);
		SoftAssert s66 = new SoftAssert();
		s66.assertEquals(IMGDesconCCP, ImageDescription);
		s66.assertAll();

		Thread.sleep(2000);
		String IMGLoconCCP = WebDriverWaits.GetText(ImgLoconCCP);
		SoftAssert s67 = new SoftAssert();
		s67.assertEquals(IMGLoconCCP, ImageLOcation);
		s67.assertAll();
		Thread.sleep(3000);
	}

	@Test(priority = 65)
	public static void VerifyMultipleFilesUpload() throws InterruptedException {
		extentTest = extent.startTest(" VerifyMultipleFilesUpload ");
		WebDriverWaits.ClickOn(ImageIcon);
		WebElement UploadFile = driver.findElement(By.xpath("//label[text()='Browse file']"));

		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/1.jpg");
		Thread.sleep(1000);
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/2.jpg");
		Thread.sleep(1000);
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/3.jpg");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(AddButton2);
		Thread.sleep(3000);
	}

	@Test(priority = 66)
	public static void VerifyMultipleFilesDiffTypeUpload() throws InterruptedException {
		extentTest = extent.startTest(" VerifyMultipleFilesDiffTypeUpload ");
		WebDriverWaits.ClickOn(ImageIcon);
		WebElement UploadFile = driver.findElement(By.xpath("//label[text()='Browse file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/1.jpg");
		Thread.sleep(1000);
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/4.pdf");
		Thread.sleep(1000);
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/democsvfile.csv");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(AddButton2);
	}

}
