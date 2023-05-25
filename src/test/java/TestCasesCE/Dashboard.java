package TestCasesCE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import CommonMethods.WebDriverWaits;
import POMCE.DashboardUtils;

import static java.lang.Integer.parseInt;

public class Dashboard extends CLP {

	public static By DashboardDropdownArrow = By.xpath(DashboardUtils.dashboardDropdownArrow);
	public static By AllStaffOption = By.xpath(DashboardUtils.allStaffOption);
	public static By SelectedOptionText = By.xpath(DashboardUtils.selectedOptionText);
	public static By MeOption = By.xpath(DashboardUtils.meOption);
	public static By OpenCasesAssignedToMe = By.xpath(DashboardUtils.openCasesAssignedToMe);
	public static By DashboardPage = By.xpath(DashboardUtils.dashboardPage);
	public static By OpenCasesForMyAgency = By.xpath(DashboardUtils.openCasesForMyAgency);
	public static By OverdueInspections = By.xpath(DashboardUtils.overdueInspections);
	public static By OverdueInspection = By.xpath(DashboardUtils.overdueInspection);
	public static By InspectionsDueToday = By.xpath(DashboardUtils.inspectionsDueToday);
	public static By TotalInspections = By.xpath(DashboardUtils.totalInspections);
	public static By TotalCasesForMyAgency = By.xpath(DashboardUtils.totalCasesForMyAgency);
	public static By ShowMoreLink = By.xpath(DashboardUtils.showMoreLink);
	public static By TotalCasesPopup = By.xpath(DashboardUtils.totalCasesPopup);
	public static By ClosePopupButton = By.xpath(DashboardUtils.closePopupButton);
	public static By NoticeTotal = By.xpath(DashboardUtils.noticesTotal);

	public static By NoticesToPrintLink = By.xpath(DashboardUtils.noticesToPrintLink);
	public static By NoticeToPrintLink = By.xpath(DashboardUtils.noticeToPrintLink);

	public static By PrintQueuePopup = By.xpath(DashboardUtils.printQueuePopup);
	public static By ClosePrintQueuePopoup = By.xpath(DashboardUtils.closePrintQueuePopoup);
	public static By CountOpenCasesFMA = By.xpath(DashboardUtils.countOpenCasesFMA);

	@Test(priority = 1)
	public static void TC_Dashboard_ViewAllStaffDashboard() {
		extentTest = extent.startTest(" TC_Dashboard_ViewAllStaffDashboard ");
		extentTest.setDescription(
				" Verify that Admin User is able to view the 'All Staff' Dashboard, on 'Dashboard' page. ");

		try {
			//Login.LoginAgency();
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(15000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			Thread.sleep(6000);
			WebDriverWaits.ClickOn(AllStaffOption);
			String AllStaffText = WebDriverWaits.GetText(SelectedOptionText);
//			SoftAssert s1 = new SoftAssert();
//			s1.assertEquals(AllStaffText, "All Staff");
//			s1.assertAll();
			Assert.assertEquals(AllStaffText, "All Staff");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 2)
	public static void TC_Dashboard_ViewMeDashboard() {
		extentTest = extent.startTest(" TC_Dashboard_ViewMeDashboard ");
		extentTest
				.setDescription(" Verify that Admin User is able to view the 'User' Dashboard, on 'Dashboard' page. ");
		try {
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(MeOption);
			String AllStaffText = WebDriverWaits.GetText(SelectedOptionText);
//			SoftAssert s2 = new SoftAssert();
//	   		s2.assertEquals(AllStaffText, "Me");
//	   		s2.assertAll();
			Assert.assertEquals(AllStaffText, "Me");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 3)
	public static void TC_Dashboard_OpenCasesAssignedToMeLink() {
		extentTest = extent.startTest(" TC_Dashboard_OpenCasesAssignedToMeLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Open cases assigned to me' link, when 'Me' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(OpenCasesAssignedToMe);
			Thread.sleep(1000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {

				SoftAssert s3 = new SoftAssert();
				s3.assertEquals(false, true);
				s3.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 4)
	public static void TC_Dashboard_OpenCasesForMyAgencyLink() {
		extentTest = extent.startTest(" TC_Dashboard_OpenCasesForMyAgencyLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Open cases for my agency' link, when 'Me' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			WebDriverWaits.ClickOn(MeOption);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(OpenCasesForMyAgency);
			Thread.sleep(1000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s4 = new SoftAssert();
				s4.assertEquals(false, true);
				s4.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 5)
	public static void TC_Dashboard_OverdueInspectionsLink() {
		extentTest = extent.startTest(" TC_Dashboard_OverdueInspectionsLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Overdue Inspections' link, when 'Me' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(MeOption);
			Thread.sleep(4000);
			int overDueInstpections = driver.findElements(OverdueInspections).size();
			if (overDueInstpections > 0) {
				WebDriverWaits.ClickOn(OverdueInspections);

			}
			else {
				WebDriverWaits.ClickOn(OverdueInspection);
			}

			Thread.sleep(5000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s5 = new SoftAssert();
				s5.assertEquals(false, true);
				s5.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public static By InspectionDueTodayCount = By.xpath(DashboardUtils.inspectionsDueTodayCount);
	public static By InspectionDueToday = By.xpath(DashboardUtils.inspectionDueToday);
	public static By InspectionDuetdy = By.xpath(DashboardUtils.inspectionsDueToday);


	@Test(priority = 6)
	public static void TC_Dashboard_InspectionsDueTodayLink() {
		extentTest = extent.startTest(" TC_Dashboard_InspectionsDueTodayLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Inspections Due Today' link, when 'Me' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(15000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(MeOption);
			Thread.sleep(10000);
			WebDriverWaits.ScrollIntoView(InspectionDueTodayCount);
			String dueTodayCount = WebDriverWaits.GetText(InspectionDueTodayCount);
			int TodayDueWidget = parseInt(dueTodayCount);
			if(TodayDueWidget > 1 ) {
				WebDriverWaits.ClickOn(InspectionsDueToday);
			}
			else {
				WebDriverWaits.ClickOn(InspectionDueToday);
			}

			Thread.sleep(8000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s6 = new SoftAssert();
				s6.assertEquals(false, true);
				s6.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 7)
	public static void TC_Dashboard_TotalInspectionsLink() {
		extentTest = extent.startTest(" TC_Dashboard_TotalInspectionsLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Total Inspections' link, when 'Me' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(DashboardDropdownArrow);
			WebDriverWaits.ClickOn(MeOption);
			Thread.sleep(3000);
//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			Thread.sleep(4000);
//			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebDriverWaits.ScrollIntoView(TotalInspections);

			Thread.sleep(4000);
			WebDriverWaits.ClickOn(TotalInspections);
			Thread.sleep(1000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s7 = new SoftAssert();
				s7.assertEquals(false, true);
				s7.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 8)
	public static void TC_Dashboard_AllStaff_OpenCasesForMyAgency() {
		extentTest = extent.startTest(" TC_Dashboard_AllStaff_OpenCasesForMyAgency ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Open cases for my agency' link, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(OpenCasesForMyAgency);
			Thread.sleep(3000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s8 = new SoftAssert();
				s8.assertEquals(false, true);
				s8.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 9)
	public static void TC_Dashboard_TotalcasesForMyAgencyLink() {
		extentTest = extent.startTest(" TC_Dashboard_TotalcasesForMyAgencyLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Total cases for my agency' link, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(15000);
			WebDriverWaits.ScrollIntoView(TotalCasesForMyAgency);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(TotalCasesForMyAgency);
			Thread.sleep(1000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s9 = new SoftAssert();
				s9.assertEquals(false, true);
				s9.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 10)
	public static void TC_Dashboard_AllStaff_OverdueInspections() {
		extentTest = extent.startTest(" TC_Dashboard_AllStaff_OverdueInspections ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Overdue Inspections' link, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(OverdueInspections);
			Thread.sleep(1000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s10 = new SoftAssert();
				s10.assertEquals(false, true);
				s10.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 11)
	public static void TC_Dashboard_AllStaff_InspectionsDueToday() {
		extentTest = extent.startTest(" TC_Dashboard_AllStaff_InspectionsDueToday ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Inspections Due Today' link, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			//Login.LoginAgency();
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(25000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,2500)", "");

			Thread.sleep(3000);
			String dueTodayCount = WebDriverWaits.GetText(InspectionDueTodayCount);
			int TodayDueWidget = parseInt(dueTodayCount);
			if(TodayDueWidget > 1 ) {
				WebDriverWaits.ScrollIntoView(InspectionsDueToday);
				Thread.sleep(2000);
				WebDriverWaits.ClickOn(InspectionsDueToday);
			}
			else {
				Thread.sleep(2000);
				//WebDriverWaits.ClickOn(InspectionDueToday);
				WebDriverWaits.ScrollIntoView(InspectionDueToday);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(InspectionDueToday);

			}

			Thread.sleep(8000);


//			WebDriverWaits.ScrollIntoView(InspectionsDueToday);
//			WebDriverWaits.ClickOn(InspectionsDueToday);
//			Thread.sleep(7000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s11 = new SoftAssert();
				s11.assertEquals(false, true);
				s11.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 12)
	public static void TC_Dashboard_AllStaff_TotalInspectionsLink() {
		extentTest = extent.startTest(" TC_Dashboard_AllStaff_TotalInspectionsLink ");
		extentTest.setDescription(
				" Verify that Admin User gets directed to the 'Cases' page on clicking the 'Total Inspections' link, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(15000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)", "");
			Thread.sleep(8000);
			WebDriverWaits.ScrollIntoView(TotalInspections);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(TotalInspections);
			Thread.sleep(3000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s12 = new SoftAssert();
				s12.assertEquals(false, true);
				s12.assertAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(enabled=false)
	public static void TC_Dashboard_OpenTotalInspectionPopup() {
		extentTest = extent.startTest(" TC_Dashboard_OpenTotalInspectionPopup ");
		extentTest.setDescription(
				" Verify that '<Count> Total Inspections' popup opens up after clicking on the 'Show More' link under '<Count> Total Inspections' section, when 'All Staff' option is selected from the 'Staff' dropdown, on 'Dashboard' page. ");
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)", "");
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ShowMoreLink);
			Thread.sleep(3000);
			String PopupTitle = WebDriverWaits.GetText(TotalCasesPopup);
			Thread.sleep(1000);
			SoftAssert s13 = new SoftAssert();
			s13.assertEquals(PopupTitle, "Total Inspections");
			s13.assertAll();
			WebDriverWaits.ClickOn(ClosePrintQueuePopoup);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 14)
	public static void TC_Dashboard_CompareCountOfCasesWithCLP() {
		extentTest = extent.startTest(" TC_Dashboard_CompareCountOfCasesWithCLP ");
		extentTest.setDescription(
				" Verify that accurate count of cases appear on 'Dashboard' page with respect to CLP. ");
		try {
//			Login.LoginAgency();
//			Thread.sleep(10000);
			Thread.sleep(10000);
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(10000);
			String GetOpenCasesFMACount = WebDriverWaits.GetText(CountOpenCasesFMA);
			int CountCases1 = parseInt(GetOpenCasesFMACount);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-2500)", "");
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(OpenCasesForMyAgency);
			Thread.sleep(10000);
			Thread.sleep(5000);
			String[] CountOfCases = WebDriverWaits.GetText(CasesCount).split(" ");
			String CountCases0 = CountOfCases[0];
			int CountCases = parseInt(CountCases0);
//	     	SoftAssert s14 = new SoftAssert();
//	   		s14.assertEquals(CountCases1, CountCases);
//	   		s14.assertAll();
			Assert.assertEquals(CountCases1, CountCases);

			WebDriverWaits.ClickOn(DashboardPage);
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 15)
	public static void TC_Dashboard_OpenPrintQueuePopup() throws InterruptedException {
		extentTest = extent.startTest(" TC_Dashboard_OpenPrintQueuePopup ");
		extentTest.setDescription(
				" Verify that 'Print Queue' popup opens up, when user clicks on '<count> notices in your print queue' link, on 'Dashboard' page. ");
		// Login.LoginAgency();
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(15000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		WebDriverWaits.ScrollTillPageEnd();
		Thread.sleep(2000);
		if(parseInt(WebDriverWaits.GetText(NoticeTotal)) >1)
		{
			Thread.sleep(1000);
			WebDriverWaits.ScrollIntoView(NoticesToPrintLink);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(NoticesToPrintLink);

		}else{
			Thread.sleep(1000);
			WebDriverWaits.ScrollIntoView(NoticeToPrintLink);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(NoticeToPrintLink);
		}
		Thread.sleep(2000);
		WebElement PopupTitle = WebDriverWaits.WaitUntilVisibleWE(PrintQueuePopup);
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PopupTitle.isDisplayed(), "Print Queue Popup didn't open!!");
		WebDriverWaits.ClickOn(ClosePrintQueuePopoup);
		softAssert.assertAll();

	}

}
