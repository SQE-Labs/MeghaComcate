package POMCE;

public class CCPUtils {

	// Select Location Tile
	public static String cEOption = "//label[text()='Code Enforcement Case']";
	public static String CCPOption = "//label[text()='Code Enforcement Case']";
	public static String CreateCaseButton = "//div/button[text()='Create Case']";
	public static String AssignCaseTo = "//h5[text()='Assign Case To']//parent::div//button";
	public static String InspectionAssigneeTo = "//h5[text()='Assign Inspection To']//parent::div//button";
	public static String CreateScheduleInspectionButton = "//div[@class='modal-footer']//button[2]";
	public static String AddButton = "//div[@class='attachments-modal__footer']/button[2]";
	public static String addAttachmenttop = "//p[text()='Attachments']//preceding-sibling::button";
	public static String addAttachmentCCP = "//span[contains(text(),'Attachments')]//following-sibling::button";
	public static String addAttachmentbottom= "(//span[contains(text(),'Attachments')]//parent::h2//div//button)[2]";
	public static String LocationSearchField = "//div[@class='location-tile__inputs-container']//input";
	public static String LocationSearchResult = "//li[@id='react-autowhatever-1-section-0-item-0']";
	public static String cRMOption = "//label[text()='Customer submission']";
	public static String cCPTitle = "//h1[text()='Create A Case']";
	public static String plusIconToCECRM = "//*[@class='app-header__new']";
	public static String globalValidMsg = "//div[@class='create-case__global-error']";
	public static String infoMsg = "//div[@class='location-tile__display-data-empty-message tile-empty-msg']";
	public static String CCbutton = "//div/button[text()='Create Case']";
	public static String Location = "//div[@class='location-tile__inputs-container']//input";
	public static String Map = "//li[@id='react-autowhatever-1-section-0-item-0']";
	public static String MapGis2 = "//div[@class='react-autosuggest-sections']//li//b";
	public static String EditLocation = "//div[@class='edit-address__actions']/button";
	public static String editStreetAddress = "//input[@name='streetAddress']";
	public static String editCity = "//input[@name='city']";
	public static String editZip = "//input[@name='zip']";
	public static String saveButton = "//div[@class='edit-address__header']/child::div/button[2]";
	public static String cancelButton = "//div[@class='edit-address__header']/child::div/button[1]";
	public static String toggleChecked = "//div[@class='react-toggle react-toggle--checked bs-toggle danger']";
	public static String addLocManually = "//div[@class='react-autosuggest__function']";
	public static String streetAdd = "//div[@class='manual-address-modal__body']//input[@name='streetAddress']";
	public static String cityAdd = "//div[@class='manual-address-modal__body']//input[@name='city']";
	public static String zipAdd = "//div[@class='manual-address-modal__body']//input[@name='zip']";
	public static String saveButton2 = "//div[@class='manual-address-modal__footer']/button[2]";
	public static String manualLocPopup = "(//div[@class='modal-header'])[2]";
	public static String validationMsg3 = "//span[text()='The Address is required.']";
	public static String apnAdd = "//div/input[@name='apn']";
	public static String outAgencyMsg = "//div[@class='location-tile__map']/following::div[1]/span";
	public static String flagToggle = "(//div[@class='react-toggle-thumb'])[1]";
	public static String cancelBtnLoc = "//div[@class='manual-address-modal__footer']/button[1]";
	public static String streetLabel = "(//label[@class='field__label-data-field'])[1]";
	public static String cityLabel = "(//label[@class='field__label-data-field'])[2]";
	public static String zipLabel = "(//label[@class='field__label-data-field'])[4]";
	public static String zipLabel20 = "(//label[@class='field__label-data-field'])[5]";
	public static String popupTitle = "(//div[@class='modal-header'])[2]";
	public static String reasonToFlag = "//textarea[@name='reasonForFlagging']";
	public static String flagAddressBtn = "//button[text()='Flag address']";
	public static String crossIconFlag = "(//button[@class='square-btn btn btn-default'])[2]";
	public static String flaggedLabel = "(//label[@class='field__label-data-field field__label-data-field--toggle'])[1]";

	// Add Violations Tile
	public static String violationsTile = "//div[@id='violation-tile']//h2/span";
	public static String violationSearchBox = "//div/input[@placeholder=\"Start typing name of violation, article number or issue description\"]";
	public static String violationList = "//div[@class=\"react-autosuggest__suggestion-element\"]/div";
	public static String violationList20 = "//div[@class='icon-chooser']//preceding-sibling::div";
	public static String violationPopup = "(//div[@class='modal-header'])[2]";
	public static String entityField1 = "//div/input[@name='Animal Colour']";
	public static String addButton = "//button[text()='Add']";
	public static String validationMsg2 = "//p[@class='tile--error-msg']";
	public static String infoMsg2 = "//div[@class='tile-empty-msg' and text()='You have not added any violations or issues yet.']";
	public static String customIssue = "(//div[@class='react-autosuggest__function'])[2]";
	public static String infoMsgNoSearch = "//div[@class='react-autosuggest__empty-message']";
	public static String customIssueIcon = "(//div/i[@class='react-autosuggest__add-icon'])[2]";
	public static String customIssueFeild = "//label[@class='field__label-label']";
	public static String customIssueDesc = "//textarea[@name='issueDescription']/parent::div";
	public static String validMsgCustom = "//span[@class='field__error']";
	public static String waterViolation = "//label[@class='violation-tile__item-info-name']";
	public static String validMsgVioPopup = "//div[@class='entity-modal__edit-error entity-modal__edit-error--show']";
	public static String crossIconVio = "//div[@class='violation-tile__item-info']/following::button[1]";
	public static String editIconVio = "(//button[@class='edit-btn  btn btn-primary'])[2]";
	public static String uploadLink = "//label[@class='file-upload__label']";
	public static String uploadLink2 = "//div[@class='file-upload__actions']//label[text()='Replace']";
	public static String uploadedImg = "//div[@class='file-upload']/div/img";
	public static String customIssueDlt = "//div[@id='violation-tile']/div[2]/div/div[2]/button";
	public static String dltUploadedImg = "//div[@class='file-upload__actions']/button";
	public static String entityAddBtn = "//div[@class='entity-modal__footer']/button[2]";
	public static String entityCancelBtn = "//div[@class='entity-modal__footer']/button[1]";
	public static String uploadedImgThumb = "//div[@class='entity-display-wrapper']/img";
	public static String closePopup = "//button[text()='Close']";
	public static String entitySearchBox = "//div[@class='searchbox-container']//input";
	public static String entitySearchList = "//div[@class='list-label']";
	public static String entitySeachListCss = "ul li div.list-label";
	public static String entitySearchListB= "//div[@class='list-label']//b";
	public static String entitySearchList20 = "//ul[@class='react-autosuggest__suggestions-list']//div[@class='list-label']";
	public static String addedVioList = "//label[@class='violation-tile__entity-info-label']";
	public static String addAnotherVio = "//div[@class='violation-tile__entity-disclaimer']/a";
	public static String countViolations = "//div[@id='violation-tile']/div/div/h2/span";
	public static String countEachVio = "//div[@id='violation-tile']/div/div/h2/a[1]";
	public static String addedImgThumb = "//div[@class='file-upload']//img";

	// Contacts Tile
	public static String addContactFld = "//div[@class='contact-tile tile']//input";
	public static String crtNewContact = "//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']";
	public static String contactPopup = "//div[@class='full-page-modal__header']/h1[text()='Create a Contact']";
	public static String crtContactBtn = "(//div[@class='full-page-modal__header']//button[2])[2]";
	public static String contactErrMsg = "(//span[@class='field__error'])[1]";
	public static String nameField = "//input[@name='name']";
	public static String ViolationsList = "//div[@class='react-autosuggest__suggestion-element']/div";
	
	public static String AddContactField = "//div[@class='contact-tile tile']//input";
	public static String CreateNewContact = 
			"//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']";
	
	public static String CreateContactBtn = "(//div[@class='full-page-modal__header']//button[2])[2]";
	public static String CreateContactBtn2 = "(//div[@class='full-page-modal__header']//button[2])";
	public static String countContact = "//div[@class='contact flex-row--center']";
	public static String cancelContactBtn = "(//div[@class='full-page-modal__header']//button)[3]";
	public static String editContact = "//div[@class='contact__actions']/button[1]";
	public static String editContactPopup = "//div[@class='full-page-modal__header']/h1[text()='Edit Contact']";
	public static String cancelEditPopup = "(//div[@class='full-page-modal__header']//button)[3]";
	public static String deleteContact = "//div[@class='contact__actions']/button[2]";
	public static String countContactTile = "//div[@class='contact-tile tile']//h2";
	public static String createAnyway = "//div[@class='duplicate-contacts__footer']/button[2]";
	public static String propertyOwnerOption = "//span/label[text()='Property Owner']";
	public static String applyButton = "//button[text()='Apply']";
	public static String emailField = "//input[@name='email']";
	public static String workPhoneField = "//input[@name='workPhone']";
	
	// Attachments Tile
	public static String imageIcon = "//span[text()='Attachments ']/following-sibling::button";
	public static String attachmentTitle = "//div[@class='modal-header' and text()='Add Attachments']";
	public static String cameraButton = "//label[@class='content-placeholder']";
	public static String addButton2 = "//div[@class='attachments-modal__footer']/button[2]";
	public static String imgThumb = "//img[@class='attachments-modal__saved-thumb']";
	public static String crossIcon2 = "(//button[@class='close'])[2]";
	public static String yesCloseBtn = "//div[@class='attachments-modal__footer']/button[1]";
	public static String dontCloseBtn = "//div[@class='attachments-modal__footer']/button[2]";
	public static String imgThumb2 = "//img[@class='attachments-tile__saved-thumb']";
	public static String closeAttachmentTitle = "//div[@class='modal-header' and text()='Close Add Attachments']";
	public static String attachmentDetailsTitle = "//div[@class='modal-header' and text()='Attachments Details']";
	public static String modalHeaders = "//div[@class='modal-header']";
	public static String addedImage = "//div[@class='attachments-tile__photo-container']/img";
	public static String description = "//input[@name='description']";
	public static String cancelBtnAttachDet = "//div[@class='attachments-edit__footer']/button[1]";
	public static String updateBtn = "//div[@class='attachments-edit__footer']/button[2]";
	public static String crossIcon = "//button[@class='delete-btn  btn btn-default']";
	public static String countAttachment = "//div[@class='attachment-tile tile']//h2/span";
	public static String deleteAttach = "//div[@class='attachments-edit__carousel']//button";
	public static String yesDelete = "//div[@class='flex-row--middle']/button[2]";

	public static String toasterMSGAttachment = "//div[text()='One/more files with unsupported format is/are discarded.']";
	public static String toasterMSGSize = "//div[text()='File size cannot exceed 15MB']";
	public static String uploadedImgTitle = "//div[@class='attachments-modal__saved-title']/span/b";
	public static String uploadedImgName = "//input[@name='title']";
	public static String uploadedImgLoc = "//input[@name='location']";
	public static String imgTitleonCCP = "//a[@class='attachments-tile__photo-title']";
	public static String imgDesconCCP = "//span[@class='clipped-text']";
	public static String imgLoconCCP = "//label[@class='attachments-tile__photo-location']";

	// Create Case
	public static String createCasePop = "//div[@class='modal-header' and text()='Create Case']";
	public static String checkboxPerIns = "//label[@for='PERFORM_INSPECTION']";
	public static String checkboxSchIns = "//label[@for='SCHEDULE_INSPECTION']";
	public static String crtSchInsButton = "//div[@class='modal-footer']//button[2]";
	public static String nextInsSec = "//div[@class='inspection-details']";
	public static String caseStatus = "//h2[@class='case-details__case-status']";
	public static String totalContactsCDP = "//div[@class='contact flex-row--center']";
	public static String totalViolationsCDP = "//div[@class='case-violation-list']";
	public static String totalAttachmentsCDP = "//img[@class='attachments-tile__saved-thumb']";
	public static String caseTilesCDP = "//div[@class='tile-header']//h2";

}