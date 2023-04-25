package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
//************************************ Click and SendText Method *****************************************
    // the method will click on the element
    public void clikOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    //This method will get text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    // This method will send text to elements
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method will send text to element
    public void sendKeysToElement(By by, CharSequence keys) {
        driver.findElement(by).sendKeys(keys);
    }
    //*********************************ACTION CLASS METHODS****************************************
    public void dragAndDrop(By drag, By drop) {
        Actions actions = new Actions(driver);
        WebElement draggable = driver.findElement(drag);
        WebElement droppable = driver.findElement(drop);
        actions.dragAndDrop(draggable, droppable).build().perform();
    }

    // This method will mouse hover and click the element
    public void mouseHoverAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        //   Thread.sleep(3000);
        //  waitUnitVisibilityOfElementLocated(by,3000);
        actions.moveToElement(mouseHoover).click().build().perform();
    }

    // This method will mouse hover on element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
//        Thread.sleep(3000);
        // waitUnitVisibilityOfElementLocated(by,2000);
        actions.moveToElement(mouseHoover).build().perform();
    }
    // ******************************Select Method **********************************************************
    // Select by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

        // This method will clear text from field
   public void clearTextFromField(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }
    public void selectByIndexFromDropDown(By by, int index) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    //This method will select by value
    public void selectByValueFromDropdown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }

    // ***************************************other method**************************************************

    // This method will verify text displayed on web page
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, actualMessage);

    }

    public void selectMenu(String menu) {
    driver.findElement(By.linkText(menu)).click();


    }
  public void selectMyAccountOptions(String option){
        driver.findElement(By.linkText(option)).click();
  }
    }
