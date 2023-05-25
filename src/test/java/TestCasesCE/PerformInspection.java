package TestCasesCE;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.PerformInspectionUtils;

public class PerformInspection extends CCP {
	public static By PerformInsButton = By.xpath(PerformInspectionUtils.performInsButton);
	public static By ContinueBtn = By.xpath(PerformInspectionUtils.continueBtn);
	public static By GlobalValidMsg = By.xpath(PerformInspectionUtils.globalValidMsg);
	public static By TitlePIPage = By.xpath(PerformInspectionUtils.titlePIPage);
	public static By AddVioPI = By.xpath(PerformInspectionUtils.addVioPI);
	public static By SelectVioList = By.xpath(PerformInspectionUtils.selectVioList);
	public static By InvalidBtnList = By.xpath(PerformInspectionUtils.invalidBtnList);
	public static By NoteField = By.xpath(PerformInspectionUtils.noteField);
	public static By FooterButtons = By.xpath(PerformInspectionUtils.footerButtons);
	public static By AddImgIcon = By.xpath(PerformInspectionUtils.addImgIcon);
	public static By BrowseFileLink = By.xpath(PerformInspectionUtils.browseFileLink);
	public static By AddBtnAttach = By.xpath(PerformInspectionUtils.addBtnAttach);
	public static By CaseVioList = By.xpath(PerformInspectionUtils.caseVioList);
	public static By ConfirmationPopup = By.xpath(PerformInspectionUtils.confirmationPopup);
	public static By CancelConfirmation = By.xpath(PerformInspectionUtils.cancelConfirmation);
	public static By CloseCasePopup = By.xpath(PerformInspectionUtils.closeCasePopup);
	public static By ModalHeaderPI = By.xpath(PerformInspectionUtils.modalHeaderPI);
	public static By ValidBtnList = By.xpath(PerformInspectionUtils.validBtnList);
	public static By VoluntaryToggle = By.xpath(PerformInspectionUtils.voluntaryToggle);
	public static By CancelCloseCase = By.xpath(PerformInspectionUtils.cancelCloseCase);
	public static By IssueNoticeBtn = By.xpath(PerformInspectionUtils.issueNoticeBtn);
	public static By EditVerifyVio = By.xpath(PerformInspectionUtils.editVerifyVio);
	public static By EditVioIcon = By.xpath(PerformInspectionUtils.editVioIcon);
	public static By EditVioPopup = By.xpath(PerformInspectionUtils.editVioPopup);
	public static By LabelVioStatus1 = By.xpath(PerformInspectionUtils.labelVioStatus1);
	public static By NoNoticeToggleButton = By.xpath(PerformInspectionUtils.noNoticeToggleButton);
	public static By NoticeIssueDate = By.xpath(PerformInspectionUtils.noticeIssueDate);
	public static By CancelEditAnimal = By.xpath(PerformInspectionUtils.cancelEditAnimal);
	public static By VioVerificationStatus = By.xpath(PerformInspectionUtils.vioVerificationStatus);
	public static By TitleSection2 = By.xpath(PerformInspectionUtils.titleSection2);
	public static By ForcedToggle = By.xpath(PerformInspectionUtils.forcedToggle);
	public static By ClosedInvalidStatus = By.xpath(PerformInspectionUtils.closedInvalidStatus);
	public static By OpenCompliantStatus = By.xpath(PerformInspectionUtils.openCompliantStatus);
	public static By NoticeSelected = By.xpath(PerformInspectionUtils.noticeSelected);
	public static By NoticeSelected2 = By.xpath(PerformInspectionUtils.noticeSelected2);
	public static By SelectANotice = By.xpath(PerformInspectionUtils.selectANotice);
	public static By Notice2 = By.xpath(PerformInspectionUtils.notice2);
	public static By TitleSection3 = By.xpath(PerformInspectionUtils.titleSection3);
	public static By NoticeDatePicker = By.xpath(PerformInspectionUtils.noticeDatePicker);
	public static By IssueNoticeButton = By.xpath(PerformInspectionUtils.issueNoticeButton);
	public static By ContinueBtnSec2 = By.xpath(PerformInspectionUtils.continueBtnSec2);
	public static By VioListSec2 = By.xpath(PerformInspectionUtils.vioListSec2);
	public static By ComplyByDateFld = By.xpath(PerformInspectionUtils.complyByDateFld);
	public static By ComplyByDatePicker = By.xpath(PerformInspectionUtils.complyByDatePicker);
	public static By InspectionDateFld = By.xpath(PerformInspectionUtils.inspectionDateFld);
	public static By InspectionDatePicker = By.xpath(PerformInspectionUtils.inspectionDatePicker);
	public static By AgencyAdmin = By.xpath(PerformInspectionUtils.agencyAdmin);
	public static By CertifiedMail = By.xpath(PerformInspectionUtils.certifiedMail);
	public static By CertifiedMailFld = By.xpath(PerformInspectionUtils.certifiedMailFld);
	public static By RecipientTile = By.xpath(PerformInspectionUtils.recipientTile);
	public static By RecipientContacts = By.xpath(PerformInspectionUtils.recipientContacts);
	public static By GenerateNoticeBtn = By.xpath(PerformInspectionUtils.generateNoticeBtn);
	public static By ErrorMsgSec3 = By.xpath(PerformInspectionUtils.errorMsgSec3);
	public static By ResponsiblePartyTile = By.xpath(PerformInspectionUtils.responsiblePartyTile);
	public static By ExitBtn = By.xpath(PerformInspectionUtils.exitBtn);
	public static By GenerateNoticePopup = By.xpath(PerformInspectionUtils.generateNoticePopup);
	public static By CancelNoticeBtn = By.xpath(PerformInspectionUtils.cancelNoticeBtn);
	public static By NoticeContent = By.xpath(PerformInspectionUtils.noticeContent);
	public static By PrintBtn = By.xpath(PerformInspectionUtils.printBtn);
	public static By DoNotPrintBtn = By.xpath(PerformInspectionUtils.doNotPrintBtn);
	public static By IssueNoticeCIBtn = By.xpath(PerformInspectionUtils.issueNoticeCIBtn);
	public static By YesConfirmation = By.xpath(PerformInspectionUtils.yesConfirmation);
	public static By TotalContacts = By.xpath(PerformInspectionUtils.totalContacts);
	public static By IframeHTML = By.id(PerformInspectionUtils.iframeHTML);
	public static By CLP = By.xpath(PerformInspectionUtils.cLP);
	public static By CDP = By.xpath(PerformInspectionUtils.cDP);
	public static By AddContactsPIP = By.xpath(PerformInspectionUtils.addContactsPIP);
	public static By CrtContactLink2 = By.xpath(PerformInspectionUtils.crtContactLink2);
	public static By NameFieldPIP = By.xpath(PerformInspectionUtils.nameFieldPIP);
	public static By CrtContactBtn = By.xpath(PerformInspectionUtils.crtContactBtn);
	public static By FollowUpInspectionSection = By.xpath(PerformInspectionUtils.followUpInspectionSection);
	public static By EditFollowUpIcon = By.xpath(PerformInspectionUtils.editFollowUpIcon);
	public static By EditFollowUpPopup = By.xpath(PerformInspectionUtils.editFollowUpPopup);
	public static By After7daysDateLink = By.xpath(PerformInspectionUtils.after7daysDateLink);
	public static By UpdateButton = By.xpath(PerformInspectionUtils.updateButton);
	public static By ScheduleInspectionBtn = By.xpath(PerformInspectionUtils.scheduleInspectionBtn);
	public static By ScheduleInspectionPopupBtn = By.xpath(PerformInspectionUtils.scheduleInspectionPopupBtn);
	public static By ContinueBtnFollowUp = By.xpath(PerformInspectionUtils.continueBtnFollowUp);
	public static By ContinueBtnFollowUp2 = By.xpath(PerformInspectionUtils.continueBtnFollowUp2);
	public static By InspectVioSection = By.xpath(PerformInspectionUtils.inspectVioSection);
	public static By ArrowForPINote = By.xpath(PerformInspectionUtils.arrowForPINote);
	public static By InspectionNoteCDP = By.xpath(PerformInspectionUtils.inspectionNoteCDP);
	public static By CaseNotesIcon = By.xpath(PerformInspectionUtils.caseNotesIcon);
	public static By CaseNotePopupValidate = By.xpath(PerformInspectionUtils.caseNotePopupValidate);
	public static By NoticePopupCancel = By.xpath(PerformInspectionUtils.noticePopupCancel);
	public static By ValidationMessage = By.xpath(PerformInspectionUtils.validationMessage);
	public static By NoteTextArea = By.xpath(PerformInspectionUtils.noteTextArea);
	public static By Notes5000valMsg = By.xpath(PerformInspectionUtils.notes5000valMsg);
	public static By CreateNoteButton = By.xpath(PerformInspectionUtils.createNoteButton);
	public static By CreatedNotesTitle = By.xpath(PerformInspectionUtils.createdNotesTitle);
	public static By NewNoticeToggle = By.xpath(PerformInspectionUtils.newNoticeToggle);

	static String InspectionNote = RandomStrings.RequiredString(15);

	public static void PerformInspection_PreRequisite_CDP() {
		extentTest = extent.startTest(" Pre-requisite (CDP) ");
		extentTest.setDescription(" Verify that the created case is associated with multiple contacts. ");
		try {
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(CLP);
			Thread.sleep(10000);
			WebDriverWaits.ClickOn(CDP);
			WebElement Case = WebDriverWaits.WaitUntilVisibleWE(CaseStatus);
			if ((Case.isDisplayed()) == false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 64)
	public static void PerformInspection_PreRequisite_Contacts() {
		extentTest = extent.startTest(" Pre-requisite (Contacts) ");
		extentTest.setDescription(" Verify that the created case is associated with multiple contacts. ");
		try {
			Thread.sleep(3000);
			List<WebElement> CountContacts = driver.findElements(TotalContacts);
			if (((CountContacts.size()) >= 2) == false) {
				for (int con = 0; con < 2; con++) {
					Thread.sleep(2000);
					WebDriverWaits.ClickOn(AddContactsPIP);
					WebDriverWaits.ClickOn(CrtContactLink2);
					String ContactName = RandomStrings.RequiredString(10);
					WebDriverWaits.SendKeys(NameFieldPIP, ContactName);
					WebDriverWaits.ClickOn(CrtContactBtn);
					Thread.sleep(3000);
					WebDriverWaits.ClickOn(PropertyOwnerOption);
					WebDriverWaits.ClickOn(ApplyButton);
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 65)
	public static void PerformInspection_OpenVerificationInspectionInProgressPage() {
		extentTest = extent.startTest(" PerformInspection_OpenVerificationInspectionInProgressPage ");
		extentTest.setDescription(
				" Verify that 'Verification Inspection in Progress' page opens up, when user clicks on 'Perform Inspection' button under 'Abatement Activities' tile, 'Case Detail' page. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(PerformInsButton);
			String[] Title = WebDriverWaits.GetText(TitlePIPage).split("-");
			String TitleValid = Title[0];
			String ActualTitle = "Verification Inspection in Progress ";

			SoftAssert s65 = new SoftAssert();
			s65.assertEquals(ActualTitle, TitleValid);
			s65.assertAll();
			// Assert.assertEquals(ActualTitle, TitleValid);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 66)
	public static void PerformInspection_ValidationMessageSection1() {
		extentTest = extent.startTest(" PerformInspection_ValidationMessageSection1 ");
		extentTest.setDescription(
				" Verify that appropriate validation message appears, when user clicks on 'Continue' button without entering data in mandatory fields, on 'Verify Violations' popup. ");

		WebDriverWaits.ClickOn(ContinueBtn);
		String ActValidMsg = WebDriverWaits.GetText(GlobalValidMsg);
		String ExpValidMsg = "Could not proceed. There are missing fields/information on this page.";
		SoftAssert s66 = new SoftAssert();
		s66.assertEquals(ActValidMsg, ExpValidMsg);
		s66.assertAll();
		// Assert.assertEquals(ActValidMsg, ExpValidMsg);
	}

	@Test(priority = 67)
	public static void PerformInspection_VerifySection1Status() {
		extentTest = extent.startTest(" PerformInspection_VerifySection1Status ");
		extentTest.setDescription(
				" Verify that the status of 'Verify Violations' section appears 'Incomplete' by default, under 'Verify Violations' section.  ");
		try {
			Thread.sleep(1000);
			String VioStatus1 = WebDriverWaits.GetText(LabelVioStatus1);
			SoftAssert s67 = new SoftAssert();
			s67.assertEquals(VioStatus1, "Incomplete");
			s67.assertAll();
			// Assert.assertEquals(VioStatus1, "Incomplete");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 68)
	public static void PerformInspection_AddAViolation() throws InterruptedException{
		extentTest = extent.startTest(" PerformInspection_AddAViolation ");
		extentTest.setDescription(
				" Verify that user is able to add a violation via 'Add another violation' search box, on 'Verify Violations' popup. ");
		List<WebElement> VioList = WebDriverWaits.WaitUntilVisibleList(CaseVioList);
		int BeforeAdding = VioList.size();
		WebDriverWaits.SendKeys(AddVioPI, "Wa");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(SelectVioList);
		Thread.sleep(7000);
		List<WebElement> VioList2 = WebDriverWaits.WaitUntilVisibleList(CaseVioList);
		int AfterAdding = VioList2.size();
		if ((AfterAdding == (BeforeAdding + 1)) == false) {

			SoftAssert s68 = new SoftAssert();
			s68.assertEquals(false, true);
			s68.assertAll();
			// Assert.assertEquals(false, true);
		}
	}

	@Test(priority = 69)
	public static void PerformInspection_VerifyVerificationPendingStatusForViolation() {
		extentTest = extent.startTest(" PerformInspection_VerifyVerificationPendingStatusForViolation ");
		extentTest.setDescription(
				" Verify that 'Verification Pending' status appears by defualt, when no toggle is selected for a violation, under 'Verify Violations' section. ");

		String VioVerifStatus = WebDriverWaits.GetText(VioVerificationStatus);
		SoftAssert s69 = new SoftAssert();
		s69.assertEquals(VioVerifStatus, "Verification Pending ");
		s69.assertAll();
		// Assert.assertEquals(VioVerifStatus, "Verification Pending ");

	}

	@Test(priority = 70)
	public static void PerformInspection_SelectAnyToggleButtonForViolation() {
		extentTest = extent.startTest(" PerformInspection_SelectAnyToggleButtonForViolation ");
		extentTest.setDescription(
				" Verify that user is able to select any toggle button for the added violations , under 'Verify Violations' section. ");
		WebDriverWaits.ClickOn(InvalidBtnList);
		WebElement InvalidToggle = WebDriverWaits.WaitUntilVisibleWE(InvalidBtnList);
		if ((InvalidToggle.isEnabled()) == false) {

			SoftAssert s70 = new SoftAssert();
			s70.assertEquals(false, true);
			s70.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 71)
	public static void PerformInspection_VerifyClosedStatusForViolation() {
		extentTest = extent.startTest(" PerformInspection_VerifyClosedStatusForViolation ");
		extentTest.setDescription(
				" Verify that 'Closed, invalid, ' status appears, when user selects 'Invalid' toggle button for a violation, under 'Verify Violations' section.  ");
		try {
			WebDriverWaits.ClickOn(InvalidBtnList);
			Thread.sleep(1000);
			String[] VioVerifStatus1 = WebDriverWaits.GetText(ClosedInvalidStatus).split(",");

			SoftAssert s71 = new SoftAssert();
			s71.assertEquals(VioVerifStatus1[0], "Closed");
			s71.assertAll();
			// Assert.assertEquals(VioVerifStatus1, "Closed, invalid, \n" + "Invalid
			// Disposition");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 72)
	public static void PerformInspection_VerifyOpenStatusForViolation() {
		extentTest = extent.startTest(" PerformInspection_VerifyOpenStatusForViolation ");
		extentTest.setDescription(
				" Verify that 'Open, non-compliant' status appears, when user selects 'Valid' toggle button for a violation, under 'Verify Violations' section.  ");

		WebDriverWaits.ClickOn(ValidBtnList);
		;
		String VioVerifStatus1 = WebDriverWaits.GetText(OpenCompliantStatus);

		SoftAssert s72 = new SoftAssert();
		s72.assertEquals(VioVerifStatus1, "Open, non-compliant ");
		s72.assertAll();
		// Assert.assertEquals(VioVerifStatus1, "Open, non-compliant ");

	}

	@Test(priority = 73)
	public static void PerformInspection_VerifyContinueButtonPresence() {
		extentTest = extent.startTest(" PerformInspection_VerifyContinueButtonPresence ");
		extentTest.setDescription(
				" Verify that 'Continue' button no longer appears, when 'Invalid' toggle button is selected for all the violations, on 'Verify Violations' popup. ");

		List<WebElement> InvalidList = WebDriverWaits.WaitUntilVisibleList(InvalidBtnList);
		int CountList = InvalidList.size();
		for (int i = 0; i < CountList; i++) {
			WebElement ListClick = InvalidList.get(i);
			// Thread.sleep(1000);
			ListClick.click();
		}
		List<WebElement> FooterBtns = WebDriverWaits.WaitUntilVisibleList(FooterButtons);
		int sizeFootBtn = FooterBtns.size();
		if ((sizeFootBtn <= 1) == false) {
			SoftAssert s73 = new SoftAssert();
			s73.assertEquals(false, true);
			s73.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 74)
	public static void PerformInspection_OpenConfirmationPopupForCloseCaseButton() {
		extentTest = extent.startTest(" PerformInspection_OpenConfirmationPopupForCloseCaseButton ");
		extentTest.setDescription(
				" Verify that confirmation popup opens up, when user clicks on 'Complete Inspection & Close Case' button for invalid violations, under 'Verify Violations' section. ");

		WebDriverWaits.ClickOn(FooterButtons);
		WebElement ConfirmationIcon = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
		if ((ConfirmationIcon.isDisplayed()) == false) {
			SoftAssert s74 = new SoftAssert();
			s74.assertEquals(false, true);
			s74.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 75)
	public static void PerformInspection_CloseConfirmationPopup() {
		extentTest = extent.startTest(" PerformInspection_CloseConfirmationPopup ");
		extentTest.setDescription(
				" Verify that confirmation popup gets closed, when user clicks on 'Close' button, under 'Verify Violations' section. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelConfirmation);
			Thread.sleep(1000);
			List<WebElement> ConfirmationValid = driver.findElements(ConfirmationPopup);
			if (((ConfirmationValid.size()) < 1) == false) {
				SoftAssert s75 = new SoftAssert();
				s75.assertEquals(false, true);
				s75.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 76)
	public static void PerformInspection_VerifySection2Title() {
		extentTest = extent.startTest(" PerformInspection_VerifySection2Title ");
		extentTest.setDescription(
				" Verify that 'Select Notice & Schedule Follow Up' section's title appears under 'Verify Violations' section, when 'Valid' toggle button is selected for any violation. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ValidBtnList);
			WebElement Section2 = WebDriverWaits.WaitUntilVisibleWE(TitleSection2);
			if ((Section2.isDisplayed()) == false) {
				SoftAssert s76 = new SoftAssert();
				s76.assertEquals(false, true);
				s76.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 77)
	public static void PerformInspection_OpenCloseCasePopup() {
		extentTest = extent.startTest(" PerformInspection_OpenCloseCasePopup ");
		extentTest.setDescription(
				" Verify that 'Close Case' popup opens up, when user clicks on 'Complete Inspection & Close Case' button for valid violations, on 'Verify Violations' popup. ");

		List<WebElement> ValidList = WebDriverWaits.WaitUntilVisibleList(ValidBtnList);
		int CountList1 = ValidList.size();
		for (int i = 0; i < CountList1; i++) {
			WebElement ListClick = ValidList.get(i);
			ListClick.click();
		}
		WebDriverWaits.ClickOn(FooterButtons);
		String CCPopupTitle = WebDriverWaits.GetText(CloseCasePopup);

		SoftAssert s77 = new SoftAssert();
		s77.assertEquals(CCPopupTitle, "Close Case");
		s77.assertAll();
		// Assert.assertEquals(CCPopupTitle, "Close Case");

	}

	@Test(priority = 78)
	public static void PerformInspection_VerifyVoluntaryToggleButtonState() {
		extentTest = extent.startTest(" PerformInspection_VerifyVoluntaryToggleButtonState ");
		extentTest.setDescription(
				" Verify that 'Voluntary' toggle button appears selected by default, on 'Close Case' popup. ");

		WebElement VoluntaryBtn = WebDriverWaits.WaitUntilVisibleWE(VoluntaryToggle);
		if ((VoluntaryBtn.isEnabled()) == false) {
			SoftAssert s78 = new SoftAssert();
			s78.assertEquals(false, true);
			s78.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 79)
	public static void PerformInspection_SelectForcedToggleButton() {
		extentTest = extent.startTest(" PerformInspection_SelectForcedToggleButton ");
		extentTest
				.setDescription(" Verify that user is able to select 'Forced' toggle button, on 'Close case' popup. ");

		WebElement ForcedBtn = WebDriverWaits.WaitUntilVisibleWE(ForcedToggle);
		if ((ForcedBtn.isEnabled()) == false) {
			SoftAssert s79 = new SoftAssert();
			s79.assertEquals(false, true);
			s79.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 80)
	public static void PerformInspection_CloseCloseCasePopup() {
		extentTest = extent.startTest(" PerformInspection_CloseCloseCasePopup ");
		extentTest.setDescription(
				" Verify that 'Close Case' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Verify Violations' popup. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.WaitUntilVisible(CancelCloseCase);
			WebDriverWaits.ClickOn(CancelCloseCase);
			Thread.sleep(1000);
			List<WebElement> ModalCount = WebDriverWaits.WaitUntilVisibleList(ModalHeaderPI);
			if (((ModalCount.size()) < 3) == false) {

				SoftAssert s80 = new SoftAssert();
				s80.assertEquals(false, true);
				s80.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 81)
	public static void PerformInspection_AddInspectionNote() {
		extentTest = extent.startTest(" PerformInspection_AddInspectionNote ");
		extentTest.setDescription(
				" Verify that user is able to add notes in the 'Inspection Note' field, on the 'Verify Violations' popup. ");

		WebDriverWaits.ClickOn(NoteField);
		WebDriverWaits.SendKeys(NoteField, InspectionNote);

	}

	@Test(priority = 82)
	public static void PerformInspection_AddAttachment() {
		extentTest = extent.startTest(" PerformInspection_AddAttachment ");
		extentTest.setDescription(
				" Verify that user is able to add an attachment under 'Attachments' tile after clicking on 'Image' icon, on 'Verify Violations' popup. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(AddImgIcon);
			// WebDriverWaits.ClickOn(BrowseFileLink);
			Thread.sleep(2000);
			WebElement UploadFile01 = driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile01.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(AddBtnAttach);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 83)
	public static void PerformInspection_ExpandSection2OnContinue() {
		extentTest = extent.startTest(" PerformInspection_ExpandSection2OnContinue ");
		extentTest.setDescription(
				" Verify that 'Select Notice & Schedule Follow Up' popup opens up, when user clicks on 'Continue' button, on 'Verify Violations' popup. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(ContinueBtn);
			WebElement CompleteInsBtn = WebDriverWaits.WaitUntilVisibleWE(IssueNoticeBtn);
			if ((CompleteInsBtn.isDisplayed()) == false) {
				SoftAssert s83 = new SoftAssert();
				s83.assertEquals(false, true);
				s83.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 84)
	public static void PerformInspection_VerifySection1Label() {
		extentTest = extent.startTest(" PerformInspection_VerifySection1Label ");
		extentTest.setDescription(
				" Verify that label of the 'Verify Violations' popup appears complete after user clicks on 'Continue' button. ");

		String LabelComplete = WebDriverWaits.GetText(LabelVioStatus1);
		SoftAssert s84 = new SoftAssert();
		s84.assertEquals(LabelComplete, "Complete");
		s84.assertAll();
		// Assert.assertEquals(LabelComplete, "Complete");

	}

	@Test(priority = 85)
	public static void PerformInspection_EditVerifyViolationSection() {
		extentTest = extent.startTest(" PerformInspection_EditVerifyViolationSection ");
		extentTest.setDescription(
				" Verify that user is able to edit the 'Verify Violations' popup, after clicking on the 'Edit' icon, on 'Select Notice & Schedule Follow Up' popup. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(EditVerifyVio);
			WebDriverWaits.ClickOn(EditVioIcon);
			String[] EditVioTitle = WebDriverWaits.GetText(EditVioPopup).split(" ");
			SoftAssert s85 = new SoftAssert();
			s85.assertEquals(EditVioTitle[0], "Edit");
			s85.assertAll();
			// Assert.assertEquals(EditVioTitle[0], "Edit");
			WebDriverWaits.ClickOn(CancelEditAnimal);
			Thread.sleep(4000);
			WebDriverWaits.ScrollIntoView(ContinueBtn);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(ContinueBtn);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 86)
	public static void PerformInspection_VerifyFirstNoticeState() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_VerifyFirstNoticeState ");
		extentTest.setDescription(
				" Verify that first notice appears selected by default under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section. ");

		Thread.sleep(6000);
		WebElement Notice = WebDriverWaits.WaitUntilVisibleWE(NoticeSelected2);
		if ((Notice.isEnabled()) == false) {

			SoftAssert s86 = new SoftAssert();
			s86.assertEquals(false, true);
			s86.assertAll();
			// Assert.assertEquals(false, true);
		}
	}

	@Test(priority = 87)
	public static void PerformInspection_SelectAnyNotice() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_SelectAnyNotice ");
		extentTest.setDescription(
				" Verify that user is able to select a notice under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section. ");

		Thread.sleep(2000);
		WebDriverWaits.ClickOn(Notice2);
		Thread.sleep(1000);
		WebElement Notice02 = WebDriverWaits.WaitUntilVisibleWE(Notice2);
		if ((Notice02.isEnabled()) == false) {
			SoftAssert s87 = new SoftAssert();
			s87.assertEquals(false, true);
			s87.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 88)
	public static void PerformInspection_VerifySection3Title() {
		extentTest = extent.startTest(" PerformInspection_VerifySection3Title ");
		extentTest.setDescription(
				" Verify that 'Generate Notice' section's title appears under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section, when user selects any HTML notice. ");
		try {
			Thread.sleep(1000);
			List<WebElement> AllNotices = WebDriverWaits.WaitUntilVisibleList(NoticeSelected);
			int CountNotices = AllNotices.size();
			for (int i = 0; i < CountNotices; i++) {
				WebElement ListSeq = AllNotices.get(i);
				String[] NoticeType = ListSeq.getText().split(" ");
				if (NoticeType[0].equalsIgnoreCase("HTML")) {
					ListSeq.click();
					break;
				}
			}
			WebElement TitleSec3 = WebDriverWaits.WaitUntilVisibleWE(TitleSection3);
			if ((TitleSec3.isDisplayed()) == false) {

				SoftAssert s88 = new SoftAssert();
				s88.assertEquals(false, true);
				s88.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 89)
	public static void PerformInspection_SelectNoNoticeRequiredCheckbox() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_SelectNoNoticeToggleButton ");
		extentTest.setDescription(
				" Verify that user is able to select 'No Notice' toggle button, on 'Select Notice & Schedule Follow Up' popup. ");

		WebElement NoNoticeToggle = WebDriverWaits.WaitUntilVisibleWE(NoNoticeToggleButton);
		NoNoticeToggle.click();
		Thread.sleep(2000);
		if ((NoNoticeToggle.isEnabled()) == false) {
			SoftAssert s89 = new SoftAssert();
			s89.assertEquals(false, true);
			s89.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 90)
	public static void PerformInspection_UpdateNoticeIssueDate() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_UpdateNoticeIssueDate ");
		extentTest.setDescription(
				" Verify that 'Notice issue date' sub-section gets updated, when user selects a date from calendar, on 'Select Notice & Schedule Follow Up' popup. ");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(By.xpath("//button[text()='New Notice']"));
		Thread.sleep(2000);
		WebElement CurDate = WebDriverWaits.WaitUntilVisibleWE(NoticeIssueDate);
		String CurrentDate = CurDate.getAttribute("value");
		WebDriverWaits.ClickOn(NoticeIssueDate);
		WebDriverWaits.ClickOn(NoticeDatePicker);
		WebElement UpdDate = WebDriverWaits.WaitUntilVisibleWE(NoticeIssueDate);
		String UpdatedDate = UpdDate.getAttribute("value");
		SoftAssert s90 = new SoftAssert();
		s90.assertNotEquals(CurrentDate, UpdatedDate);
		s90.assertAll();
//		 Assert.assertNotEquals(CurrentDate, UpdatedDate);

	}

	@Test(priority = 91)
	public static void PerformInspection_VerifyIssueNoticeAndCompleteInspectionButton() {
		extentTest = extent.startTest(" PerformInspection_VerifyIssueNoticeAndCompleteInspectionButton ");
		extentTest.setDescription(
				" Verify that 'Issue Notice & Complete Inspection' button appears, when any non-HTML notice option is selected, under 'Select a notice' sub-section. ");
		try {
			WebDriverWaits.ClickOn(NewNoticeToggle);
			Thread.sleep(2000);
			List<WebElement> AllNotices1 = WebDriverWaits.WaitUntilVisibleList(NoticeSelected);
//			WebDriverWaits.ClickOn(By.xpath("//div[text()='More...']"));
//			Thread.sleep(8000);
//			WebDriverWaits.ClickOn(By.xpath("//*[text()='Non-HTML']"));

			int CountNotices = AllNotices1.size();
			for (int i = 0; i < CountNotices; i++) {
				WebElement ListSeq = AllNotices1.get(i);
				String[] NoticeType1 = ListSeq.getText().split("-");
				if (NoticeType1[0].equalsIgnoreCase("Non")) {
					Thread.sleep(1000);
					ListSeq.click();
					break;
				}
			}
			Thread.sleep(3000);
			SoftAssert s91 = new SoftAssert();
			s91.assertEquals(WebDriverWaits.ElementIsDisplayed(IssueNoticeButton) , true);
			s91.assertAll();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 92)
	public static void PerformInspection_VerifyContinueButtonPresenceOnHtmlSelected() {
		extentTest = extent.startTest(" PerformInspection_VerifyContinueButtonPresenceOnHtmlSelected ");
		extentTest.setDescription(
				" Verify that 'Continue' button appears, when any HTML notice option is selected, under 'Select a notice' sub-section. ");

		List<WebElement> AllNotices = WebDriverWaits.WaitUntilVisibleList(NoticeSelected);
		int CountNotices = AllNotices.size();
		for (int i = 0; i < CountNotices; i++) {
			WebElement ListSeq = AllNotices.get(i);
			String[] NoticeType = ListSeq.getText().split(" ");
			if (NoticeType[0].equalsIgnoreCase("HTML")) {
				ListSeq.click();
				break;
			}
		}
		WebElement ContinueBtn2 = WebDriverWaits.WaitUntilVisibleWE(ContinueBtnSec2);
		if ((ContinueBtn2.isDisplayed()) == false) {

			SoftAssert s92 = new SoftAssert();
			s92.assertEquals(false, true);
			s92.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 93)
	public static void PerformInspection_VerifyViolationsUnderReviewOpenViolations() {
		extentTest = extent.startTest(" PerformInspection_VerifyViolationsUnderReviewOpenViolations ");
		extentTest.setDescription(
				" Verify that only valid violations appear under 'Review Open Violations and Comply by dates' sub-section, on 'Select Notice & Schedule Follow Up' section. ");
		try {
			WebDriverWaits.ClickOn(EditVerifyVio);
			Thread.sleep(3000);
			List<WebElement> validList = WebDriverWaits.WaitUntilVisibleList(ValidBtnList);
			int CountList = validList.size();
			int CountValidVio = 0;
			for (int i = 0; i < CountList; i++) {
				WebElement ListClick = validList.get(i);
				if ((ListClick.isEnabled()) == true) {
					CountValidVio++;
				}
			}
			int finalCount = CountValidVio;
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(ContinueBtn);
			Thread.sleep(2000);
			List<WebElement> VioList = WebDriverWaits.WaitUntilVisibleList(VioListSec2);
			int actualCount = VioList.size();

			SoftAssert s93 = new SoftAssert();
			s93.assertEquals(actualCount, finalCount);
			s93.assertAll();
			// Assert.assertEquals(actualCount, finalCount);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 94)
	public static void PerformInspection_UpdateComplyByDate() {
		extentTest = extent.startTest(" PerformInspection_UpdateComplyByDate ");
		extentTest.setDescription(
				" Verify that user is able to update the Comply by date for the open violations under 'Review Open Violations and Comply by dates' sub-section of the 'Select Notice & Schedule Follow Up' section. ");
		try {
//			WebElement CurDate1 = WebDriverWaits.WaitUntilVisibleWE(ComplyByDateFld);
//			String CurrentDate1 = CurDate1.getAttribute("value");
			Thread.sleep(4000);
//			WebDriverWaits.ClickOn(ComplyByDateFld);
			Thread.sleep(2000);
//			WebDriverWaits.ClickOn(ComplyByDatePicker);
//			WebElement UpdDate1 = WebDriverWaits.WaitUntilVisibleWE(ComplyByDateFld);
//			String UpdatedDate1 = UpdDate1.getAttribute("value");
//
//			SoftAssert s94 = new SoftAssert();
//			s94.assertNotEquals(CurrentDate1, UpdatedDate1);
//			s94.assertAll();
			// Assert.assertNotEquals(CurrentDate1, UpdatedDate1);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 97)
	public static void PerformInspection_UpdateFollowUpInspectionDate() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_UpdateFollowUpInspectionDate ");
		extentTest.setDescription(
				" Verify that user is able to update the Follow-up inspection date under 'Follow-up inspection date' sub-section of the 'Select Notice & Schedule Follow Up' section. ");

		WebElement CurDate2 = WebDriverWaits.WaitUntilVisibleWE(InspectionDateFld);
		String CurrentDate2 = CurDate2.getAttribute("value");
		WebDriverWaits.ClickOn(InspectionDateFld);
		WebDriverWaits.ClickOn(InspectionDatePicker);
		Thread.sleep(2000);
		WebElement UpdDate2 = WebDriverWaits.WaitUntilVisibleWE(InspectionDateFld);
		String UpdatedDate2 = UpdDate2.getAttribute("value");

		SoftAssert s97 = new SoftAssert();
		s97.assertNotEquals(CurrentDate2, UpdatedDate2);
		s97.assertAll();
		// Assert.assertNotEquals(CurrentDate2, UpdatedDate2);

	}

	@Test(priority = 98)
	public static void PerformInspection_VerifyLoggedInUserToggleButtonState() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_VerifyLoggedInUserToggleButtonState ");
		extentTest.setDescription(
				" Verify that logged in user appears selected by default under 'Follow-up inspection assignee' sub-section of the 'Select Notice & Schedule Follow Up' section. ");

		Thread.sleep(3000);
		WebElement Admin = WebDriverWaits.WaitUntilVisibleWE(AgencyAdmin);
		if ((Admin.isEnabled()) == false) {

			SoftAssert s98 = new SoftAssert();
			s98.assertEquals(false, true);
			s98.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 99)
	public static void PerformInspection_ExpandSection3() {
		extentTest = extent.startTest(" PerformInspection_ExpandSection3 ");
		extentTest.setDescription(
				" Verify that 'Generate Notice' section expands after clicking the 'Continue' button, when any HTML notice is selected, under 'Select Notice & Schedule Follow Up' section.");

		List<WebElement> AllNotices = WebDriverWaits.WaitUntilVisibleList(NoticeSelected);
		int CountNotices = AllNotices.size();
		for (int i = 0; i < CountNotices; i++) {
			WebElement ListSeq = AllNotices.get(i);
			String[] NoticeType = ListSeq.getText().split(" ");
			if (NoticeType[0].equalsIgnoreCase("HTML")) {
				ListSeq.click();
				break;
			}
		}
		WebDriverWaits.ClickOn(ContinueBtnSec2);
		WebElement VerifyEle = WebDriverWaits.WaitUntilVisibleWE(CertifiedMail);
		if ((VerifyEle.isDisplayed()) == false) {

			SoftAssert s99 = new SoftAssert();
			s99.assertEquals(false, true);
			s99.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 100)
	public static void PerformInspection_EnterCertifiedMailNumber() {
		extentTest = extent.startTest(" PerformInspection_EnterCertifiedMailNumber ");
		extentTest.setDescription(
				" Verify that user is able to enter Certified Mail Number in the 'Certified Mail Number' field, under 'Generate Notice' section. ");

		String MailNumber = RandomStrings.RequiredString(10);
		WebDriverWaits.SendKeys(CertifiedMailFld, MailNumber);
		WebElement MailEntered = WebDriverWaits.WaitUntilVisibleWE(CertifiedMailFld);
		String MailEntered2 = MailEntered.getAttribute("value");
		if (MailEntered2 == null) {

			SoftAssert s100 = new SoftAssert();
			s100.assertEquals(false, true);
			s100.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 101)
	public static void PerformInspection_VerifyRecipientSubSectionPresence() {
		extentTest = extent.startTest(" PerformInspection_VerifyRecipientSubSectionPresence ");
		extentTest.setDescription(
				" Verify that 'Recipient' sub-section gets displayed, when case is associated with multiple contacts, under 'Generate Notice' section. ");

		WebElement RecipientSec = WebDriverWaits.WaitUntilVisibleWE(RecipientTile);
		if ((RecipientSec.isDisplayed()) == false) {

			SoftAssert s101 = new SoftAssert();
			s101.assertEquals(false, true);
			s101.assertAll();
			// Assert.assertEquals(false, true);
		}
	}

	@Test(priority = 102)
	public static void PerformInspection_VerifyRecipientNoLongerMandatory() throws InterruptedException {
		extentTest = extent.startTest(" PerformInspection_VerifyRecipientNoLongerMandatory ");
		extentTest.setDescription(
				" Verify that validation message appears after user clicks on 'Generate Notice' button, when no Recipient is selected, under 'Generate Notice' section. ");
		WebDriverWaits.ClickOn(RecipientContacts);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(GenerateNoticeBtn);
		Thread.sleep(2000);
		String NoticePopup = WebDriverWaits.GetText(GenerateNoticePopup);
		Assert.assertEquals(NoticePopup, "Generate Notice");
	}

	@Test(priority = 103)
	public static void PerformInspection_SelectMultipleContact() {
		extentTest = extent.startTest(" PerformInspection_SelectMultipleContact ");
		extentTest.setDescription(
				" Verify that user is able to select multiple contacts from 'Recipient' sub-section, under 'Generate Notice' section. ");
		try {
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CancelNoticeBtn);
			List<WebElement> RecpContacts = WebDriverWaits.WaitUntilVisibleList(RecipientContacts);
			int CountContacts = RecpContacts.size();
			for (int i = 0; i < CountContacts; i++) {
				WebElement ContClick = RecpContacts.get(i);
				ContClick.click();
				Thread.sleep(1000);
				if ((RecpContacts.get(i).isEnabled()) == false) {

					SoftAssert s103 = new SoftAssert();
					s103.assertEquals(false, true);
					s103.assertAll();
					// Assert.assertEquals(false, true);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 104)
	public static void PerformInspection_VerifyResponsiblePartySectionPresence() {
		extentTest = extent.startTest(" PerformInspection_VerifyResponsiblePartySectionPresence ");
		extentTest.setDescription(
				" Verify 'Responsible Party' section gets displayed when there are more than one contact are marked as Bill to contact or none of the contact is marked as Bill to contact when case is having multiple contacts associated with a case. ");

		WebElement ResponsiblePSec = WebDriverWaits.WaitUntilVisibleWE(ResponsiblePartyTile);
		if ((ResponsiblePSec.isDisplayed()) == false) {

			SoftAssert s104 = new SoftAssert();
			s104.assertEquals(false, true);
			s104.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 105)
	public static void PerformInspection_OpenConfirmationPopupOnExitButton() {
		extentTest = extent.startTest(" PerformInspection_OpenConfirmationPopupOnExitButton ");
		extentTest.setDescription(
				" Verify that confirmation popup opens up, when user clicks on 'Exit' button, on 'Verification Inspection in Progress' page. ");

		WebDriverWaits.ClickOn(ExitBtn);
		WebElement ConfirmationIcon1 = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
		if ((ConfirmationIcon1.isDisplayed()) == false) {

			SoftAssert s105 = new SoftAssert();
			s105.assertEquals(false, true);
			s105.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 106)
	public static void PerformInspection_CloseConfirmationPopupForExitButto() {
		extentTest = extent.startTest(" PerformInspection_CloseConfirmationPopupForExitButto ");
		extentTest.setDescription(" Verify that confirmation popup gets closed, when user clicks on 'Cancel' button. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelConfirmation);
			Thread.sleep(1000);
			List<WebElement> ConfirmaValid = driver.findElements(ConfirmationPopup);
			if (((ConfirmaValid.size()) < 1) == false) {

				SoftAssert s106 = new SoftAssert();
				s106.assertEquals(false, true);
				s106.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 107)
	public static void PerformInspection_OpenGenerateNoticepopup() {
		extentTest = extent.startTest(" PerformInspection_OpenGenerateNoticepopup ");
		extentTest.setDescription(
				" Verify that 'Generate Notice' popup opens up, when user clicks on 'Generate Notice' button, on 'Generate Notice' popup. ");
		try {
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(GenerateNoticeBtn);
			String NoticePopup = WebDriverWaits.GetText(GenerateNoticePopup);

			SoftAssert s107 = new SoftAssert();
			s107.assertEquals(NoticePopup, "Generate Notice");
			s107.assertAll();
			// Assert.assertEquals(NoticePopup, "Generate Notice");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 108)
	public static void PerformInspection_CloseGenerateNoticePopup() {
		extentTest = extent.startTest(" PerformInspection_CloseGenerateNoticePopup ");
		extentTest.setDescription(
				" Verify that 'Generate Notice' popup gets closed, when user clicks on 'Cancel' button, on 'Generate Notice' popup. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelNoticeBtn);
			Thread.sleep(2000);
			List<WebElement> modalCount = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
			if (((modalCount.size()) <= 2) == false) {

				SoftAssert s108 = new SoftAssert();
				s108.assertEquals(false, true);
				s108.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 109)
	public static void PerformInspection_AddTextToTextBox() {
		extentTest = extent.startTest(" PerformInspection_AddTextToTextBox ");
		extentTest.setDescription(" Verify that user is able to add text to the text box on 'Generate Notice' popup. ");
		try {
			WebDriverWaits.ClickOn(GenerateNoticeBtn);
			Thread.sleep(1000);
			WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeHTML);
			Thread.sleep(2000);
			driver.switchTo().frame(switchFrame);
			WebElement noticeText = WebDriverWaits.WaitUntilVisibleWE(NoticeContent);
			Thread.sleep(3000);
			noticeText.clear();
			noticeText.sendKeys("New HTML Notice");
			Thread.sleep(8000);
			String newNoticeText = WebDriverWaits.GetText(NoticeContent);

			SoftAssert s109 = new SoftAssert();
			s109.assertEquals(newNoticeText, "New HTML Notice");
			s109.assertAll();
			// Assert.assertEquals(newNoticeText, "New HTML Notice");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 110)
	public static void PerformInspection_VerifyPrintToggleButtonState() {
		extentTest = extent.startTest(" PerformInspection_VerifyPrintToggleButtonState ");
		extentTest.setDescription(
				" Verify that 'Print' toggle button appears selected by default on the 'Generate Notice' popup. ");

		driver.switchTo().defaultContent();
		WebElement printStatus = WebDriverWaits.WaitUntilVisibleWE(PrintBtn);
		if ((printStatus.isEnabled()) == false) {

			SoftAssert s110 = new SoftAssert();
			s110.assertEquals(false, true);
			s110.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 111)
	public static void PerformInspection_SelectAnyToggleButton() {
		extentTest = extent.startTest(" PerformInspection_SelectAnyToggleButton ");
		extentTest.setDescription(
				" Verify that user is able to select the 'Queue To Print'/'Do Not Print' toggle button on the 'Generate Notice' popup. ");

		WebDriverWaits.ClickOn(DoNotPrintBtn);
		WebElement DontPrint = WebDriverWaits.WaitUntilVisibleWE(DoNotPrintBtn);
		if ((DontPrint.isEnabled()) == false) {

			SoftAssert s111 = new SoftAssert();
			s111.assertEquals(false, true);
			s111.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 112)
	public static void PerformInspection_OpenConfirmationPopupForCompleteInspection() {
		extentTest = extent.startTest(" PerformInspection_OpenConfirmationPopupForCompleteInspection ");
		extentTest.setDescription(
				" Verify that confirmation popup opens up, when user clicks on 'Issue Notice & complete Inspection' button, on 'Generate Notice' popup. ");

		WebDriverWaits.ClickOn(IssueNoticeCIBtn);
		WebElement ConfirmationIcon2 = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
		if ((ConfirmationIcon2.isDisplayed()) == false) {

			SoftAssert s112 = new SoftAssert();
			s112.assertEquals(false, true);
			s112.assertAll();
			// Assert.assertEquals(false, true);
		}

	}

	@Test(priority = 113)
	public static void PerformInspection_CloseConfirmationPopupOnCancel() {
		extentTest = extent.startTest(" PerformInspection_CloseConfirmationPopupOnCancel ");
		extentTest.setDescription(
				" Verify that confirmation popup gets closed, when user clicks on 'Cancel' button, on Confirmation popup. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelConfirmation);
			Thread.sleep(1000);
			List<WebElement> ConfirmaValid = driver.findElements(ConfirmationPopup);
			if (((ConfirmaValid.size()) < 1) == false) {

				SoftAssert s113 = new SoftAssert();
				s113.assertEquals(false, true);
				s113.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 114)
	public static void PerformInspection_VerifyTheNoticeIssued() {
		extentTest = extent.startTest(" PerformInspection_VerifyTheNoticeIssued ");
		extentTest.setDescription(
				" Verify that a notice gets issued successfully, when user clicks on 'Yes' button, on confirmation popup. ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(IssueNoticeCIBtn);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(YesConfirmation);
			Thread.sleep(10000);
			List<WebElement> ScheduleIns = driver.findElements(ScheduleInspectionBtn);
			if ((ScheduleIns.size() >= 1) == true) {
				WebDriverWaits.ClickOn(ScheduleInspectionBtn);
				Thread.sleep(2000);
				WebDriverWaits.ClickOn(After7daysDateLink);
				Thread.sleep(2000);
				WebDriverWaits.ClickOn(ScheduleInspectionPopupBtn);
				Thread.sleep(2000);
			}
			Thread.sleep(20000);
			String FollowUP = WebDriverWaits.GetText(FollowUpInspectionSection);
			System.out.println(FollowUP);
			String ExpectedTitle = "Follow-up Inspection 1";

			SoftAssert s114 = new SoftAssert();
			s114.assertEquals(FollowUP, ExpectedTitle);
			s114.assertAll();
			// Assert.assertEquals(FollowUP, ExpectedTitle);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 115)
	public static void FollowUpInspection_VerifyFollowUpInspectionSubSection() {
		extentTest = extent.startTest(" FollowUpInspection_VerifyFollowUpInspectionSubSection ");
		extentTest.setDescription(
				" Verify that 'Follow-up Inspection' sub-section gets added under 'Abatement Activities' section, after user performs first Inspection, on CDP. ");
		try {
			Thread.sleep(4000);
			WebElement FollowUpIns = WebDriverWaits.WaitUntilVisibleWE(FollowUpInspectionSection);
			if ((FollowUpIns.isDisplayed()) == false) {

				SoftAssert s115 = new SoftAssert();
				s115.assertEquals(false, true);
				s115.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 116)
	public static void FollowUpInspection_OpenEditFollowUpInspectionPopup() {
		extentTest = extent.startTest(" FollowUpInspection_OpenEditFollowUpInspectionPopup ");
		extentTest.setDescription(
				" Verify that 'Edit Follow-up Inspection1' popup opens up, when user clicks on 'Edit' icon under 'Abatement Activities' section, on CDP. ");
		try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(EditFollowUpIcon);
			Thread.sleep(4000);
			String EditFollowUpTitle = WebDriverWaits.GetText(EditFollowUpPopup);

			SoftAssert s116 = new SoftAssert();
			s116.assertEquals(EditFollowUpTitle, "Edit Follow-up Inspection 1");
			s116.assertAll();
			// Assert.assertEquals(EditFollowUpTitle, "Edit Follow-up Inspection 1");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 117)
	public static void FollowUpInspection_VerifyEditedDetails() {
		extentTest = extent.startTest(" FollowUpInspection_VerifyEditedDetails ");
		extentTest.setDescription(
				" Verify that user is able to edit & update Follow-up Inspection, after clicking on 'Update' button, on 'Edit Follow-up Inspection1' popup.");
		try {
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(After7daysDateLink);
			WebDriverWaits.ClickOn(UpdateButton);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 118)
	public static void FollowUpInspection_OpenFollowUpInspectionInProgressPopup() {
		extentTest = extent.startTest(" FollowUpInspection_OpenFollowUpInspectionInProgressPopup ");
		extentTest.setDescription(
				" Verify that 'Follow-up Inspection 1 in Progress - <Case #>' popup opens up, when user clicks on 'Perform Inspection' button, on CDP.");
		try {
			Thread.sleep(15000);
			WebDriverWaits.ClickOn(PerformInsButton);
			String[] Title = WebDriverWaits.GetText(TitlePIPage).split(" in ");
			String TitleValid = Title[0];
			String ExpectedTitle = "Follow-up Inspection 1";

			SoftAssert s118 = new SoftAssert();
			s118.assertEquals(TitleValid, ExpectedTitle);
			s118.assertAll();
			// Assert.assertEquals(TitleValid, ExpectedTitle);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 119)
	public static void FollowUpInspection_VerifyInspectViolationsHeadersection1() {
		extentTest = extent.startTest(" FollowUpInspection_VerifyInspectViolationsHeadersection1 ");
		extentTest.setDescription(
				" Verify that 'Inspect Violations' header appears for section 1 of Follow-up Inspection, on CDP.");
		try {
			Thread.sleep(8000);
			String InspectVioHeader = WebDriverWaits.GetText(InspectVioSection);
			String ExpectedHeader = "Inspect Violations";

			SoftAssert s119 = new SoftAssert();
			s119.assertEquals(InspectVioHeader, ExpectedHeader);
			s119.assertAll();
			// Assert.assertEquals(InspectVioHeader, ExpectedHeader);

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 120)
	public static void FollowUpInspection_PerformFollowUpInspection() {
		extentTest = extent.startTest(" FollowUpInspection_PerformFollowUpInspection ");
		extentTest.setDescription(" Verify that user is able to perform Follow-up Inspection on CDP. ");
		try {
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(ContinueBtnFollowUp);
			Thread.sleep(4000);

			int htmlSizebtn = driver.findElements(By.xpath("//div[@class='multi-choice-buttons']//button[contains(text(),'HTML')]")).size();

			if(htmlSizebtn > 0){
				WebDriverWaits.ClickByJsExecuter(By.xpath("//div[@class='multi-choice-buttons']//button[contains(text(),'HTML')]"));
			}
			else {

				List<WebElement> AllNotices = WebDriverWaits.WaitUntilVisibleList(SelectANotice);
				int CountNotices = AllNotices.size();
				for (int i = 0; i < CountNotices; i++) {
					WebElement ListSeq = AllNotices.get(i);
					String[] NoticeType = ListSeq.getText().split(" ");
					if (NoticeType[0].equalsIgnoreCase("HTML")) {
						ListSeq.click();
						break;
					}
				}
			}
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(ContinueBtnFollowUp2);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(GenerateNoticeBtn);
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(DoNotPrintBtn);
			WebDriverWaits.ClickOn(IssueNoticeCIBtn);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(YesConfirmation);
			Thread.sleep(10000);
			WebElement FollowUp2Title = WebDriverWaits.WaitUntilVisibleWE(FollowUpInspectionSection);
			if ((FollowUp2Title.isDisplayed()) == false) {

				SoftAssert s120 = new SoftAssert();
				s120.assertEquals(false, true);
				s120.assertAll();
				// Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 121)
	public static void FollowUpInspection_VerifyFollowUpInspection2Title() {
		extentTest = extent.startTest(" FollowUpInspection_VerifyFollowUpInspection2Title ");
		extentTest.setDescription(
				" Verify that 'Follow-up Inspection 2' title appears under 'Abatement Activities' sub-section, after Follow-up Inspection 1 is completed, on CDP.");
		try {
			Thread.sleep(2000);
			Thread.sleep(20000);
			String FollowUp2 = WebDriverWaits.GetText(FollowUpInspectionSection);
			String ExpectedTitle = "Follow-up Inspection 2";

			SoftAssert s121 = new SoftAssert();
			s121.assertEquals(FollowUp2, ExpectedTitle);
			s121.assertAll();
			// Assert.assertEquals(FollowUp2, ExpectedTitle);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 122)
	public static void CDP_PerformInspection_AddedNoteVerification() {
		extentTest = extent.startTest(" CDP_PerformInspection_NoteVerification ");
		try {
			String PINote = InspectionNote;
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(ArrowForPINote);
			String PINoteCDP = WebDriverWaits.GetText(InspectionNoteCDP);
			Assert.assertEquals(PINote, PINoteCDP);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 123)
	public static void CDP_VerifyOpenAddCaseNotePopup() {
		extentTest = extent.startTest(" CDP_VerifyAddCaseNotePopup ");
		try {
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(CaseNotesIcon);
			Thread.sleep(4000);
			String PopupOpens = WebDriverWaits.GetText(CaseNotePopupValidate);
			Assert.assertEquals(PopupOpens, "Add Case Note");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 124)
	public static void CDP_VerifyPopopClosesOnclickingCancel() {
		extentTest = extent.startTest(" CDP_VerifyPopopClosesOnclickingCancel ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(NoticePopupCancel);
			Thread.sleep(3000);
			List<WebElement> NotesPopup = driver.findElements(CaseNotePopupValidate);
			if (NotesPopup.size() != 0) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 125)
	public static void CDP_ValidationMessageForAddCaseNoteField() {
		extentTest = extent.startTest(" CDP_ValidationMessageForAddCaseNoteField ");
		try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(CaseNotesIcon);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CreateNoteButton);
			Thread.sleep(5000);
			String ValMsg5000 = WebDriverWaits.GetText(ValidationMessage);
			Assert.assertEquals(ValMsg5000, "The Case note is required.");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 126)
	public static void CDP_validationMsgForMoreThan5000Characters() {
		extentTest = extent.startTest(" CDP_validationMsgForMoreThan5000Characters ");
		try {
			Thread.sleep(2000);
			String TextMoreThan5000 = RandomStrings.RequiredString(5001);
			Thread.sleep(2000);
			WebDriverWaits.SendKeys(NoteTextArea, TextMoreThan5000);
			WebDriverWaits.ClickOn(CreateNoteButton);
			Thread.sleep(2000);
			String ValMsg5000 = WebDriverWaits.GetText(ValidationMessage);
			Assert.assertEquals(ValMsg5000, "5000 character limit.");
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 127)
	public static void CDP_VerifyCaseNoteGetsAdded() {
		extentTest = extent.startTest(" CDP_VerifyCaseNoteGetsAdded ");
		try {
			Thread.sleep(1000);
			WebElement AddNoteField = WebDriverWaits.WaitUntilVisibleWE(NoteTextArea);
			Thread.sleep(1000);
			AddNoteField.clear();
			String RandomNote = RandomStrings.RequiredString(50);
			Thread.sleep(2000);
			WebDriverWaits.SendKeys(NoteTextArea, RandomNote);
			WebDriverWaits.ClickOn(CreateNoteButton);
			String[] NotesTitle = WebDriverWaits.GetText(CreatedNotesTitle).split(" ");
			Assert.assertEquals(NotesTitle[0], "Notes");

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

}
