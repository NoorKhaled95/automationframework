package tests.signIn;

import base.Finder;
import org.openqa.selenium.WebElement;

public class SignIn {
    public static WebElement getGetStartedButton() {
        return Finder.getByClassName("signup-in-btn", true);
    }

    public static WebElement getPhoneNumberField() {
        return Finder.getById("phone-input", false);
    }

    public static WebElement getRequestOTPButton() {
        return Finder.getById("sendotp", true);
    }

    public static WebElement getOTPCodeField() {
        return Finder.getByName("otpfield", true);
    }

    public static WebElement getSendOTPButton() {return Finder.getById("sendotp", true);}

    public static WebElement getDropDownMenu() {
        return Finder.getById("dropdownMenuButton1", true);
    }

    public static WebElement getSwitchingHostButton() {
        return Finder.getById("updateUserMode", true);
    }

    public static WebElement getHostDashboardTitle() {
        return Finder.getByClassName("dr-main-title", false);
    }
}
