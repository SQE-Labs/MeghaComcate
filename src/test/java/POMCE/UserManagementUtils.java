package POMCE;

public class UserManagementUtils {

	public static String createUserButton = "//button[text()='Create User']";
	public static String creatUserBtn = "//div[@class='action-item']//button";
	public static String createUserPopupTitle = "//h1[text()='Create User']";
	public static String firstNameField = "//input[@name='firstName']";
	public static String lastNameField = "//input[@name='lastName']";
	public static String emailField = "//input[@name='email']";
	public static String roleDropdown = "//label[text()='Role']/following::span[1]";
	public static String roleOptionselect = "//*[text()='Agency Admin CEM']";
	public static String cancelButton = "//button[text()='Cancel']";
	public static String searchField = "//input[@placeholder='Filter by name or email']";
	public static String usersCount = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String searchResultName = "//div[@class='rt-tr -odd']/div";
	public static String createUserPopupBtn = "//div[@class='user-form__header full-page-modal__header']//button[text()='Create User']";
	public static String editUserIcon = "//button[@class='edit-btn  btn btn-primary']";
	public static String editUserpopupTitle = "//h1[text()='Edit User']";
	public static String yopmailSearchUser = "//input[@class='ycptinput']";
	public static String paginationText = "//span[@class='table__pagination-of-text']";
	public static String userSearchResult = "//div[@class='rt-tr-group']";
	public static String yopmailInboxArrow = "//button[@class='md']";
	public static String rolesTab = "//div[contains(text(),'Roles')]";
	public static String createRoleButton = "//button[text()='Create Role']";
	public static String createRolePopupTitle = "//h1[text()='Create Role']";
	public static String roleNameField = "//input[@placeholder='Enter Text']";
	public static String descriptionField = "//textarea[@name='description']";
	public static String createRolePopupBtn = "//div[@class='modal-header']//following::button[text() ='Create Role']";
	public static String roleCreatedSuccessMsg = "//span[text()='Role created']";
	public static String iframeSwitch = "//iframe[@id='ifmail']";
	public static String firstMail = "//button[@class='lm']";
	public static String activateBtn = "//span[contains(text(),'Activate')]";
	public static String activateOktaBtn = "//span[text()='Activate Okta Account']";
	public static String activateOktaBtn_Stage = "//span[text()=' Activate Comcate Account ']";
	public static String newPassword = "//input[@name='newPassword']";
	public static String confirmPassword = "//input[@name='confirmPassword']";
	public static String resetPasswordBtn = "//input[@value='Reset Password']";
	public static String productSettingsToggle = "//span[@class='toggle__children']";
	public static String deleteReissueYesBtn = "//label[@title='Delete and Reissue Notice']/following::button[text()='Yes'][1]";
	public static String basicToggle = "//button[text()='Basic']";
	public static String groupsTab = "//div[contains(text(),'Groups')]";
	public static String createNewGroupBtn = "//button[text()='Create New Group']";
	public static String createGroupPopupTitle = "//h1[text()='Create Group']";
	public static String createGroupPopupBtn = "//button[text()='Create Group']";
	public static String groupName = "//input[@name='label']";
	public static String groupCreatedSuccessMsg = "//span[text()='Group created']";
	public static String nextNavigationIcon = "//div[@class='table__pagination-nav-btns']/button[2]";

}
