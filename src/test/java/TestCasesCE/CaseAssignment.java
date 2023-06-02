package TestCasesCE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCE.CaseAssignmentUtils;
import junit.framework.Assert;

public class CaseAssignment extends Dashboard {

    public static By EditAssignmentIcon = By.xpath(CaseAssignmentUtils.editAssignmentIcon);
    public static By EditAssignmentPopup = By.xpath(CaseAssignmentUtils.editAssignmentPopup);
    public static By NameField = By.xpath(CaseAssignmentUtils.nameField);
    public static By DescriptionField = By.xpath(CaseAssignmentUtils.descriptionField);
    public static By ActionDropdown = By.xpath(CaseAssignmentUtils.actionDropdown);
    public static By OptionActionDropdown = By.xpath(CaseAssignmentUtils.optionActionDropdown);
    public static By CrossIconRuleSet = By.xpath(CaseAssignmentUtils.crossIconRuleSet);
    public static By SaveButton = By.xpath(CaseAssignmentUtils.saveButton);
    public static By ValidationNoRule = By.xpath(CaseAssignmentUtils.validationNoRule);
    public static By AddRuleButton = By.xpath(CaseAssignmentUtils.addRuleButton);
    public static By CreateRule = By.xpath(CaseAssignmentUtils.createRule);
    public static By CriteriaFields = By.xpath(CaseAssignmentUtils.criteriaFields);
    public static By ZipOption = By.xpath(CaseAssignmentUtils.zipOption);
    public static By EqualsOption = By.xpath(CaseAssignmentUtils.equalsOption);
    public static By ValueField = By.xpath(CaseAssignmentUtils.valueField);
    public static By AddCriteriaLink = By.xpath(CaseAssignmentUtils.addCriteriaLink);
    public static By EqualsOption2 = By.xpath(CaseAssignmentUtils.equalsOption2);
    public static By CaseAssigneeField = By.xpath(CaseAssignmentUtils.caseAssigneeField);
    public static By InspectionAssigneeField = By.xpath(CaseAssignmentUtils.inspectionAssigneeField);
    public static By UserOptionCA = By.xpath(CaseAssignmentUtils.userOptionCA);
    public static By UserOptionIA = By.xpath(CaseAssignmentUtils.userOptionIA);
    public static By CreateRulebutton = By.xpath(CaseAssignmentUtils.createRulebutton);
    public static By AddedRule = By.xpath(CaseAssignmentUtils.addedRule);
    public static By EditRuleIcon = By.xpath(CaseAssignmentUtils.editRuleIcon);
    public static By UserOptionCA2 = By.xpath(CaseAssignmentUtils.userOptionCA2);
    public static By SaveButtonEditRule = By.xpath(CaseAssignmentUtils.saveButtonEditRule);
    public static By AssignCaseToColumn = By.xpath(CaseAssignmentUtils.assignCaseToColumn);
    public static By DeleteRuleIcon = By.xpath(CaseAssignmentUtils.deleteRuleIcon);
    public static By InactiveToggle = By.xpath(CaseAssignmentUtils.inactiveToggle);
    public static By BlockOption = By.xpath(CaseAssignmentUtils.blockOption);
    public static By ValueField2 = By.xpath(CaseAssignmentUtils.valueField2);
    public static By ActiveToggle = By.xpath(CaseAssignmentUtils.activeToggle);

    @Test(priority = 1)
    public static void CaseAssignment_OpenEditAssignmentPopup() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_OpenEditAssignmentPopup ");
        extentTest.setDescription(" Verify that 'Edit Assignment' popup opens up after clicking the 'Edit' icon next to 'Case Assignment' rule on the 'Assignment Rules' page. ");
        driver.navigate().to(DataInterface.URLAssignmentRules);
//        Thread.sleep(4000);
        WebDriverWaits.WaitForElementInteractable(EditAssignmentIcon);
        WebDriverWaits.ClickOn(EditAssignmentIcon);
        String PopupTitle = WebDriverWaits.GetText(EditAssignmentPopup);
        Assert.assertEquals(PopupTitle, "Edit Assignment");
    }

    @Test(priority = 2)
    public static void CaseAssignment_EditFieldsOnEditAssignmentPopup() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_EditFieldsOnEditAssignmentPopup ");
        extentTest.setDescription(" Verify that user is able to update the 'Name', 'Action' & 'Status' fields on the 'Edit Assignment' popup ");
        String RandomName = RandomStrings.RequiredString(10);
        Thread.sleep(1000);
        WebElement Name = WebDriverWaits.WaitUntilVisibleWE(NameField);
        Thread.sleep(1000);
        Name.clear();
        Name.sendKeys(RandomName);
        String NameValue = WebDriverWaits.WaitUntilVisibleWE(NameField).getAttribute("value");
        Assert.assertEquals(NameValue, RandomName);
    }

    @Test(priority = 3)
    public static void CaseAssignment_NotAbleToUpdateWithoutRule() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_NotAbleToUpdateWithoutRule ");
        extentTest.setDescription(" Verify that user is not able to save the changes, when no Rule is added under 'Rules Set' tile, on 'Edit Assignment' popup. ");
        WebDriverWaits.ScrollIntoView(CrossIconRuleSet);
        //Thread.sleep(2000);
        WebDriverWaits.WaitforCustometime(2);
        List<WebElement> CrossIcon = driver.findElements(CrossIconRuleSet);

        int CountCrossIcons = CrossIcon.size();
        while (CountCrossIcons > 0) {
            WebDriverWaits.WaitForElementInteractable(CrossIconRuleSet);
            driver.findElement(CrossIconRuleSet).click();
//            Thread.sleep(2000);
            WebDriverWaits.WaitforCustometime(2);
            CountCrossIcons--;
        }


        WebDriverWaits.ClickOn(SaveButton);
        String NoRuleValidation = WebDriverWaits.GetText(ValidationNoRule);
        String ExpectedValidation = "At least one rule should be present.";
        Assert.assertEquals(NoRuleValidation, ExpectedValidation);
    }

    @Test(priority = 4)
    public static void CaseAssignment_OpenCreateRulepopup() {
        extentTest = extent.startTest(" CaseAssignment_OpenCreateRulepopup ");
        extentTest.setDescription(" Verify that 'Create Rule' popup opens up, when user clicks the 'Add Rule' button, on 'Edit Assignment' popup. ");
        WebDriverWaits.ClickOn(AddRuleButton);
        String PopupTitle = WebDriverWaits.GetText(CreateRule);
        Assert.assertEquals(PopupTitle, "Create Rule");
    }

    @Test(priority = 5)
    public static void CaseAssignment_CreateRuleWithMultipleCriterias() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_CreateRuleWithMultipleCriterias ");
        extentTest.setDescription(" Verify that the created rule with one or multiple criterias, gets added under 'Rules Set' tile, on 'Edit Assignment' popup. ");

        WebDriverWaits.ClickOn(CriteriaFields);
//            Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(ZipOption);
        WebDriverWaits.ClickOn(ZipOption);
        WebDriverWaits.ClickOn(CriteriaFields);
        // Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(EqualsOption);
        WebDriverWaits.ClickOn(EqualsOption);
//            Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(ValueField);
        WebDriverWaits.SendKeys(ValueField, "77590");
        WebDriverWaits.ClickOn(AddCriteriaLink);
        WebDriverWaits.ClickOn(CriteriaFields);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(BlockOption);
        WebDriverWaits.ClickOn(BlockOption);
        WebDriverWaits.ClickOn(CriteriaFields);
        // Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(EqualsOption2);
        WebDriverWaits.ClickOn(EqualsOption2);
        // Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(ValueField2);
        WebDriverWaits.SendKeys(ValueField2, "1");
        WebDriverWaits.ClickOn(CaseAssigneeField);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(UserOptionCA);
        WebDriverWaits.ClickOn(UserOptionCA);
        WebDriverWaits.ClickOn(InspectionAssigneeField);
        //Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(UserOptionIA);
        WebDriverWaits.ClickOn(UserOptionIA);
        WebDriverWaits.ClickOn(CreateRulebutton);
//            Thread.sleep(2000);
        WebDriverWaits.WaitForElementInteractable(AddedRule);
        List<WebElement> RulesCount = driver.findElements(AddedRule);
        boolean SizeAfter = RulesCount.size() >= 1;
        Assert.assertEquals(SizeAfter, true);

    }

    @Test(priority = 6)
    public static void CaseAssignment_EditAddedRule() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_EditAddedRule ");
        extentTest.setDescription(" Verify that user is able to edit the added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");

            String AssigneeBefore = WebDriverWaits.GetText(AssignCaseToColumn);
            WebDriverWaits.ClickOn(EditRuleIcon);
            WebDriverWaits.ClickOn(CaseAssigneeField);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(UserOptionCA2);
            WebDriverWaits.ClickOn(UserOptionCA2);
            //Thread.sleep(4000);
            WebDriverWaits.WaitForElementInteractable(SaveButtonEditRule);
            WebDriverWaits.ClickOn(SaveButtonEditRule);
            String AssigneeAfter = WebDriverWaits.GetText(AssignCaseToColumn);
            boolean CompareStr = AssigneeBefore.equals(AssigneeAfter);
            Assert.assertEquals(CompareStr, false);

    }

    @Test(priority = 7)
    public static void CaseAssignment_DeleteAddedRule() {
        extentTest = extent.startTest(" CaseAssignment_DeleteAddedRule ");
        extentTest.setDescription(" Verify that user is able to delete that added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");

            List<WebElement> RulesCountBefore = driver.findElements(AddedRule);
            int BeforeDeleting = RulesCountBefore.size();
            WebDriverWaits.ClickOn(DeleteRuleIcon);
            List<WebElement> RulesCountAfter = driver.findElements(AddedRule);
            int AfterDeleting = RulesCountAfter.size();
            boolean CompareCount = (AfterDeleting == BeforeDeleting - 1);
            Assert.assertEquals(CompareCount, true);

    }

    @Test(priority = 8)
    public static void CaseAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
        extentTest = extent.startTest(" CaseAssignment_AssignmentRuleUnderInactiveSection ");
        extentTest.setDescription(" Verify that Assignment Rule appears under 'Inactive' section, when user sets 'Status' toggle button as Inactive, on 'Edit Assignment' popup. ");

            WebDriverWaits.ClickOn(AddRuleButton);
            WebDriverWaits.ClickOn(CriteriaFields);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(ZipOption);
            WebDriverWaits.ClickOn(ZipOption);
            WebDriverWaits.ClickOn(CriteriaFields);
            // Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(EqualsOption);
            WebDriverWaits.ClickOn(EqualsOption);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(ValueField);
            WebDriverWaits.SendKeys(ValueField, "77590");
            WebDriverWaits.ClickOn(CaseAssigneeField);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(UserOptionCA);
            WebDriverWaits.ClickOn(UserOptionCA);
            WebDriverWaits.ClickOn(InspectionAssigneeField);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(UserOptionIA);
            WebDriverWaits.ClickOn(UserOptionIA);
            WebDriverWaits.ClickOn(CreateRulebutton);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(InactiveToggle);
            WebDriverWaits.ClickOn(InactiveToggle);
            WebDriverWaits.ClickOn(SaveButton);
            Thread.sleep(4000);
            WebDriverWaits.WaitForElementInteractable(EditAssignmentIcon);
            WebDriverWaits.ClickOn(EditAssignmentIcon);
            //Thread.sleep(2000);
            WebDriverWaits.WaitForElementInteractable(ActiveToggle);
            WebDriverWaits.ClickOn(ActiveToggle);
            WebDriverWaits.ClickOn(SaveButton);

    }

}
