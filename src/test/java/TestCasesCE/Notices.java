package TestCasesCE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.NoticesUtils;
import junit.framework.Assert;

public class Notices extends UserManagement {
    public static By ActiveTab = By.xpath(NoticesUtils.activeTab);
    public static By CreateNonHtmlNoticeBtn = By.xpath(NoticesUtils.createNonHtmlNoticeBtn);
    public static By CreateNonHtmlNoticePopup = By.xpath(NoticesUtils.createNonHtmlNoticePopup);
    public static By LabelField = By.xpath(NoticesUtils.labelField);
    public static By CreateNoticeBtn = By.xpath(NoticesUtils.createNoticeBtn);
    public static By CreateHtmlNoticeBtn = By.xpath(NoticesUtils.createHtmlNoticeBtn);
    public static By MergeFieldsLink = By.xpath(NoticesUtils.mergeFieldsLink);
    public static By AddMergeFieldsPopup = By.xpath(NoticesUtils.addMergeFieldsPopup);
    public static By CreateHtmlNoticePopup = By.xpath(NoticesUtils.createHtmlNoticePopup);
    public static By CountNotices = By.xpath(NoticesUtils.countNotices);
    public static By CategoryDropdown = By.xpath(NoticesUtils.categoryDropdown);
    public static By CategoryOption = By.xpath(NoticesUtils.categoryOption);
    public static By FieldResults = By.xpath(NoticesUtils.fieldResults);
    public static By CategoryResults = By.xpath(NoticesUtils.categoryResults);
    public static By DoneButton = By.xpath(NoticesUtils.doneButton);
    public static By PreviewButton = By.xpath(NoticesUtils.previewButton);
    public static By PreviewPopupBody = By.xpath(NoticesUtils.previewPopupBody);
    public static By FADocumentToggle = By.xpath(NoticesUtils.fADocumentToggle);
    public static By NoticesPageLink = By.xpath(NoticesUtils.noticesPageLink);
    public static By EditIconNotice = By.xpath(NoticesUtils.editIconNotice);
    public static By NoticeLabelColumn = By.xpath(NoticesUtils.noticeLabelColumn);
    public static By NoticesCountHeader = By.xpath(NoticesUtils.noticesCountHeader);
    public static By NoticesCountActual = By.xpath(NoticesUtils.noticesCountActual);
    public static By LinkToVioTypesField = By.xpath(NoticesUtils.linkToVioTypesField);
    public static By WaterOptionToLink = By.xpath(NoticesUtils.waterOptionToLink);
    public static By AppHeaderIcon = By.xpath(NoticesUtils.appHeaderIcon);
    public static By AgencySetupLabel = By.xpath(NoticesUtils.agencySetupLabel);
    public static By CE = By.xpath(NoticesUtils.CE);
    public static By ProductDemo = By.xpath(NoticesUtils.ProductDemo);

    @Test(priority = 0)
    public static void Notices_PreRequisite() throws InterruptedException {
        extentTest = extent.startTest(" Notices_PreRequisite ");
        driver.get(DataInterface.URLDashboard);
        Thread.sleep(20000);
        WebDriverWaits.ClickByJsExecuter(AppHeaderIcon);
        Thread.sleep(5000);
        WebDriverWaits.ClickByJsExecuter(AgencySetupLabel);
        ;
        Thread.sleep(20000);
        if (DataInterface.RunEnvironment.equalsIgnoreCase("STAGE")) {
            WebDriverWaits.ScrollIntoView(CE);
            Thread.sleep(4000);
            WebDriverWaits.ClickOn(CE);
            Thread.sleep(4000);
        } else {

            int ceSize = driver.findElements(CE).size();
            int ProductDemoSize = driver.findElements(ProductDemo).size();
            if (ceSize > 0) {
                WebDriverWaits.ScrollIntoView(CE);
                Thread.sleep(4000);
                WebDriverWaits.ClickOn(CE);
                Thread.sleep(4000);
            } else if (ProductDemoSize > 0) {
                WebDriverWaits.ScrollIntoView(ProductDemo);
                Thread.sleep(4000);
                WebDriverWaits.ClickOn(ProductDemo);
                Thread.sleep(4000);
            }


        }
        WebDriverWaits.ScrollIntoView(NoticesPageLink);
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(NoticesPageLink);
        Thread.sleep(20000);
        WebDriverWaits.ScrollIntoView(AppHeaderIcon);
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public static void Notices_OpenCreateNonHtmlNoticePopup() throws InterruptedException {
        extentTest = extent.startTest(" Notices_OpenCreateNonHtmlNoticePopup ");
        extentTest.setDescription(" Verify that 'Create Non-HTML Notice' popup opens up, when user clicks on 'Create Non-HTML Notice' button, on 'Notices' page. ");
        Thread.sleep(10000);
        WebDriverWaits.ScrollIntoView(ActiveTab);
        Thread.sleep(4000);
        WebDriverWaits.WaitUntilPresent(CreateNonHtmlNoticeBtn);
        WebDriverWaits.ScrollIntoView(CreateNonHtmlNoticeBtn);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CreateNonHtmlNoticeBtn);
        String PopupTitle = WebDriverWaits.GetText(CreateNonHtmlNoticePopup);
        Assert.assertEquals(PopupTitle, "Create Non-HTML Notice");
    }

    public static int CurrentNoticesCount;

    @Test(priority = 2)
    public static void Notices_CreateNonHTMLNotice() throws InterruptedException {
        extentTest = extent.startTest(" Notices_CreateNonHTMLNotice ");
        extentTest.setDescription(" Verify that user is able to create a Non-HTML Notice, after entering data into all mandatory fields, on 'Notices' page. ");
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(CancelButtonCCP);
        Thread.sleep(2000);
        String[] NoticesSplit = WebDriverWaits.GetText(CountNotices).split(" ");
        String CountText = NoticesSplit[0];
        int NoticesCountBefore = Integer.parseInt(CountText);
        WebDriverWaits.ClickOn(CreateNonHtmlNoticeBtn);
        Thread.sleep(2000);
        String RandomLabel = "Non-HTML " + RandomStrings.RequiredCharacters(8);
        WebDriverWaits.SendKeys(LabelField, RandomLabel);
        WebDriverWaits.ScrollIntoView(CreateNoticeBtn);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CreateNoticeBtn);
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(8000);
        WebDriverWaits.ScrollIntoView(CountNotices);
        Thread.sleep(4000);
        String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
        String CountText2 = NoticesSplit2[0];
        CurrentNoticesCount = Integer.parseInt(CountText2);
        boolean CompareCount = CurrentNoticesCount == (NoticesCountBefore + 1);
        Assert.assertEquals(CompareCount, true);
    }

    @Test(priority = 3)
    public static void Notices_OpenCreateHtmlNoticePopup() throws InterruptedException {
        extentTest = extent.startTest(" Notices_OpenCreateHtmlNoticePopup ");
        extentTest.setDescription(" Verify that 'Create HTML Notice' popup opens up, when user clicks on 'Create HTML Notice' button, on 'Notices' page. ");
        Thread.sleep(6000);
        WebDriverWaits.ScrollIntoView(CreateHtmlNoticeBtn);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CreateHtmlNoticeBtn);
        Thread.sleep(2000);
        String PopupTitle = WebDriverWaits.GetText(CreateHtmlNoticePopup);
        Assert.assertEquals(PopupTitle, "Create HTML Notice");
    }

    @Test(priority = 4)
    public static void Notices_OpenAddMergeFieldsPopup() throws InterruptedException {
        extentTest = extent.startTest(" Notices_OpenAddMergeFieldsPopup ");
        extentTest.setDescription(" Verify that 'Add Merge Tables' popup opens up, when user clicks on 'Merge Tables' button, on 'Create HTML Notice' popup. ");
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(MergeFieldsLink);
        String PopupTitle = WebDriverWaits.GetText(AddMergeFieldsPopup);
        Assert.assertEquals(PopupTitle, "Add Merge Fields");
    }

    @Test(priority = 5)
    public static void Notices_ApplyCategoryOnMergeFields() throws InterruptedException {
        extentTest = extent.startTest(" Notices_ApplyCategoryOnMergeFields ");
        extentTest.setDescription(" Verify that user is able to apply filters from 'Category' dropdown list, on 'Add Merge Tables' popup. ");
        WebDriverWaits.ClickOn(CategoryDropdown);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CategoryOption);
        List<WebElement> CategoryApplied = driver.findElements(FieldResults);
        int CountFields = CategoryApplied.size();
        List<WebElement> CategoryResult = driver.findElements(CategoryResults);
        int CountCategory = CategoryResult.size();
        Assert.assertEquals(CountFields, CountCategory);
    }

    @Test(priority = 6)
    public static void Notices_VerifyMergeFieldsOnHtmleditor() throws InterruptedException {
        extentTest = extent.startTest(" Notices_VerifyMergeFieldsOnHtmleditor ");
        extentTest.setDescription(" Verify that respective Merge Table gets added to the HTML editor, when user clicks on any Merge Tables link, on 'Add Merge Tables' popup. ");
        WebDriverWaits.ClickOn(FieldResults);
        String FieldText = WebDriverWaits.GetText(FieldResults);
        WebDriverWaits.ClickOn(DoneButton);
        WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeHTML);
        Thread.sleep(2000);
        driver.switchTo().frame(switchFrame);
        String NoticeText = WebDriverWaits.GetText(NoticeContent);
        Assert.assertEquals(FieldText, NoticeText);
    }

    @Test(priority = 7)
    public static void Notices_VerifyPreviewPopup() {
        extentTest = extent.startTest(" Notices_VerifyPreviewPopup ");
        extentTest.setDescription(" Verify that user is able to Preview the data entered in the HTML editor, on 'Preview Notice' popup. ");
        String NoticeText = WebDriverWaits.GetText(NoticeContent);
        driver.switchTo().defaultContent();
        WebDriverWaits.ClickOn(PreviewButton);
        String PreviewText = WebDriverWaits.GetText(PreviewPopupBody);
        Assert.assertEquals(PreviewText, NoticeText);
    }

    @Test(priority = 8)
    public static void Notices_CreateHtmlCaseNotice() throws InterruptedException {
        extentTest = extent.startTest(" Notices_CreateHtmlCaseNotice ");
        extentTest.setDescription(" Verify that user is able to create an HTML Notice of 'Case Notice' type, with a Violation type linked, on 'Notices' page. ");
        WebDriverWaits.ClickOn(ClosePopup);
        String RandomLabel = "HTML " + RandomStrings.RequiredCharacters(8);
        Thread.sleep(2000);
        WebDriverWaits.SendKeys(LabelField, RandomLabel);
        WebDriverWaits.ClickOn(CreateNoticeBtn);
        Thread.sleep(20000);
        WebDriverWaits.ScrollIntoView(CountNotices);
        Thread.sleep(4000);
        String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
        String CountText2 = NoticesSplit2[0];
        int NoticesCountAfter = Integer.parseInt(CountText2);
        boolean CompareCount = NoticesCountAfter == (CurrentNoticesCount + 1);
        Assert.assertEquals(CompareCount, true);

    }

    @Test(priority = 9)
    public static void Notices_CreateFADocumentHtmlNotice() throws InterruptedException {
        extentTest = extent.startTest(" Notices_CreateFADocumentHtmlNotice ");
        extentTest.setDescription(" Verify that user is able to create an HTML Notice of  'FA Document' type, on 'Notices' page. ");
        WebDriverWaits.ScrollIntoView(CreateHtmlNoticeBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CreateHtmlNoticeBtn);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(FADocumentToggle);
        String RandomLabel = "FA Doc " + RandomStrings.RequiredCharacters(8);
        WebDriverWaits.SendKeys(LabelField, RandomLabel);
        WebDriverWaits.ClickOn(MergeFieldsLink);
        WebDriverWaits.ClickOn(FieldResults);
        WebDriverWaits.ClickOn(DoneButton);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CreateNoticeBtn);
        Thread.sleep(25000);
        WebDriverWaits.ScrollIntoView(CountNotices);
        Thread.sleep(4000);
        String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
        String CountText2 = NoticesSplit2[0];
        int NoticesCountAfter = Integer.parseInt(CountText2);
        boolean CompareCount = NoticesCountAfter == (CurrentNoticesCount + 2);
        Assert.assertEquals(CompareCount, true);
    }

    @Test(priority = 10)
    public static void Notices_VerifyEditNotices() throws InterruptedException {
        extentTest = extent.startTest(" Notices_VerifyEditNotices ");
        extentTest.setDescription(" Verify that user is able to edit the added Notices, on 'Notices' page. ");
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(EditIconNotice);
        Thread.sleep(2000);
        WebElement Label = WebDriverWaits.WaitUntilVisibleWE(LabelField);
        Thread.sleep(2000);
        Label.clear();
        String RandomLabel = "Non-Html Edited " + RandomStrings.RequiredCharacters(4);
        Thread.sleep(2000);
        Label.sendKeys(RandomLabel);
        WebDriverWaits.ClickOn(SaveBtn);
        Thread.sleep(8000);
        String GetLabel = WebDriverWaits.GetText(NoticeLabelColumn);
        Assert.assertEquals(GetLabel, RandomLabel);
    }

    @Test(priority = 11)
    public static void Notices_VerifyCountOfNotices() throws InterruptedException {
        extentTest = extent.startTest(" Notices_VerifyCountOfNotices ");
        extentTest.setDescription(" Verify that accurate count of Notices appear, on 'Notices' page. ");
        Thread.sleep(2000);
        String[] CountAtHeader = WebDriverWaits.GetText(NoticesCountHeader).split(" ");
        String NoticesCountExp = CountAtHeader[0];
        int NoticesCountExpected = Integer.parseInt(NoticesCountExp);
        Thread.sleep(6000);
        List<WebElement> NoOfNotices = driver.findElements(NoticesCountActual);
        int TotalCountNotices = NoOfNotices.size();
        Assert.assertEquals(NoticesCountExpected, TotalCountNotices);
    }

    @Test(priority = 12)
    public static void Notices_VerifyAutoPopulationOfNotices() throws InterruptedException {
        extentTest = extent.startTest(" Notices_VerifyAutoPopulationOfNotices ");
        extentTest.setDescription(" Verify that Notices linked to Violation Types get auto-populated while Performing Inspection. ");
    }

}
