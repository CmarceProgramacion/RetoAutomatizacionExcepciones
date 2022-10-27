package com.aliexpress.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/start_of_page_pop_ups.feature",
        glue = "com.aliexpress.stepdefinitions",
        tags = "@CaseOne",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class StartOfPagePopUpsRunner {
}
