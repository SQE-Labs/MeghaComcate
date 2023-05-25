package POMCE;

import org.openqa.selenium.By;

public class FAUtils {

	public static String moreBtn = "//button[contains(text(),'More...')]";
	public static String initiateFABtn = "//li[text()='Initiate Forced Abatement']";
	public static String popupTitleFA = "//div[text()='Initiate Forced Abatement']";
	public static String iFAPopupBtn = "//div[@class='modal-footer']//button[2]";
	public static String errorMsgNote = "(//span[@class='field__error'])[2]";
	public static String noteField = "//textarea[@placeholder='Enter Note']";
	public static String errorNoteLimit = "//span[text()='500 character limit.']";
	public static String forcedBadge = "//span[text()='Forced']";
	public static String abatementInfo = "//div[@class='abatement-activities__fa-details']//h4";
	public static String editFANoteLink = "//label[@class='fa-note__label']/a[text()='Edit']";
	public static String editNotePopup = "//div[text()='Edit FA Note']";
	public static String saveBtn = "//button[text()='Save']";
	public static String editedNote = "//label[@class='fa-note__label']/following::p";
	public static String addActivityBtn = "//button[text()='Add Activity']";
	public static String addAttachment = "(//div[contains(text(),'Attachments')]//parent::h2//div//button)";
	public static String activityType2 = "(//div[@class='multi-choice-buttons']//button)[2]";
	public static String activityType3 = "(//div[@class='multi-choice-buttons']//button)[3]";
	public static String fAActivityPopup = "//div[text()='Add Forced Abatement Activity']";
	public static String fAactivityPopup = "//h1[text()='Add Forced Abatement Activity']";
	
	public static String fAToggleBtn = "//div[@class='multi-choice-buttons']/button[1]";//
	public static String fAActivityBtn = "//button[text()='Add Forced Abatement Activity']";
	public static String selectDocument = "//label[text()='Select Document']/following::div[1]//div";
	public static String selectHTML = "//div[text()='HTML FA Document']";
	public static String errorMsgFA1 = "(//span[@class='field__error'])[4]";
	public static String errorMsgFA2 = "(//span[@class='field__error'])[4]";
	public static String docNoteTitle = "//label[text()='Document Note']";
	public static String validMsgDocNote = "//label[@title='Document Note']/following::span";
	public static String labelForText1 = "//input[@placeholder='Enter Text']";
	public static String labelForNumber2 = "//input[@placeholder='Enter Number']";
	public static String labelForSelect3 = "//div[@class='Select-placeholder']";
	public static String documentNoteField = "//textarea[@placeholder='Enter Note']";
	//public static String documenttNoteFAADet = "//textarea[@name='documentNote']";
	public static String firstOption = "//div[text()='Yes']";
	public static String generateDocBtn = "//button[text()='Generate Document']";
	public static String continueToGenDoc = "//button[text()='Continue to Generate Document']";
	public static String selectFAADocArrow = "//label[text()='More...']//following-sibling::span";
	public static String selectFAADoc =
			"(//label[@title='Select an FAA Document']//ancestor::div[@class='abatement-activities__documents']//div[@class='dropdown__list']//ul//li[@class='option']/span)[1]";
	public static String genFAADoc = "//button[text()='Generate FAA Document']";
	public static String generateDocAddFABtn = "//div[@class='case-inspection__notice-action-buttons']/button[2]";
	public static String addedActivity = "//div[@class='abatement-activities__fa-activity__header']";
	public static String editActivityIcon = "//div[@class='abatement-activities__fa-activity__actions']/button[1]";
	public static String editActivityPopup = "(//div[@class='modal-header'])[2]";
	public static String editFAAPopup = "(//div[@class='modal-header'])[2]//div[@class='abatement-activities__title-text']//h1";
	public static String cancelBtnEditFA = "//div[@class='certified-mail-number__footer']/button[1]";
	public static String saveBtnEditFA = "//div[@class='certified-mail-number__footer']/button[2]";
	public static String editedLabelText1 = "(//label[@class='field__value'])[2]";
	public static String deleteActivityIcon = "//div[@class='abatement-activities__fa-activity__actions']/button[2]";
	public static String generateDocumentBtn = "//button[text()='Generate Document']";
	public static String editSaveFAA = "//button[text()='Save']";
	
	
	public static String violationLable = "//span[@class='violation-label']";
	public static String contactfirst = "(//div[@class='contact__name-role']//b)[1]";
	public static String contact2 = "(//div[@class='contact__name-role']//b)[2]"; 
	public static String fAAAttachement = "(//label[@class='attachments-tile__photo-name'])[3]";
	
	
	public static String selectImgFAA1 = "(//div[@class='tick--not-selected']//following-sibling::img)[1]";
	public static String selectImgFAA2 = "(//div[@class='tick--not-selected']//following-sibling::img)[2]";
	public static String selectedImagFAA1 = "(//div[@class='tick--selected']//following-sibling::img)[1]//parent::div//div//a";
	public static String selectedImahFAA2 = "(//div[@class='tick--selected']//following-sibling::img)[2]//parent::div//div//a";
	public static String printPreviewFrame = "editor_ifr";
	public static String imagedetTabTitle1 = "(//tbody//td//p)[2]"; 
	public static String imagedetTabTitle2 = "(//tbody//td//p)[6]";
	public static String donotPrint = "//button[text()='Do Not Print']";
	
	public static String exitAddActivity = "//button[text()='Exit']";
	public static String exitConfirmYesBtn = "//button[text()='Yes']"; 
	public static String addContactCDP = "//label[text()='Add contact']//parent::div//input";
	public static String crtNewContactCDP = "//span[text()='Create a  new contact']";
	public static String contactName = "//input[@name='name']";
	
	public static String createAnywayContact = "//button[text()='Create Anyway']";
	public static String billtoContact2 = "(//input[@name='billableContact'])[2]";
	public static String billtoContact3 = "(//input[@name='billableContact'])[3]";
	
	
	public static String photoSection = "//div[@class='case__attachment__title']//h5"; 
	public static String selectAllCheckBox = "//input[@name='selectAll'][@type='checkbox']"; 
	public static String photosAttached = "//div[@class='case__attachment']//a[@class='attachments-tile__photo-title']";
	
	public static String viewphotos= "//a[@class='view-photos']";
	
    public static String photoDetailsHeader = "(//div[@class='modal-header'])[3]"; 
    public static String closeBtn = "//button[text()='Close']"; 
    public static String chooseFAHtmlDoc = "//div[@class='multi-choice-buttons']//button[text()='HTML FA Document']";
	public static String activityProgress = "//h2[text()='Abatement Activity']//parent::div//label";
	public static String abatementDetailsPopup = "//div[text()='2']//following-sibling::h2";
	public static String progressDetails ="//div[text()='2']//following-sibling::label";
	public static String abatementActivitySec = "//h2[text()='Abatement Activity']";
	
	public static String fineSection = "//div[@class='tile fine-section']//h5"; 
	public static String violationFileSec = "(//div[@class=''])[7]"; 
	public static String issueFAADate = "//label[@title='FAA Document Issue Date']"; 
	public static String fAAcontact1 = "(//div[text()='Recipients']//parent::div//span[@class='contact-name'])[1]";
	public static String fAAcontact2 = "(//div[text()='Recipients']//parent::div//span[@class='contact-name'])[2]";
	
	public static String fAAResPosiblecontact1 = "(//div[text()='Responsible Party']//parent::div//span[@class='contact-name'])[1]";
	public static String fAAResPosiblecontact2 = "(//div[text()='Responsible Party']//parent::div//span[@class='contact-name'])[2]";	
	public static String fAASelectfaaDoc = "//label[@title='Select an FAA Document']";
	public static String selectedcontact1 = "(//input[@name='billableContact'])[2]//ancestor::div[@class='contact__bill-to-contact']//preceding-sibling::div[@class='contact__name']";
	public static String selectedcontact2 = "(//input[@name='billableContact'])[3]//ancestor::div[@class='contact__bill-to-contact']//preceding-sibling::div[@class='contact__name']";
	
	public static String fAADonotIsuueFine = "//input[@name='isFineIssued'][@type='checkbox']"; 
	public static String fAAAddAnotherFine = "//span[@class='fine-section__fine-add-icon']//parent::a"; 
	
}