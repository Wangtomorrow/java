package com.wzy.dom4j;

import java.util.*;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {
	public static void main(String[] args) throws DocumentException{
		//创建核心对象
		SAXReader reader = new SAXReader();
		//创建dom树
		Document doc = reader.read("file:///D:\\ME工作空间\\xml_1\\xml\\web.xml");
		//获取根节点
		Element root = doc.getRootElement();
		//获取其他节点
		List<Element> list = root.elements();
		//遍历集合
		for(Element ele:list){
			//获取servlet-name标签提
			String name = ele.elementText("servlet-name");
			System.out.println(name);
			System.out.println(ele.elementText("servlet-class"));
			System.out.println(ele.elementText("url-pattern"));
			System.out.println();
		}
		//获取root的version属性
		String value = root.attributeValue("version");
		System.out.println(value);;
	}
	
}
