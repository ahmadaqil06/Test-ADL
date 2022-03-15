package com.adl.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
@PropertySource("framework.properties")
@EnableConfigurationProperties({ConfigurationProperties.class,})
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	@Value("${textsuccesfulllogin}")
	private String textsuccesfulllogin;
	@Value("${filenamecreate}")
	private String filenamecreate;
	@Value("${descriptiongistcreate}")
	private String descriptiongistcreate;
	@Value("${alllist}")
	private String alllist;
	@Value("${deletetextbtn}")
	private String deletetextbtn;
	@Value("${editassertsucces}")
	private String editassertsucces;
	@Value("${logoutscucces}")
	private String logoutscucces;
	

	public String getLogoutscucces() {
		return logoutscucces;
	}


	public String getDeletetextbtn() {
		return deletetextbtn;
	}


	public String getEditassertsucces() {
		return editassertsucces;
	}


	public String getAlllist() {
		return alllist;
	}


	public String getTextsuccesfulllogin() {
		return textsuccesfulllogin;
	}


	public String getFilenamecreate() {
		return filenamecreate;
	}


	public String getDescriptiongistcreate() {
		return descriptiongistcreate;
	}


	public String getBrowser() {
		return browser;
	}

	
	
	

}
