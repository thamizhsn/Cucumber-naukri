package com.naukri.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.resources.CommonActions;

public class PageObjectModel extends CommonActions {
	CommonActions c=new CommonActions();
	public PageObjectModel () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="name")
	private WebElement Name;
	@FindBy(id="email")
	private WebElement Email;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(id="mobile")
	private WebElement Mobile;
	@FindBy(id="(//h2[@class='main-3'])[1]")
	private WebElement Exp;
	@FindBy(id="//button[@type='submit']")
	private WebElement Register;
	public WebElement getName() {
		return Name;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getExp() {
		return Exp;
	}
	public WebElement getRegister() {
		return Register;
	}
	
}
