package com.naukri.stepdefinition;

import com.naukri.objectrepository.PageObjectModel;
import com.naukri.resources.CommonActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class NaukriCreation extends CommonActions {
	CommonActions c=new CommonActions();
	PageObjectModel p =new PageObjectModel();
	@Given("User Launch Nakuri Application")
	public void user_Launch_Nakuri_Application() {
	    c.browserLaunch();
	}

	@When("User should click and Enter the Name")
	public void user_should_click_and_Enter_the_Name() {
        c.name();
	}

	@When("User should click and Enter the Email Id")
	public void user_should_click_and_Enter_the_Email_Id() {
	   c.email();
	}

	@When("User should click and Enter the Password")
	public void user_should_click_and_Enter_the_Password() {
	    c.password();
	}

	@When("User should click and Enter the Mobile Number")
	public void user_should_click_and_Enter_the_Mobile_Number() {
	    c.mobileNumber();
	}

	@When("User should click the Work Status")
	public void user_should_click_the_Work_Status() {
		c.Exp();
		
	}
    @Then("User should click the Register for Id Creation")
	public void user_should_click_the_Register_for_Id_Creation() {
	   c.register();
	   c.quit();
	}


}
