package Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyFile {
	public String getData(String key) throws FileNotFoundException, IOException
	{
		Properties property=new Properties();
		property.load(new FileInputStream(AutoConstant.PropertyPath));
		return property.getProperty(key);
				
	}
	

}
