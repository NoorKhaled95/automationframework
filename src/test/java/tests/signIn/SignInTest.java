package tests.signIn;

import base.Go;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.testData;
import static tests.signIn.SignIn.getRequestOTPButton;

public class SignInTest {

    @Test(priority = 1)
    public void loginPopupIsDisplayed() {
        Go.clickUntilVisibilityOfBy(SignIn.getGetStartedButton(), By.id("phone-input"));
        Assert.assertTrue(SignIn.getPhoneNumberField().isDisplayed());
    }

    @Test(priority = 2)
    public void requestOTP() {
        SignIn.getPhoneNumberField().sendKeys(testData.getUserData("validUser").get("mobile").asText());
        Go.clickUntilVisibilityOfBy(getRequestOTPButton(), By.name("otpfield"));
        Assert.assertTrue(SignIn.getOTPCodeField().isDisplayed());
    }

    @Test(priority = 3)
    public void sendOTP() {
        SignIn.getOTPCodeField().click();
        SignIn.getOTPCodeField().sendKeys(testData.getUserData("validUser").get("otp").asText().replace("\"", ""));
        SignIn.getSendOTPButton().click();
    }

    @Test(priority = 4)
    public void switchingHostButtonIsDisplayed() {
        Go.clickUntilVisibilityOfBy(SignIn.getDropDownMenu(), By.id("updateUserMode"));
        Assert.assertTrue(SignIn.getSwitchingHostButton().isDisplayed());
    }

    @Test(priority = 5)
    public void hostDashboardIsDisplayed() {
        SignIn.getSwitchingHostButton().click();
        Assert.assertTrue(SignIn.getHostDashboardTitle().isDisplayed());
    }
}
