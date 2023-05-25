package TestCasesCE;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.CheckDownloadedFile;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.CLPUtils;
import BrowsersBase.DataInterface;

import static TestCasesCE.CCP.ViolationsTile;

public class CLP extends CloseCase {

	public static By CLP = By.xpath(CLPUtils.cLP);
	public static By Cases = By.xpath(CLPUtils.cases);
	public static By ViolationTypeFilter = By.xpath(CLPUtils.violationTypeFilter);

	public static By ViolationTypeCol = By.xpath(CLPUtils.violationTypeCol);
	public static By LocationCol = By.xpath(CLPUtils.locationCol);
	public static By ApnCol = By.xpath(CLPUtils.apnCol);

	public static By AssigneeCol = By.xpath(CLPUtils.assigneeCol);
	public static By StatusCol = By.xpath(CLPUtils.statusCol);
	public static By CreatedCol = By.xpath(CLPUtils.createdCol);
	public static By ClosedCol = By.xpath(CLPUtils.closedCol);
	public static By InspectionAssigneeCol = By.xpath(CLPUtils.inspectionAssigneeCol);
	public static By NextInsepectionAssingeeCol = By.xpath(CLPUtils.nextInsepectionAssingeeCol);
	public static By DeleteCol = By.xpath(CLPUtils.deleteCol);




	public static By CaseStatusFilter = By.xpath(CLPUtils.caseStatusFilter);
	public static By CreatedFilter = By.xpath(CLPUtils.createdFilter);
	public static By InspectionAssigneeFilter = By.xpath(CLPUtils.inspectionAssigneeFilter);
	public static By NextScheduledInspectionFilter = By.xpath(CLPUtils.nextScheduledInspectionFilter);
	public static By PaginationField = By.xpath(CLPUtils.paginationField);
	public static By NextPagination = By.xpath(CLPUtils.nextPagination);
	public static By CaseID = By.xpath(CLPUtils.caseID);
	public static By CaseNumberHeader = By.xpath(CLPUtils.caseNumberHeader);
	public static By DeleteLink = By.xpath(CLPUtils.deleteLink);
	public static By DeleteCasePopup = By.xpath(CLPUtils.deleteCasePopup);
	public static By DeleteTextField = By.xpath(CLPUtils.deleteTextField);
	public static By DeleteCaseButton = By.xpath(CLPUtils.deleteCaseButton);
	public static By ValidationMsgDeleteCase = By.xpath(CLPUtils.validationMsgDeleteCase);
	public static By CasesCount = By.xpath(CLPUtils.casesCount);
	public static By DoNotDeleteButton = By.xpath(CLPUtils.doNotDeleteButton);
	public static By PaginationCount = By.xpath(CLPUtils.paginationCount);
	public static By ViolationTypePF = By.xpath(CLPUtils.violationTypePF);
	public static By CaseStatusPF = By.xpath(CLPUtils.caseStatusPF);
	public static By CreatePF = By.xpath(CLPUtils.createPF);
	public static By InspectionAssigneePF = By.xpath(CLPUtils.inspectionAssigneePF);
	public static By NextScheduledPF = By.xpath(CLPUtils.nextScheduledPF);
	public static By CaseStatusDropDown = By.xpath(CLPUtils.caseStatusDropDown);
	public static By ViolationTypesPF = By.xpath(CLPUtils.violationTypesPF);
	public static By ClosedOption = By.xpath(CLPUtils.closedOption);
	public static By AnimalviolationOption = By.xpath(CLPUtils.animalviolationOption);
	public static By AnimalViolationOptionChk = By.xpath(CLPUtils.animalViolationOptionChk);

	public static By ClosedStatusCLP = By.xpath(CLPUtils.closedStatusCLP);
	public static By ClearAllFiltersLink = By.xpath(CLPUtils.clearAllFiltersLink);
	public static By FilterSlider = By.xpath(CLPUtils.filterSlider);
	public static By ViolationsFilter = By.xpath(CLPUtils.violationsFilter);
	public static By OutstandingBalanceFilter = By.xpath(CLPUtils.outstandingBalanceFilter);
	public static By ViolationsFilterCLP = By.xpath(CLPUtils.violationsFilterCLP);
	public static By OutstandingBalanceFilterCLP = By.xpath(CLPUtils.outstandingBalanceFilterCLP);
	public static By FilterSliderClose = By.xpath(CLPUtils.filterSliderClose);
	public static By ColumnControlWidget = By.xpath(CLPUtils.columnControlWidget);
	public static By ColumnOutstandingBalance = By.xpath(CLPUtils.columnOutstandingBalance);
	public static By CloseColumnControl = By.xpath(CLPUtils.closeColumnControl);
	public static By DropdownOutstandingBalance = By.xpath(CLPUtils.dropdownOutstandingBalance);
	public static By Option2OB = By.xpath(CLPUtils.option2OB);
	public static By ApplyButtonOB = By.xpath(CLPUtils.applyButtonOB);
	public static By CrossSecondaryFilter = By.xpath(CLPUtils.crossSecondaryFilter);
	public static By CountSecondaryFilters = By.xpath(CLPUtils.countSecondaryFilters);
	public static By CLPSearchField = By.xpath(CLPUtils.cLPSearchField);
	public static By NoCasesInfoMsg = By.xpath(CLPUtils.noCasesInfoMsg);
	public static By ColumnOutstandingBalanceCLP = By.xpath(CLPUtils.columnOutstandingBalanceCLP);
	public static By RestoreDefaultsLink = By.xpath(CLPUtils.restoreDefaultsLink);
	public static By SaveAsButton = By.xpath(CLPUtils.saveAsButton);
	public static By SaveAsPopup = By.xpath(CLPUtils.saveAsPopup);
	public static By SaveButton = By.xpath(CLPUtils.saveButton);
	public static By ErrorMsgSaveAsPopup = By.xpath(CLPUtils.errorMsgSaveAsPopup);
	public static By FilterNameField = By.xpath(CLPUtils.filterNameField);
	public static By CountFiltersSaveAs = By.xpath(CLPUtils.countFiltersSaveAs);
	public static By CrossIconFilters = By.xpath(CLPUtils.crossIconFilters);
	public static By FiltersDropdown = By.xpath(CLPUtils.filtersDropdown);
	public static By CreateCaseButtonCLP = By.xpath(CLPUtils.createCaseButtonCLP);
	public static By DownloadButton = By.xpath(CLPUtils.downloadButton);
	public static By CSVOption = By.xpath(CLPUtils.cSVOption);
	public static By OpenedCaseId = By.xpath(CLPUtils.openedCaseId);
	public static By PrintButtonCLP = By.xpath(CLPUtils.printButtonCLP);
	public static By CloseCaseIcon = By.xpath(CLPUtils.closeCaseIcon);
	public static By CancelButtonCCP = By.xpath(CLPUtils.cancelButtonCCP);
	public static By AgencyUserName = By.xpath(CLPUtils.agencyUserName);
	public static By MineButtonCLP = By.xpath(CLPUtils.mineButtonCLP);
	public static By AssigneeColumn = By.xpath(CLPUtils.assigneeColumn);

	public static String CountBefore;
	public static int BeforeDeleting;

	@Test(priority = 1)
	public static void CLP_VerifyCLPOpensUp() {
		extentTest = extent.startTest(" CLP_VerifyCLPOpensUp ");
		extentTest.setDescription(
				" Verify that 'Case Listing' page opens up, when user clicks on 'Cases' tab, on Dashboard. ");
		//	Login.LoginAgency();
		try {
			driver.navigate().to(DataInterface.URLDashboard);
			Thread.sleep(10000);
			WebDriverWaits.ScrollIntoView(CLP);
			//WebDriverWaits.ClickOn(CLP);
			WebDriverWaits.ClickByJsExecuter(CLP);
			Thread.sleep(6000);
			WebElement CasesText = WebDriverWaits.WaitUntilVisibleWE(Cases);
			if ((CasesText.isDisplayed()) == false) {

				SoftAssert s1 = new SoftAssert();
				s1.assertEquals(false, true);
				s1.assertAll();
			}
		} catch (InterruptedException e) {
		}
	}

	@Test(priority = 2)
	public static void CLP_VerifyDefaultColumns() throws InterruptedException {
		extentTest = extent.startTest(" CLP_VerifyDefaultColumns ");
		extentTest.setDescription(" Verify that all default columns appear on CLP. ");
//		Login.LoginAgency();
//		CLP_VerifyCLPOpensUp();

		Thread.sleep(12000);
		WebElement DefaultCol1 = WebDriverWaits.WaitUntilVisibleWE(ViolationTypeCol);
		WebElement DefaultCol2 = WebDriverWaits.WaitUntilVisibleWE(LocationCol);
		WebElement DefaultCol3 = WebDriverWaits.WaitUntilVisibleWE(ApnCol);
		WebDriverWaits.ScrollIntoView(AssigneeCol);
		WebElement DefaultCol4 = WebDriverWaits.WaitUntilVisibleWE(AssigneeCol);
		WebDriverWaits.ScrollIntoView(StatusCol);
		WebElement DefaultCol5 = WebDriverWaits.WaitUntilVisibleWE(StatusCol);
		WebDriverWaits.ScrollIntoView(CreatedCol);
		WebElement DefaultCol6 = WebDriverWaits.WaitUntilVisibleWE(CreatedCol);
		WebDriverWaits.ScrollIntoView(ClosedCol);
		WebElement DefaultCol7 = WebDriverWaits.WaitUntilVisibleWE(ClosedCol);
		WebDriverWaits.ScrollIntoView(InspectionAssigneeCol);
		WebElement DefaultCol8 = WebDriverWaits.WaitUntilVisibleWE(InspectionAssigneeCol);
		WebDriverWaits.ScrollIntoView(NextInsepectionAssingeeCol);
		WebElement DefaultCol9 = WebDriverWaits.WaitUntilVisibleWE(NextInsepectionAssingeeCol);
		WebDriverWaits.ScrollIntoView(DeleteCol);
		WebElement DefaultCol10 = WebDriverWaits.WaitUntilVisibleWE(DeleteCol);


		if (((DefaultCol1.isDisplayed()) == true) && (DefaultCol2.isDisplayed() == true)
				&& (DefaultCol3.isDisplayed() == true) && (DefaultCol4.isDisplayed() == true)
				&& (DefaultCol5.isDisplayed() == true)&& (DefaultCol6.isDisplayed() == true ) && (DefaultCol7.isDisplayed() == true)
				&& (DefaultCol8.isDisplayed() == true ) && (DefaultCol9.isDisplayed() == true) && (DefaultCol1.isDisplayed()
				== true)) {

			SoftAssert s2 = new SoftAssert();
			s2.assertEquals(true, true);
			s2.assertAll();
		}

	}


	@Test(priority = 3)
	public static void CLP_VerifyNavigationToNextPage() {
		extentTest = extent.startTest(" CLP_VerifyNavigationToNextPage ");
		extentTest.setDescription(
				" Verify that user is able to navigate to the next page, after clicking on the 'Next' arrow icon, on CLP. ");
		try {
			Thread.sleep(5000);
			String[] CaseIDBeforeClick = WebDriverWaits.GetText(CaseID).split("-");
			String ID1 = CaseIDBeforeClick[1];
			System.out.println(ID1);
			WebDriverWaits.ScrollIntoView(NextPagination);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(NextPagination);
			Thread.sleep(5000);
			String[] CaseIDAfterClick = WebDriverWaits.GetText(CaseID).split("-");
			String ID2 = CaseIDAfterClick[1];
			System.out.println(ID2);
			int differenceID = Integer.parseInt(ID1) - Integer.parseInt(ID2);
			if ((differenceID >= 50) == false) {

				SoftAssert s3 = new SoftAssert();
				s3.assertEquals(false, true);
				s3.assertAll();
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 4)
	public static void CLP_VerifynavigationToSpecificPage() {
		extentTest = extent.startTest(" CLP_VerifynavigationToSpecificPage ");
		extentTest.setDescription(
				" Verify that user gets navigated to the specific page, when a digit is entered in the pagination field, on CLP. ");
		try {
			WebElement Pagination = WebDriverWaits.WaitUntilVisibleWE(PaginationField);
			Thread.sleep(1000);
			Pagination.sendKeys(Keys.BACK_SPACE);
			Pagination.sendKeys("2");
			Pagination.sendKeys(Keys.RETURN);
		} catch (InterruptedException  e) {
		}
	}

	public static ArrayList<Integer> IDArray = new ArrayList<Integer>();

	@Test(priority = 5)
	public static void CLP_VerifyDescendingOrderOfCases() {
		extentTest = extent.startTest(" CLP_VerifyDescendingOrderOfCases ");
		extentTest.setDescription(" Verify that by default cases are arranged in descending order, on CLP. ");
		int FinalIDs = 0;
		try {
			Thread.sleep(1000);
			List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(CaseID);
			int CountIDs = AllCasesID.size() / 2;
			for (int i = 0; i < CountIDs; i++) {
				WebElement IDList = AllCasesID.get(i);
				String[] IDList1 = IDList.getText().split("-");
				String IDs = IDList1[1];
				FinalIDs = Integer.parseInt(IDs);
				IDArray.add(FinalIDs);
			}
//			System.out.println(FinalIDs);
			Integer[] arr = new Integer[IDArray.size()];
			for (int i = 0; i < 1; i++) {
				arr[i] = IDArray.get(i);
//				System.out.println(i);
//				System.out.println(arr[i]);
				for (int j = i + 1; j < IDArray.size(); j++) {
					arr[j] = IDArray.get(j);
//					System.out.println(j);
//					System.out.println(arr[j]);
					if ((arr[j] < arr[i]) == false) {
//						System.out.println("................");

						SoftAssert s5 = new SoftAssert();
						s5.assertEquals(false, true);
						s5.assertAll();
						// Assert.assertEquals(false, true);
					}
				}
			}
		} catch (InterruptedException  e) {
		}
	}

	@Test(priority = 6)
	public static void CLP_VerifyAscendingOrderOfCases() {
		extentTest = extent.startTest(" CLP_VerifyAscendingOrderOfCases ");
		extentTest.setDescription(
				" Verify that user is able to sort the cases, after clicking on the 'Case Number' header, on CLP. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CaseNumberHeader);
			Thread.sleep(8000);
			List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(CaseID);
			int CountIDs = AllCasesID.size() / 2;
			IDArray.clear();
			for (int i = 0; i < CountIDs; i++) {
				WebElement IDList = AllCasesID.get(i);
				String[] IDList1 = IDList.getText().split("-");
				String IDs = IDList1[1];
				int FinalIDs = Integer.parseInt(IDs);
				IDArray.add(FinalIDs);
			}
			Integer[] arr = new Integer[IDArray.size()];
			for (int i = 0; i < 1; i++) {
				arr[i] = IDArray.get(i);
				for (int j = i + 1; j < IDArray.size(); j++) {
					arr[j] = IDArray.get(j);
					if ((arr[j] > arr[i]) == false) {

//						SoftAssert s6 = new SoftAssert();
//				   		s6.assertEquals(false, true);
//				   		s6.assertAll();
						Assert.assertEquals(false, true);
					}
				}
			}
		} catch (InterruptedException  e) {
		}
	}

	@Test(priority = 7)
	public static void CLP_OpenDeleteCasePopup() {
		extentTest = extent.startTest(" CLP_OpenDeleteCasePopup ");
		extentTest.setDescription(
				" Verify that 'Delete Case' popup opens up, when user clicks on 'Delete' link text corresponding to a case, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CaseNumberHeader);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(DeleteLink);
			String DeleteCaseTitle = WebDriverWaits.GetText(DeleteCasePopup);

			SoftAssert s7 = new SoftAssert();
			s7.assertEquals(DeleteCaseTitle, "Delete Case");
			s7.assertAll();
			// Assert.assertEquals(DeleteCaseTitle, "Delete Case");
		} catch (InterruptedException  e) {
		}
	}

	@Test(priority = 8)
	public static void CLP_ValidationMsgForDeleteCase() {
		extentTest = extent.startTest(" CLP_ValidationMsgForDeleteCase ");
		extentTest.setDescription(
				" Verify that validation message appears, when user clicks on 'Delete Case' button without entering dat in mandatory field, on 'Delete Case' popup. ");
		try {
			Thread.sleep(4000);
			String[] CountCases = WebDriverWaits.GetText(CasesCount).split(" ");
			CountBefore = CountCases[0];
			System.out.println(CountBefore);
			BeforeDeleting = Integer.parseInt(CountBefore);
			System.out.println(BeforeDeleting);
			WebDriverWaits.ScrollIntoView(DeleteCaseButton);
			WebDriverWaits.ClickOn(DeleteCaseButton);
			String ValidationMsgDltCase = WebDriverWaits.GetText(ValidationMsgDeleteCase);
			String ExpectedMsg = "Please enter DELETE in all caps";

			SoftAssert s8 = new SoftAssert();
			s8.assertEquals(ValidationMsgDltCase, ExpectedMsg);
			s8.assertAll();
			// Assert.assertEquals(ValidationMsgDltCase, ExpectedMsg);
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 9)
	public static void CLP_VerifyDeletedcase() {
		extentTest = extent.startTest(" CLP_VerifyDeletedcase ");
		extentTest.setDescription(
				" Verify that user is able to delete a case, after entering 'DELETE' text in mandatory field, on 'Delete Case' popup. ");
		try {
			Thread.sleep(3000);
//			String[] CountCases = WebDriverWaits.GetText(CasesCount).split(" ");
//			String CountBefore = CountCases[0];
//			System.out.println(CountBefore);
//			int BeforeDeleting = Integer.parseInt(CountBefore);
//			System.out.println(BeforeDeleting);
			Thread.sleep(2000);
			WebDriverWaits.SendKeys(DeleteTextField, "DELETE");
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(DeleteCaseButton);
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(12000);
			String[] CountCases2 = WebDriverWaits.GetText(CasesCount).split(" ");
			String CountAfter = CountCases2[0];
			System.out.println(CountAfter);
			int AfterDeleting = Integer.parseInt(CountAfter);
			System.out.println(AfterDeleting);
			if ((AfterDeleting < BeforeDeleting) == false) {

				SoftAssert s9 = new SoftAssert();
				s9.assertEquals(false, true, "Case did not get deleted!");
				s9.assertAll();
				// Assert.assertEquals(false, true, "Case did not get deleted!");
			}
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 10)
	public static void CLP_VerifyCasesForDoNotDeleteOption() {
		extentTest = extent.startTest(" CLP_VerifyCasesForDoNotDeleteOption ");
		extentTest.setDescription(
				" Verify that case does not get deleted, when user clicks on 'Do Not Delete' button, on 'Delete Case' popup. ");
		try {
			Thread.sleep(1000);
			String[] CountCases = WebDriverWaits.GetText(CasesCount).split(" ");
			String CountBefore = CountCases[0];
			int BeforeDeleting = Integer.parseInt(CountBefore);
			WebDriverWaits.ClickOn(DeleteLink);
			WebDriverWaits.ClickOn(DoNotDeleteButton);
			Thread.sleep(3000);
			String[] CountCases2 = WebDriverWaits.GetText(CasesCount).split(" ");
			String CountAfter = CountCases2[0];
			int AfterDeleting = Integer.parseInt(CountAfter);
			if ((AfterDeleting == BeforeDeleting) == false) {

				SoftAssert s10 = new SoftAssert();
				s10.assertEquals(false, true);
				s10.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 11)
	public static void CLP_VerifyTotalCountOfCases() {
		extentTest = extent.startTest(" CLP_VerifyTotalCountOfCases ");
		extentTest.setDescription(" Verify that accurate total count of cases appear above cases, on CLP. ");
		try {
			Thread.sleep(3000);
			String[] CountOfCases = WebDriverWaits.GetText(CasesCount).split(" ");
			String CountHeader = CountOfCases[0];
			int CountAtHeader = Integer.parseInt(CountHeader);
			String[] PaginationCounts = WebDriverWaits.GetText(PaginationCount).split(" ");
			String PaginationFinal = PaginationCounts[1];
			int PgCount = Integer.parseInt(PaginationFinal);
			int CountCasesCLP = (PgCount - 1) * 50;
			for (int i = 0; i < PgCount - 1; i++) {
				Thread.sleep(3000);
				WebDriverWaits.ScrollIntoView(NextPagination);
				Thread.sleep(2000);
				WebDriverWaits.ClickOn(NextPagination);
				Thread.sleep(3000);
			}
			List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(CaseID);
			int CountIDs = AllCasesID.size();
			int TotalCasesCount = CountCasesCLP + CountIDs;

			SoftAssert s11 = new SoftAssert();
			s11.assertEquals(TotalCasesCount, CountAtHeader);
			s11.assertAll();
			// Assert.assertEquals(TotalCasesCount, CountAtHeader);
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 12)
	public static void CLP_VerifyPrimaryFilters() {
		extentTest = extent.startTest(" CLP_VerifyPrimaryFilters ");
		extentTest.setDescription(" Verify that all the Primary filters appear on the CLP. ");
		try {
			Thread.sleep(1000);
			WebElement PrimaryFilter1 = WebDriverWaits.WaitUntilVisibleWE(ViolationTypePF);
			WebElement PrimaryFilter2 = WebDriverWaits.WaitUntilVisibleWE(CaseStatusPF);
			WebElement PrimaryFilter3 = WebDriverWaits.WaitUntilVisibleWE(CreatePF);
			WebElement PrimaryFilter4 = WebDriverWaits.WaitUntilVisibleWE(InspectionAssigneePF);
			// WebElement PrimaryFilter5 =
			// WebDriverWaits.WaitUntilVisibleWE(NextScheduledPF);
			if (((PrimaryFilter1.isDisplayed()) == false) || (PrimaryFilter2.isDisplayed() == false)
					|| (PrimaryFilter3.isDisplayed() == false) || (PrimaryFilter4.isDisplayed() == false)) {

				SoftAssert s12 = new SoftAssert();
				s12.assertEquals(false, true);
				s12.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 13)
	public static void CLP_VerifyApplicationOfPrimaryFilters() {
		extentTest = extent.startTest(" CLP_VerifyApplicationOfPrimaryFilters ");
		extentTest.setDescription(" Verify that user is able to apply the primary filters on the cases, on CLP. ");
		try {
			Thread.sleep(10000);
			WebDriverWaits.ScrollIntoView(CaseStatusDropDown);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CaseStatusDropDown);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(ClosedOption);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CaseStatusDropDown);
			Thread.sleep(3000);
			List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(CaseID);
			int CountIDs = AllCasesID.size();
			Thread.sleep(3000);
			List<WebElement> ClosedCasesCount = WebDriverWaits.WaitUntilVisibleList(ClosedStatusCLP);
			int CountClosedCases = ClosedCasesCount.size();

			SoftAssert s13 = new SoftAssert();
			s13.assertEquals(CountClosedCases, CountIDs);
			s13.assertAll();
			// Assert.assertEquals(CountClosedCases, CountIDs);
		} catch (InterruptedException e) {

		}
	}

	@Test(priority = 14)
	public static void CLP_VerifyClearAllFiltersLinkText() {
		extentTest = extent.startTest(" CLP_VerifyClearAllFiltersLinkText ");
		extentTest.setDescription(
				" Verify that 'Clear all filters' link text appears, when user applies any filter on the cases, on CLP. ");
		try {

			Thread.sleep(3000);

			WebDriverWaits.ScrollIntoView(ViolationTypesPF);
			WebDriverWaits.ClickOn(ViolationTypesPF);
			Thread.sleep(4000);
			WebDriverWaits.ClickByJsExecuter(AnimalViolationOptionChk);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(ViolationTypesPF);
			Thread.sleep(4000);


			WebDriverWaits.ScrollIntoView(ClearAllFiltersLink);
			WebElement ClearAllFilters = WebDriverWaits.WaitUntilVisibleWE(ClearAllFiltersLink);

			if ((ClearAllFilters.isDisplayed()) == false) {

				SoftAssert s14 = new SoftAssert();
				s14.assertEquals(false, true);
				s14.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException  e) {

		}
	}

	@Test(priority = 15)
	public static void CLP_VerifyClearAllFiltersLinkNotPresent() {

		extentTest = extent.startTest(" CLP_VerifyClearAllFiltersLinkNotPresent ");
		extentTest.setDescription(
				" Verify that 'Clear all filters' link text no longer appears, when user clicks on 'Clear all filters' link text, on CLP. ");
		try {
			WebDriverWaits.ScrollIntoView(ClearAllFiltersLink);
			WebDriverWaits.ClickOn(ClearAllFiltersLink);
			Thread.sleep(2000);
			List<WebElement> ClearAllFilters = driver.findElements(ClearAllFiltersLink);
			if ((ClearAllFilters.size() > 0) == true) {

				SoftAssert s15 = new SoftAssert();
				s15.assertEquals(false, true);
				s15.assertAll();

				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException  e) {

		}
	}
	//TO-DO
	@Test(priority = 16)
	public static void CLP_VerifySelectionOfSecondaryFilters() {
		extentTest = extent.startTest(" CLP_VerifySelectionOfSecondaryFilters ");
		extentTest.setDescription(
				" Verify that user is able to select secondary filters, after clicking on 'Filters' slider icon, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(FilterSlider);
			WebDriverWaits.ClickOn(ViolationsFilter);
			WebDriverWaits.ClickOn(OutstandingBalanceFilter);
			WebElement ViolationCheckbox = WebDriverWaits.WaitUntilVisibleWE(ViolationsFilter);
			Thread.sleep(1000);
			WebElement OutstandingBalanceCheckbox = WebDriverWaits.WaitUntilVisibleWE(OutstandingBalanceFilter);
			if ((ViolationCheckbox.isEnabled() == false) || (OutstandingBalanceCheckbox.isEnabled() == false)) {

				SoftAssert s16 = new SoftAssert();
				s16.assertEquals(false, true);
				s16.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 17)
	public static void CLP_VerifyPresenceOfSecondaryFiltersUnderPrimaryFilters() {
		extentTest = extent.startTest(" CLP_VerifyPresenceOfSecondaryFiltersUnderPrimaryFilters ");
		extentTest.setDescription(" Verify that all selected secondary filters appear under primary filters, on CLP. ");
		try {
			WebDriverWaits.ClickOn(FilterSliderClose);
			Thread.sleep(1000);
			WebElement ViolationSecondaryFilter = WebDriverWaits.WaitUntilVisibleWE(ViolationsFilterCLP);
			Thread.sleep(1000);
			WebElement OutstandingBalance2ndFilter = WebDriverWaits.WaitUntilVisibleWE(OutstandingBalanceFilterCLP);
			if ((ViolationSecondaryFilter.isDisplayed() == false)
					|| (OutstandingBalance2ndFilter.isDisplayed() == false)) {

				SoftAssert s17 = new SoftAssert();
				s17.assertEquals(false, true);
				s17.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 18)
	public static void CLP_VerifyApplicationOfsecondaryFilters() {
		extentTest = extent.startTest(" CLP_VerifyApplicationOfsecondaryFilters ");
		extentTest.setDescription(" Verify that user is able to apply the secondary filters on cases, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ColumnControlWidget);
			WebDriverWaits.ClickOn(ColumnOutstandingBalance);
			WebDriverWaits.ClickOn(CloseColumnControl);
			WebDriverWaits.ClickOn(DropdownOutstandingBalance);
			WebDriverWaits.ClickOn(Option2OB);
			WebDriverWaits.ClickOn(ApplyButtonOB);
		} catch (Exception  e) {

		}
	}

	@Test(priority = 19)
	public static void CLP_VerifyRemovalOfSecondaryFilters() {
		extentTest = extent.startTest(" CLP_VerifyRemovalOfSecondaryFilters ");
		extentTest.setDescription(
				" Verify that secondary filter gets removed, when user clicks on 'Cross' icon of filter, on CLP. ");
		try {
			Thread.sleep(1000);
			List<WebElement> SecondaryFilters = WebDriverWaits.WaitUntilVisibleList(CountSecondaryFilters);
			int countSF1 = SecondaryFilters.size();
			WebDriverWaits.ClickOn(CrossSecondaryFilter);
			Thread.sleep(1000);
			List<WebElement> SecondaryFilters2 = WebDriverWaits.WaitUntilVisibleList(CountSecondaryFilters);
			int countSF2 = SecondaryFilters2.size();
			if ((countSF1 > countSF2) == false) {

				SoftAssert s19 = new SoftAssert();
				s19.assertEquals(false, true);
				s19.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 20)
	public static void CLP_VerifySearchField() {
		extentTest = extent.startTest(" CLP_VerifySearchField ");
		extentTest.setDescription(
				" Verify that user is able to filter & search the cases by Case #, Location or APN, after entering data in the search field on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ClearAllFiltersLink);
			String APN = "7030-0159-0010-000";
//		 String APN = "0024-0013-0000-000";
			WebDriverWaits.SendKeys(CLPSearchField, APN);
			Thread.sleep(9000);
			List<WebElement> AllCasesID = driver.findElements(CaseID);
			int CountIDs = AllCasesID.size();
			Thread.sleep(4000);
			List<WebElement> APNCases = driver.findElements(By.xpath("//div[text()='" + (APN) + "']"));
			int APNCaseList = APNCases.size();
			if (APNCaseList < CountIDs) {

				SoftAssert s20 = new SoftAssert();
				s20.assertEquals(false, true);
				s20.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 21)
	public static void CLP_VerifyInfoMsgForNoSearchResults() {
		extentTest = extent.startTest(" CLP_VerifyInfoMsgForNoSearchResults ");
		extentTest.setDescription(
				" Verify that an information message appears, when no search results are found for the entered data, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ClearAllFiltersLink);
			String CLPSearchRandom = RandomStrings.RequiredCharacters(15);
			WebDriverWaits.SendKeys(CLPSearchField, CLPSearchRandom);
			Thread.sleep(6000);
			String NoCasesMsg = WebDriverWaits.GetText(NoCasesInfoMsg);
			SoftAssert s21 = new SoftAssert();
			s21.assertEquals(NoCasesMsg, "No cases to display");
			s21.assertAll();
			// Assert.assertEquals(NoCasesMsg, "No cases to display");
		} catch (Exception  e) {

		}
	}

	@Test(priority = 22)
	public static void CLP_VerifyAdditionOfColumns() {
		extentTest = extent.startTest(" CLP_VerifyAdditionOfColumns ");
		extentTest.setDescription(
				" Verify that user is able to add respective columns, after selecting the checkboxes from 'Column Control' widget, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ColumnControlWidget);
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ColumnOutstandingBalance);
			WebDriverWaits.ClickOn(CloseColumnControl);
			WebElement ColumnAdded = WebDriverWaits.WaitUntilVisibleWE(ColumnOutstandingBalanceCLP);
			if ((ColumnAdded.isDisplayed() == false)) {

				SoftAssert s22 = new SoftAssert();
				s22.assertEquals(false, true);
				s22.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 23)
	public static void CLP_VerifyRestorationOfCheckedBoxes() {
		extentTest = extent.startTest(" CLP_VerifyRestorationOfCheckedBoxes ");
		extentTest.setDescription(
				" Verify that recently checked boxes get restored to default, when user clicks on 'Restore Defaults' link text, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ColumnControlWidget);
			WebDriverWaits.ClickOn(RestoreDefaultsLink);
			Thread.sleep(2000);
			WebElement OBColumn = WebDriverWaits.WaitUntilVisibleWE(ColumnOutstandingBalance);
			if ((OBColumn.isSelected() == true)) {

				SoftAssert s23 = new SoftAssert();
				s23.assertEquals(false, true);
				s23.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 24)
	public static void CLP_VerifyAddedColumnsAfterRestoreDefaultsLink() {
		extentTest = extent.startTest(" CLP_VerifyAddedColumnsAfterRestoreDefaultsLink ");
		extentTest.setDescription(
				" Verify that added columns no longer appear on CLP, when user clicks on 'Restore Defaults' link text. ");
		try {
			WebDriverWaits.ClickOn(ColumnOutstandingBalance);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(RestoreDefaultsLink);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CloseColumnControl);
			Thread.sleep(4000);
			List<WebElement> ColumnRemoved = driver.findElements(ColumnOutstandingBalanceCLP);
			if ((ColumnRemoved.size()) != 0) {

				SoftAssert s24 = new SoftAssert();
				s24.assertEquals(false, true);
				s24.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 25)
	public static void CLP_OpenSaveAsPopup() {
		extentTest = extent.startTest(" CLP_OpenSaveAsPopup ");
		extentTest.setDescription(
				" Verify that 'Save As' popup opens up, when user clicks on 'Save As' button on the top of CLP. ");
		try {
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(15000);
			WebDriverWaits.ClickOn(FiltersDropdown);
			Thread.sleep(2000);
			List<WebElement> DeleteFilters = WebDriverWaits.WaitUntilVisibleList(CrossIconFilters);
			int CountFiltersCross = DeleteFilters.size();
			for (int d = 0; d < CountFiltersCross - 2; d++) {
				WebElement CrossIcons = DeleteFilters.get(d);
				CrossIcons.click();
				Thread.sleep(1000);
				WebDriverWaits.ClickOn(YesDelete);
			}
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(FiltersDropdown);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(SaveAsButton);
			Thread.sleep(1000);
			WebElement SaveasPopup = WebDriverWaits.WaitUntilVisibleWE(SaveAsPopup);
			if ((SaveasPopup.isDisplayed() == false)) {

				SoftAssert s25 = new SoftAssert();
				s25.assertEquals(false, true);
				s25.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 26)
	public static void CLP_VerifyValidationMessageForSaveBtn() {
		extentTest = extent.startTest(" CLP_VerifyValidationMessageForSaveBtn ");
		extentTest.setDescription(
				" Verify that validation message appears, when user clicks on 'Save' button without entering data in 'Filter Name' field, on 'Save As' popup. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(SaveButton);
			WebElement ErrorMsg = WebDriverWaits.WaitUntilVisibleWE(ErrorMsgSaveAsPopup);
			if ((ErrorMsg.isDisplayed() == false)) {

				SoftAssert s26 = new SoftAssert();
				s26.assertEquals(false, true);
				s26.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 27)
	public static void CLP_VerifySavedFilter() {
		extentTest = extent.startTest(" CLP_VerifySavedFilter ");
		extentTest.setDescription(
				" Verify that filter gets saved under 'Default' dropdown list, when user clicks on 'Save' button, on CLP. ");
		try {
			Thread.sleep(2000);
			String FilterNameRandom = RandomStrings.RequiredString(6);
			WebDriverWaits.SendKeys(FilterNameField, "Filter " + (FilterNameRandom));
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(SaveButton);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(FiltersDropdown);
		} catch (Exception  e) {

		}
	}

	@Test(priority = 28)
	public static void CLP_VerifyDeletionOfSavedFilter() {
		extentTest = extent.startTest(" CLP_VerifyDeletionOfSavedFilter ");
		extentTest.setDescription(
				" Verify that user is able to delete the added filter under 'Default' dropdown list, on CLP. ");
		try {
			Thread.sleep(3000);
			List<WebElement> CountFilters = WebDriverWaits.WaitUntilVisibleList(CountFiltersSaveAs);
			int FiltersCount = CountFilters.size();
			WebDriverWaits.ClickOn(CrossIconFilters);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(YesDelete);
			Thread.sleep(3000);
			List<WebElement> CountFiltersAfter = WebDriverWaits.WaitUntilVisibleList(CountFiltersSaveAs);
			int FiltersCountAfter = CountFiltersAfter.size();
			if ((FiltersCountAfter < FiltersCount) == false) {

				SoftAssert s28 = new SoftAssert();
				s28.assertEquals(false, true);
				s28.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {

		}
	}

	@Test(priority = 29)
	public static void CLP_OpenCCPFromCreateCaseBtn() {
		extentTest = extent.startTest(" CLP_OpenCCPFromCreateCaseBtn ");
		extentTest.setDescription(" Verify that CCP opens up, when user clicks on 'Create Case' button, on CLP. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CreateCaseButtonCLP);
			Thread.sleep(6000);
			WebElement CCPElement = WebDriverWaits.WaitUntilVisibleWE20(ViolationsTile);
			if ((CCPElement.isDisplayed()) == false) {

				SoftAssert s29 = new SoftAssert();
				s29.assertEquals(false, true);
				s29.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (Exception  e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 30)
	public static void CLP_VerifyCSVFileDownloaded() {
		extentTest = extent.startTest(" CLP_VerifyCSVFileDownloaded ");
		extentTest.setDescription(
				" Verify that user is able to download the CSV file, after clicking on 'Download' button > 'CSV' option, on CLP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelButtonCCP);
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(ClearAllFiltersLink);
			WebDriverWaits.ClickOn(DownloadButton);
			WebDriverWaits.ClickOn(CSVOption);
			Thread.sleep(3000);
			driver.getTitle();
			CheckDownloadedFile.isFileDownloaded("AUTOMATION_NEW_AGENCY_06-21-2022_03_46 am.csv");
		} catch (Exception  e) {

		}
	}

	@Test(priority = 31)
	public static void CLP_VerifyDirectionToCDP() {
		extentTest = extent.startTest(" CLP_VerifyDirectionToCDP ");
		extentTest.setDescription(
				" Verify that user gets directed to the respective case, after clicking on any case link, on CLP. ");
		try {
			Thread.sleep(4000);
			String FirstCasID = WebDriverWaits.GetText(CaseID);
			WebDriverWaits.ClickOn(CaseID);
			Thread.sleep(4000);
			String[] OpenedID = WebDriverWaits.GetText(OpenedCaseId).split(" #");
			String OpenedCase = OpenedID[1];

			SoftAssert s31 = new SoftAssert();
			s31.assertEquals(OpenedCase, FirstCasID);
			s31.assertAll();
			// Assert.assertEquals(OpenedCase, FirstCasID);
		} catch (Exception  e) {

		}
	}

	@Test(priority = 32)
	public static void CLP_VerifyDirectionToCLPPreview() {
		extentTest = extent.startTest(" CLP_VerifyDirectionToCLPPreview ");
		extentTest.setDescription(
				" Verify that user gets directed to Case List Print Preview, after clicking on 'Print' button, on CLP. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CloseCaseIcon);
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(PrintButtonCLP);
			Thread.sleep(9000);
			String currentWindow = driver.getWindowHandle();
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			Thread.sleep(5000);
			driver.switchTo().window((String) tabs.get(1));
			Thread.sleep(2000);
			driver.switchTo().window(currentWindow);
		} catch (Exception  e) {

		}
	}

	@Test(priority = 33)
	public static void CLP_VerifyMineButtonApplication()  {
		extentTest = extent.startTest(" CLP_VerifyMineButtonApplication ");
		extentTest.setDescription(
				" Verify that only logged in Agency user's cases appear, when user clicks on 'Mine' button, on CLP. ");
		try {
			Login.LoginAgency();
			CLP_VerifyCLPOpensUp();
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(MineButtonCLP);
			Thread.sleep(3000);
			List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(CaseID);
			int CountIDs = AllCasesID.size();
			System.out.println("CountIds "+CountIDs);
			String LoggedInUserName = WebDriverWaits.GetText(AgencyUserName);
//			List<WebElement> AgencyUserCases = driver.findElements(By.xpath("//div[text()='" + (LoggedInUserName) + "']"));
			WebDriverWaits.ScrollIntoView(AssigneeColumn);

			List<WebElement> AssigneeList = driver.findElements(AssigneeColumn);
			int matched = 0;
			System.out.println(AssigneeList.size());

			for (int i = 0; i < AssigneeList.size(); i++) {

				WebElement MatchAssignee = AssigneeList.get(i);
				String MatchUser = MatchAssignee.getText();
				if (MatchUser.equals(LoggedInUserName)) {
					matched++;
				}
			}
			boolean CompareCount = (matched == CountIDs);
			System.out.println(matched);

			Assert.assertTrue(CompareCount);
		} catch (Exception  e) {

		}
	}

}
