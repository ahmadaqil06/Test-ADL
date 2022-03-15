package com.adl.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adl.Utils.ConstantsDriver;
import com.adl.driver.DriverSingleton;

public class CreatePostGistPage {
	
	private ConstantsDriver constantsDriver;
	private WebDriver driver;

	public CreatePostGistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="body > div.position-relative.js-header-wrapper > div > div:nth-child(6) > a")
	private WebElement btnaddpostGitst;
	
	@FindBy(css="#gists > input")
	private WebElement gistdesc;
	
	@FindBy(css="#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement fileextension;
	
	@FindBy(css="#code-editor > div > pre")
	private WebElement codeeditor;
	
	@FindBy(css="#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement submitcreategist;
	
	@FindBy(css="#new_comment_field")
	private WebElement new_comment_field;
	
	@FindBy(css="#partial-new-comment-form-actions > button")
	private WebElement btnsubmitcomment;
	@FindBy(css = "#gist-pjax-container > div.container-lg.px-3.new-discussion-timeline > div > div > div:nth-child(1)")
	private WebElement textAfterCreate;
	
	public String getTextAfterCreate() {
		return textAfterCreate.getText();
	}

	
	public void createGist() {
		btnaddpostGitst.click();
		
		gistdesc.sendKeys(constantsDriver.descriptiongistcreate);
		fileextension.sendKeys(constantsDriver.filenamecreate);
		codeeditor.sendKeys("System.out.println(\"coba coba aja pakai gist ini\");");
		
		submitcreategist.click();
		
//		new_comment_field.sendKeys("komen test aja");
//		
//		btnsubmitcomment.click();
	}
}
