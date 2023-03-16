package TCsNewAgencySetup;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POMCRM.CreateCRMUserUtils;
import POMNewAgencySetup.AppPreRequisitesUtils;
import TestCasesCRM.Login;
import POMNewAgencySetup.AgencyCreationUtils;
import POMNewAgencySetup.TemplateMangementUtils;

public class TemplateManagement extends TemplateMangementUtils {
   
	
	@Test(priority = 1)
	public static void TemplateMangement_PreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" TemplateMangement_PreRequisite ");
		extentTest.setDescription(
				"Verify TemplateMangement sub tab is open after clicking on TemplateMangement sidebar under Agency setup.");
		
		TemplateMangementUtils.TemplateMangement_PreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(emailTemplatesLabel, ExpectedemailTemplatesLabel);
		softAssert.assertEquals(TextMessageTemplateLabel,ExpectedTextMessageTemplateLabel );
		softAssert.assertAll();
	}
	
	
	
	@Test(priority = 2)
	public static void TemplateMangement_CloseandOpenCreateTemplatePOpup() throws InterruptedException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that 'Create Template' popup opens up,when user clicks on 'Create Template' button,and close when click on 'Cancel' button");
		TemplateMangementUtils.TemplateMangement_CloseandOpenCreateTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CrtTemplateHeader, ExpectedCrtTemplateHeader);
		softAssert.assertEquals(ClosedCrtTemplatePopup, true);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void TemplateMangement_VerifyValidationsOnCreateTemplatePOpup() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that appropriate validation messages appear, on clicking the 'Save' button when no/ data exceeding the max limit is entered in fields, on 'Create Template' popup");
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
		TemplateMangementUtils.TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualNameValidMsg, ExpectedNameValidMsg);
		softAssert.assertEquals(ActualEmailSubLineValidMsg, ExpectedEmailSubLineValidMsg);
		softAssert.assertEquals(ActualEmailBdyValidMsg, ExpectedEmailBdyValidMsg);
		softAssert.assertEquals(ActualEmailSubLineValidMsg, EmailSubLnMsg);
		softAssert.assertAll();
	}
	
	@Test(priority = 4)
	public static void TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that user is able to add a single as well as multiple documents,after clicking on 'Add Related Documnets' button, on 'Create Template' popup. and delete the added documents");
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
		TemplateMangementUtils.TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(filesCountCheck, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 5)
	public static void TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated ");
		extentTest.setDescription("Verify that 'Preview Email Template' popup opens up and Data Population, when user clicks on 'Preview' button, on 'Create Template' popup.");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
//		TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
		
		TemplateMangementUtils.TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualpreviewTempData, ExpectedpreviewTemplateData);
		softAssert.assertEquals(ActualpreviewTempHeader, ExpectedpreviewTemplateHeader);
		softAssert.assertAll();
	}
	
	
	
//	@Test(priority = )
//	public static void AgencySetup_VerifyAllLinksForCEDashboard() throws InterruptedException {
//		extentTest = extent.startTest(" AgencySetup_VerifyAllLinksForCEDashboard ");
//	    extentTest.setDescription(" Verify that all links under 'Cases', 'Inspections' & 'Notices' section appear, on CE Dashboard. ");
//	AppPreRequisitesUtils.AgencySetup_VerifyAllLinksForCEDashboard();
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertAll();
//	}

}
