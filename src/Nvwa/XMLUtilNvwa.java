package Nvwa;

import javax.xml.parsers.*;

import org.w3c.dom.*;
//import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtilNvwa {
	   //该方法用于从XML配置文件中提取名称，并返回该名称
		public static String getSexName()
		{
			try
			{
				//创建文档对象
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;							
				doc = builder.parse(new File("Simple.xml")); 
			
				//获取包含名称的文本节点
				NodeList nl = doc.getElementsByTagName("sexName");
	            Node classNode=nl.item(0).getFirstChild();
	            String sexName=classNode.getNodeValue().trim();
	            return sexName;
	           }   
	           	catch(Exception e)
	           	{
	           		e.printStackTrace();
	           		return null;
	           	}
			}
}