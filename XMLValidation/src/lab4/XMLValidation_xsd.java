package lab4;

import java.io.File;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaderJDOMFactory;
import org.jdom2.input.sax.XMLReaders;

public class XMLValidation_xsd {

	public static void main(String args[])
	{
		File xmlFile = new File("src/lab4/file.xml");
		try{
			
			SAXBuilder builder = new SAXBuilder(XMLReaders.XSDVALIDATING);
			Document jdoc = builder.build(xmlFile);
		}
		catch(Exception e){	
			System.out.println(e.getMessage());
		}
	}
}