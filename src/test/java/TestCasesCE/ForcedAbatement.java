package TestCasesCE;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import CommonMethods.CECommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.FAUtils;

public class ForcedAbatement extends PerformInspection {

    public static By MoreBtn = By.xpath(FAUtils.moreBtn);
    public static By InitiateFABtn = By.xpath(FAUtils.initiateFABtn);
    public static By PopupTitleFA = By.xpath(FAUtils.popupTitleFA);
    public static By IFAPopupBtn = By.xpath(FAUtils.iFAPopupBtn);
    public static By ErrorMsgNote = By.xpath(FAUtils.errorMsgNote);
    public static By NoteField = By.xpath(FAUtils.noteField);
    public static By ErrorNoteLimit = By.xpath(FAUtils.errorNoteLimit);
    public static By ForcedBadge = By.xpath(FAUtils.forcedBadge);
    public static By AbatementInfo = By.xpath(FAUtils.abatementInfo);
    public static By EditFANoteLink = By.xpath(FAUtils.editFANoteLink);
    public static By EditNotePopup = By.xpath(FAUtils.editNotePopup);
    public static By SaveBtn = By.xpath(FAUtils.saveBtn);
    public static By EditedNote = By.xpath(FAUtils.editedNote);
    public static By AddActivityBtn = By.xpath(FAUtils.addActivityBtn);
    public static By AddAttachment = By.xpath(FAUtils.addAttachment);
    public static By ActivityType2 = By.xpath(FAUtils.activityType2);
    public static By ActivityType3 = By.xpath(FAUtils.activityType3);
    public static By FAActivityPopup = By.xpath(FAUtils.fAActivityPopup);
    public static By FAactivityPopup = By.xpath(FAUtils.fAactivityPopup);
    public static By FAToggleBtn = By.xpath(FAUtils.fAToggleBtn);
    public static By FAActivityBtn = By.xpath(FAUtils.fAActivityBtn);
    public static By AddedActivity = By.xpath(FAUtils.addedActivity);
    public static By SelectDocument = By.xpath(FAUtils.selectDocument);
    public static By SelectHTML = By.xpath(FAUtils.selectHTML);
    public static By ErrorMsgFA1 = By.xpath(FAUtils.errorMsgFA1);
    public static By ErrorMsgFA2 = By.xpath(FAUtils.errorMsgFA2);
    public static By DocNoteTitle = By.xpath(FAUtils.docNoteTitle);
    public static By ValidMsgDocNote = By.xpath(FAUtils.validMsgDocNote);
    public static By LabelForText1 = By.xpath(FAUtils.labelForText1);
    public static By LabelForNumber2 = By.xpath(FAUtils.labelForNumber2);
    public static By LabelForSelect3 = By.xpath(FAUtils.labelForSelect3);
    public static By DocumentNoteField = By.xpath(FAUtils.documentNoteField);
    public static By FirstOption = By.xpath(FAUtils.firstOption);
    public static By GenerateDocBtn = By.xpath(FAUtils.generateDocBtn);
    public static By ContinueToGenDoc = By.xpath(FAUtils.continueToGenDoc);
    public static By GenerateDocAddFABtn = By.xpath(FAUtils.generateDocAddFABtn);
    public static By EditActivityIcon = By.xpath(FAUtils.editActivityIcon);
    public static By EditActivityPopup = By.xpath(FAUtils.editActivityPopup);
    public static By CancelBtnEditFA = By.xpath(FAUtils.cancelBtnEditFA);
    public static By SaveBtnEditFA = By.xpath(FAUtils.saveBtnEditFA);
    public static By EditedLabelText1 = By.xpath(FAUtils.editedLabelText1);
    public static By DeleteActivityIcon = By.xpath(FAUtils.deleteActivityIcon);
    public static By GenerateDocumentBtn = By.xpath(FAUtils.generateDocumentBtn);
    public static By selectFAADocArrow = By.xpath(FAUtils.selectFAADocArrow);
    public static By SelectFAADoc = By.xpath(FAUtils.selectFAADoc);
    public static By GenFAADoc = By.xpath(FAUtils.genFAADoc);
    public static By EditFAAPopup = By.xpath(FAUtils.editFAAPopup);
    public static By EditSaveFAA = By.xpath(FAUtils.editSaveFAA);


    public static By violationLable = By.xpath(FAUtils.violationLable);
    public static By contactfirst = By.xpath(FAUtils.contactfirst);
    public static By contact2 = By.xpath(FAUtils.contact2);
    public static By FAAAttachement = By.xpath(FAUtils.fAAAttachement);


    public static By selectImgFAA1 = By.xpath(FAUtils.selectImgFAA1);
    public static By selectImgFAA2 = By.xpath(FAUtils.selectImgFAA2);
    public static By selectedImagFAA1 = By.xpath(FAUtils.selectedImagFAA1);
    public static By selectedImahFAA2 = By.xpath(FAUtils.selectedImahFAA2);
    public static By printPreviewFrame = By.id(FAUtils.printPreviewFrame);
    public static By imagedetTabTitle1 = By.xpath(FAUtils.imagedetTabTitle1);
    public static By imagedetTabTitle2 = By.xpath(FAUtils.imagedetTabTitle2);
    public static By donotPrint = By.xpath(FAUtils.donotPrint);

    public static By exitAddActivity = By.xpath(FAUtils.exitAddActivity);
    public static By exitConfirmYesBtn = By.xpath(FAUtils.exitConfirmYesBtn);
    public static By addContactCDP = By.xpath(FAUtils.addContactCDP);
    public static By crtNewContactCDP = By.xpath(FAUtils.crtNewContactCDP);
    public static By contactName = By.xpath(FAUtils.contactName);

    public static By createAnywayContact = By.xpath(FAUtils.createAnywayContact);
    public static By billtoContact2 = By.xpath(FAUtils.billtoContact2);
    public static By billtoContact3 = By.xpath(FAUtils.billtoContact3);


    public static By photoSection = By.xpath(FAUtils.photoSection);
    public static By selectAllCheckBox = By.xpath(FAUtils.selectAllCheckBox);
    public static By photosAttached = By.xpath(FAUtils.photosAttached);

    public static By viewphotos = By.xpath(FAUtils.viewphotos);

    public static By photoDetailsHeader = By.xpath(FAUtils.photoDetailsHeader);
    public static By closeBtn = By.xpath(FAUtils.closeBtn);
    public static By chooseFAHtmlDoc = By.xpath(FAUtils.chooseFAHtmlDoc);
    public static By activityProgress = By.xpath(FAUtils.activityProgress);
    public static By abatementDetailsPopup = By.xpath(FAUtils.abatementDetailsPopup);
    public static By progressDetails = By.xpath(FAUtils.progressDetails);
    public static By abatementActivitySec = By.xpath(FAUtils.abatementActivitySec);

    public static By fineSection = By.xpath(FAUtils.fineSection);
    public static By violationFileSec = By.xpath(FAUtils.violationFileSec);
    public static By issueFAADate = By.xpath(FAUtils.issueFAADate);
    public static By FAAcontact1 = By.xpath(FAUtils.fAAcontact1);
    public static By FAAcontact2 = By.xpath(FAUtils.fAAcontact2);

    public static By FAAResPosiblecontact1 = By.xpath(FAUtils.fAAResPosiblecontact1);
    public static By FAAResPosiblecontact2 = By.xpath(FAUtils.fAAResPosiblecontact2);
    public static By FAASelectfaaDoc = By.xpath(FAUtils.fAASelectfaaDoc);
    public static By Selectedcontact1 = By.xpath(FAUtils.selectedcontact1);
    public static By Selectedcontact2 = By.xpath(FAUtils.selectedcontact2);

    public static By FAADonotIsuueFine = By.xpath(FAUtils.fAADonotIsuueFine);
    public static By FAAAddAnotherFine = By.xpath(FAUtils.fAAAddAnotherFine);


    public static String IssueFAADate;
    public static String fineSectionHeader;
    public static String addedViolation;
    public static String addedRecipent1;
    public static String addedRecipent2;
    public static String addedRisponsoible1;
    public static String addedRisponsoible2;
    public static String FAASelectfaaDocLabel;
    public static int FAADonotIsuueFineChkbox;
    public static Boolean FAAAddAnotherFineLinktxt;
    public static String expectFineSectionHeader = "There is an associated fine with the document you selected, please set the due date and assign a fine amount for each open violation on the case below.";
    public static int photocount;
    public static int selectCheckBox;
    public static String viewPhotoDetails;
    public static String SelectedImag1;
    public static String SelectedImag2;
    public static String actualImag1;
    public static String actualImag2;
    public static Boolean activity2Field;
    public static Boolean activity3Field;
    public static String waterViolation;
    public static String contact1;
    public static String contact22;

    public static String Attachment1 = "pexels-mike-b-170811.jpg";
    public static String Attachment2 = "pexels-mike-b-810357.jpg";
    public static String Attachment3 = "pexels-torsten-dettlaff-70912.jpg";
    public static String expectedprogressActivity = "Complete";
    public static String actualprogressActivity;
    public static String expectedprogressAbDetail = "Incomplete";
    public static String actualprogressAbDetails;
    public static Boolean AbatementDetailsPopup;


    @Test(priority = 115)
    public static void ForcedAbatement_OpenInitiateForcedAbabtementPopup() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_OpenInitiateForcedAbabtementPopup ");
        extentTest.setDescription(" Verify that 'Initiate Forced Abatement' popup opens up after clicking on the 'More'>'Initiate Forced Abatement' button on the CDP. ");
        Thread.sleep(2000);
        driver.navigate().to(DataInterface.URLDashboard);
        Thread.sleep(25000);
        CECommonMethods.CE_CreateACase();
        Thread.sleep(10000);
        Thread.sleep(15000);

        try {
            Thread.sleep(5000);
            WebDriverWaits.ClickByJsExecuter(MoreBtn);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(InitiateFABtn);
            String FATitle = WebDriverWaits.GetText(PopupTitleFA);
            Assert.assertEquals(FATitle, "Initiate Forced Abatement");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 116)
    public static void ForcedAbatement_ValidationMsgForEmptyNote() {
        extentTest = extent.startTest(" ForcedAbatement_ValidationMsgForEmptyNote ");
        extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Initiate Forced Abatement' button, without adding any note, on the 'Initiate Forced Abatement' popup. ");
        try {
            Thread.sleep(4000);
            WebDriverWaits.ClickOn(IFAPopupBtn);
            Thread.sleep(1000);
            String ValidMsg = WebDriverWaits.GetText(ErrorMsgNote);
            String ExpValidMag = "The Forced Abatement Note is required.";
            SoftAssert s116 = new SoftAssert();
            s116.assertEquals(ValidMsg, ExpValidMag);
            s116.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 117)
    public static void ForcedAbatement_ValidationMsgForCharactersOver500InNote() {
        extentTest = extent.startTest(" ForcedAbatement_ValidationMsgForCharactersOver500InNote ");
        extentTest.setDescription(" Verify that validation message appears after clicking on the 'Initiate Forced Abatement' button, when more than 500 characters are entered in the 'Note' field, on 'Initiate Forced Abatement' popup. ");
        try {
            String LargeNote = RandomStrings.RequiredString(505);
            WebDriverWaits.SendKeys(NoteField, LargeNote);
            Thread.sleep(3000);
            WebDriverWaits.ClickOn(IFAPopupBtn);
            String LimitError = WebDriverWaits.GetText(ErrorNoteLimit);
            SoftAssert s117 = new SoftAssert();
            s117.assertEquals(LimitError, "500 character limit.");
            s117.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 118)
    public static void ForcedAbatement_InitiateForcedAbatement() {
        extentTest = extent.startTest(" ForcedAbatement_InitiateForcedAbatement ");
        extentTest.setDescription(" Verify that User is able to initiate the Forced Abatement on the 'Initiate Forced Abatement' popup. ");
        try {
            WebElement NoteFld = WebDriverWaits.WaitUntilVisibleWE(NoteField);
            NoteFld.clear();
            WebDriverWaits.SendKeys(NoteField, "Notes for FA");
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(IFAPopupBtn);
            Thread.sleep(15000);
            WebDriverWaits.WaitUntilVisible(AbatementInfo);
            Thread.sleep(2000);
            WebElement FAInfo = driver.findElement(AbatementInfo);
            if ((FAInfo.isDisplayed()) == false) {
                SoftAssert s118 = new SoftAssert();
                s118.assertEquals(false, true);
                s118.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 119)
    public static void ForcedAbatement_VerifyForcedStageBadge() {
        extentTest = extent.startTest(" ForcedAbatement_VerifyForcedStageBadge ");
        extentTest.setDescription(" Verify that Abatement stage badge converts into Forced, when FA has been initiated. ");
        try {
            Thread.sleep(1000);
            WebElement Forced = WebDriverWaits.WaitUntilVisibleWE(ForcedBadge);
            if ((Forced.isDisplayed()) == false) {
                SoftAssert s119 = new SoftAssert();
                s119.assertEquals(false, true);
                s119.assertAll();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 119)
    public static void ForcedAbatement_OpenEditFaNotePopup() {
        extentTest = extent.startTest(" ForcedAbatement_OpenEditFaNotePopup ");
        extentTest.setDescription(" Verify that 'Edit FA Note' popup opens up, when user clicks on 'Edit' link, under 'Abatement Activities' tile. ");
        try {
            Thread.sleep(6000);
            WebDriverWaits.ClickOn(EditFANoteLink);
            Thread.sleep(3000);
            String EditFAPopup = WebDriverWaits.GetText(EditNotePopup);
            SoftAssert s119 = new SoftAssert();
            s119.assertEquals(EditFAPopup, "Edit FA Note");
            s119.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 120)
    public static void ForcedAbatement_EditNoteInEditFaNoteField() {
        extentTest = extent.startTest(" ForcedAbatement_EditNoteInEditFaNoteField ");
        extentTest.setDescription(" Verify that user is able to edit note in the 'Edit FA Note' field, on 'Edit FA Note' popup. ");
        try {
            Thread.sleep(4000);
            WebDriverWaits.SendKeys(NoteField, " Edited*");
            Thread.sleep(2000);
            String EditedFANote = WebDriverWaits.GetText(NoteField);
            SoftAssert s120 = new SoftAssert();
            s120.assertEquals(EditedFANote, "Notes for FA Edited*");
            s120.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 121)
    public static void ForcedAbatement_VerifyTheUpdatedNote() {
        extentTest = extent.startTest(" ForcedAbatement_VerifyTheUpdatedNote ");
        extentTest.setDescription(" Verify that the edited note gets updated, when user clicks on save button, on 'Edit FA Note' popup ");
        try {
            Thread.sleep(4000);
            WebDriverWaits.ScrollIntoView(SaveBtn);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(SaveBtn);
            Thread.sleep(5000);
            WebDriverWaits.ScrollIntoView(EditedNote);
            Thread.sleep(2000);
            String EditedFANote = WebDriverWaits.GetText(EditedNote);
            SoftAssert s121 = new SoftAssert();
            s121.assertEquals(EditedFANote, "Notes for FA Edited*");
            s121.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 122)
    public static void ForcedAbatement_VerifyAddActivityBtn() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_VerifyAddActivityBtn ");
        extentTest.setDescription(" Verify that 'Add Activity' button appears under the 'Abatement Activities' tile, when user has created Forced Abatement Activity on the 'Case Management'>'Forced Abatement' page. ");
        WebDriverWaits.ScrollIntoView(AddActivityBtn);
        Thread.sleep(2000);
        String ActivityBtn = WebDriverWaits.GetText(AddActivityBtn);
        SoftAssert s122 = new SoftAssert();
        s122.assertEquals(ActivityBtn, "Add Activity");
        s122.assertAll();

    }

    @Test(priority = 123)
    public static void ForcedAbatement_OpenAddForcedAbatementActivityPopup() {
        extentTest = extent.startTest(" ForcedAbatement_OpenAddForcedAbatementActivityPopup ");
        extentTest.setDescription(" Verify that 'Add Forced Abatement Activity' popup opens up, when user clicks on 'Add Activity' button, under 'Abatement Activities' tile. ");
        try {
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(AddActivityBtn);
            Thread.sleep(3000);
            String AddFAActivity = WebDriverWaits.GetText(FAactivityPopup);
            SoftAssert s123 = new SoftAssert();
            s123.assertEquals(AddFAActivity, "Add Forced Abatement Activity");
            s123.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 124)
    public static void ForcedAbatement_VerifyFirstActivityBtnState() {
        extentTest = extent.startTest(" ForcedAbatement_VerifyFirstActivityBtnState ");
        extentTest.setDescription(" Verify that first abatement activity type appears selected by default, under 'Choose Activity Type' field, on 'Add Forced Abatement Activity' popup. ");
        WebElement FirstActivity = WebDriverWaits.WaitUntilVisibleWE(FAToggleBtn);
        if ((FirstActivity.isEnabled()) == false) {
            Assert.assertEquals(false, true);
        }

    }

    @Test(priority = 125)
    public static void ForcedAbatement_ValidationMsgForNoDataOfActivity() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_ValidationMsgForNoDataOfActivity ");
        extentTest.setDescription(" Verify that validation messages appear, when user clicks on 'Add Forced Abatement Activity' button without entering data in mandatory fields, on 'Add Forced Abatement Activity' popup. ");
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FAToggleBtn);
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(FAActivityBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FAActivityBtn);
        Thread.sleep(5000);
        WebElement ErrorMsg1 = WebDriverWaits.WaitUntilVisibleWE(ErrorMsgFA1);
        WebElement ErrorMsg2 = WebDriverWaits.WaitUntilVisibleWE(ErrorMsgFA2);
        if ((ErrorMsg1.isDisplayed()) == false && ErrorMsg2.isDisplayed() == false) {

            SoftAssert s125 = new SoftAssert();
            s125.assertEquals(false, true);
            s125.assertAll();
        }
    }

    @Test(priority = 126)
    public static void ForcedAbatement_VerifyDocumentNoteFieldPresence() {
        extentTest = extent.startTest(" ForcedAbatement_VerifyDocumentNoteFieldPresence ");
        extentTest.setDescription(" Verify that 'Document Note' mandatory field gets added under 'Select Document' dropdown box, when user selects any document, on 'Add Forced Abatement Activity' popup. ");
        try {
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(SelectDocument);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(SelectHTML);
            WebElement DocumentNote = WebDriverWaits.WaitUntilVisibleWE(DocNoteTitle);
            if ((DocumentNote.isDisplayed()) == false) {
                SoftAssert s126 = new SoftAssert();
                s126.assertEquals(false, true);
                s126.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 127)
    public static void ForcedAbatement_ValidationMsgForEmptyDocumentNote() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_ValidationMsgForEmptyDocumentNote ");
        extentTest.setDescription(" Verify that validation message appears, when user clicks on 'Add Forced Abatement Activity' button without entering data in 'Documnet Note' field, on 'Add Forced Abatement Activity' popup. ");
        Thread.sleep(1000);
        WebDriverWaits.ClickOn(GenerateDocumentBtn);
        Thread.sleep(2000);
        WebElement ValidationDocNote = WebDriverWaits.WaitUntilVisibleWE(ValidMsgDocNote);
        if ((ValidationDocNote.isDisplayed()) == false) {
            SoftAssert s127 = new SoftAssert();
            s127.assertEquals(false, true);
            s127.assertAll();
        }

    }

    @Test(priority = 128)
    public static void ForcedAbatement_AddForcedAbatementActivity() {
        extentTest = extent.startTest(" ForcedAbatement_AddForcedAbatementActivity ");
        extentTest.setDescription(" Verify that User is able to Add Forced Abatement Activity after entering data in all mandatory fields & clicking on 'Add Forced Abatement Activity' button, on 'Add Forced Abatement Activity' popup.");
        try {
            WebDriverWaits.SendKeys(LabelForText1, "C123C456");
            WebDriverWaits.SendKeys(LabelForNumber2, "12345");
            WebDriverWaits.ClickOn(LabelForSelect3);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(FirstOption);
            WebDriverWaits.ScrollIntoView(ContinueToGenDoc);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(ContinueToGenDoc);
            Thread.sleep(4000);
            WebDriverWaits.ClickOn(selectFAADocArrow);
            Thread.sleep(3000);
            WebDriverWaits.ClickOn(SelectFAADoc);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(GenFAADoc);
            Thread.sleep(6000);
            WebDriverWaits.ClickOn(By.xpath("//button[text()='Do Not Print']"));
            WebDriverWaits.ClickOn(GenerateDocAddFABtn);
            Thread.sleep(10000);
            WebElement AddedActivities = WebDriverWaits.WaitUntilVisibleWE(AddedActivity);
            if ((AddedActivities.isDisplayed()) == false) {
                SoftAssert s128 = new SoftAssert();
                s128.assertEquals(false, true);
                s128.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static String actualEditFAApop;

    @Test(priority = 129)
    public static void ForcedAbatement_OpenEditForcedAbatementActivityPopup() {
        extentTest = extent.startTest(" ForcedAbatement_OpenEditForcedAbatementActivityPopup ");
        extentTest.setDescription("Verify that 'Edit Forced Abatement Activity' popup opens up, when user clicks on Edit icon, next to Forced Abatement Activity. ");
        try {
            Thread.sleep(25000);
            WebDriverWaits.ScrollIntoView(EditActivityIcon);
            Thread.sleep(3000);
            WebDriverWaits.ClickOn(EditActivityIcon);
            Thread.sleep(3000);
            actualEditFAApop = WebDriverWaits.GetText(EditFAAPopup);
            String ExpectedEditFATitle = "Edit Forced Abatement - Forced Abatement Activity";
            SoftAssert s129 = new SoftAssert();
            s129.assertEquals(actualEditFAApop, ExpectedEditFATitle);
            s129.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 130)
    public static void ForcedAbatement_CloseEditForcedAbatementActivityPopup() {
        extentTest = extent.startTest(" ForcedAbatement_CloseEditForcedAbatementActivityPopup ");
        extentTest.setDescription(" Verify that 'Edit Forced Abatement Activity' popup gets closed without updating changes, when user clicks on 'Cancel' button or 'Cross' icon, on CDP. ");
        try {
            driver.findElement(LabelForText1).clear();
            Thread.sleep(2000);
            WebDriverWaits.SendKeys(LabelForText1, "Edited C123C456");
            Thread.sleep(1000);
            WebDriverWaits.ClickOn(CancelBtnEditFA);
            Thread.sleep(1000);
            List<WebElement> ModalHeadersFA = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
            if ((ModalHeadersFA.size() <= 1) == false) {

                SoftAssert s130 = new SoftAssert();
                s130.assertEquals(false, true);
                s130.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 131)
    public static void ForcedAbatement_EditAddedActivity() {
        extentTest = extent.startTest(" ForcedAbatement_EditAddedActivity ");
        extentTest.setDescription(" Verify that user is able to edit and save the previously added Forced Abatement Activity, on 'Case Detail' page. ");
        try {
            Thread.sleep(6000);
            WebElement Label1 = WebDriverWaits.WaitUntilVisibleWE(LabelForText1);
            Label1.clear();
            Label1.sendKeys("Edited C123C456");
            WebDriverWaits.ScrollIntoView(EditSaveFAA);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(EditSaveFAA);
            Thread.sleep(8000);
            String EditedLabelText = WebDriverWaits.GetText(EditedLabelText1);
            SoftAssert s131 = new SoftAssert();
            s131.assertEquals(EditedLabelText, "Edited C123C456");
            s131.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 132)
    public static void ForcedAbatement_ConfirmationPopupForDeletingActivity() {
        extentTest = extent.startTest(" ForcedAbatement_ConfirmationPopupForDeletingActivity ");
        extentTest.setDescription(" Verify that confirmation popup opens up, when user clicks on 'Cross' icon, next to Forced Abatement Activity. ");
        try {
            Thread.sleep(1000);
            WebDriverWaits.ScrollIntoView(DeleteActivityIcon);
            Thread.sleep(3000);
            WebDriverWaits.ClickByJsExecuter(DeleteActivityIcon);
            Thread.sleep(20000);
            WebElement ConfirmationIconFA = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
            if ((ConfirmationIconFA.isDisplayed()) == false) {

                SoftAssert s132 = new SoftAssert();
                s132.assertEquals(false, true);
                s132.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 133)
    public static void ForcedAbatement_DeleteAddedActivity() {
        extentTest = extent.startTest(" ForcedAbatement_DeleteAddedActivity ");
        extentTest.setDescription(" Verify that the Forced Abatement Activity gets deleted, when user clicks on 'Yes, Delete' button, on confirmation popup. ");
        try {
            WebDriverWaits.WaitUntilVisible(YesDelete);
            WebDriverWaits.ClickOn(YesDelete);
            Thread.sleep(20000);
            List<WebElement> ActivityCount = driver.findElements(AddedActivity);
            if ((ActivityCount.size() <= 0) == false) {

                SoftAssert s133 = new SoftAssert();
                s133.assertEquals(false, true);
                s133.assertAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


    @Test(priority = 134)
    public static void ForcedAbatement_VerifyAbleToSelectActivityType() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_VerifyAbleToSelectActivityType ");
        extentTest.setDescription(" Verify that user is able select activity types under 'Choose Activity Type' toggle, on 'Add Forced Abatement Activity' pop up");

        CECommonMethods.CE_AddAttachment("\\TestData\\" + Attachment1);
        CECommonMethods.CE_AddAttachmentBottom("\\TestData\\" + Attachment2);
        Thread.sleep(10000);
        waterViolation = WebDriverWaits.GetText(violationLable);
        contact1 = WebDriverWaits.GetText(contactfirst);
        contact22 = WebDriverWaits.GetText(contact2);
        WebDriverWaits.ClickOn(AddActivityBtn);
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(ActivityType2);
        Thread.sleep(2000);
        activity2Field = driver.findElement(By.xpath("//label[@title='Label']")).isDisplayed();

        WebDriverWaits.ClickOn(ActivityType3);
        Thread.sleep(2000);
        activity3Field = driver.findElement(By.xpath("//label[@title='Response']")).isDisplayed();

        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FAToggleBtn);
        Thread.sleep(2000);

        SoftAssert s = new SoftAssert();
        s.assertEquals(activity2Field, Boolean.TRUE);
        s.assertEquals(activity3Field, Boolean.TRUE);
        s.assertAll();

        CECommonMethods.CE_AddAttachmentAddActivityPage("\\TestData\\" + Attachment3);
        Thread.sleep(15000);


    }


    @Test(priority = 135)
    public static void ForceAbatement_AbatementDetailsPopupopen() throws InterruptedException {
        extentTest = extent.startTest(" ForcedAbatement_VerifyAbleToSelectActivityType ");
        extentTest.setDescription("Verify that 'Abatement Details'  pop up open when click on 'Continue to Generate Document'");

        WebDriverWaits.SendKeys(LabelForText1, "C123C456");
        WebDriverWaits.SendKeys(LabelForNumber2, "12345");
        WebDriverWaits.ClickOn(LabelForSelect3);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FirstOption);
        WebDriverWaits.ScrollIntoView(ContinueToGenDoc);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(ContinueToGenDoc);
        Thread.sleep(4000);
        WebDriverWaits.ScrollIntoView(abatementActivitySec);
        Thread.sleep(2000);

        actualprogressActivity = WebDriverWaits.GetText(activityProgress);
        AbatementDetailsPopup = driver.findElement(abatementDetailsPopup).isDisplayed();
        actualprogressAbDetails = WebDriverWaits.GetText(progressDetails);

        SoftAssert s = new SoftAssert();
        s.assertEquals(actualprogressActivity, expectedprogressActivity);
        s.assertEquals(actualprogressAbDetails, expectedprogressAbDetail);
        s.assertEquals(AbatementDetailsPopup, Boolean.TRUE);
        s.assertAll();

    }


    @Test(priority = 136)
    public static void ForceAbatement_AbatementDetailsDetails() throws InterruptedException {

        extentTest = extent.startTest(" ForceAbatement_AbatementDetailsDetails ");
        extentTest.setDescription("Verify that 'Abatement Details'  section deatils auto Populated");
        Thread.sleep(4000);
        IssueFAADate = WebDriverWaits.GetText(issueFAADate);
        WebDriverWaits.SendKeys(DocumentNoteField, "Document Note");
        fineSectionHeader = WebDriverWaits.GetText(fineSection);
        //addedViolation = WebDriverWaits.GetText(violationFileSec);
        addedRecipent1 = WebDriverWaits.GetText(FAAcontact1);
        addedRecipent2 = WebDriverWaits.GetText(FAAcontact2);
        addedRisponsoible1 = WebDriverWaits.GetText(FAAResPosiblecontact1);
        addedRisponsoible2 = WebDriverWaits.GetText(FAAResPosiblecontact2);
        FAASelectfaaDocLabel = WebDriverWaits.GetText(FAASelectfaaDoc);
        FAADonotIsuueFineChkbox = driver.findElements(FAADonotIsuueFine).size();
        FAAAddAnotherFineLinktxt = driver.findElement(FAAAddAnotherFine).isDisplayed();
        SoftAssert s = new SoftAssert();
        s.assertEquals(FAADonotIsuueFineChkbox > 0, true);
        s.assertEquals(FAAAddAnotherFineLinktxt, Boolean.TRUE);
        s.assertEquals(IssueFAADate, "FAA Document Issue Date");
        s.assertEquals(fineSectionHeader, expectFineSectionHeader);
        s.assertEquals(addedViolation, waterViolation);
        s.assertEquals(addedRecipent1, contact1);
        s.assertEquals(addedRecipent2, contact22);
        s.assertEquals(addedRisponsoible1, contact1);
        s.assertEquals(addedRisponsoible2, contact22);
        s.assertEquals(FAASelectfaaDocLabel, "Select an FAA Document");
        s.assertAll();


    }


    @Test(priority = 137)
    public static void ForceAbatement_AttachmentSectionAppearFAADocSelected() throws InterruptedException {

        extentTest = extent.startTest(" ForceAbatement_AbatementDetailsDetails ");
        extentTest.setDescription("Verify that 'Attachements' section appears, when the 'FAA Document'selected has attachements merged code and user has uploaded images on the case");
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(chooseFAHtmlDoc);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(chooseFAHtmlDoc);
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(photoSection);
        Thread.sleep(2000);
        String photocounts[] = driver.findElement(photoSection).getText().split(" ")[1].replace("(", " ").replace(")", " ").split("\\r?\\n");
        selectCheckBox = driver.findElements(selectAllCheckBox).size();
        photocount = Integer.parseInt((photocounts)[0].trim());

        List<String> Images = new ArrayList<>();

        driver.findElements(photosAttached).stream().forEach(img -> Images.add(img.getText()));


        WebDriverWaits.ClickOn(viewphotos);
        Thread.sleep(3000);

        viewPhotoDetails = WebDriverWaits.GetText(photoDetailsHeader);
        WebDriverWaits.ClickOn(closeBtn);
        Thread.sleep(4000);

        String images1 = Images.get(0);
        String images2 = Images.get(1);
        String images3 = Images.get(2);

        SoftAssert s = new SoftAssert();
        s.assertEquals(photocount, 3);
        s.assertEquals(viewPhotoDetails, "View Photo Details");
        s.assertEquals(selectCheckBox > 0, true);
        s.assertEquals(images1.contains(Attachment1.replace(".jpg", "")), true);
        s.assertEquals(images2.contains(Attachment2.replace(".jpg", "")), true);
        s.assertEquals(images3.contains(Attachment3.replace(".jpg", "")), true);
        s.assertAll();

    }


    @Test(priority = 138)
    public static void ForceAbatement_ContactAppearUnderResponsibleParty() throws InterruptedException {
        extentTest = extent.startTest(" ForceAbatement_AbatementDetailsDetails ");
        extentTest.setDescription("Verify contact details appear under resposible party section when 'zero' or 'more than one contact' are choosen bill to contact");


        Thread.sleep(10000);
        WebDriverWaits.scrolltoUp();
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(exitAddActivity);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(exitAddActivity);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(exitConfirmYesBtn);
        Thread.sleep(3000);

        WebDriverWaits.ScrollIntoView(addContactCDP);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(addContactCDP);
        Thread.sleep(1000);
        WebDriverWaits.ClickOn(crtNewContactCDP);
        Thread.sleep(4000);
        String rnname = RandomStrings.RequiredCharacters(3);
        String name = rnname + "Name";
        WebDriverWaits.SendKeys(contactName, name);
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(CCP.CreateContactBtn2);
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(CCP.CreateContactBtn2);
        Thread.sleep(5000);
        int Checkbtn = driver.findElements(createAnywayContact).size();
        if (Checkbtn > 0) {

            WebDriverWaits.ClickOn(createAnywayContact);


        }
        Thread.sleep(5000);
        WebDriverWaits.ClickOn(CCP.PropertyOwnerOption);
        WebDriverWaits.ClickOn(CCP.ApplyButton);
        Thread.sleep(2000);
        Thread.sleep(2000);

        WebDriverWaits.ClickByJsExecuter(billtoContact2);
        Thread.sleep(5000);
        WebDriverWaits.ClickByJsExecuter(billtoContact3);
        Thread.sleep(5000);
        addedRisponsoible1 = WebDriverWaits.GetText(Selectedcontact1);
        addedRisponsoible2 = WebDriverWaits.GetText(Selectedcontact2);

        WebDriverWaits.ScrollIntoView(AddActivityBtn);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(AddActivityBtn);
        Thread.sleep(10000);

        WebDriverWaits.SendKeys(LabelForText1, "C123C456");
        WebDriverWaits.SendKeys(LabelForNumber2, "12345");
        WebDriverWaits.ClickOn(LabelForSelect3);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FirstOption);
        WebDriverWaits.ScrollIntoView(ContinueToGenDoc);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(ContinueToGenDoc);
        Thread.sleep(4000);
        CECommonMethods.CE_AddAttachmentAddActivityPage("\\TestData\\" + Attachment3);
        Thread.sleep(4000);

        contact1 = WebDriverWaits.GetText(FAAResPosiblecontact1);
        contact22 = WebDriverWaits.GetText(FAAResPosiblecontact2);

        SoftAssert s = new SoftAssert();
        s.assertEquals(addedRisponsoible1.split("\\r?\\n")[0], contact1);
        s.assertEquals(addedRisponsoible2.split("\\r?\\n")[0], contact22);
        Thread.sleep(2000);
        s.assertAll();


    }


    @Test(priority = 139)
    public static void ForceAbatement_SelectedAttachmentPopulatedonPrintPreview() throws InterruptedException {

        Thread.sleep(1000);

        extentTest = extent.startTest(" ForceAbatement_AbatementDetailsDetails ");
        extentTest.setDescription("Verify that selected attachement appears on 'Generate FAA Document' print preview pop up");

        WebDriverWaits.ScrollIntoView(selectImgFAA1);
        Thread.sleep(3000);
        WebDriverWaits.ClickByJsExecuter(selectImgFAA1);

        WebDriverWaits.ClickByJsExecuter(selectImgFAA2);

        SelectedImag1 = driver.findElement(selectedImagFAA1).getText();
        SelectedImag2 = driver.findElement(selectedImahFAA2).getText();
        WebDriverWaits.ScrollIntoView(GenFAADoc);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(GenFAADoc);
        Thread.sleep(6000);

        driver.switchTo().frame(driver.findElement(printPreviewFrame));

        actualImag1 = driver.findElement(imagedetTabTitle1).getText().split(":")[1].trim();
        actualImag2 = driver.findElement(imagedetTabTitle2).getText().split(":")[1].trim();

        SoftAssert s = new SoftAssert();
        s.assertEquals(actualImag1, SelectedImag1);
        s.assertEquals(actualImag2, SelectedImag2);
        s.assertAll();

        driver.switchTo().defaultContent();

        WebDriverWaits.ClickOn(donotPrint);
        WebDriverWaits.ClickOn(GenerateDocAddFABtn);
        Thread.sleep(20000);
        ForcedAbatement_ConfirmationPopupForDeletingActivity();
        ForcedAbatement_DeleteAddedActivity();


    }
}
