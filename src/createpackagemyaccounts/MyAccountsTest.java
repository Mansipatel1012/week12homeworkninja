package createpackagemyaccounts;

import com.google.common.base.Verify;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MyAccountsTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // Click on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        selectMyAccountOptions("Register");
        // Verify the text “Register Account”.
        verifyText("Register Account", By.xpath("//h1[normalize-space()='Register Account']"), "Register Account");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Click on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        selectMyAccountOptions("Login");
        // Verify the text “Returning Customer”.
        verifyText("Returning Customer", By.xpath("//h2[contains(text(),'Returning Customer')]"), "Returning Customer");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        // Clickr on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        selectMyAccountOptions("Register");
        // Enter First Name
        sendTextToElement(By.xpath("//input[@id='input-firstname']"),"Sun");
        // Enter Last Name
        sendTextToElement(By.xpath("//input[@id='input-lastname']"),"Flower");
        // Enter Email
        sendTextToElement(By.xpath("//input[@id='input-email']"),"SF@gmail.com");
        // Enter Telephone
        sendTextToElement(By.xpath("//input[@id='input-telephone']"),"07123456789");
        // Enter Password
        sendTextToElement(By.xpath("//input[@id='input-password']"),"Flower123");
        // Enter Password Confirm
        sendTextToElement(By.xpath("//input[@id='input-confirm']"),"Flower123");
        // Select Subscribe Yes radio button
        clikOnElement(By.xpath("//label[normalize-space()='Yes']"));
        // Click on Privacy Policy check box
        clikOnElement(By.xpath("//input[@name='agree']"));
        // Click on Continue button
        clikOnElement(By.xpath("//input[@value='Continue']"));
        // Verify the message “Your Account Has Been Created!”
        verifyText("Your Account Has Been Created!",By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"),"Your Account Has Been Created!");
        // Click on Continue button
        clikOnElement(By.xpath("//a[normalize-space()='Continue']"));
        // Clickr on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        selectMyAccountOptions("Logout");
        // Verify the text “Account Logout”
        verifyText("Account Logout",By.xpath("//h1[contains(text(),'Account Logout')]"),"Account Logout");
        // Click on Continue button
        clikOnElement(By.xpath("//a[contains(text(),'Continue')]"));

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        // Clickr on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        selectMyAccountOptions("Login");
        //Enter Email address
        sendTextToElement(By.xpath("//input[@id='input-email']"),"SF@gmail.com");
        // Enter Password
        sendTextToElement(By.xpath("//input[@id='input-password']"),"Flower123");
        // Click on Login button
        clikOnElement(By.xpath("//input[@type='submit']"));
        // Verify text “My Account”
        verifyText("My Account",By.xpath("//h2[contains(text(),'My Account')]"),"My Account");
        // Click on My Account Link.
        clikOnElement(By.xpath("//span[normalize-space()='My Account']"));
        // Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        selectMyAccountOptions("Logout");
        // Verify the text “Account Logout”
        verifyText("Account Logout",By.xpath("//h1[contains(text(),'Account Logout')]"),"Account Logout");


    }
}