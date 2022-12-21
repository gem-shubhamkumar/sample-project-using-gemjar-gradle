package com.gemini.generic.steps;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import com.gemini.generic.locator.Locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestSteps extends PageObject {
    @Given("launch the app and verify the opened app")
    public void launchTheAppAndVerifyTheOpenedApp() {
        MobileAction.waitUntilElementVisible(Locators.label_appHead, 20);
        MobileAction.verifyEquals(Locators.label_appHead, "EXPENSE TRACKER");
    }

    @When("click on signup button")
    public void clickOnSignupButton() {
//        MobileAction.click(Locators.button_signup, "sign up");
        clickOn(MobileAction.getElement(Locators.button_signup));

//        MobileAction
    }

    @Then("wait until signup page load")
    public void waitUntilSignupPageLoad() {
        MobileAction.waitUntilElementVisible(Locators.label_signUpHead, 20);
        MobileAction.verifyEquals(Locators.label_signUpHead, "SIGNUP");
    }

    @And("enter signup name {string}")
    public void enterSignupName(String name) {
//        MobileAction.typeText(Locators.input_signupName, name, "name");
        typeInto(MobileAction.getElement(Locators.input_signupName), name);
    }

    @And("enter signup email {string}")
    public void enterSignupEmail(String email) {
        MobileAction.typeText(Locators.input_signupEmail, email, "email");
    }

    @And("enter signup password {string}")
    public void enterSignupPassword(String password) {
        MobileAction.typeText(Locators.input_signupPassword, password, "password");
    }

    @And("enter signup confirm password {string}")
    public void enterSignupConfirmPassword(String password) {
        MobileAction.typeText(Locators.input_signupConfirmPassword, password, "confirm password");
    }

    @And("select signup currency {string}")
    public void selectSignupCurrency(String currency) {
        MobileAction.click(Locators.select_signupCurrency, "currency");
        List<WebElement> ccy = MobileAction.getElements(Locators.options_signupCurrency);
        for (WebElement element : ccy) {
            if (MobileAction.getElementText(element).contains(currency)) {
                element.click();
                break;
            }
        }
    }

    @And("click register button")
    public void clickRegisterButton() {
        MobileAction.click(Locators.button_register, "register");
    }

    @And("verify navigation to login")
    public void verifyNavigationToLogin() {
        MobileAction.waitUntilElementVisible(Locators.label_appHead, 20);
        MobileAction.verifyEquals(Locators.label_appHead, "EXPENSE TRACKER");
    }
}
