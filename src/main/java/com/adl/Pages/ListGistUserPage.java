package com.adl.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adl.driver.DriverSingleton;

public class ListGistUserPage {
	private WebDriver driver;

	public ListGistUserPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > div > div > div.d-flex.flex-column.width-full > div.d-flex.flex-row.width-full > h1 > span.author > a")
	private WebElement mylistgist;
	@FindBy(css="body > div.position-relative.js-header-wrapper > div > div.Header-item.Header-item--full.js-site-search.flex-column.flex-md-row.width-full.flex-order-2.flex-md-order-none.mr-0.mr-md-3.mt-3.mt-md-0.Details-content--hidden-not-important.d-md-flex > nav > a:nth-child(1)")
	private WebElement listviewsuccesassert;

	public String getListviewsuccesassert() {
		return listviewsuccesassert.getText();
	}
	public void listgist() {
		mylistgist.click();
	}

	
}
