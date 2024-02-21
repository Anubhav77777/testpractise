package DatadDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datadriventesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("./testdata/propertydata.properties");
 Properties property = new Properties();
	property.load(fis);
String url =	property.getProperty("url");
	System.out.println(url);

	}

}
