package com.naukri.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                  glue="com.naukri.stepdefinition",
                  monochrome=true)
public class TestRunner {
	
	}

