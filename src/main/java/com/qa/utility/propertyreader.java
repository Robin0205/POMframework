package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertyreader {

	//code to read the property files

	public static String  getpropertydata(String propertyname) 
	
	{
		Properties pr=new Properties();
		//to get the location of the current working directory adress"
		String path=System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties";
		
	  
	try {
		FileInputStream fis = new FileInputStream(path);
		 pr.load(fis);
		  fis.close();
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	  
	return pr.getProperty(propertyname);
}
}