package com.gemini.generic.locator;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;


public class Locators {

    public static By label_appHead = AppiumBy.id("io.perfecto.expense.tracker:id/tv_login_head");
    public static By button_signup = AppiumBy.id("io.perfecto.expense.tracker:id/login_signup_btn");
    public static By label_signUpHead = AppiumBy.id("io.perfecto.expense.tracker:id/tv_login_head");
    public static By input_signupName = AppiumBy.id("io.perfecto.expense.tracker:id/signup_name");
    public static By input_signupEmail = AppiumBy.id("io.perfecto.expense.tracker:id/signup_email");
    public static By input_signupPassword = AppiumBy.id("io.perfecto.expense.tracker:id/signup_password");
    public static By input_signupConfirmPassword = AppiumBy.id("io.perfecto.expense.tracker:id/signup_confirm_password");
    public static By select_signupCurrency = AppiumBy.id("io.perfecto.expense.tracker:id/signup_currency");
    public static By scrollArea_signupCurrency = AppiumBy.className("android.widget.ListView");
    public static By options_signupCurrency = AppiumBy.className("android.widget.TextView");
    public static By button_register = AppiumBy.id("io.perfecto.expense.tracker:id/signup_save_btn");
}
