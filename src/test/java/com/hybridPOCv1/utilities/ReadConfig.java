package com.hybridPOCv1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro = new Properties();
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		}catch (Exception e){
			System.out.println("Exception is" +e.getMessage());
			
		}
	}
	
	public String getApplicationURL() {
		String  url = pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
		String  uname = pro.getProperty("username");
		return uname;
	}
	public String getPassword() {
		String  pwd = pro.getProperty("password");
		return pwd;
	}
	public String getChromePath() {
		String  chromePath = pro.getProperty("chromepath");
		return chromePath;
	}
	public String getEdgePath() {
		String  edgePath = pro.getProperty("edgepath");
		return edgePath;
	}
	
}
