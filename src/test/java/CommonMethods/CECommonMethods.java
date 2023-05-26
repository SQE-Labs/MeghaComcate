package CommonMethods;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;
import TestCasesCE.CCP;
import TestCasesCE.CloseCase;
import TestCasesCE.ForcedAbatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CECommonMethods extends BrowsersInvoked {
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static WebDriverWait wait20 = new WebDriverWait(driver, 20);


    public static void CE_CreateACase() throws InterruptedException {
        Thread.sleep(2000);
        WebElement CCPBtnJSE = WebDriverWaits.GetWebElementByJS("#header > div.app-header__right > div:nth-child(2) > div.app-header__new')");
        Thread.sleep(10000);
        WebDriverWaits.ClickOnWE20(CCPBtnJSE);
        WebDriverWaits.ClickOn(CCP.CCPOption);
        Thread.sleep(10000);
        CE_AddLocation();
        CE_AddViolationParam("Wa");
        CE_AddContact();
        WebDriverWaits.ClickOn(CCP.CreateCaseButton);
        Thread.sleep(6000);
        WebDriverWaits.ClickOn(CCP.AssignCaseTo);
        Thread.sleep(1000);
        WebDriverWaits.ClickOn(CCP.InspectionAssigneeTo);
        Thread.sleep(1000);
        WebDriverWaits.ClickOn(CCP.CreateScheduleInspectionButton);
        Thread.sleep(10000);
    }

    public static void CE_AddAttachmentCrtCasePage(String path) throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWaits.ScrollIntoView(CCP.addAttachmentCCP);
        Thread.sleep(2000);
        WebDriverWaits.ClickByJsExecuter(CCP.addAttachmentCCP);
        Thread.sleep(10000);
        Thread.sleep(3000);
        WebElement UploadFile4 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        Thread.sleep(20000);
        WebDriverWaits.ClickOn(CCP.AddBtn);
        Thread.sleep(7000);
    }

    public static void CE_AddAttachment(String path) throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWaits.ScrollIntoView(CCP.addAttachmenttop);
        Thread.sleep(2000);
        WebDriverWaits.ClickByJsExecuter(CCP.addAttachmenttop);
        Thread.sleep(10000);
        Thread.sleep(3000);
        WebElement UploadFile4 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        Thread.sleep(20000);
        WebDriverWaits.ClickOn(CCP.AddBtn);
        Thread.sleep(7000);
    }

    public static void CE_AddAttachmentBottom(String path) throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWaits.ScrollIntoView(CCP.addAttachmentbottom);
        Thread.sleep(2000);
        WebDriverWaits.ClickByJsExecuter(CCP.addAttachmentbottom);
        Thread.sleep(3000);
        Thread.sleep(3000);
        WebElement UploadFile4 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        Thread.sleep(20000);
        WebDriverWaits.ClickOn(CCP.AddBtn);
        Thread.sleep(7000);
    }


    public static void CE_AddAttachmentAddActivityPage(String path) throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWaits.ScrollIntoView(ForcedAbatement.AddAttachment);
        Thread.sleep(2000);
        WebDriverWaits.ClickByJsExecuter(ForcedAbatement.AddAttachment);
        Thread.sleep(3000);
        Thread.sleep(3000);

        WebElement UploadFile4 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        Thread.sleep(20000);
        WebDriverWaits.ClickOn(CCP.AddBtn);
        Thread.sleep(7000);
    }


    public static void CE_AddLocation() throws InterruptedException {
        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect1o) || DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            CECommonMethods.serachLocationCCP(DataInterface.searchLocationKey1O);
        } else {
            CECommonMethods.serachLocationCCP(DataInterface.searchLocationKey);
        }

    }


    public static void CE_AddViolation() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CCP.ViolationSearchBox);
        Thread.sleep(4000);
        WebDriverWaits.SendKeys(CCP.ViolationSearchBox, "Wa");
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CCP.ViolationsList);
    }


    public static void CE_AddViolationParam(String vName) throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CCP.ViolationSearchBox);
        Thread.sleep(4000);
        WebDriverWaits.SendKeys(CCP.ViolationSearchBox, vName);
        Thread.sleep(4000);
        WebDriverWaits.ClickOn(CCP.ViolationsList);
    }

    public static void CE_AddContact() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWaits.ScrollIntoView(CCP.AddContactField);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CCP.AddContactField);
        WebDriverWaits.ClickOn(CCP.CreateNewContact);
        String RandomName = RandomStrings.RequiredCharacters(8);
        String RandomMail = RandomName + "@yopmail.com";
        String RandomContact = RandomStrings.RequiredDigits(10);
        WebDriverWaits.SendKeys(CCP.NameField, RandomName);
        WebDriverWaits.SendKeys(CCP.EmailField, RandomMail);
        WebDriverWaits.SendKeys(CCP.WorkPhoneField, RandomContact);
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(CCP.CreateContactBtn);
        Thread.sleep(3000);
        WebDriverWaits.ClickOn(CCP.CreateContactBtn);
        Thread.sleep(5000);
        WebDriverWaits.ClickOn(CCP.PropertyOwnerOption);
        WebDriverWaits.ClickOn(CCP.ApplyButton);
        Thread.sleep(2000);
    }


    public static void serachLocationCCP(String Address) throws InterruptedException {
        WebDriverWaits.SendKeys(CCP.LocationFld, Address);
        Thread.sleep(4000);

        if (DataInterface.agencyConfig.equalsIgnoreCase(DataInterface.agencyConfigGisDirect2o)) {
            WebDriverWaits.WaitUntilVisible(CCP.MapGis2);
            Thread.sleep(10000);
            WebDriverWaits.ClickOn(CCP.MapGis2);

        } else {
            WebDriverWaits.WaitUntilVisible(CCP.Map3);
            Thread.sleep(10000);
            WebDriverWaits.ClickOn(CCP.Map3);
        }

        Thread.sleep(15000);
    }


    public static void CreationOf50PlusCases() throws InterruptedException {
        Thread.sleep(5000);
        for (int i = 0; i <= 50; i++) {
            CECommonMethods.CE_CreateACase();
            System.out.println(i + "Test Case Created..");
            WebDriverWaits.ScrollIntoView(CloseCase.CloseCDPIcon);
            Thread.sleep(2000);
            WebDriverWaits.ClickOn(CloseCase.CloseCDPIcon);
            Thread.sleep(10000);
        }
    }


}
