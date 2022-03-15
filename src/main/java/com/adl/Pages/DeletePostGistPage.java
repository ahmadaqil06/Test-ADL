package com.adl.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adl.driver.DriverSingleton;

public class DeletePostGistPage {
	private WebDriver driver;

	public DeletePostGistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#gist-pjax-container > div > div > div.col-9.col-md-9.col-12 > div:nth-child(2) > div.gist-snippet-meta.d-flex.flex-lg-row.flex-column.width-full > div > div.d-inline-block.px-lg-2.px-0 > span:nth-child(1) > a:nth-child(2)")
	private WebElement selecteditemlistgist;
	
	@FindBy(css="#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(2) > form > button")
	private WebElement btndeleteselecteditemgist;
	@FindBy(css="#js-flash-container > div > div")
	private WebElement deletetextbtn;
	public String getDeletetextbtn() {
		return deletetextbtn.getText();
	}
	public void deleteSelectedgist() {
		
		selecteditemlistgist.click();
		btndeleteselecteditemgist.click();
		
		
	}
	public void deleteSelectedgistalert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
}
