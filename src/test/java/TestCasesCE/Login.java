package TestCasesCE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import CommonMethods.CECommonMethods;
import CommonMethods.WebDriverWaits;
import ExtentReport.ExtentReportClass;
import POMCE.CCPUtils;
import POMCE.LoginAgencyUtils;
import BrowsersBase.DataInterface;

public class Login extends ExtentReportClass {

	public static By UsernameField = By.id(LoginAgencyUtils.Username);
	public static By NextButton = By.id("idp-discovery-submit");
	public static By OKTAUsernameField = By.id("idp-discovery-username"); //stage
	public static By OKTAPasswordField = By.id("okta-signin-password");
	public static By OKTASubmitButton = By.id("okta-signin-submit");
	public static By PasswordField = By.id(LoginAgencyUtils.Password);
	public static By SubmitButton = By.id(LoginAgencyUtils.Button);
	public static By AdminUsername = By.xpath(LoginAgencyUtils.adminUsername);
	public static By AdminPassword = By.xpath(LoginAgencyUtils.adminPassword);
	public static By AdminButton = By.xpath(LoginAgencyUtils.adminButton);
	public static By SearchAgency = By.xpath(LoginAgencyUtils.searchAgency);
	public static By EnterAgencyIcon = By.xpath(LoginAgencyUtils.enterAgencyIcon);
	public static By AgencyLoggedInUsername = By.xpath(LoginAgencyUtils.agencyLoggedInUsername);
	public static By PlusIconToCECRM = By.xpath(CCPUtils.plusIconToCECRM);

	public static String AgencyLoggedInUserName;

	@Test(priority = 0)
	public static void LoginAgency() throws InterruptedException {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
		try {
			driver.navigate().to(DataInterface.AgencyURL);
			if (DataInterface.RunEnvironment.equalsIgnoreCase("STAGE"))
			{
				WebDriverWaits.SendKeys(OKTAUsernameField, DataInterface.AgencyUsername);
				WebDriverWaits.ClickOn(NextButton); //stage
				WebDriverWaits.SendKeys(OKTAPasswordField, DataInterface.AgencyPassword);
				WebDriverWaits.WaitUntilVisible(OKTASubmitButton);
				WebDriverWaits.ClickOn(OKTASubmitButton);
				Thread.sleep(20000);
			}
			else{
				WebDriverWaits.SendKeys(UsernameField, DataInterface.AgencyUsername);
				WebDriverWaits.SendKeys(PasswordField, DataInterface.AgencyPassword);
				WebDriverWaits.WaitUntilVisible(SubmitButton);
				WebDriverWaits.ClickOn(SubmitButton);
				Thread.sleep(25000);
			}

			WebDriverWaits.WaitUntilVisible(PlusIconToCECRM);
			WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
			if (CPPBtn.isDisplayed() == false) {
				Assert.assertEquals(false, true);
			}
			AgencyLoggedInUserName = WebDriverWaits.GetText(AgencyLoggedInUsername);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//CECommonMethods.CreationOf50PlusCases();
	}

	@Test(priority = 0)
	public static void LoginAdmin() {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		try {
			driver.navigate().to(DataInterface.AdminURL);
			Thread.sleep(2000);
			WebDriverWaits.SendKeys(AdminUsername, DataInterface.AdminUsername);
			Thread.sleep(2000);
			WebDriverWaits.SendKeys(AdminPassword, DataInterface.AdminPassword);
			WebDriverWaits.ClickOn(AdminButton);
			Thread.sleep(2000);
//			WebDriverWaits.SendKeys(SearchAgency, String.valueOf(DataInterface.AgencyID));
//			Thread.sleep(2000);
//			WebDriverWaits.ClickOn(EnterAgencyIcon);
//			Thread.sleep(8000);
//			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//			Thread.sleep(3000);
//			driver.switchTo().window((String) tabs.get(1));
//			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
