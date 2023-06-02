package TestCasesCE;

import java.util.List;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.CloseCaseUtils;
import BrowsersBase.DataInterface;

import static TestCasesCE.ReopenCase.ClosedCase;
import static TestCasesCE.ReopenCase.StatusColumnSort;

public class CloseCase extends ForcedAbatement {

    public static By CloseCaseBtn = By.xpath(CloseCaseUtils.closeCaseBtn);
    public static By CloseCasePopup = By.xpath(CloseCaseUtils.closeCasePopup);
    public static By CancelBtnCCPopup = By.xpath(CloseCaseUtils.cancelBtnCCPopup);
    public static By VoluntaryBtn = By.xpath(CloseCaseUtils.voluntaryBtn);
    public static By CloseCaseBtnCCPopup = By.xpath(CloseCaseUtils.closeCaseBtnCCPopup);
    public static By YesBtnConfirmationPopup = By.xpath(CloseCaseUtils.yesBtnConfirmationPopup);
    public static By ClosedStatus = By.xpath(CloseCaseUtils.closedStatus);
    public static By CloseCDPIcon = By.xpath(CloseCaseUtils.CloseCDPIcon);

    @Test(priority = 134)
    public static void CloseCase_PreRequisite() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_PreRequisite ");
        extentTest.setDescription(" Verify that 'Close Case' option appears, when user clicks on 'More' button, on CDP. ");
        driver.navigate().to(DataInterface.URLDashboard);
        // Thread.sleep(10000);
        WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitForElementInteractable(CLP);
        WebDriverWaits.ClickByJsExecuter(CLP);
        // Thread.sleep(15000);
        WebDriverWaits.WaitUntilPresent(StatusColumnSort);
        //Thread.sleep(4000);
        WebDriverWaits.ScrollIntoView(StatusColumnSort);
        WebDriverWaits.WaitForElementInteractable(StatusColumnSort);
        int checkOpen = driver.findElements(ReopenCase.ReOpenCaseGrid).size();
        if (checkOpen > 0) {
            WebDriverWaits.ScrollIntoView(ReopenCase.ReOpenCaseGrid);
            //Thread.sleep(4000);
            WebDriverWaits.WaitForElementInteractable(ReopenCase.ReOpenCaseGrid);
            WebDriverWaits.ClickByJsExecuter(ReopenCase.ReOpenCaseGrid);
            //Thread.sleep(8000);
        } else {
            WebDriverWaits.ClickOn(StatusColumnSort);
            //Thread.sleep(8000);
            WebDriverWaits.WaitUntilVisible(ReopenCase.ReOpenCaseGrid);
            int checktOpen = driver.findElements(ReopenCase.ReOpenCaseGrid).size();
            if (checktOpen > 0) {
                WebDriverWaits.ScrollIntoView(ReopenCase.ReOpenCaseGrid);
                WebDriverWaits.WaitForElementInteractable(ReopenCase.ReOpenCaseGrid);
                //Thread.sleep(4000);
                WebDriverWaits.ClickByJsExecuter(ReopenCase.ReOpenCaseGrid);
                //Thread.sleep(8000);
            }
        }

        //Thread.sleep(20000);
        WebDriverWaits.WaitForPageLoadTime(10);
        WebDriverWaits.WaitUntilVisible(MoreBtn);
        WebDriverWaits.WaitForElementInteractable(MoreBtn);
        WebDriverWaits.ClickByJsExecuter(MoreBtn);
        //Thread.sleep(3000);
        WebDriverWaits.WaitUntilVisible(CloseCaseBtn);
        String CloseCaseText = WebDriverWaits.GetText(CloseCaseBtn);

        SoftAssert s134 = new SoftAssert();
        s134.assertEquals(CloseCaseText, "Close Case");
        s134.assertAll();

    }

    @Test(priority = 135)
    public static void CloseCase_OpenCloseCasePopup() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_OpenCloseCasePopup ");
        extentTest.setDescription(" Verify that 'Close Case' popup opens up, when user selects 'Close Case' option, after clicking on 'More' button, on CDP. ");

        WebDriverWaits.ClickOn(CloseCaseBtn);
//        Thread.sleep(1000);
        WebDriverWaits.WaitUntilPresent(CloseCasePopup);
        String CCPopupText = WebDriverWaits.GetText(CloseCasePopup);

        SoftAssert s135 = new SoftAssert();
        s135.assertEquals(CCPopupText, "Close Case");
        s135.assertAll();

    }

    @Test(priority = 136)
    public static void CloseCase_CloseCloseCasePopup() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_CloseCloseCasePopup ");
        extentTest.setDescription(" Verify that 'Close Case' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Verify Violations' section. ");


        WebDriverWaits.ClickOn(CancelBtnCCPopup);
//      Thread.sleep(2000);
        //WebDriverWaits.WaitForPageLoadTime(5);
        WebDriverWaits.WaitUntilPresent(ModalHeaders);
        WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
        List<WebElement> modalCount = WebDriverWaits.findElementsByXPath(ModalHeaders);
        if (((modalCount.size()) <= 1) == false) {

            SoftAssert s136 = new SoftAssert();
            s136.assertEquals(false, true);
            s136.assertAll();
        }

    }

    @Test(priority = 137)
    public static void CloseCase_VerifyVoluntaryToggleBtnState() {
        extentTest = extent.startTest(" CloseCase_VerifyVoluntaryToggleBtnState ");
        extentTest.setDescription(" Verify that 'Voluntary' toggle button appears selected by default, on 'Close Case' popup. ");

//            Thread.sleep(10000);
        WebDriverWaits.WaitUntilElementPresent(MoreBtn, 2);
        WebDriverWaits.ScrollIntoView(MoreBtn);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(MoreBtn);
        WebDriverWaits.ClickByJsExecuter(MoreBtn);
        WebDriverWaits.WaitUntilPresent(CloseCaseBtn);
        WebDriverWaits.ClickOn(CloseCaseBtn);
        WebElement VoluntaryBtnState = WebDriverWaits.WaitUntilVisibleWE(VoluntaryBtn);
        if ((VoluntaryBtnState.isEnabled()) == false) {

            SoftAssert s137 = new SoftAssert();
            s137.assertEquals(false, true);
            s137.assertAll();
        }

    }

    @Test(priority = 138)
    public static void CloseCase_SelectForcedToggleBtn() {
        extentTest = extent.startTest(" CloseCase_SelectForcedToggleBtn ");
        extentTest.setDescription(" Verify that user is able to select 'Forced' toggle button, on 'Close Case' popup. ");

//            Thread.sleep(4000);
        WebDriverWaits.WaitForPageLoadTime(3);
        WebElement ForcedBtnState = WebDriverWaits.WaitUntilVisibleWE(ForcedToggle);
        if ((ForcedBtnState.isEnabled()) == false) {

            SoftAssert s138 = new SoftAssert();
            s138.assertEquals(false, true);
            s138.assertAll();
        }

    }

    @Test(priority = 139)
    public static void CloseCase_VerifyClosedStatus() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_VerifyClosedStatus ");
        extentTest.setDescription(" Verify that 'Closed' status appears after Case gets closed, when user clicks on 'Close Case' button, on 'Close Case' popup. ");

        WebDriverWaits.ClickByJsExecuter(CloseCaseBtnCCPopup);
//            Thread.sleep(20000);
            Thread.sleep(5000);
        WebDriverWaits.WaitUntilVisible(CaseStatus);
        WebDriverWaits.WaitUntilPresent(CaseStatus);
        String ClosedStatus = WebDriverWaits.GetText(CaseStatus);

        SoftAssert s139 = new SoftAssert();
        s139.assertEquals(ClosedStatus, "Closed");
        s139.assertAll();

    }

    public static void AddAddress() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(LocationFld);
        WebDriverWaits.ClickOn(AddLocManually);
        Thread.sleep(1000);
        String StreetAddress1 = RandomStrings.RequiredString(8);
        WebDriverWaits.SendKeys(StreetAdd, StreetAddress1);
        String CityAddress1 = RandomStrings.RequiredString(8);
        WebDriverWaits.SendKeys(CityAdd, CityAddress1);
        WebDriverWaits.SendKeys(ZipAdd, "77590");
        WebDriverWaits.SendKeys(ApnAdd, "7030-0122-0011-000");
        WebDriverWaits.ClickOn(SaveButton2);
    }

    public static void AddVio() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(ViolationSearchBox);
        WebDriverWaits.SendKeys(ViolationSearchBox, "An");
        WebDriverWaits.ClickOn(ViolationList);
        WebDriverWaits.SendKeys(EntitySearchBox, "Wh");
        WebDriverWaits.ClickOn(EntitySearchList);
        WebDriverWaits.ClickOn(AddButton);
    }

    @Test(priority = 140)
    public static void CloseCase_PreRequisiteCaseCreationForCloseCase() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_ConfirmationPopupForCloseCaseValidViolations ");
        extentTest.setDescription("  ");

        driver.navigate().to(DataInterface.URLCreateCase);
        Thread.sleep(4000);
        AddAddress();
        AddVio();
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CCButton);
        Thread.sleep(5000);
        WebDriverWaits.ClickOn(CrtSchInsButton);
        Thread.sleep(20000);
        WebElement Case = WebDriverWaits.WaitUntilVisibleWE(CaseStatus);
        if ((Case.isDisplayed()) == false) {

            SoftAssert s140 = new SoftAssert();
            s140.assertEquals(false, true);
            s140.assertAll();

        }

    }

    @Test(priority = 141)
    public static void CloseCase_ConfirmationPopupForCloseCaseInvalidViolations() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_ConfirmationPopupForCloseCaseInvalidViolations ");
        extentTest.setDescription(" Verify that confirmation popup opens up, when user clicks on 'Complete Inspection & Close Case' button for invalid violations, under 'Verify Violations' section. ");

            Thread.sleep(4000);
            WebDriverWaits.ClickOn(AddContactsPIP);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(CrtContactLink2);
            String RandomName = RandomStrings.RequiredCharacters(8);
            String RandomMail = RandomName + "@yopmail.com";
            String RandomContact = RandomStrings.RequiredDigits(10);
            WebDriverWaits.SendKeys(NameFieldPIP, RandomName);
            WebDriverWaits.SendKeys(NameField, RandomName);
            WebDriverWaits.SendKeys(EmailField, RandomMail);
            WebDriverWaits.SendKeys(WorkPhoneField, RandomContact);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(CrtContactBtn);
            Thread.sleep(3000);
            WebDriverWaits.ClickOn(PropertyOwnerOption);
            WebDriverWaits.ClickOn(ApplyButton);
            Thread.sleep(6000);
            WebDriverWaits.ClickOn(PerformInsButton);
            List<WebElement> InvalidList = WebDriverWaits.WaitUntilVisibleList(InvalidBtnList);
            int CountList = InvalidList.size();
            for (int i = 0; i < CountList; i++) {
                WebElement ListClick = InvalidList.get(i);
                Thread.sleep(1000);
                ListClick.click();
            }
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(FooterButtons);
            WebElement ConfirmationIcon = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
            if ((ConfirmationIcon.isDisplayed()) == false) {

                SoftAssert s141 = new SoftAssert();
                s141.assertEquals(false, true);
                s141.assertAll();

            }

    }

    @Test(priority = 142)
    public static void CloseCase_CloseConfirmationPopupForCloseCase() throws InterruptedException{
        extentTest = extent.startTest(" CloseCase_ConfirmationPopupForCloseCaseInvalidViolations ");
        extentTest.setDescription(" Verify that confirmation popup gets closed, when user clicks on 'Cancel' button, under 'Verify Violations' section. ");

            Thread.sleep(4000);
            WebDriverWaits.ScrollIntoView(CancelConfirmation);
            WebDriverWaits.ClickOn(CancelConfirmation);
            Thread.sleep(1000);
            List<WebElement> ConfirmationValid = driver.findElements(ConfirmationPopup);
            if (((ConfirmationValid.size()) < 1) == false) {

                SoftAssert s142 = new SoftAssert();
                s142.assertEquals(false, true);
                s142.assertAll();

            }

    }

    @Test(priority = 143)
    public static void CloseCase_VerifyClosedStatusViaPerformInspection() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_VerifyClosedStatusViaPerformInspection ");
        extentTest.setDescription(" Verify that 'Closed' status appears after Case gets closed, when user clicks on 'Yes' button, on 'Close Case' popup. ");

            Thread.sleep(3000);
            WebDriverWaits.ClickOn(FooterButtons);
            Thread.sleep(4000);
            WebDriverWaits.ClickOn(YesBtnConfirmationPopup);
            Thread.sleep(7000);
            String ClosedStatus2 = WebDriverWaits.GetText(ClosedStatus);

            SoftAssert s143 = new SoftAssert();
            s143.assertEquals(ClosedStatus2, "Closed");
            s143.assertAll();


    }

    public static void Create_New_Contact() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(AddContactFld);
        WebDriverWaits.ClickOn(CrtContactLink2);
        Thread.sleep(2000);
        String RandomName = RandomStrings.RequiredCharacters(8);
        String RandomMail = RandomName + "@yopmail.com";
        String RandomContact = RandomStrings.RequiredDigits(10);
        WebDriverWaits.SendKeys(NameFieldPIP, RandomName);
        WebDriverWaits.SendKeys(NameField, RandomName);
        WebDriverWaits.SendKeys(EmailField, RandomMail);
        WebDriverWaits.SendKeys(WorkPhoneField, RandomContact);
        WebDriverWaits.ClickOn(CrtContactBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(PropertyOwnerOption);
        WebDriverWaits.ClickOn(ApplyButton);
    }

    public static void CreateCasePreRequisites() throws InterruptedException {
        driver.navigate().to(DataInterface.URLCreateCase);
        Thread.sleep(2000);
        AddAddress();
        AddVio();
        Create_New_Contact();
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CCButton);
        Thread.sleep(2000);

        WebDriverWaits.ClickOn(CrtSchInsButton);
        Thread.sleep(4000);
    }

    @Test(priority = 144)
    public static void CloseCase_CloseCasewithValidViolations() throws InterruptedException {
        extentTest = extent.startTest(" CloseCase_CloseCasewithValidViolations ");
        extentTest.setDescription(" Verify that user is able to close the case for valid violations, after clicking on 'Complete Inspection & Close Case' button > 'Close Case' button, on 'Close Case' popup. ");

            CreateCasePreRequisites();
            Thread.sleep(25000);
            WebDriverWaits.WaitUntilVisible(PerformInsButton);
            WebDriverWaits.ScrollIntoView(PerformInsButton);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(PerformInsButton);
            Thread.sleep(5000);
            WebDriverWaits.ClickOn(ValidBtnList);
            WebDriverWaits.ScrollIntoView(FooterButtons);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(FooterButtons);
            Thread.sleep(15000);
            String CCPopupText = WebDriverWaits.GetText(CloseCasePopup);

            SoftAssert s144a = new SoftAssert();
            s144a.assertEquals(CCPopupText, "Close Case");
            s144a.assertAll();

            WebDriverWaits.ClickOn(CloseCaseBtnCCPopup);
            Thread.sleep(18000);
            String ClosedStatus = WebDriverWaits.GetText(CaseStatus);

            SoftAssert s144b = new SoftAssert();
            s144b.assertEquals(ClosedStatus, "Closed");
            s144b.assertAll();


    }

}
