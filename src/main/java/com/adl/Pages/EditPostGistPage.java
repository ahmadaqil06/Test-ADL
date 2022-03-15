package com.adl.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adl.Utils.ConstantsDriver;
import com.adl.driver.DriverSingleton;

public class EditPostGistPage {
	ConstantsDriver constantsDriver;
	private WebDriver driver;

	public EditPostGistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
                   
	@FindBy(css = "#gist-pjax-container > div > div > div.col-9.col-md-9.col-12 > div:nth-child(2) > div.gist-snippet-meta.d-flex.flex-lg-row.flex-column.width-full > div > div.d-inline-block.px-lg-2.px-0 > span:nth-child(1) > a:nth-child(2)")
	private WebElement selecteditemlistgist;
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(1) > a")
	private WebElement editgistselecteditem;
	@FindBy(css = "#gists > input")
	private WebElement gistdesc;

	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement fileextension;

	@FindBy(css = "#code-editor > div > pre")
	private WebElement codeeditor;
	

	@FindBy(xpath = "//div[@class='form-actions']/button")
	private WebElement submitcreategistedit;

	@FindBy(css = "#new_comment_field")
	private WebElement new_comment_field;

	@FindBy(css = "#partial-new-comment-form-actions > button")
	private WebElement btnsubmitcomment;
	
	@FindBy(css="#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(1) > a")
	private WebElement editassertsucces;
	


	public String getEditassertsucces() {
		return editassertsucces.getText();
	}



	public void editpostgist() {
		selecteditemlistgist.click();
		editgistselecteditem.click();

		gistdesc.sendKeys(constantsDriver.descriptiongistcreateedit);
		fileextension.sendKeys(constantsDriver.filenamecreateedit);
		codeeditor.sendKeys("System.out.println(\"coba coba aja pakai gist ini versi edit\");");

		submitcreategistedit.click();

//		new_comment_field.sendKeys("komen test aja versi edit");
//
//		btnsubmitcomment.click();

	}
}
