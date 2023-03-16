package POMNewAgencySetup;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;
import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCRM.CSPInternalUtils;
import POMCRM.CreateCRMUserUtils;
import POMCRM.DashboardCRMUtils;
import POMCRM.SubmissionSettingsUtils;
import net.bytebuddy.utility.RandomString;


public class TemplateMangementUtils extends AgencyCreationUtils {

	public static String templateManagementSideBarTab = "//label[text()='Template Management']";
	public static String textTemplatesTab = "//div[@class='tab-name ']";
	public static String createTemplateBtn = "//h2[contains(text(),'Active')]//parent::div//button";
	public static String emailTemplatesTab = "//div[@class='tab-name ']//preceding-sibling::div";
	public static String createTemplatePopupHeader = "//div[@class='modal-header']//h1"; 
	
	public static String cancelCrtTemplate = "//button[text()='Cancel']";
	public static String saveCrtTemplate="//button[text()='Save']";
	public static String templateNameTxt = "//input[@name='name']";
	public static By TemplateNameTxt = By.xpath(templateNameTxt);
	public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	public static By IncludeMagicLinkchk = By.xpath("//input[@name='MagicLinkToggle'][@type='checkbox']");
	public static By PreviewTemplateBtn = By.xpath("//button[text()='Preview']"); 
	public static By PreviewTempHeader = By.xpath("(//div[@class='modal-header'])[2]");
	public static By PreviewTemplateBdyMesg = By.xpath("(//div[@class='modal-header'])[2]//following-sibling::div//p");
	public static By ClosePreview = By.xpath("//button[text()='Close']"); 
	public static By IframeBody = By.xpath("//iframe[@id='editor_ifr']");
	
	public static By EmailTemplatesTab = By.xpath(emailTemplatesTab);
	public static By CreateTemplateBtn = By.xpath(createTemplateBtn);
	public static By TextTemplatesTab = By.xpath(textTemplatesTab);
	public static By TemplateManagementSideBarTab = By.xpath(templateManagementSideBarTab); 
	public static By CreateTemplatePopupHeader = By.xpath(createTemplatePopupHeader);
	public static By CancelCrtTemplate = By.xpath(cancelCrtTemplate);
	public static By SaveCrtTemplate = By.xpath(saveCrtTemplate);
	
	
	
	public static String nameValidMsg = "";
	public static String emailSubLineValidMsg = "";
	public static String emailBdyValidMsg = "//label[@class='html-editor__error']"; 
	public static String emailSubLineInput = "//input[@name='subject']";
	
	
	
	public static By EmailBdyValidMsg = By.xpath(emailBdyValidMsg); 
	public static By EmailSubLineInput = By.xpath(emailSubLineInput);
	
	
	
	
	
	
	
	
	// Global Variables 
	
	public static String emailTemplatesLabel ;
	public static String TextMessageTemplateLabel;
	public static String CrtTemplateHeader;
	public static Boolean ClosedCrtTemplatePopup;
	public static String ActualNameValidMsg ;
	public static String ActualEmailSubLineValidMsg ; 
	public static String ActualEmailBdyValidMsg ; 
	public static String EmailSubLnMsg ;
	public static String templateName;
	public static String rndSubLine; 
	public static String TemplateMessgae;
	public static String ActualpreviewTempData;
	public static String ExpectedpreviewTemplateData ;
	public static String ActualpreviewTempHeader;
	
	
	public static String ExpectedpreviewTemplateHeader  = "Preview Email Template";
	public static String ExpectedNameValidMsg = "The Name is required.";
	public static String ExpectedEmailSubLineValidMsg = "Min 1 and Max 150 characters limit.";
	public static String ExpectedEmailBdyValidMsg = "The Email Body is required.";  
	public static String ExpectedemailTemplatesLabel = "Email Templates" ;
	public static String ExpectedTextMessageTemplateLabel = "Text Message Templates";
	public static String ExpectedCrtTemplateHeader = "Create Template";
	
	
	
	        public static void TemplateMangement_PreRequisite() throws InterruptedException {
	        	Thread.sleep(10000);
	        	WebDriverWaits.scrolltoUp();
	        	CRMCommonMethods.NavigateTo_AgencySetup();
	        	CRMCommonMethods.NavigateTo_TemplateManagement();
	        	emailTemplatesLabel = WebDriverWaits.GetText(EmailTemplatesTab);
	        	TextMessageTemplateLabel = WebDriverWaits.GetText(TextTemplatesTab);
	        }
	 
			public static void TemplateMangement_CloseandOpenCreateTemplatePOpup() throws InterruptedException {
				Thread.sleep(3000);
				WebDriverWaits.ScrollIntoView(CreateTemplateBtn);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CreateTemplateBtn);
				Thread.sleep(2000); 
				CrtTemplateHeader = WebDriverWaits.GetText(CreateTemplatePopupHeader);
				Thread.sleep(8000);
				WebDriverWaits.ScrollIntoView(CancelCrtTemplate);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CancelCrtTemplate);
				Thread.sleep(4000);
				ClosedCrtTemplatePopup = (driver.findElements(CreateTemplatePopupHeader).size() == 0);
				Thread.sleep(2000);
			}
			
			
			
			
			public static String GetCustomXPath (int index) { 
				String xpath = "(//span[@class='field__error'])["+index+"]" ;
				return xpath;
			}
			
			public static void TemplateMangement_VerifyValidationsOnCreateTemplatePOpup() throws InterruptedException, AWTException {
				
				Thread.sleep(3000);
				WebDriverWaits.ScrollIntoView(CreateTemplateBtn);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CreateTemplateBtn);
				Thread.sleep(4000); 
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate);
				Thread.sleep(2000);
				nameValidMsg = GetCustomXPath(1);
				emailSubLineValidMsg = GetCustomXPath(3);
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(4000);
				ActualNameValidMsg = WebDriverWaits.FindElementByXPath(nameValidMsg).getText();
				Thread.sleep(1000);
				ActualEmailSubLineValidMsg = WebDriverWaits.FindElementByXPath(emailSubLineValidMsg).getText();
				WebDriverWaits.ScrollIntoView(EmailBdyValidMsg);
				Thread.sleep(3000);
				ActualEmailBdyValidMsg = WebDriverWaits.GetText(EmailBdyValidMsg);
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(EmailSubLineInput);
				String rng = RandomStrings.RequiredString(151);
				Thread.sleep(5000);
				WebDriverWaits.SendKeys(EmailSubLineInput, rng);
				Thread.sleep(5000);
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(4000);
				EmailSubLnMsg = WebDriverWaits.FindElementByXPath(emailSubLineValidMsg).getText();
				Thread.sleep(2000);
				
			}
			
			public static String AddDocument = "//label[text()='Add Related Documents']"; 
			public static String addedFiles = "//div[@class='chip__body']";
			public static By AddedFiles = By.xpath(addedFiles);
			public static int filescount ; 
			public static Boolean filesCountCheck ;
	 
			public static void TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup () throws InterruptedException, AWTException{
				
				String path1 = System.getProperty("user.dir") + "\\TestData\\Jellyfish_11zon.jpg";
				CRMCommonMethods.AddTemplateFiles(AddDocument,path1);
				Thread.sleep(2000);
				
				String path2 = System.getProperty("user.dir") + "\\TestData\\Panda_11zon.jpg";
				CRMCommonMethods.AddTemplateFiles(AddDocument,path2);
				Thread.sleep(2000); 
				filescount = driver.findElements(AddedFiles).size();
				filesCountCheck = filescount == 2;
			}
	 
			
			
			public static void TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated()throws InterruptedException ,AWTException{
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(TemplateNameTxt);
				Thread.sleep(2000);
				templateName = RandomStrings.RequiredCharacters(3) + "Template";
				WebDriverWaits.SendKeys(TemplateNameTxt, templateName);
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(EmailSubLineInput);
				rndSubLine = RandomStrings.RequiredString(3) + "EmailSubjectLine";
				Thread.sleep(5000);
				WebDriverWaits.Clear(EmailSubLineInput);
				Thread.sleep(2000);
				WebDriverWaits.SendKeys(EmailSubLineInput, rndSubLine);
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(TemplateManagementSideBarTab);
				Thread.sleep(2000);
				TemplateMessgae = RandomStrings.RequiredCharacters(10);
				ExpectedpreviewTemplateData = TemplateMessgae;
				WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeBody);
				Thread.sleep(2000);
				
				driver.switchTo().frame(switchFrame);
				WebDriverWaits.SendKeys(MessageBody, TemplateMessgae);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(IncludeMagicLinkchk);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(IncludeMagicLinkchk);
				Thread.sleep(1000);
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(PreviewTemplateBtn);
				Thread.sleep(4000);
				ActualpreviewTempHeader = WebDriverWaits.GetText(PreviewTempHeader);
				ActualpreviewTempData = WebDriverWaits.GetText(PreviewTemplateBdyMesg);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(ClosePreview);
				Thread.sleep(2000);
			}
	 
	 
	 
	 
	 

}
