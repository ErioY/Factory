package Nvwa;

import javax.xml.parsers.*;

import org.w3c.dom.*;
//import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtilNvwa {
	   //�÷������ڴ�XML�����ļ�����ȡ���ƣ������ظ�����
		public static String getSexName()
		{
			try
			{
				//�����ĵ�����
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;							
				doc = builder.parse(new File("Simple.xml")); 
			
				//��ȡ�������Ƶ��ı��ڵ�
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