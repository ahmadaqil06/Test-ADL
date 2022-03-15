package com.adl.runningtest;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.adl.Config.AutomationFrameworkConfiguration;
import com.adl.Pages.CreatePostGistPage;
import com.adl.Pages.DeletePostGistPage;
import com.adl.Pages.EditPostGistPage;
import com.adl.Pages.ListGistUserPage;
import com.adl.Pages.LoginGistPage;
import com.adl.Pages.LogoutGistPage;
import com.adl.Utils.ConfigurationProperties;
import com.adl.Utils.ConstantsDriver;
import com.adl.driver.DriverSingleton;

@Test
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)

public class GistGithub extends AbstractTestNGSpringContextTests {
	private WebDriver driver;
	private LoginGistPage loginGistPage;
	private CreatePostGistPage createPostGistPage;
	private ListGistUserPage listGistUserPage;
	private DeletePostGistPage deletePostGistPage;
	private EditPostGistPage editPostGistPage;
	private LogoutGistPage logoutGistPage;
	private ConstantsDriver constantsDriver;
	

	@Autowired
	ConfigurationProperties configurationProperties;

	@BeforeTest
	public void setup() {

	}
	public void gotoWeblogin() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL);
		loginGistPage = new LoginGistPage();
		constantsDriver = new ConstantsDriver();
		loginGistPage.loginGist(constantsDriver.USERNAME,ConstantsDriver.PASSWORD);
		assertEquals(loginGistPage.getTextAfterLogin(), configurationProperties.getTextsuccesfulllogin());

	}
	
	public void create_a_gist() {
		createPostGistPage = new CreatePostGistPage();
		createPostGistPage.createGist();
		assertEquals(createPostGistPage.getTextAfterCreate(), constantsDriver.descriptiongistcreate);

	}
	public void seelist_of_gist() {
		listGistUserPage = new ListGistUserPage();
		listGistUserPage.listgist();
		assertEquals(listGistUserPage.getListviewsuccesassert(), configurationProperties.getAlllist());

		
	}
	public void delete_of_gist() {
		deletePostGistPage = new DeletePostGistPage();
		deletePostGistPage.deleteSelectedgist();
		deletePostGistPage.deleteSelectedgistalert();
		assertEquals(deletePostGistPage.getDeletetextbtn(), configurationProperties.getDeletetextbtn());
	}
	public void edit_of_gist() {
		editPostGistPage = new EditPostGistPage();
		editPostGistPage.editpostgist();
		assertEquals(editPostGistPage.getEditassertsucces(), configurationProperties.getEditassertsucces());
	}
	public void logout_of_gist() {
		logoutGistPage = new LogoutGistPage();
		logoutGistPage.logoutUserGist();
		assertEquals(logoutGistPage.getLogoutscucces(), configurationProperties.getLogoutscucces());
	}
	
	


}
