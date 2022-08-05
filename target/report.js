$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/NaukriNewAccount.feature");
formatter.feature({
  "name": "Naukri Account Creation",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Nakuri Application",
  "keyword": "Given "
});
formatter.match({
  "location": "NaukriCreation.user_Launch_Nakuri_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click and Enter the Name",
  "keyword": "When "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_and_Enter_the_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click and Enter the Email Id",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_and_Enter_the_Email_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click and Enter the Password",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_and_Enter_the_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click and Enter the Mobile Number",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_and_Enter_the_Mobile_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Work Status",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_the_Work_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Register for Id Creation",
  "keyword": "Then "
});
formatter.match({
  "location": "NaukriCreation.user_should_click_the_Register_for_Id_Creation()"
});
formatter.result({
  "status": "passed"
});
});