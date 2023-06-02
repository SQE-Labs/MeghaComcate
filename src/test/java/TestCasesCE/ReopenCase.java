package TestCasesCE;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import BrowsersBase.DataInterface;
import CommonMethods.WebDriverWaits;
import POMCE.ReopenCaseUtils;
import junit.framework.Assert;

import static TestCasesCE.CCP.CaseStatus;
import static TestCasesCE.ForcedAbatement.MoreBtn;
import static TestCasesCE.ReopenCase.StatusColumnSort;

public class ReopenCase extends Notices {

    public static By StatusColumnSort = By.xpath(ReopenCaseUtils.statusColumnSort);
    public static By ReOpenCaseGrid = By.xpath(ReopenCaseUtils.reOpenCaseGrid);
    public static By ClosedCaseGrid = By.xpath(ReopenCaseUtils.closedCaseGrid);
    public static By ClosedCase = By.xpath(ReopenCaseUtils.closedCase);
    public static By ReopenCaseOption = By.xpath(ReopenCaseUtils.reopenCaseOption);
    public static By ReopenCasePopup = By.xpath(ReopenCaseUtils.reopenCasePopup);
    public static By ViolationsOnCDP = By.xpath(ReopenCaseUtils.violationsOnCDP);
    public static By ReopenCaseButton = By.xpath(ReopenCaseUtils.reopenCaseButton);
    public static By ViolationsOnRCP = By.xpath(ReopenCaseUtils.violationsOnRCP);
    public static By ErrorMessageRCP = By.xpath(ReopenCaseUtils.errorMessageRCP);
    public static By NonCompliantButton = By.xpath(ReopenCaseUtils.nonCompliantButton);
    public static By ReopenedCaseActivity = By.xpath(ReopenCaseUtils.reopenedCaseActivity);
    public static By DateReopenedCase = By.xpath(ReopenCaseUtils.dateReopenedCase);
    public static By UserInfoRCP = By.xpath(ReopenCaseUtils.userInfoRCP);

    @Test(priority = 1)
    public static void ReopenCase_PreRequisite() throws InterruptedException {
        extentTest = extent.startTest(" ReopenCase_PreRequisite ");

        driver.navigate().to(DataInterface.URLDashboard);
        Thread.sleep(6000);
        WebDriverWaits.ClickOn(CLP);
        Thread.sleep(8000);
        WebDriverWaits.ClickOn(StatusColumnSort);
        Thread.sleep(8000);
        WebDriverWaits.ClickOn(StatusColumnSort);
        Thread.sleep(9000);
        WebDriverWaits.ScrollIntoView(StatusColumnSort);
        int checkOpen = driver.findElements(ReopenCase.ClosedCaseGrid).size();
        if (checkOpen > 0) {
            WebDriverWaits.ScrollIntoView(ReopenCase.ClosedCaseGrid);
            Thread.sleep(4000);
            WebDriverWaits.ClickByJsExecuter(ReopenCase.ClosedCaseGrid);
            Thread.sleep(8000);
        } else {
            WebDriverWaits.ClickOn(StatusColumnSort);
            Thread.sleep(8000);
            int checktOpen = driver.findElements(ReopenCase.ClosedCaseGrid).size();
            if (checktOpen > 0) {
                WebDriverWaits.ScrollIntoView(ReopenCase.ClosedCaseGrid);
                Thread.sleep(4000);
                WebDriverWaits.ClickByJsExecuter(ReopenCase.ClosedCaseGrid);
                Thread.sleep(8000);
            }
        }

        Thread.sleep(10000);
        Thread.sleep(8000);
        String ClosedStatus = WebDriverWaits.GetText(CaseStatus);
        Assert.assertEquals("Closed", ClosedStatus);
    }

    @Test(priority = 2)
    public static void ReopenCase_OpenReopenCasePopup() throws InterruptedException {
        extentTest = extent.startTest(" ReopenCase_OpenReopenCasePopup ");
        extentTest.setDescription(" Verify that 'Reopen Case' popup opens up, when user clicks on 'More' button > 'Reopen Case' option, on CDP. ");
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(MoreBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(ReopenCaseOption);
        String PopupTitle = WebDriverWaits.GetText(ReopenCasePopup);
        Assert.assertEquals("Reopen Case", PopupTitle);
    }

    public static ArrayList<String> VioCDPList = new ArrayList<String>();

    @Test(priority = 3)
    public static void ReopenCase_VerifyViolationsFromCDP() throws InterruptedException {
        extentTest = extent.startTest(" ReopenCase_VerifyViolationsFromCDP ");
        extentTest.setDescription(" Verify that exact violation(s) from CDP appear on 'Reopen Case' popup. ");
        WebDriverWaits.ClickOn(CancelButton);
        Thread.sleep(2000);
        List<WebElement> VioCDP = WebDriverWaits.WaitUntilVisibleList(ViolationsOnCDP);
        int VioCDPCount = VioCDP.size();
        for (int i = 0; i < VioCDPCount; i++) {
            WebElement VioList = VioCDP.get(i);
            Thread.sleep(2000);
            String ViolationsCDP = VioList.getText();
            VioCDPList.add(ViolationsCDP);
        }
        WebDriverWaits.ClickOn(MoreBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(ReopenCaseOption);
        ArrayList<String> VioRCPList = new ArrayList<String>();
        List<WebElement> VioRCP = WebDriverWaits.WaitUntilVisibleList(ViolationsOnRCP);
        int VioRCPCount = VioRCP.size();
        for (int i = 0; i < VioRCPCount; i++) {
            WebElement VioList2 = VioRCP.get(i);
            Thread.sleep(2000);
            String ViolationsRCP = VioList2.getText();
            VioRCPList.add(ViolationsRCP);
        }
        boolean CompareList = VioCDPList.equals(VioRCPList);
        Assert.assertEquals(CompareList, true);
    }

    @Test(priority = 4)
    public static void ReopenCase_NonCompliantViolationIsRequired() {
        extentTest = extent.startTest(" ReopenCase_NonCompliantViolationIsRequired ");
        extentTest.setDescription(" Verify that user is not able to Reopen a case without selecting at least one violation as Non-Compliant. ");
        WebDriverWaits.ClickOn(ReopenCaseButton);
        String ErrorMsgExp = "You must mark at least one violation as Non-Compliant and schedule an inspection to reopen this Case.";
        String ErrorMsgActual = WebDriverWaits.GetText(ErrorMessageRCP);
        Assert.assertEquals(ErrorMsgExp, ErrorMsgActual);
    }

    @Test(priority = 5)
    public static void ReopenCase_CaseDoesNotReopenOnCancel() throws InterruptedException {
        extentTest = extent.startTest(" ReopenCase_CaseDoesNotReopenOnCancel ");
        extentTest.setDescription(" Verify that Closed case does not Reopen, when user clicks on 'Cancel' button, on 'Reopen Case' popup. ");
        WebDriverWaits.ClickOn(CancelButton);
        Thread.sleep(5000);
        String ClosedStatus = WebDriverWaits.GetText(CaseStatus);
        Assert.assertEquals("Closed", ClosedStatus);
    }

    @Test(priority = 6)
    public static void ReopenCase_VerifyCaseReopened() throws InterruptedException {
        extentTest = extent.startTest(" ReopenCase_VerifyCaseReopened ");
        extentTest.setDescription(" Verify that user is able to Reopen the closed Case, on CDP. ");
        WebDriverWaits.ClickOn(MoreBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(ReopenCaseOption);
        WebDriverWaits.ClickOn(NonCompliantButton);
        WebDriverWaits.ClickOn(ReopenCaseButton);
        Thread.sleep(15000);
        String ClosedStatus = WebDriverWaits.GetText(CaseStatus);
        Assert.assertEquals("Open", ClosedStatus);
    }

    @Test(priority = 7)
    public static void ReopenCase_VerifyCaseReopenedDetails() {
        extentTest = extent.startTest(" ReopenCase_VerifyCaseReopenedDetails ");
        extentTest.setDescription(" Verify that Case Reopened details get added under 'Abatement Activities' tile, on CDP. ");
        String ReopenedCaseStr = WebDriverWaits.GetText(ReopenedCaseActivity);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals("Case Reopened", ReopenedCaseStr);
        String UserInfoActual = WebDriverWaits.GetText(UserInfoRCP);
        String UserInfoExp = "Reopened by " + Login.AgencyLoggedInUserName;
        SoftAssert soft2 = new SoftAssert();
        soft2.assertEquals(UserInfoExp, UserInfoActual);
        soft.assertAll();

    }

}
