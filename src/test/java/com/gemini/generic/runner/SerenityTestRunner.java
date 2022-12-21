package com.gemini.generic.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.gemini.generic",
        features = "src/test/resources/features",
        tags = "@test",
        monochrome = true
)
public class SerenityTestRunner {

}
