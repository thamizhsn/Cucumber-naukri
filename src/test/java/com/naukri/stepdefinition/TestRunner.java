package com.naukri.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                  glue="com.naukri.stepdefinition",
                  plugin= {"html:target","json:target/reports.json"},
                  monochrome=true)
public class TestRunner {
	
	}

