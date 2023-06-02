package CommonMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;

public class WebDriverWaits extends BrowsersInvoked {
    @SuppressWarnings("deprecation")
//    static WebDriverWait wait = new WebDriverWait(driver, 10);
//    static WebDriverWait wait20 = new WebDriverWait(driver, 20);

    static WebDriverWait wait= new WebDriverWait(driver , Duration.ofSeconds(15));
    static WebDriverWait wait20 = new WebDriverWait(driver,Duration.ofSeconds(20));

    public static void WaitUntilPresent(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }


    public static void WaitUntilElementPresent(By locator, int tries) {
        try {
            for (int i = 0; i < tries; i++) {
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            }
        } catch (Exception e) {

        }
    }

    public static void WaitforCustometime(long time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void WaitUntilVisible(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public static void WaitUntilElementVisible(By locator, int tries) {
        try {
            for (int i = 0; i < tries; i++) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            }
        } catch (Exception e) {

        }
    }

    public static void WaitForElementInteractable(By element) {
        WaitUntilVisible(element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void WaitUntilInvisible(By element) {
        wait.until(ExpectedConditions.invisibilityOf((WebElement) element));
    }

    public static void WaitForElementInvisiblilty(WebElement ele){
        wait.until(ExpectedConditions.invisibilityOf(ele));
    }

    public static void WaitForCurserRunning(int time){
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(time));
        WebElement ele = driver.findElement(By.xpath("img[@src='/assets/loading.gif']"));
        wait1.until(ExpectedConditions.invisibilityOf(ele));
    }

    public static void WaitForPageLoadTime(int time){
//        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
    }

    public static void clearByJSE(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value ='';", ele);

    }

    public static boolean ElementIsDisplayed(By path) {
        try {
            WebElement ele = driver.findElement(path);
            return ele.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static WebElement WaitUntilVisibleWE(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static WebElement WaitUntilVisibleWE20(By element) {
        return wait20.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static List<WebElement> WaitUntilVisibleList(By element) {
        return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }

    public static void ClickOn(By element) {
        wait20.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait20.until(ExpectedConditions.elementToBeClickable(element));
        WebElement ele = driver.findElement(element);
        ele.click();
    }

    public static void SendKeys(By element, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        ele.sendKeys(value);
    }

    public static void VisibilityOfElementLocated(By element, int tries) {

        for (int i = 1; i <= tries; i++) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            } catch (Exception e) {

            }
        }


    }

    public static void Clear(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        ele.clear();
    }

    public static void ClickOnWE(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void ClickOnWE20(WebElement element) {
        wait20.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static String GetText(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        String text = ele.getText();
        return text;
    }

    public static void WaitForElementInteractable(By locator, int tries) {
        try {
            for (int i = 0; i < tries; i++) {
                wait.until(ExpectedConditions.elementToBeClickable(locator));
            }
        } catch (Exception e) {

        }
    }

    public static void CloseOtherTabs() throws InterruptedException {
        String originalHandle = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();

        for (String handle : tabs) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(originalHandle);
        System.out.print(driver.getCurrentUrl());
        Thread.sleep(3000);
    }

    public static void ScrollIntoView(By element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement ele = driver.findElement(element);
        jse.executeScript("arguments[0].scrollIntoView(true);", ele);


    }

    public static String GetValueAttribute(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        String text = ele.getAttribute("value");
        return text;
    }

    public static void ClickByJsExecuter(By element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement ele = driver.findElement(element);
        jse.executeScript("arguments[0].click();", ele);
    }

    public static void scrollToRight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(6000,0)");
    }

    public static void scrolltoUp() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-400)");
    }


    public static void scrolltoUpCustom(int x, int y) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(" + x + ",-" + y + ")");
    }

    public static WebElement FindElementByXPath(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));
        WebElement ele = driver.findElement(By.xpath(selector));
        return ele;
    }

    public static List<WebElement> findElementsByXPath(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        List<WebElement> ele = driver.findElements(element);
        return ele;
    }

    public static WebElement findElementByCssSelector(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
        WebElement ele = driver.findElement(By.cssSelector(selector));
        return ele;
    }

    public static List<WebElement> findElementsByCssSelector(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
        List<WebElement> ele = driver.findElements(By.cssSelector(selector));
        return ele;
    }

    public static WebElement findElementById(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id(selector)));
        WebElement ele = driver.findElement(By.id(selector));
        return ele;
    }


    public static WebElement findElementByPartialLinkTxt(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(selector)));
        WebElement ele = driver.findElement(By.partialLinkText(selector));
        return ele;
    }


    public static WebElement findElementByName(String selector) {
        wait.until(ExpectedConditions.elementToBeClickable(By.name(selector)));
        WebElement ele = driver.findElement(By.name(selector));
        return ele;
    }

    public static String actionUploadMedia(String Path) throws AWTException {
        Actions act = new Actions(driver);
        StringSelection str = new StringSelection(Path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        act.keyDown(Keys.CONTROL);
        act.sendKeys("V");
        act.keyUp(Keys.CONTROL);
        act.build().perform();
        return Path;

    }

    public static void ScrollTillPageEnd() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

    }

    public static WebElement GetWebElementByJS(String CSSselector) {
        JavascriptExecutor jser = (JavascriptExecutor) BrowsersInvoked.driver;
        String query = "return document.querySelector('" + CSSselector;

        WebElement CCPBtnJSE = (WebElement) jser.executeScript(query);
        return CCPBtnJSE;
    }

    public static WebElement findElement(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        return ele;
    }


}
