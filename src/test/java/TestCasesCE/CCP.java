package TestCasesCE;

import BrowsersBase.DataInterface;
import CommonMethods.CECommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import ExtentReport.ExtentReportClass;
import POMCE.CCPUtils;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CCP extends ExtentReportClass {

    public static By CEOption = By.xpath(CCPUtils.cEOption);
    public static By CCPOption = By.xpath(CCPUtils.CCPOption);
    public static By CreateCaseButton = By.xpath(CCPUtils.CreateCaseButton);
    public static By AssignCaseTo = By.xpath(CCPUtils.AssignCaseTo);
    public static By InspectionAssigneeTo = By.xpath(CCPUtils.InspectionAssigneeTo);
    public static By CreateScheduleInspectionButton = By.xpath(CCPUtils.CreateScheduleInspectionButton);
    public static By AddBtn = By.xpath(CCPUtils.AddButton);
    public static By addAttachmenttop = By.xpath(CCPUtils.addAttachmenttop);
    public static By addAttachmentCCP = By.xpath(CCPUtils.addAttachmentCCP);
    public static By addAttachmentbottom = By.xpath(CCPUtils.addAttachmentbottom);
    public static By LocationSearchField = By.xpath(CCPUtils.LocationSearchField);
    public static By LocationSearchResult = By.xpath(CCPUtils.LocationSearchResult);
    public static By CRMOption = By.xpath(CCPUtils.cRMOption);
    public static By CCPTitle = By.xpath(CCPUtils.cCPTitle);
    public static By PlusIconToCECRM = By.xpath(CCPUtils.plusIconToCECRM);
    public static By LocationFld = By.xpath(CCPUtils.Location);
    public static By InfoMsg = By.xpath(CCPUtils.infoMsg);
    public static By Map3 = By.xpath(CCPUtils.Map);
    public static By MapGis2 = By.xpath(CCPUtils.MapGis2);
    public static By EditLocIcon = By.xpath(CCPUtils.EditLocation);
    public static By EditStreetAdd = By.xpath(CCPUtils.editStreetAddress);
    public static By EditCity = By.xpath(CCPUtils.editCity);
    public static By EditZip = By.xpath(CCPUtils.editZip);
    public static By SaveButton = By.xpath(CCPUtils.saveButton);
    public static By CCButton = By.xpath(CCPUtils.CCbutton);
    public static By GlobalValidMsg = By.xpath(CCPUtils.globalValidMsg);
    public static By AddLocManually = By.xpath(CCPUtils.addLocManually);
    public static By ManualLocPopup = By.xpath(CCPUtils.manualLocPopup);
    public static By ValidationMsg3 = By.xpath(CCPUtils.validationMsg3);
    public static By SaveButton2 = By.xpath(CCPUtils.saveButton2);
    public static By StreetAdd = By.xpath(CCPUtils.streetAdd);
    public static By CityAdd = By.xpath(CCPUtils.cityAdd);
    public static By ZipAdd = By.xpath(CCPUtils.zipAdd);
    public static By ApnAdd = By.xpath(CCPUtils.apnAdd);
    public static By OutAgencyMsg = By.xpath(CCPUtils.outAgencyMsg);
    public static By CancelBtnLoc = By.xpath(CCPUtils.cancelBtnLoc);
    public static By StreetLabel = By.xpath(CCPUtils.streetLabel);
    public static By CityLabel = By.xpath(CCPUtils.cityLabel);
    public static By ZipLabel = By.xpath(CCPUtils.zipLabel);
    public static By zipLabel20 = By.xpath(CCPUtils.zipLabel20);
    public static By CancelButton = By.xpath(CCPUtils.cancelButton);
    public static By toggleChecked = By.xpath(CCPUtils.toggleChecked);
    public static By FlagToggle = By.xpath(CCPUtils.flagToggle);
    public static By PopupTitle = By.xpath(CCPUtils.popupTitle);
    public static By ReasonToFlag = By.xpath(CCPUtils.reasonToFlag);
    public static By FlagAddressBtn = By.xpath(CCPUtils.flagAddressBtn);
    public static By CrossIconFlag = By.xpath(CCPUtils.crossIconFlag);
    public static By FlaggedLabel = By.xpath(CCPUtils.flaggedLabel);

    public static By ViolationsTile = By.xpath(CCPUtils.violationsTile);
    public static By ViolationSearchBox = By.xpath(CCPUtils.violationSearchBox);
    public static By ViolationList = By.xpath(CCPUtils.violationList);
    public static By violationList20 = By.xpath(CCPUtils.violationList20);
    public static By ViolationPopup = By.xpath(CCPUtils.violationPopup);
    public static By EntityField1 = By.xpath(CCPUtils.entityField1);
    public static By AddButton = By.xpath(CCPUtils.addButton);
    public static By ValidationMsg2 = By.xpath(CCPUtils.validationMsg2);
    public static By InfoMsg2 = By.xpath(CCPUtils.infoMsg2);
    public static By InfoMsgNoSearch = By.xpath(CCPUtils.infoMsgNoSearch);
    public static By CustomIssueIcon = By.xpath(CCPUtils.customIssueIcon);
    public static By CustomIssueFeild = By.xpath(CCPUtils.customIssueFeild);
    public static By CustomIssueDesc = By.xpath(CCPUtils.customIssueDesc);
    public static By ValidMsgCustom = By.xpath(CCPUtils.validMsgCustom);
    public static By WaterViolation = By.xpath(CCPUtils.waterViolation);
    public static By ValidMsgVioPopup = By.xpath(CCPUtils.validMsgVioPopup);
    public static By EntitySearchBox = By.xpath(CCPUtils.entitySearchBox);
    public static By EntitySearchList = By.xpath(CCPUtils.entitySearchList);
    public static By entitySeachListCss = By.cssSelector(CCPUtils.entitySeachListCss);
    public static By entitySearchListB = By.xpath(CCPUtils.entitySearchListB);
    public static By entitySearchList20 = By.xpath(CCPUtils.entitySearchList20);
    public static By AddedVioList = By.xpath(CCPUtils.addedVioList);
    public static By AddAnotherVio = By.xpath(CCPUtils.addAnotherVio);
    public static By CrossIconVio = By.xpath(CCPUtils.crossIconVio);
    public static By EditIconVio = By.xpath(CCPUtils.editIconVio);
    public static By UploadLink = By.xpath(CCPUtils.uploadLink);
    public static By UploadLink2 = By.xpath(CCPUtils.uploadLink2);
    public static By UploadedImg = By.xpath(CCPUtils.uploadedImg);
    public static By CustomIssueDlt = By.xpath(CCPUtils.customIssueDlt);
    public static By DltUploadedImg = By.xpath(CCPUtils.dltUploadedImg);
    public static By EntityAddBtn = By.xpath(CCPUtils.entityAddBtn);
    public static By EntityCancelBtn = By.xpath(CCPUtils.entityCancelBtn);
    public static By UploadedImgThumb = By.xpath(CCPUtils.uploadedImgThumb);
    public static By CountViolations = By.xpath(CCPUtils.countViolations);
    public static By CountEachVio = By.xpath(CCPUtils.countEachVio);
    public static By ClosePopup = By.xpath(CCPUtils.closePopup);
    public static By AddedImgThumb = By.xpath(CCPUtils.addedImgThumb);

    public static By AddContactFld = By.xpath(CCPUtils.addContactFld);
    public static By CrtNewContact = By.xpath(CCPUtils.crtNewContact);
    public static By ContactPopup = By.xpath(CCPUtils.contactPopup);
    public static By CrtContactBtn = By.xpath(CCPUtils.crtContactBtn);
    public static By ContactErrMsg = By.xpath(CCPUtils.contactErrMsg);
    public static By NameField = By.xpath(CCPUtils.nameField);
    public static By CreateContactBtn = By.xpath(CCPUtils.CreateContactBtn);
    public static By CreateContactBtn2 = By.xpath(CCPUtils.CreateContactBtn2);
    public static By ViolationsList = By.xpath(CCPUtils.ViolationsList);
    public static By AddContactField = By.xpath(CCPUtils.AddContactField);
    public static By CreateNewContact = By.xpath(CCPUtils.CreateNewContact);
    public static By CountContact = By.xpath(CCPUtils.countContact);
    public static By CancelContactBtn = By.xpath(CCPUtils.cancelContactBtn);
    public static By EditContact = By.xpath(CCPUtils.editContact);
    public static By EditContactPopup = By.xpath(CCPUtils.editContactPopup);
    public static By CancelEditPopup = By.xpath(CCPUtils.cancelEditPopup);
    public static By DeleteContact = By.xpath(CCPUtils.deleteContact);
    public static By CountContactTile = By.xpath(CCPUtils.countContactTile);
    public static By CreateAnyway = By.xpath(CCPUtils.createAnyway);
    public static By PropertyOwnerOption = By.xpath(CCPUtils.propertyOwnerOption);
    public static By ApplyButton = By.xpath(CCPUtils.applyButton);
    public static By EmailField = By.xpath(CCPUtils.emailField);
    public static By WorkPhoneField = By.xpath(CCPUtils.workPhoneField);

    public static By ImageIcon = By.xpath(CCPUtils.imageIcon);
    public static By AttachmentTitle = By.xpath(CCPUtils.attachmentTitle);
    public static By CameraButton = By.xpath(CCPUtils.cameraButton);
    public static By AddButton2 = By.xpath(CCPUtils.addButton2);
    public static By ImgThumb = By.xpath(CCPUtils.imgThumb);
    public static By CrossIcon2 = By.xpath(CCPUtils.crossIcon2);
    public static By YesCloseBtn = By.xpath(CCPUtils.yesCloseBtn);
    public static By DontCloseBtn = By.xpath(CCPUtils.dontCloseBtn);
    public static By ImgThumb2 = By.xpath(CCPUtils.imgThumb2);
    public static By CloseAttachmentTitle = By.xpath(CCPUtils.closeAttachmentTitle);
    public static By ModalHeaders = By.xpath(CCPUtils.modalHeaders);
    public static By AddedImage = By.xpath(CCPUtils.addedImage);
    public static By Description = By.xpath(CCPUtils.description);
    public static By CancelBtnAttachDet = By.xpath(CCPUtils.cancelBtnAttachDet);
    public static By UpdateBtn = By.xpath(CCPUtils.updateBtn);
    public static By CrossIcon = By.xpath(CCPUtils.crossIcon);
    public static By CountAttachment = By.xpath(CCPUtils.countAttachment);
    public static By DeleteAttach = By.xpath(CCPUtils.deleteAttach);
    public static By YesDelete = By.xpath(CCPUtils.yesDelete);
    public static By AttachmentDetailsTitle = By.xpath(CCPUtils.attachmentDetailsTitle);
    public static By UploadedImgName = By.xpath(CCPUtils.attachmentDetailsTitle);

    public static By ToasterMSGAttachment = By.xpath(CCPUtils.toasterMSGAttachment);
    public static By ToasterMSGSize = By.xpath(CCPUtils.toasterMSGSize);
    public static By UploadedImgTitle = By.xpath(CCPUtils.uploadedImgTitle);
    public static By UploadedImgNameA = By.xpath(CCPUtils.uploadedImgName);
    public static By UploadedImgLoc = By.xpath(CCPUtils.uploadedImgLoc);
    public static By ImgTitleonCCP = By.xpath(CCPUtils.imgTitleonCCP);
    public static By ImgDesconCCP = By.xpath(CCPUtils.imgDesconCCP);
    public static By ImgLoconCCP = By.xpath(CCPUtils.imgLoconCCP);

    public static By CreateCasePop = By.xpath(CCPUtils.createCasePop);
    public static By CheckboxPerIns = By.xpath(CCPUtils.checkboxPerIns);
    public static By CheckboxSchIns = By.xpath(CCPUtils.checkboxSchIns);
    public static By CrtSchInsButton = By.xpath(CCPUtils.crtSchInsButton);
    public static By NextInsSec = By.xpath(CCPUtils.nextInsSec);
    public static By CaseStatus = By.xpath(CCPUtils.caseStatus);
    public static By TotalContactsCDP = By.xpath(CCPUtils.totalContactsCDP);
    public static By TotalViolationsCDP = By.xpath(CCPUtils.totalViolationsCDP);
    public static By TotalAttachmentsCDP = By.xpath(CCPUtils.totalAttachmentsCDP);
    public static By CaseTilesCDP = By.xpath(CCPUtils.caseTilesCDP);

    public static SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void CCP_PreRequisite() throws InterruptedException {
        extentTest = extent.startTest(" PreRequisite (CCP)");
        extentTest.setDescription(" Verify that CCP opens up, when user clicks on the 'Plus' icon, on Dashboard. ");
        //Thread.sleep(10000);
        driver.get(DataInterface.URLCreateCase);
        //Thread.sleep(25000);
        WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitUntilVisible(CCPTitle);
        String CCPTitleActual = WebDriverWaits.GetText(CCPTitle);
        SoftAssert s1 = new SoftAssert();

        s1.assertEquals(CCPTitleActual, "Create A Case");
        s1.assertAll();

    }

    @Test(priority = 2)
    public static void CCP_GlobalValidationMsgForNoData() throws InterruptedException {
        extentTest = extent.startTest(" CCP_GlobalValidationMsgForNoData ");
        extentTest.setDescription("Verify that appropriate validation message appears when user clicks on 'Create Case' button without entering any data in mandatory fields, on 'Create Case' page. ");
       // Thread.sleep(6000);
        WebDriverWaits.WaitForElementInteractable(CCButton);
        WebDriverWaits.ClickOn(CCButton);
       // Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(GlobalValidMsg);
        String CCValidationActual = WebDriverWaits.GetText(GlobalValidMsg);
        String ValidationMsgExpected = "Please complete all fields marked in red below to continue.";
        SoftAssert s2 = new SoftAssert();
        s2.assertEquals(CCValidationActual, ValidationMsgExpected);
        s2.assertAll();
    }

    @Test(priority = 3)
    public static void CCP_DefaultInfoMsgOnLOcationTile() {
        extentTest = extent.startTest(" CCP_DefaultInfoMsgOnLOcationTile ");
        extentTest.setDescription(" Verify that an information message appears by deafult, when no location is selected, on 'Create Case' page. ");
        String InfoMessage = WebDriverWaits.GetText(InfoMsg);
        String ExpInfoMsg = "";
        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisLite)) {
            ExpInfoMsg = "Enter an address, or drop a pin on the map to add location details\n" + "Location is required to create a case";
        } else {
            ExpInfoMsg = "Enter an address, APN Number, or drop a pin on the map to add location details\n" + "Location is required to create a case";
        }
        SoftAssert s3 = new SoftAssert();
        s3.assertEquals(InfoMessage, ExpInfoMsg);
        s3.assertAll();
    }

    @Test(priority = 4)
    public static void CCP_ValidationMsgOutsideAgencyBoundary() throws InterruptedException {
        extentTest = extent.startTest(" CCP_ValidationMsgOutsideAgencyBoundary ");
        extentTest.setDescription(" Verify that appropriate validation message appears, when user clicks on the outside of Agency boundary on map, on 'Create Case' page. ");

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.SendKeys(LocationFld, "Texas");
            driver.navigate().refresh();
            Thread.sleep(5000);
        } else {
            WebDriverWaits.SendKeys(LocationFld, "Turkey");
            Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(Map3);
            WebDriverWaits.ClickOn(Map3);
            Thread.sleep(5000);
            WebDriverWaits.WaitUntilVisible(OutAgencyMsg);
            String OutsideAgencyMsg = WebDriverWaits.GetText(OutAgencyMsg);
            String ValidMsg7 = "The location you have entered falls outside of the\n" + "agency boundary. Please select a location within\n" + "the city limits to continue";
            SoftAssert s4 = new SoftAssert();
            s4.assertEquals(OutsideAgencyMsg, ValidMsg7);
            s4.assertAll();
        }

    }

    @Test(priority = 5)
    public void CCP_SearchAndAddAddress() throws InterruptedException {
        extentTest = extent.startTest(" CCP_SearchAndAddAddress ");
        extentTest.setDescription(" Verify that user is able to add a location from 'Enter Address, APN or drop a Pin on the Map' combo box, on 'Create Case' page. ");

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect1o)) {
            CECommonMethods.serachLocationCCP(DataInterface.searchLocationKey1O);
            WebDriverWaits.WaitUntilVisible(EditLocIcon);
            String ValidateStreetAdd = WebDriverWaits.GetText(StreetLabel);
            SoftAssert s5b = new SoftAssert();
            Assert.assertEquals(ValidateStreetAdd, DataInterface.CCPStreetAddress1);
            String ValidateZip = WebDriverWaits.GetText(ZipLabel);
            s5b.assertEquals(ValidateZip, DataInterface.CCPZip1);
            s5b.assertAll();
        } else if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            CECommonMethods.serachLocationCCP(DataInterface.searchLocationKey1O);

            //Thread.sleep(2000);
            WebDriverWaits.WaitUntilVisible(EditLocIcon);
            String ValidateStreetAdd = WebDriverWaits.GetText(StreetLabel);
            SoftAssert s5b = new SoftAssert();

            Assert.assertEquals(ValidateStreetAdd, DataInterface.CCPStreetAddress2);
            String ValidateZip = WebDriverWaits.GetText(zipLabel20);
            s5b.assertEquals(ValidateZip, DataInterface.CCPZip1);
            s5b.assertAll();
        } else {
            CECommonMethods.serachLocationCCP(DataInterface.searchLocationKey);
           // Thread.sleep(3000);
            WebDriverWaits.WaitUntilVisible(EditLocIcon);
            String ValidateStreetAdd = WebDriverWaits.GetText(StreetLabel);
            SoftAssert s5b = new SoftAssert();
            Assert.assertEquals(ValidateStreetAdd, DataInterface.CCPStreetAddress1);
            String ValidateZip = WebDriverWaits.GetText(ZipLabel);
            s5b.assertEquals(ValidateZip, DataInterface.CCPZip1);
            s5b.assertAll();
        }


    }

    @Test(priority = 7)
    public static void CCP_OpenAddAddressManuallyPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenAddAddressManuallyPopup ");
        extentTest.setDescription(" Verify that 'Add Address Manually' popup opens up, after clicking on 'Add Address Manually' link, on 'Create Case' page. ");

        Thread.sleep(1000);
        //WebDriverWaits.WaitUntilVisible(OutAgencyMsg);
        List<WebElement> OutsideAgency = driver.findElements(OutAgencyMsg);
        if ((OutsideAgency.size() > 0) == true) {
            driver.navigate().refresh();
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWaits.SendKeys(LocationFld, " ");
        Thread.sleep(1000);
        WebElement AddLoc = (WebElement) jse.executeScript("return document.querySelector('#react-autowhatever-1 > div')");
        WebDriverWaits.ClickOnWE(AddLoc);
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(ManualLocPopup);
        String PopupTitleActual = WebDriverWaits.GetText(ManualLocPopup);
        String PopupTitleExpected = "Add Address Manually";

        SoftAssert s7 = new SoftAssert();
        s7.assertEquals(PopupTitleActual, PopupTitleExpected);
        s7.assertAll();
    }

    @Test(priority = 8)
    public static void CCP_CloseAddAddressManuallyPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CloseAddAddressManuallyPopup ");
        extentTest.setDescription(" Verify that 'Add Address Manually' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Create Case' page. ");

        WebDriverWaits.WaitForElementInteractable(CancelBtnLoc);
        WebDriverWaits.ClickOn(CancelBtnLoc);
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeaders1 = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if ((ModalHeaders1.size() <= 1) == false) {

            SoftAssert s8 = new SoftAssert();
            s8.assertEquals(false, true);
            s8.assertAll();
        }
    }

    @Test(priority = 9)
    public static void CCP_ValidationMsgForNoAddressDetails() throws InterruptedException {
        extentTest = extent.startTest(" CCP_ValidationMsgForNoAddressDetails ");
        extentTest.setDescription(" Verify that validation messages appear when user clicks on 'Add Address' button without entering data in mandatory fields, on 'Create Case' popup.  ");

        WebDriverWaits.WaitForElementInteractable(LocationFld);
        WebDriverWaits.ClickOn(LocationFld);
        WebDriverWaits.ClickOn(AddLocManually);
        WebDriverWaits.ClickOn(SaveButton2);
        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(ValidationMsg3);
        String ValidationMsgActual = WebDriverWaits.GetText(ValidationMsg3);
        String ValidMsgExpected = "The Address is required.";

        SoftAssert s9 = new SoftAssert();
        s9.assertEquals(ValidationMsgActual, ValidMsgExpected);
        s9.assertAll();
    }

    @Test(priority = 10)
    public static void CCP_AddTheAddressManually() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddTheAddressManually ");
        extentTest.setDescription(" Verify that the address gets added under 'Select Location' tile, after entering address details manually & clicking on 'Add Address' button, on 'Add Address Manually' popup. ");

//        Thread.sleep(4000);
        WebDriverWaits.WaitForElementInteractable(StreetAdd);
        WebDriverWaits.SendKeys(StreetAdd, "Manual Street");
       // Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(CityAdd);
        WebDriverWaits.SendKeys(CityAdd, "Manual City");
        //Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(ZipAdd);
        WebDriverWaits.SendKeys(ZipAdd, "77590");
        //Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(ApnAdd);
        WebDriverWaits.SendKeys(ApnAdd, "7030-0122-0011-000");
        //Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(SaveButton2);
        WebDriverWaits.ClickOn(SaveButton2);
        Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(StreetLabel);
        String ValidateStreetAdd = WebDriverWaits.GetText(StreetLabel);

        SoftAssert s10 = new SoftAssert();
        s10.assertEquals(ValidateStreetAdd, "Manual Street");
        s10.assertAll();

    }

    @Test(priority = 11)
    public static void CCP_EditAddedAddress() throws InterruptedException {
        extentTest = extent.startTest(" CCP_EditAddedAddress ");
        extentTest.setDescription(" Verify that user is able to edit the location details, after clicking on the 'Edit' icon, on 'Create Case' page. ");

        //Thread.sleep(1000);
        WebDriverWaits.WaitUntilVisible(EditLocIcon);
        WebDriverWaits.WaitForElementInteractable(EditLocIcon);
        //Thread.sleep(1000);
        WebDriverWaits.ClickOn(EditLocIcon);
        WebElement EditStreet = WebDriverWaits.WaitUntilVisibleWE(EditStreetAdd);
        EditStreet.clear();
        WebDriverWaits.SendKeys(EditStreetAdd, DataInterface.StreetAddress);
        WebElement EditCityFld = WebDriverWaits.WaitUntilVisibleWE(EditCity);
        EditCityFld.clear();
        EditCityFld.sendKeys(DataInterface.City);
        WebElement EditZipFld = WebDriverWaits.WaitUntilVisibleWE(EditZip);
        EditZipFld.clear();
        EditZipFld.sendKeys(DataInterface.Zip);

        WebElement SaveBtn = WebDriverWaits.WaitUntilVisibleWE(SaveButton);
        if ((SaveBtn.isDisplayed()) == false) {

            SoftAssert s11 = new SoftAssert();
            s11.assertEquals(false, true);
            s11.assertAll();
        }
    }

    @Test(priority = 12)
    public static void CCP_UpdateAddressOnSaveButton() throws InterruptedException {
        extentTest = extent.startTest(" CCP_UpdateAddressOnSaveButton ");
        extentTest.setDescription(" Verify that address gets updated, when user edits data and clicks on 'Save' button under 'Select Location' tile, on 'Create Case' page. ");

        //Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(SaveButton);
        WebDriverWaits.ClickOn(SaveButton);
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(StreetLabel);
        String NameLabel1 = WebDriverWaits.GetText(StreetLabel);
        Assert.assertEquals(DataInterface.StreetAddress, NameLabel1);
        String CityLabel1 = WebDriverWaits.GetText(CityLabel);
        SoftAssert s12b = new SoftAssert();
        s12b.assertEquals(DataInterface.City, CityLabel1);
        s12b.assertAll();
        String ZipLabel1 = WebDriverWaits.GetText(ZipLabel);
        SoftAssert s12c = new SoftAssert();
        s12c.assertEquals(DataInterface.Zip, ZipLabel1);
        s12c.assertAll();


    }

    @Test(priority = 13)
    public static void CCP_AddressShouldntGetUpdatedOnCancelButton() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddressShouldntGetUpdatedOnCancelButton ");
        extentTest.setDescription(" Verify that address does not get updated, when user edits data and clicks on 'Cancel' button under 'Select Location' tile, on 'Create Case' page. ");

        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(EditLocIcon);
        WebDriverWaits.WaitForElementInteractable(EditLocIcon);
        WebDriverWaits.ClickOn(EditLocIcon);
        WebDriverWaits.ClickOn(CancelButton);
        String NameLabel1 = WebDriverWaits.GetText(StreetLabel);
        SoftAssert s13a = new SoftAssert();
        s13a.assertEquals(DataInterface.StreetAddress, NameLabel1);
        s13a.assertAll();
        String CityLabel1 = WebDriverWaits.GetText(CityLabel);
        SoftAssert s13b = new SoftAssert();
        s13b.assertEquals(DataInterface.City, CityLabel1);
        s13b.assertAll();
        String ZipLabel1 = WebDriverWaits.GetText(ZipLabel);
        SoftAssert s13c = new SoftAssert();
        s13c.assertEquals(DataInterface.Zip, ZipLabel1);
        s13c.assertAll();
    }

    @Test(priority = 14)
    public static void CCP_OpenFlagAddressPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenFlagAddressPopup ");
        extentTest.setDescription(" Verify that 'Flag Address' popup opens up for an unflagged address, when user clicks on 'Flagged?' toggle button, on 'Create Case' page. ");
        Thread.sleep(2000);

        if (WebDriverWaits.ElementIsDisplayed(toggleChecked)) {
            WebDriverWaits.ClickOn(FlagToggle);
//            Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(FlagToggle);
            WebDriverWaits.ClickOn(FlagToggle);
            System.out.println("clicked toggle twice");

        } else WebDriverWaits.ClickOn(FlagToggle);
//        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(PopupTitle);
        String[] FlagPopup = WebDriverWaits.GetText(PopupTitle).split("-");
        String FlagPopupTitle = FlagPopup[0];

        SoftAssert s14 = new SoftAssert();
        s14.assertEquals("Flag Address ", FlagPopupTitle);
        s14.assertAll();
    }

    @Test(priority = 15)
    public static void CCP_CloseFlagAddressPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CloseFlagAddressPopup ");
        extentTest.setDescription(" Verify that 'Flag Address' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Flag Address' popup. ");

       // Thread.sleep(5000);
        WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitForElementInteractable(CrossIconFlag);
        WebDriverWaits.ClickOn(CrossIconFlag);
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeaders3 = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if ((ModalHeaders3.size() <= 1) == false) {

            SoftAssert s15 = new SoftAssert();
            s15.assertEquals(true, false);
            s15.assertAll();
        }

    }

    @Test(priority = 16)
    public static void CCP_VerifyFlagAddressButtonState() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyFlagAddressButtonState ");
        extentTest.setDescription(" Verify that 'Flag address' button gets enabled, when user enters data in 'Reason to Flag the address' field, on 'Flag Address' popup. ");

        //Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(FlagToggle);
        WebDriverWaits.ClickOn(FlagToggle);

        boolean Status = driver.findElement(FlagAddressBtn).isEnabled();

        SoftAssert s16a = new SoftAssert();
        s16a.assertEquals(Status, false);
        String RandomReason = RandomStrings.RequiredString(20);
        WebDriverWaits.SendKeys(ReasonToFlag, RandomReason);
       // Thread.sleep(4000);
        WebDriverWaits.WaitUntilVisible(FlagAddressBtn);
        boolean Status1 = driver.findElement(FlagAddressBtn).isEnabled();

        SoftAssert s16b = new SoftAssert();
        s16b.assertEquals(Status1, true);
        s16a.assertAll();
        s16b.assertAll();
    }

    @Test(priority = 17)
    public static void CCP_VerifyFlaggedButtonState() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyFlaggedButtonState ");
        extentTest.setDescription(" Verify that 'Flagged?' toggle button gets enabled, when user clicks on 'Flag Address' button after entering data in the mandatory field, on 'Create Case' popup. ");

        //Thread.sleep(4000);
        WebDriverWaits.WaitForElementInteractable(FlagAddressBtn);
        WebDriverWaits.ClickOn(FlagAddressBtn);
        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(FlaggedLabel);
        String FlaggedLabel1 = WebDriverWaits.GetText(FlaggedLabel);

        SoftAssert s17 = new SoftAssert();
        s17.assertEquals(FlaggedLabel1, "Yes");
        s17.assertAll();

    }

    @Test(priority = 18)
    public static void CCP_InfoMsgForNoViolation() throws InterruptedException {
        extentTest = extent.startTest(" CCP_InfoMsgForNoViolation ");
        extentTest.setDescription(" Verify that an information message appears when no violation is added, on 'Create Case' page. ");

        Thread.sleep(1000);
        WebElement InfoMessage2 = WebDriverWaits.WaitUntilVisibleWE(InfoMsg2);
        if ((InfoMessage2.isDisplayed()) == false) {

            SoftAssert s18 = new SoftAssert();
            s18.assertEquals(false, true);
            s18.assertAll();
        }
    }

    @Test(priority = 19)
    public static void CCP_ValidationMsgForNoViolation() {
        extentTest = extent.startTest(" CCP_ValidationMsgForNoViolation ");
        extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Create Case' button without adding any violation, on 'Create Case' page. ");

        WebDriverWaits.ClickOn(CCButton);

        WebElement ValidMsg2 = WebDriverWaits.WaitUntilVisibleWE(ValidationMsg2);
        if ((ValidMsg2.isDisplayed()) == false) {

            SoftAssert s19 = new SoftAssert();
            s19.assertEquals(false, true);
            s19.assertAll();
        }

    }

    @Test(priority = 20)
    public static void CCP_InfoMsgForNonExistingData() {
        extentTest = extent.startTest(" CCP_InfoMsgForNonExistingData ");
        extentTest.setDescription(" Verify that an information message appears on entering non-existing data in 'Find a violation, article number or describe the issue' field, on 'Create Case' page. ");

        String RandomReason1 = RandomStrings.RequiredString(10);
        WebDriverWaits.SendKeys(ViolationSearchBox, RandomReason1);
        String NoSearchResult = WebDriverWaits.GetText(InfoMsgNoSearch);
        String InfoMsg = "No matching violations";

        SoftAssert s20 = new SoftAssert();
        s20.assertEquals(NoSearchResult, InfoMsg);
        s20.assertAll();

    }

    @Test(priority = 21)
    public static void CCP_AddCustomIssueDescriptionField() {
        extentTest = extent.startTest(" CCP_AddCustomIssueDescriptionField ");
        extentTest.setDescription(" Verify that 'Custom Issue Description' field gets added after entering data & clicking on 'Add custom issue description' link, on 'Create Case' page. ");

        WebDriverWaits.ClickOn(CustomIssueIcon);
        boolean CustomIssue = driver.findElement(CustomIssueFeild).isDisplayed();

        SoftAssert s21 = new SoftAssert();
        s21.assertEquals(CustomIssue, true);
        s21.assertAll();

    }

    @Test(priority = 22)
    public static void CCP_validationMsgForEmptyCustomIssueDescriptionField() {
        extentTest = extent.startTest(" CCP_validationMsgForEmptyCustomIssueDescriptionField ");
        extentTest.setDescription(" Verify that appropriate validation message appears when 'Custom Issue Description' field is blank, on 'Create Case' page. ");

        WebDriverWaits.ClickOn(CustomIssueDlt);
        WebDriverWaits.ClickOn(ViolationSearchBox);
        WebDriverWaits.ClickOn(CustomIssueIcon);
        String CustomValidMsg = WebDriverWaits.GetText(ValidMsgCustom);
        String CustValidMsg = "The Custom Issue Description is required.";

        SoftAssert s22 = new SoftAssert();
        s22.assertEquals(CustomValidMsg, CustValidMsg);
        s22.assertAll();

    }

    @Test(priority = 23)
    public static void CCP_AddViolationWithoutEntity() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddViolationWithoutEntity ");
        extentTest.setDescription(" Verify that Violation with no entity gets added under 'Add Violations' tile via search results of 'Find a violation, article number or describe the issue' combo box, on 'Create Case' page. ");

        WebDriverWaits.ClickOn(CustomIssueDlt);
        WebDriverWaits.ClickOn(ViolationSearchBox);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(ViolationSearchBox);
        WebDriverWaits.SendKeys(ViolationSearchBox, "Wa");
        //Thread.sleep(3000);

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.WaitForElementInteractable(violationList20);
            WebDriverWaits.ClickOn(violationList20);
            WebElement WaterVio = WebDriverWaits.WaitUntilVisibleWE(WaterViolation);
            if ((WaterVio.isDisplayed()) == false) {

                SoftAssert s23 = new SoftAssert();
                s23.assertEquals(false, true);
                s23.assertAll();
            }
        } else {
            WebDriverWaits.WaitForElementInteractable(ViolationList);
            WebDriverWaits.ClickOn(ViolationList);
            WebElement WaterVio = WebDriverWaits.WaitUntilVisibleWE(WaterViolation);
            if ((WaterVio.isDisplayed()) == false) {

                SoftAssert s23 = new SoftAssert();
                s23.assertEquals(false, true);
                s23.assertAll();
            }
        }

    }

    @Test(priority = 24)
    public static void CCP_OpenViolationWithEntityPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenViolationWithEntityPopup ");
        extentTest.setDescription(" Verify that '<Violation>' popup opens up for violations with entity, via search results of 'Find a violation, article number or describe the issue' combo box, on 'Create Case' page. ");
        WebDriverWaits.ClickOn(ViolationSearchBox);
        WebDriverWaits.SendKeys(ViolationSearchBox, "An");
        //Thread.sleep(3000);

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.WaitForElementInteractable(violationList20);
            WebDriverWaits.ClickOn(violationList20);
            List<WebElement> ModalHeaders4 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
            if ((ModalHeaders4.size() > 1) == false) {

                SoftAssert s24 = new SoftAssert();
                s24.assertEquals(false, true);
                s24.assertAll();
            }
        } else {
            WebDriverWaits.WaitForElementInteractable(ViolationList);
            WebDriverWaits.ClickOn(ViolationList);
            List<WebElement> ModalHeaders4 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
            if ((ModalHeaders4.size() > 1) == false) {

                SoftAssert s24 = new SoftAssert();
                s24.assertEquals(false, true);
                s24.assertAll();
            }
        }
    }

    @Test(priority = 25)
    public static void CCP_ValidationMsgForNoViolationData() {
        extentTest = extent.startTest(" CCP_ValidationMsgForNoViolationData ");
        extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Add' button, without entering data in the mandatory field, on violation popup. ");
        WebDriverWaits.ClickOn(AddButton);
        WebElement ValidMsgVio = WebDriverWaits.WaitUntilVisibleWE(ValidMsgVioPopup);
        if ((ValidMsgVio.isDisplayed()) == false) {

            SoftAssert s25 = new SoftAssert();
            s25.assertEquals(false, true);
            s25.assertAll();
        }
        WebDriverWaits.ClickOn(EntityCancelBtn);
    }

    @Test(priority = 26)
    public void CCP_AddViolationWithEntity() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddViolationWithEntity ");
        extentTest.setDescription(" Verify that a violation gets added under 'Find a violation, article number or describe the issue' combo box, when user clicks on 'Add' button after entering data in mandatory fields, on 'Create Case' page. ");
        List<WebElement> countVio1 = driver.findElements(AddedVioList);
        int BeforeAdd = countVio1.size();
        WebDriverWaits.ClickOn(ViolationSearchBox);
        WebDriverWaits.clearByJSE(ViolationSearchBox);
        //Thread.sleep(2000);

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.WaitForElementInteractable(ViolationSearchBox);
            WebDriverWaits.SendKeys(ViolationSearchBox, "An");
            WebDriverWaits.ClickOn(violationList20);
            //Thread.sleep(3000);
            WebDriverWaits.WaitForElementInteractable(EntityField1);
            WebDriverWaits.SendKeys(EntityField1, "Black");
            WebDriverWaits.ClickOn(AddButton);
            List<WebElement> countVio2 = driver.findElements(AddedVioList);
            int AfterAdd = countVio2.size();
            if (AfterAdd != (BeforeAdd + 1)) {

                SoftAssert s26 = new SoftAssert();
                s26.assertEquals(false, true);
                s26.assertAll();
            }


        } else {
            WebDriverWaits.SendKeys(ViolationSearchBox, "An");
            WebDriverWaits.ClickOn(ViolationList);
//            Thread.sleep(3000);
            WebDriverWaits.WaitForElementInteractable(EntityField1);
            WebDriverWaits.SendKeys(EntityField1, "Black");
            WebDriverWaits.ClickOn(AddButton);
            List<WebElement> countVio2 = driver.findElements(AddedVioList);
            int AfterAdd = countVio2.size();
            if (AfterAdd != (BeforeAdd + 1)) {

                SoftAssert s26 = new SoftAssert();
                s26.assertEquals(false, true);
                s26.assertAll();

            }
        }

    }

    @Test(priority = 27)
    public static void CCP_SearchAndAddViolation() throws InterruptedException {
        extentTest = extent.startTest(" CCP_SearchAndAddViolation ");
        extentTest.setDescription(" Verify that user is able to add a violation after selecting an option from 'Find and add existing Entity' combo box, on Violation popup. ");

        //Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(ViolationSearchBox);
        WebDriverWaits.ClickOn(ViolationSearchBox);
        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.SendKeys(ViolationSearchBox, "An");
            WebDriverWaits.ClickOn(violationList20);
            //Thread.sleep(4000);
            WebDriverWaits.WaitForElementInteractable(EntitySearchBox);
            WebDriverWaits.SendKeys(EntitySearchBox, "Wh");
            Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
            WebDriverWaits.ClickOn(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
            //Thread.sleep(1000);
            WebDriverWaits.WaitForElementInteractable(AddButton);
            WebDriverWaits.ClickOn(AddButton);
//            Thread.sleep(3000);
            WebDriverWaits.WaitForElementInteractable(AddedVioList);
            WebElement VioList = WebDriverWaits.findElement(AddedVioList);
            if ((VioList.isDisplayed()) == false) {

                SoftAssert s27 = new SoftAssert();
                s27.assertEquals(false, true);
                s27.assertAll();

            }

        } else {

            WebDriverWaits.SendKeys(ViolationSearchBox, "An");
            WebDriverWaits.ClickOn(ViolationList);
            WebDriverWaits.SendKeys(EntitySearchBox, "Wh");
            WebDriverWaits.WaitForElementInteractable(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
            WebDriverWaits.ClickOn(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
            //Thread.sleep(1000);
            WebDriverWaits.WaitForElementInteractable(AddButton);
            WebDriverWaits.ClickOn(AddButton);
            WebElement VioList = WebDriverWaits.WaitUntilVisibleWE(AddedVioList);
            if ((VioList.isDisplayed()) == false) {

                SoftAssert s27 = new SoftAssert();
                s27.assertEquals(false, true);
                s27.assertAll();

            }
        }
    }

    @Test(priority = 28)
    public static void CCP_VerifyAddAnotherViolationLink() {
        extentTest = extent.startTest(" CCP_VerifyAddAnotherViolationLink ");
        extentTest.setDescription(" Verify that 'Add Another <Violation>' link appears under each added Violation type, under 'Add Violations' tile, on 'Create Case' page. ");
        String AddAnotherVio1 = WebDriverWaits.GetText(AddAnotherVio);

        SoftAssert s28 = new SoftAssert();
        s28.assertEquals(AddAnotherVio1, "Add another Animal");
        s28.assertAll();
    }

    @Test(priority = 29)
    public static void CCP_DeleteAddedViolation() {
        extentTest = extent.startTest(" CCP_DeleteAddedViolation ");
        extentTest.setDescription(" Verify that previously added violation gets deleted, when user clicks on the 'Delete' icon under 'Add Violations' tile, on 'Create Case' page. ");
        List<WebElement> countVio = driver.findElements(CrossIconVio);
        int CountVio = countVio.size();
        WebDriverWaits.ClickOn(CrossIconVio);
        List<WebElement> countVio1 = WebDriverWaits.WaitUntilVisibleList(CrossIconVio);
        int NewCountVio = countVio1.size() + 1;

        SoftAssert s29 = new SoftAssert();
        s29.assertEquals(CountVio, NewCountVio);
        s29.assertAll();
    }

    @Test(priority = 30)
    public static void CCP_OpenEditViolationPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenEditViolationPopup ");
        extentTest.setDescription(" Verify that 'Edit <Violation>' popup opens up, when user clicks on 'Edit' icon under 'Add Violations' tile, on 'Create Case' page. ");

//        Thread.sleep(4000);
        WebDriverWaits.WaitUntilVisible(EditIconVio);
        WebDriverWaits.WaitForElementInteractable(EditIconVio);
        WebDriverWaits.ClickOn(EditIconVio);
//        Thread.sleep(4000);
        WebDriverWaits.WaitForElementInteractable(ViolationPopup);
        String[] PopupTitle = driver.findElement(ViolationPopup).getText().split(" ");

        SoftAssert s30 = new SoftAssert();
        s30.assertEquals(PopupTitle[0], "Edit");
        s30.assertAll();
    }

    @Test(priority = 31)
    public static void CCP_UploadPhotoForViolation() throws InterruptedException {
        extentTest = extent.startTest(" CCP_UploadPhotoForViolation ");
        extentTest.setDescription(" Verify that a photo gets uploaded, when user selects a photo after clicking on 'Upload' button, on 'Edit <Violation>' popup. ");

        Thread.sleep(2000);
        WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(3000);
        UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
        Thread.sleep(4000);
        WebDriverWaits.WaitUntilVisible(EntityAddBtn);
        WebElement ImgWait = WebDriverWaits.findElement(EntityAddBtn);
        if ((ImgWait.isEnabled()) == false) {
            for (int w = 0; w < 10; w++) {
                Thread.sleep(3000);
                System.out.println(w);
                if ((ImgWait.isEnabled()) == true) {
                    break;
                }
            }
        }


        WebDriverWaits.WaitForElementInteractable(EntityAddBtn);
        WebDriverWaits.ClickOn(EntityAddBtn);
        WebElement ImageThumb = WebDriverWaits.WaitUntilVisibleWE(UploadedImgThumb);
        if ((ImageThumb.isDisplayed()) == false) {

            SoftAssert s31 = new SoftAssert();
            s31.assertEquals(false, true);
            s31.assertAll();
        }
    }

    @Test(priority = 32)
    public static void CCP_VerifyReplaceButtonPresence() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyReplaceButtonPresence ");
        extentTest.setDescription(" Verify that the 'Upload' button converts into 'Replace' button, when user uploads a photo, on 'Edit <Violation>' popup. ");

        Thread.sleep(2000);
        //WebDriverWaits.WaitUntilVisible(EditIconVio);
        WebDriverWaits.WaitForElementInteractable(EditIconVio);
        WebDriverWaits.ClickOn(EditIconVio);
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(UploadLink2);
        String ReplaceBtn = WebDriverWaits.GetText(UploadLink2);

        SoftAssert s32 = new SoftAssert();
        s32.assertEquals(ReplaceBtn, "Replace");
        s32.assertAll();
    }

    @Test(priority = 33)
    public static void CCP_DeleteAddedPhoto() throws InterruptedException {
        extentTest = extent.startTest(" CCP_DeleteAddedPhoto ");
        extentTest.setDescription(" Verify that the added photo gets deleted, when user clicks on the 'Delete' icon, on 'Edit <Violation>' popup. ");

//        Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(DltUploadedImg);
        WebDriverWaits.ClickOn(DltUploadedImg);
        Boolean ImgThumb4 = driver.findElements(AddedImgThumb).size() > 0;
        if (ImgThumb4 == true) {

            SoftAssert s33 = new SoftAssert();
            s33.assertEquals(false, true);
            s33.assertAll();
        }
//        Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(EntityCancelBtn);
        WebDriverWaits.ClickOn(EntityCancelBtn);

    }

    public static int TotalVioCountCCP;

    @Test(priority = 35)
    public static void CCP_VerifyTotalViolationsCount() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyTotalViolationsCount ");
        extentTest.setDescription(" Verify that total count along with '<Violation with entity>' count of added violations appear beside 'Add Violations' tile's header, on 'Create Case' page. ");

//        Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(CountViolations);
        String CountVio = WebDriverWaits.GetText(CountViolations);
        List<WebElement> countVio3 = WebDriverWaits.WaitUntilVisibleList(CrossIconVio);
        TotalVioCountCCP = countVio3.size();
        System.out.println("TotalVioCountCCP" + TotalVioCountCCP);
        String FinalCount = "Add Violations (" + (TotalVioCountCCP) + ")";

        SoftAssert s35 = new SoftAssert();
        s35.assertEquals(CountVio, FinalCount);
        s35.assertAll();

    }

    @Test(priority = 36)
    public static void CCP_OpenViolationListingPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenViolationListingPopup ");
        extentTest.setDescription(" Verify that respective '<Violation> Listing' popup opens up, when user clicks on '<n> <Violation>' link next to 'Add Violation' tile header, on 'Create Case' page. ");

        WebElement IndiVio = WebDriverWaits.WaitUntilVisibleWE(CountEachVio);
        String[] FirstVio = IndiVio.getText().split(" ");
        String FinalIndiVio = FirstVio[1];
        Thread.sleep(1000);
        WebDriverWaits.ClickOn(CountEachVio);
       // Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(PopupTitle);
        String[] popupVio = WebDriverWaits.GetText(PopupTitle).split(" ");
        String FinalPopupVio = popupVio[0] + "s";

        SoftAssert s36 = new SoftAssert();
        s36.assertEquals(FinalIndiVio, FinalPopupVio);
        s36.assertAll();

    }

    @Test(priority = 37)
    public static void CCP_CloseViolationListingPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CloseViolationListingPopup ");
        extentTest.setDescription(" Verify that '<Violation> Listing' popup gets closed, when user clicks on 'Cancel' button or 'Cross' icon, on 'Create Case' page. ");
        WebDriverWaits.ClickOn(EntityCancelBtn);
        Thread.sleep(2000);
        //WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeaders5 = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if ((ModalHeaders5.size() <= 1) == false) {

            SoftAssert s37 = new SoftAssert();
            s37.assertEquals(false, true);
            s37.assertAll();

        }
    }


    @Test(priority = 38)
    public static void CCP_OpenCreateAContactPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenCreateAContactPopup ");
        extentTest.setDescription(" Verify that 'Create a Contact' popup opens up, when user clicks on 'Add Contact' field > 'Create a new contact' link, on 'Create Case' popup. ");

        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(AddContactFld);
        WebDriverWaits.ClickOn(AddContactFld);
        WebDriverWaits.ClickOn(CrtNewContact);
        String ContactTitle = WebDriverWaits.GetText(ContactPopup);

        SoftAssert s38 = new SoftAssert();
        s38.assertEquals(ContactTitle, "Create a Contact");
        s38.assertAll();

    }

    @Test(priority = 39)
    public static void CCP_ValidationMsgForNodataInNameField() {
        extentTest = extent.startTest(" CCP_ValidationMsgForNodataInNameField ");
        extentTest.setDescription(" Verify that appropriate validation message appears when 'Create Contact' button is clicked without entering data in the mandatory field, on 'Create a Contact' popup. ");

        WebDriverWaits.ClickOn(CrtContactBtn);
        WebElement ErrMsg = WebDriverWaits.WaitUntilVisibleWE(ContactErrMsg);
        if ((ErrMsg.isDisplayed()) == false) {

            SoftAssert s39 = new SoftAssert();
            s39.assertEquals(false, true);
            s39.assertAll();

        }

    }

    @Test(priority = 40)
    public static void CCP_CloseCreateAContactPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CloseCreateAContactPopup ");
        extentTest.setDescription(" Verify that 'Create a Contact' popup gets closed , when user clicks on 'Cancel' button, on 'Create Case' popup. ");

       // Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(CancelContactBtn);
        WebDriverWaits.ClickOn(CancelContactBtn);
        Thread.sleep(1000);
        //WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeaders4 = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if ((ModalHeaders4.size() <= 1) == false) {

            SoftAssert s40 = new SoftAssert();
            s40.assertEquals(false, true);
            s40.assertAll();
        }
    }

    @Test(priority = 41)
    public static void CCP_AddNewContact() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddNewContact ");
        extentTest.setDescription(" Verify that new contact gets added under 'Add Contact' combo box, when user clicks on 'Create Contact' button after entering data in 'Name' field, on 'Create a Contact' popup. ");

        Thread.sleep(2000);
        //WebDriverWaits.WaitUntilVisibleList(CountContact);
        List<WebElement> BeforeAdding = driver.findElements(CountContact);
        int a = BeforeAdding.size();
        for (int z = 0; z < 3; z++) {
            String RandomName = RandomStrings.RequiredCharacters(8);
            String RandomMail = RandomName + "@yopmail.com";
            String RandomContact = RandomStrings.RequiredDigits(10);
            WebDriverWaits.WaitUntilVisible(AddContactFld);
            WebDriverWaits.ClickOn(AddContactFld);
            WebDriverWaits.ClickOn(CrtNewContact);
            WebDriverWaits.SendKeys(NameField, RandomName);
            WebDriverWaits.SendKeys(EmailField, RandomMail);
            WebDriverWaits.SendKeys(WorkPhoneField, RandomContact);
//            Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(CrtContactBtn);
            WebDriverWaits.ClickOn(CrtContactBtn);
//            Thread.sleep(3000);
            WebDriverWaits.WaitForElementInteractable(PropertyOwnerOption);
            WebDriverWaits.ClickOn(PropertyOwnerOption);
            WebDriverWaits.ClickOn(ApplyButton);
        }
        List<WebElement> AfterAdding = WebDriverWaits.WaitUntilVisibleList(CountContact);
        int b = AfterAdding.size();
        if ((b > a) == false) {

            SoftAssert s41 = new SoftAssert();
            s41.assertEquals(false, true);
            s41.assertAll();

        }

    }

    @Test(priority = 43)
    public static void CCP_OpenEditContactPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenEditContactPopup ");
        extentTest.setDescription(" Verify that 'Edit Contact' popup opens up for newly created contact, when user clicks on 'Edit' icon, on 'Create Case' page. ");

        Thread.sleep(1000);
        WebDriverWaits.WaitForElementInteractable(EditContact);
        WebDriverWaits.ClickOn(EditContact);
        String ContactEditPopup = WebDriverWaits.GetText(EditContactPopup);

        SoftAssert s43 = new SoftAssert();
        s43.assertEquals(ContactEditPopup, "Edit Contact");
        s43.assertAll();

//        Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(CancelEditPopup);
        WebDriverWaits.ClickOn(CancelEditPopup);
    }

    @Test(priority = 44)
    public static void CCP_DeleteAddedContact() throws InterruptedException {
        extentTest = extent.startTest(" CCP_DeleteAddedContact ");
        extentTest.setDescription(" Verify that previously added contact gets deleted, when user clicks on the 'Delete' icon, on 'Create Case' page. ");

        WebDriverWaits.WaitUntilVisible(CountContact);
        List<WebElement> BeforeDeleting = WebDriverWaits.findElementsByXPath(CountContact);
        int a1 = BeforeDeleting.size();
        Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(DeleteContact);
        WebDriverWaits.ClickOn(DeleteContact);
        Thread.sleep(1000);
        List<WebElement> AfterDeleting = WebDriverWaits.WaitUntilVisibleList(CountContact);
        int b1 = AfterDeleting.size();
        if ((b1 == (a1 - 1)) == false) {

            SoftAssert s44 = new SoftAssert();
            s44.assertEquals(false, true);
            s44.assertAll();

        }
    }

    public static int TotalContactsCountCCP;

    @Test(priority = 45)
    public static void CCP_VerifyTotalContactCount() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyTotalContactCount ");
        extentTest.setDescription(" Verify that accurate count of added contacts appear beside 'Contacts' tile's header, on 'Create Case' popup. ");

        String ContactTile = WebDriverWaits.GetText(CountContactTile);
        //Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(CountContact);
        WebDriverWaits.WaitUntilVisible(CountContact);
        List<WebElement> CountContacts = WebDriverWaits.findElementsByXPath(CountContact);
        TotalContactsCountCCP = CountContacts.size();
        System.out.println("TotalContactsCountCCP" + TotalContactsCountCCP);
        String FinalCountContacts = "Contacts (" + (TotalContactsCountCCP) + ")";

        SoftAssert s45 = new SoftAssert();
        s45.assertEquals(ContactTile, FinalCountContacts);
        s45.assertAll();

    }


    @Test(priority = 46)
    public static void CCP_VerifyViolationAttachmentsPresence() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyViolationAttachmentsPresence ");
        extentTest.setDescription(" Verify that attachments added to the 'Add Violations' tile also appear on the 'Attachments' tile, on 'Create Case' page. ");

//        Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(UploadedImgThumb);
        List<WebElement> VioImages = WebDriverWaits.findElementsByXPath(UploadedImgThumb);
        int count1 = VioImages.size();
        List<WebElement> AttachImages = WebDriverWaits.WaitUntilVisibleList(AddedImage);
        int count2 = AttachImages.size();
        if ((count2 >= count1) == false) {

            SoftAssert s46 = new SoftAssert();
            s46.assertEquals(false, true);
            s46.assertAll();
        }

    }

    @Test(priority = 47)
    public static void CCP_OpenAddAttachmentsPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenAddAttachmentsPopup ");
        extentTest.setDescription(" Verify that 'Add Attachments' popup opens up, when user clicks on the 'Image' icon under 'Attachments' tile, on 'Create Case' page. ");
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        JavascriptExecutor jser = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement AttachmentIcon = (WebElement) jser.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
        Thread.sleep(6000);
        AttachmentIcon.click();
        String Title = WebDriverWaits.GetText(AttachmentTitle);
        String AttachTitle = "Add Attachments";

        SoftAssert s47 = new SoftAssert();
        s47.assertEquals(AttachTitle, Title);
        s47.assertAll();

    }

    @Test(priority = 48)
    public static void CCP_VerifyAttachmentsPreview() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyAttachmentsPreview ");
        extentTest.setDescription(" Verify that attachment's preview appears, when user selects an attachment after clicking on 'Browse file' link or 'Camera' button, on 'Add Attachments' popup. ");
        Thread.sleep(2000);
        WebElement UploadFile2 = driver.findElement(By.xpath("//input[@type='file']"));
        UploadFile2.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");
        Thread.sleep(3000);
        WebElement ImageThumb = WebDriverWaits.WaitUntilVisibleWE(ImgThumb);
        if ((ImageThumb.isDisplayed()) == false) {

            SoftAssert s48 = new SoftAssert();
            s48.assertEquals(false, true);
            s48.assertAll();
        }
    }

    @Test(priority = 49)
    public static void CCP_OpenCloseAddAttachmentsPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenCloseAddAttachmentsPopup ");
        extentTest.setDescription(" Verify that 'Close Add Attachments' confirmation popup opens up, when user clicks on 'Cross' icon or 'Cancel' button after selecting an attachment, on 'Add Attachments' popup. ");

        //Thread.sleep(1000);
        WebDriverWaits.WaitUntilVisible(YesCloseBtn);
        WebDriverWaits.WaitForElementInteractable(YesCloseBtn);
        WebDriverWaits.ClickOn(YesCloseBtn);
        //Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(CloseAttachmentTitle);
        String PopupTitle2 = WebDriverWaits.GetText(CloseAttachmentTitle);
        String PopupTitle3 = "Close Add Attachments";

        SoftAssert s49 = new SoftAssert();
        s49.assertEquals(PopupTitle3, PopupTitle2);
        s49.assertAll();
    }

    @Test(priority = 50)
    public static void CCP_CloseAddAttachmentsPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CloseAddAttachmentsPopup ");
        extentTest.setDescription(" Verify that 'Add Attachments' popup gets closed, when user clicks on 'Yes, Close' button, on 'Close Add Attachment' confirmation popup. ");

        //Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(YesCloseBtn);
        WebDriverWaits.ClickOn(YesCloseBtn);
        //Thread.sleep(5000);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        WebDriverWaits.WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeaders2 = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if ((ModalHeaders2.size() <= 1) == false) {

            SoftAssert s50 = new SoftAssert();
            s50.assertEquals(false, true);
            s50.assertAll();
        }
    }

    @Test(priority = 51)
    public static void CCP_ReopenAddAttachmentsPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_ReopenAddAttachmentsPopup ");
        extentTest.setDescription(" Verify that 'Add Attachments' popup reopens, when user clicks on 'No, Don't Close' button, on 'Close Add Attachment' confirmation popup. ");

        JavascriptExecutor jser = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement AttachmentIcon = (WebElement) jser.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
//        Thread.sleep(6000);
        AttachmentIcon.click();
        Thread.sleep(2000);
        WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
        UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
        WebDriverWaits.WaitforCustometime(4);
        WebDriverWaits.WaitForElementInteractable(YesCloseBtn);
        WebDriverWaits.ClickOn(YesCloseBtn);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(DontCloseBtn);
        WebDriverWaits.ClickOn(DontCloseBtn);
        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(AttachmentTitle);
        String Title4 = WebDriverWaits.GetText(AttachmentTitle);
        String AttachTitle = "Add Attachments";

        SoftAssert s51 = new SoftAssert();
        s51.assertEquals(AttachTitle, Title4);
        s51.assertAll();
    }

    @Test(priority = 52)
    public static void CCP_AddAnAttachment() {
        extentTest = extent.startTest(" CCP_AddAnAttachment ");
        extentTest.setDescription(" Verify that an attachment gets added under 'Attachments' tile, when user clicks on 'Add' button after selecting an attachment, on 'Add Attachments' popup. ");

        WebDriverWaits.ClickOn(AddButton2);
        WebElement AddedImgThumb = WebDriverWaits.WaitUntilVisibleWE(ImgThumb2);
        if ((AddedImgThumb.isDisplayed()) == false) {

            SoftAssert s52 = new SoftAssert();
            s52.assertEquals(false, true);
            s52.assertAll();
        }

    }

    @Test(priority = 53)
    public static void CCP_AddMultipleAttachments() throws InterruptedException {
        extentTest = extent.startTest(" CCP_AddMultipleAttachments ");
        extentTest.setDescription(" Verify that user is able to add multiple attachments under 'Attachments' tile, on 'Create Case' popup. ");
        JavascriptExecutor jser = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        WebElement AttachmentIcon = (WebElement) jser.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
        Thread.sleep(6000);
        AttachmentIcon.click();
        Thread.sleep(2000);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        UploadFile4.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
        Thread.sleep(3000);
        Thread.sleep(2000);
        WebElement UploadFile5 = driver.findElement(By.xpath("//input[@type='file']"));
        UploadFile5.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(AddButton2);
    }

    @Test(priority = 54)
    public static void CCP_OpenAttachmentsDetailsPopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenAttachmentsDetailsPopup ");
        extentTest.setDescription(" Verify that 'Attachments Details' popup opens up, when user clicks on the added attachment, on 'Create Case' popup. ");

       // Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(AddedImage);
        WebDriverWaits.ClickOn(AddedImage);
        WebDriverWaits.WaitUntilVisible(AttachmentDetailsTitle);
        String AttachTitle1 = WebDriverWaits.GetText(AttachmentDetailsTitle);
        String AttachTitle2 = "Attachments Details";

        SoftAssert s54 = new SoftAssert();
        s54.assertEquals(AttachTitle1, AttachTitle2);
        s54.assertAll();

    }

    @Test(priority = 55)
    public static void CCP_UpdateAttachmentDetails() throws InterruptedException {
        extentTest = extent.startTest(" CCP_UpdateAttachmentDetails ");
        extentTest.setDescription(" Verify that attachment details get updated, when user clicks on 'Update' button, on 'Attachment Details' popup. ");

        String RandomReason2 = RandomStrings.RequiredString(15);
        WebDriverWaits.SendKeys(Description, RandomReason2);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(UpdateBtn);
        WebDriverWaits.ClickOn(UpdateBtn);
    }

    @Test(priority = 56)
    public static void CCP_DeleteAnAttachment() throws InterruptedException {
        extentTest = extent.startTest(" CCP_DeleteAnAttachment ");
        extentTest.setDescription(" Verify that an attachment gets deleted, when user clicks on 'Update' button after clicking on 'Delete' icon, on 'Attachment Details' popup ");
        Thread.sleep(2000);
        List<WebElement> AttachmentDet = driver.findElements(AttachmentDetailsTitle);
        if ((AttachmentDet.size()) > 0) {
            WebDriverWaits.ClickOn(CancelBtnAttachDet);
        }
        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(AddedImage);
        List<WebElement> countAttach0 = WebDriverWaits.findElementsByXPath(AddedImage);
        int i = countAttach0.size();
        WebDriverWaits.ClickOn(AddedImage);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(DeleteAttach);
        WebDriverWaits.ClickOn(DeleteAttach);
        //Thread.sleep(3000);
        WebDriverWaits.WaitForElementInteractable(YesDelete);
        WebDriverWaits.ClickOn(YesDelete);
        WebDriverWaits.ClickOn(UpdateBtn);
        List<WebElement> countAttach1 = WebDriverWaits.WaitUntilVisibleList(AddedImage);
        int j = countAttach1.size();
        if ((j == (i - 1)) == false) {

            SoftAssert s56 = new SoftAssert();
            s56.assertEquals(false, true);
            s56.assertAll();
        }
    }

    public static int TotalAttachmentsCountCCP;

    @Test(priority = 57)
    public static void CCP_VerifyTotalAttachmentsCount() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyTotalAttachmentsCount ");
        extentTest.setDescription(" Verify that accurate count of added attachments appear beside 'Attachments' tile's header, on 'Create Case' popup. ");
        Thread.sleep(2000);
        WebDriverWaits.WaitUntilElementPresent(AttachmentDetailsTitle,2);
        List<WebElement> AttachmentDet = driver.findElements(AttachmentDetailsTitle);
        if ((AttachmentDet.size()) > 0) {
            WebDriverWaits.WaitForElementInteractable(CancelBtnAttachDet);
            WebDriverWaits.ClickOn(CancelBtnAttachDet);
        }
       // Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(CountAttachment);
        String AttachCount = WebDriverWaits.GetText(CountAttachment);
       // Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(AddedImage);
        List<WebElement> countAttach = driver.findElements(AddedImage);
        TotalAttachmentsCountCCP = countAttach.size();
        System.out.println("TotalAttachmentsCountCCP" + TotalAttachmentsCountCCP);
        String FinalCount1 = "Attachments (" + (TotalAttachmentsCountCCP) + ")";

        SoftAssert s57 = new SoftAssert();
        s57.assertEquals(AttachCount, FinalCount1);
        s57.assertAll();
    }

    @Test(priority = 58)
    public static void CCP_OpenCreateCasePopup() throws InterruptedException {
        extentTest = extent.startTest(" CCP_OpenCreateCasePopup ");
        extentTest.setDescription(" Verify that 'Create Case' popup opens up, when user clicks on 'Create Case' button, on 'Create Case' page. ");

        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(CCButton);
        WebDriverWaits.ClickOn(CCButton);
        String CreateCaseTitle = WebDriverWaits.GetText(CreateCasePop);

        SoftAssert s58 = new SoftAssert();
        s58.assertEquals(CreateCaseTitle, "Create Case");
        s58.assertAll();
    }

    @Test(priority = 60)
    public static void CCP_VerifyCreateAndScheduleInspectionButton() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyCreateAndScheduleInspectionButton ");
        extentTest.setDescription(" Verify that 'Create & Perform Inspection' button converts into 'Create & Schedule Inspection' button, when user selects 'Schedule Verification Inspection' checkbox, on 'Create Case' popup.  ");

        //Thread.sleep(2000);
        WebDriverWaits.WaitUntilVisible(CrtSchInsButton);
        String ButtonText = WebDriverWaits.GetText(CrtSchInsButton);

        SoftAssert s60 = new SoftAssert();
        s60.assertEquals(ButtonText, "Create & Schedule Inspection");
        s60.assertAll();
    }

    @Test(priority = 61)
    public static void CCP_VerifyNextInspectionSectionState() {
        extentTest = extent.startTest(" CCP_VerifyNextInspectionSectionState ");
        extentTest.setDescription(" Verify that 'Next Inspection' section gets enabled, when user selects 'Schedule Verification Inspection' checkbox, on 'Create Case' popup.  ");

        WebElement NextInspection = WebDriverWaits.WaitUntilVisibleWE(NextInsSec);
        if ((NextInspection.isEnabled()) == false) {

            SoftAssert s61 = new SoftAssert();
            s61.assertEquals(false, true);
            s61.assertAll();
        }

    }

    @Test(priority = 62)
    public static void CCP_VerifyCaseCreation() throws InterruptedException {
        extentTest = extent.startTest(" CCP_VerifyCaseCreation ");
        extentTest.setDescription(" Verify that a case gets created, when user clicks on 'Create & Schedule Inspection' button after selecting the Assignees, 'Create Case' page.  ");
        //Thread.sleep(3000);
        WebDriverWaits.WaitforCustometime(7);
        WebDriverWaits.WaitForElementInteractable(CrtSchInsButton);
        WebDriverWaits.ClickOn(CrtSchInsButton);
        Thread.sleep(20000);
//        Thread.sleep(5000);
        WebDriverWaits.WaitForPageLoadTime(10);
        WebDriverWaits.WaitUntilVisible(CaseStatus);
        WebElement Case = WebDriverWaits.findElement(CaseStatus);
        if ((Case.isDisplayed()) == false) {

            SoftAssert s62 = new SoftAssert();
            s62.assertEquals(false, true);
            s62.assertAll();
        }
    }

    @Test(priority = 63)
    public static void CCP_CDP_CountVerifications() throws InterruptedException {
        extentTest = extent.startTest(" CCP_CDP_CountVerifications ");
        extentTest.setDescription(" ");
        int VioCountCCP = TotalVioCountCCP;
        System.out.println("VioCountCCP" + VioCountCCP);
        int ContactsCountCCP = TotalContactsCountCCP;
        System.out.println("ContactsCountCCP" + ContactsCountCCP);
        int AttachmentsCountCCP = TotalAttachmentsCountCCP;
        System.out.println("AttachmentsCountCCP" + AttachmentsCountCCP);
        //Thread.sleep(3000);
        WebDriverWaits.WaitforCustometime(3);
        WebDriverWaits.WaitUntilVisible(TotalViolationsCDP);
        List<WebElement> CountViolations = driver.findElements(TotalViolationsCDP);
        int ViolationsCountCDP = CountViolations.size();
        System.out.println("ViolationsCountCDP" + ViolationsCountCDP);
        //Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(TotalContactsCDP);
        WebDriverWaits.ScrollIntoView(TotalContactsCDP);
        List<WebElement> CountContacts = driver.findElements(TotalContactsCDP);
        int ContactsCountCDP = CountContacts.size();
        System.out.println("ContactsCountCDP" + ContactsCountCDP);
        WebDriverWaits.WaitUntilVisibleList(TotalAttachmentsCDP);
        List<WebElement> CountAttachments = driver.findElements(TotalAttachmentsCDP);
        int AttachmentsCountCDP = CountAttachments.size();
        System.out.println("AttachmentsCountCDP" + AttachmentsCountCDP);
        if ((VioCountCCP != ViolationsCountCDP) || (ContactsCountCCP != ContactsCountCDP) || (AttachmentsCountCCP != AttachmentsCountCDP)) {
            Assert.assertEquals(false, true);
        }
    }

}
