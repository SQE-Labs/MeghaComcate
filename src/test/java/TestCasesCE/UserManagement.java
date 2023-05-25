package TestCasesCE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.UserManagementUtils;
import junit.framework.Assert;

public class UserManagement extends CaseAssignment {

	public static By CreateUserButton = By.xpath(UserManagementUtils.createUserButton);
	public static By CreateUserbtn = By.xpath(UserManagementUtils.creatUserBtn);
	public static By CreateUserPopupTitle = By.xpath(UserManagementUtils.createUserPopupTitle);
	public static By FirstNameField = By.xpath(UserManagementUtils.firstNameField);
	public static By LastNameField = By.xpath(UserManagementUtils.lastNameField);
	public static By EmailField = By.xpath(UserManagementUtils.emailField);
	public static By RoleDropdown = By.xpath(UserManagementUtils.roleDropdown);
	public static By RoleOptionselect = By.xpath(UserManagementUtils.roleOptionselect);
	public static By CancelButton = By.xpath(UserManagementUtils.cancelButton);
	public static By SearchField = By.xpath(UserManagementUtils.searchField);
	public static By CreateUserPopupBtn = By.xpath(UserManagementUtils.createUserPopupBtn);
	public static By UsersCount = By.xpath(UserManagementUtils.usersCount);
	public static By UserSearchResult = By.xpath(UserManagementUtils.userSearchResult);
	public static By EditUserIcon = By.xpath(UserManagementUtils.editUserIcon);
	public static By EditUserpopupTitle = By.xpath(UserManagementUtils.editUserpopupTitle);
	public static By YopmailSearchUser = By.xpath(UserManagementUtils.yopmailSearchUser);
	public static By PaginationText = By.xpath(UserManagementUtils.paginationText);
	public static By SearchResultName = By.xpath(UserManagementUtils.searchResultName);
	public static By YopmailInboxArrow = By.xpath(UserManagementUtils.yopmailInboxArrow);
	public static By CreateRoleButton = By.xpath(UserManagementUtils.createRoleButton);
	public static By RolesTab = By.xpath(UserManagementUtils.rolesTab);
	public static By CreateRolePopupTitle = By.xpath(UserManagementUtils.createRolePopupTitle);
	public static By RoleNameField = By.xpath(UserManagementUtils.roleNameField);
	public static By DescriptionField = By.xpath(UserManagementUtils.descriptionField);
	public static By CreateRolePopupBtn = By.xpath(UserManagementUtils.createRolePopupBtn);
	public static By IframeSwitch = By.xpath(UserManagementUtils.iframeSwitch);
	public static By FirstMail = By.xpath(UserManagementUtils.firstMail);
	public static By ActivateBtn = By.xpath(UserManagementUtils.activateBtn);
	public static By ActivateOktaBtn = By.xpath(UserManagementUtils.activateOktaBtn);
	public static By ActivateOktaBtn_stage = By.xpath(UserManagementUtils.activateOktaBtn_Stage);

	public static By NewPassword = By.xpath(UserManagementUtils.newPassword);
	public static By ConfirmPassword = By.xpath(UserManagementUtils.confirmPassword);
	public static By ResetPasswordBtn = By.xpath(UserManagementUtils.resetPasswordBtn);
	public static By RoleCreatedSuccessMsg = By.xpath(UserManagementUtils.roleCreatedSuccessMsg);
	public static By ProductSettingsToggle = By.xpath(UserManagementUtils.productSettingsToggle);
	public static By DeleteReissueYesBtn = By.xpath(UserManagementUtils.deleteReissueYesBtn);
	public static By BasicToggle = By.xpath(UserManagementUtils.basicToggle);
	public static By GroupsTab = By.xpath(UserManagementUtils.groupsTab);
	public static By CreateNewGroupBtn = By.xpath(UserManagementUtils.createNewGroupBtn);
	public static By CreateGroupPopupTitle = By.xpath(UserManagementUtils.createGroupPopupTitle);
	public static By CreateGroupPopupBtn = By.xpath(UserManagementUtils.createGroupPopupBtn);
	public static By GroupName = By.xpath(UserManagementUtils.groupName);
	public static By GroupCreatedSuccessMsg = By.xpath(UserManagementUtils.groupCreatedSuccessMsg);
	public static By NextNavigationIcon = By.xpath(UserManagementUtils.nextNavigationIcon);

	@Test(priority = 1)
	public static void UserManagement_OpenCreateUserPopup() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_OpenCreateuserPopup ");
		extentTest.setDescription(
				" Verify that 'Create User' popup opens up, when user clicks on 'Create User' button, on 'Users' tab. ");
		//Login.LoginAgency();
		driver.navigate().to(DataInterface.URLUserManagement);
		Thread.sleep(15000);
		//WebDriverWaits.ClickOn(CreateUserButton);
		WebDriverWaits.ClickOn(CreateUserbtn);
		String PopupTitle = WebDriverWaits.GetText(CreateUserPopupTitle);
		Assert.assertEquals(PopupTitle, "Create User");
	}

	public static String RandomFirstName = RandomStrings.RequiredCharacters(6);
	public static String RandomLastName = RandomStrings.RequiredCharacters(6);

	@Test(priority = 2)
	public static void UserManagement_VerifyUserGetsCreated() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyUserGetsCreated ");
		extentTest.setDescription(
				" Verify that a User gets created when user clicks on 'Create User' button, after entering data into all mandatory fields, on 'Create User' popup. ");
		WebDriverWaits.ClickOn(CancelButton);
		Thread.sleep(2000);
		String[] CountUsers1 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersBefore = CountUsers1[0];
		int TotalUsersBefore = Integer.parseInt(UsersBefore);
		//WebDriverWaits.ClickOn(CreateUserButton);
		WebDriverWaits.ClickOn(CreateUserbtn); // open pop up
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(FirstNameField, "CE User " + RandomFirstName);
		WebDriverWaits.SendKeys(LastNameField, RandomLastName);
		String EmailRandom = RandomFirstName + RandomLastName + "@yopmail.com";
		WebDriverWaits.SendKeys(EmailField, EmailRandom);
		WebDriverWaits.ClickOn(RoleDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(RoleOptionselect);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateUserPopupBtn);
		Thread.sleep(25000);
		WebDriverWaits.ScrollIntoView(UsersCount);
		Thread.sleep(3000);
		String[] CountUsers2 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersAfter = CountUsers2[0];
		int TotalUsersAfter = Integer.parseInt(UsersAfter);
		boolean CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
		Assert.assertEquals(CompareCount, true);
	}

	@Test(priority = 3)
	public static void UserManagement_VerifySearchUser() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifySearchUser ");
		extentTest.setDescription(
				" Verify that user is able to search a User from 'Filter by name or email' search field, on 'Users' tab. ");
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(SearchField, RandomFirstName);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(SearchField, RandomLastName);
		Thread.sleep(2000);
		List<WebElement> SearchResults = driver.findElements(UserSearchResult);
		boolean ResultsCount = SearchResults.size() >= 1;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ResultsCount, true);
		soft.assertAll();
		Thread.sleep(2000);
		String ResultName = WebDriverWaits.GetText(SearchResultName);
		System.out.println(ResultName);
		String ResultNameExpected = "CE User " + RandomFirstName + " " + RandomLastName;
		System.out.println(ResultNameExpected);
		Assert.assertEquals(ResultName, ResultNameExpected);
	}

	@Test(priority = 4,enabled = true)
	public static void UserManagement_OpenEditUserPopup() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_OpenEditUserPopup ");
		extentTest.setDescription(
				" Verify that 'Edit User' popup opens up, when user clicks on 'Edit' icon for a user, on 'Users' tab. ");
//		Thread.sleep(6000);
//		WebDriverWaits.ClickOn(NextNavigationIcon);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(EditUserIcon);
		String PopupTitle = WebDriverWaits.GetText(EditUserpopupTitle);
		Assert.assertEquals(PopupTitle, "Edit User");
	}

	@Test(priority = 5,enabled = true)
	public static void UserManagement_VerifyUpdatedUserDetails() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyUpdatedUserDetails ");
		extentTest.setDescription(" Verify that user is able to edit & save the added user, on 'Users' tab. ");
		Thread.sleep(2000);
		WebElement FirstNameFld = WebDriverWaits.WaitUntilVisibleWE(FirstNameField);
		FirstNameFld.clear();
		WebDriverWaits.SendKeys(FirstNameField, "Edited User");
		String RandomStr01 = RandomStrings.RequiredCharacters(8);
		WebElement LastNameFld = WebDriverWaits.WaitUntilVisibleWE(LastNameField);
		Thread.sleep(2000);
		LastNameFld.clear();
		WebDriverWaits.SendKeys(LastNameField, RandomStr01);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(4000);
		WebElement SearchFld = WebDriverWaits.WaitUntilVisibleWE(SearchField);
		Thread.sleep(2000);
		SearchFld.clear();
		WebDriverWaits.SendKeys(SearchField, "Edited User ");
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(SearchField, RandomStr01);
		Thread.sleep(20000);
		List<WebElement> SearchResults = driver.findElements(UserSearchResult);
		boolean ResultsCount = SearchResults.size() >= 1;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ResultsCount, true);
		soft.assertAll();
		Thread.sleep(5000);
		String ResultName = WebDriverWaits.GetText(SearchResultName);
		String ResultNameExpected = "Edited User" + " " + RandomStr01;
		Assert.assertEquals(ResultName, ResultNameExpected);
	}

	@Test(priority = 6)
	public static void UserManagement_VerifyResetMailReceived() throws AWTException, InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyResetMailReceived ");
		extentTest.setDescription(
				" Verify that user receives a mail to reset password, after clicking on the 'Send Reset Password Link' link, on 'Edit User' popup. ");
		driver.navigate().to(DataInterface.URLUserManagement);
		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.navigate().to("https://yopmail.com/en/");
		Thread.sleep(3000);
		WebDriverWaits.SendKeys(YopmailSearchUser, (RandomFirstName + RandomLastName));
		WebDriverWaits.ClickOn(YopmailInboxArrow);
		Thread.sleep(3000);
		WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeSwitch);
		Thread.sleep(2000);
		driver.switchTo().frame(switchFrame);
		Thread.sleep(2000);
		String AOB = WebDriverWaits.GetText(ActivateBtn);
		if(DataInterface.RunEnvironment.equalsIgnoreCase("QA"))
			Assert.assertEquals(AOB.trim(), "Activate Okta Account");
		else
			Assert.assertEquals(AOB.trim(), "Activate Comcate Account");

	}

	@Test(priority = 7)
	public static void UserManagement_ResetPasswordForUser() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_ResetPasswordForUser ");
		extentTest.setDescription(" Verify that user is able to reset the password for a user. ");
		Thread.sleep(3000);
		if(DataInterface.RunEnvironment.equalsIgnoreCase("QA"))
			WebDriverWaits.ClickOn(ActivateOktaBtn);
		else
			WebDriverWaits.ClickOn(ActivateOktaBtn_stage);

		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs2.get(2));
		Thread.sleep(4000);
		WebDriverWaits.SendKeys(NewPassword, "Hello@123");
		WebDriverWaits.SendKeys(ConfirmPassword, "Hello@123");
		WebDriverWaits.ClickOn(ResetPasswordBtn);
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs2.get(0));
//		driver.switchTo().window((currentWindow));
	}

	@Test(priority = 8)
	public static void UserManagement_VerifyCountOfUsers() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyCountOfUsers ");
		extentTest.setDescription(" Verify that accurate count of users appear under the 'Users' tab. ");
		driver.navigate().refresh();
		Thread.sleep(8000);
		String[] CountUsers = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersCount = CountUsers[0];
		int TotalUsers = Integer.parseInt(UsersCount);
		String[] Pagination = WebDriverWaits.GetText(PaginationText).split(" ");
		String PaginationCount = Pagination[1];
		int PgCount = Integer.parseInt(PaginationCount);

		int UsersCount1 = (PgCount - 1) * 10;
		for (int i = 0; i < PgCount - 1; i++) {
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(NextPagination);
			Thread.sleep(5000);
		}
		Thread.sleep(10000);
		List<WebElement> countLastUsersElements = WebDriverWaits.WaitUntilVisibleList(UserSearchResult);
		int SizeOfUsers = countLastUsersElements.size();
		int FinalCountUsers = UsersCount1 + SizeOfUsers;
		Assert.assertEquals(FinalCountUsers, TotalUsers);
	}

	@Test(priority = 9)
	public static void UserManagement_OpenCreateRolePopup() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_OpenCreateRolePopup ");
		extentTest.setDescription(
				" Verify that 'Create Role' popup opens up, when user clicks on 'Create Role' button, on 'User Management' page. ");
		Thread.sleep(20000);
		WebDriverWaits.ScrollIntoView(RolesTab);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(RolesTab);
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(CreateRoleButton);
		String PopupTitle = WebDriverWaits.GetText(CreateRolePopupTitle);
		Assert.assertEquals(PopupTitle, "Create Role");
	}

	@Test(priority = 10)
	public static void UserManagement_VerifyRoleCreationWithoutProdSettings() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyRoleCreationWithoutProdSettings ");
		extentTest.setDescription(
				" Verify that user is able to create Roles under 'Roles' tab without Product Settings. ");
		String RandomRoleName = RandomStrings.RequiredCharacters(8);
		Thread.sleep(6000);
		WebDriverWaits.SendKeys(RoleNameField, RandomRoleName);
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(DescriptionField, RandomDescription);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateRolePopupBtn);
		String SuccessMsg = WebDriverWaits.GetText(RoleCreatedSuccessMsg);
		Assert.assertEquals(SuccessMsg, "Role created");
	}

	@Test(priority = 11)
	public static void UserManagement_VerifyRoleCreationWithProdSettings() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyRoleCreationWithProdSettings ");
		extentTest
				.setDescription(" Verify that user is able to create Roles under 'Roles' tab with Product Settings. ");
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CreateRoleButton);
		String RandomRoleName = RandomStrings.RequiredCharacters(8);
		Thread.sleep(4000);
		WebDriverWaits.SendKeys(RoleNameField, RandomRoleName);
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(DescriptionField, RandomDescription);
		WebDriverWaits.ClickOn(ProductSettingsToggle);
		WebDriverWaits.ClickOn(DeleteReissueYesBtn);
		WebDriverWaits.ClickOn(BasicToggle);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateRolePopupBtn);
		Thread.sleep(500);
		String SuccessMsg = WebDriverWaits.GetText(RoleCreatedSuccessMsg);
		Assert.assertEquals(SuccessMsg, "Role created");
	}

	@Test(priority = 12)
	public static void UserManagement_OpenCreateGroupPopup() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_OpenCreateGroupPopup ");
		extentTest.setDescription(
				" Verify that 'Create Group' popup opens up, when user clicks on 'Create Group' button, on 'User Management' page. ");
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(GroupsTab);
		Thread.sleep(2000);
		WebDriverWaits.ScrollIntoView(CreateNewGroupBtn);
		WebDriverWaits.ClickOn(CreateNewGroupBtn);

		String PopupTitle = WebDriverWaits.GetText(CreateGroupPopupTitle);
		Assert.assertEquals(PopupTitle, "Create Group");
	}

	@Test(priority = 13)
	public static void UserManagement_VerifyGroupCreationWithoutProdSettings() throws InterruptedException {
		extentTest = extent.startTest(" UserManagement_VerifyGroupCreationWithoutProdSettings ");
		extentTest.setDescription(
				" Verify that user is able to create Groups under 'Groups' tab without Product Settings. ");
		String RandomGrpName = RandomStrings.RequiredCharacters(8);
		Thread.sleep(4000);
		WebDriverWaits.SendKeys(GroupName, RandomGrpName);
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(DescriptionField, RandomDescription);
		Thread.sleep(2000);

		WebDriverWaits.ClickOn(CreateGroupPopupBtn);
		String SuccessMsg = WebDriverWaits.GetText(GroupCreatedSuccessMsg);
		Assert.assertEquals(SuccessMsg, "Group created");
	}

}
