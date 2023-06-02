package POMCRM;

import CommonMethods.CRMCommonMethods;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import java.io.IOException;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ComposeMail extends CSPInternalUtils {

    public static By MessagesIcon = By.xpath("//p[text()='Messages']/parent::div//button");
    public static By SubjectField = By.xpath("//div[@class='fade compose-email modal-base modal show']//input[@name='subject']");
    public static By IframeBody = By.xpath("//iframe[@id='compose-email-html-editor-modal_ifr']");
    public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
    public static By SendButton = By.xpath("//button[text()='Send']");

    public static void ComposeMessage() throws InterruptedException, MessagingException, IOException {
        SoftAssert softAssert = new SoftAssert();
        CustomerReceivedMail(SMSAndEmailVerificationUtils.RandomSubject);
        System.out.println(GMailHelper.SearchedMailCount);
        boolean ExpectedCount = GMailHelper.SearchedMailCount == 1;
        softAssert.assertTrue(ExpectedCount);
        softAssert.assertAll();

    }

    public static void CustomerReceivedMail(String SearchBySubject) throws InterruptedException, MessagingException, IOException {

        String userName = PropertiesUtils.getPropertyValue("userNameMail").trim();
        String password = PropertiesUtils.getPropertyValue("passwordMail").trim();
        GMailHelper gmailHelper = new GMailHelper(userName, password);
        List<javax.mail.Message> inboxMessageList = gmailHelper.searchEmail(5, "Inbox", SearchBySubject);
        System.out.println(inboxMessageList);
        Thread.sleep(2000);

    }
}
