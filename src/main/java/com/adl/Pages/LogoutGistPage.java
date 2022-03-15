package com.adl.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adl.driver.DriverSingleton;

public class LogoutGistPage {
	private WebDriver driver;

	public LogoutGistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#user-links > details > summary > img")
	private WebElement myiconakun;
	@FindBy(css="#user-links > details > details-menu > form > button")
	private WebElement logoutusergist;
	@FindBy(css="#js-pjax-container > div > form > input.btn.btn-block.f4.py-3.mt-5")
	private WebElement btnfinalsignoutconfirm;
	@FindBy(css="body > div.application-main > main > div.overflow-hidden > div.home-hero-container.position-relative.js-webgl-globe-data > div.home-hero.position-absolute.z-1.top-0.right-0.bottom-0.left-0.overflow-hidden > div > div > div.ml-md-n3.mr-md-3.col-12.col-lg-6.text-center.text-md-left > h1")
	private WebElement logoutscucces;
	
	public String getLogoutscucces() {
		return logoutscucces.getText();
	}

	public void logoutUserGist() {
		myiconakun.click();
		logoutusergist.click();
		btnfinalsignoutconfirm.click();
//		mylisticon.get(5).click();
	}
}
