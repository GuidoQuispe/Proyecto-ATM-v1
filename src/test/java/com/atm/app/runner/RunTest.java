package com.atm.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( format = {"pretty"},
                plugin = {"json:target/cucumber.json"}, 
                snippets = SnippetType.CAMELCASE, 
                features = "classpath:cucumber/cash_withdrawal.feature",
                    glue = "com.atm.app.steps")
public class RunTest {}