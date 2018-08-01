package com.wzy.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.wzy.reflect.Reflect;

public class Demo {
	@Test
	public void func() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, DocumentException{
		//解析xml文件
		
		//创建dom对象
		Document doc=new SAXReader().read("file:///D:\\ME工作空间\\xml_1\\xml\\web.xml");
		//通过xpath解析获取
		Element servletClass = (Element) doc.selectSingleNode("//servlet-class");
		Element urlPattern = (Element) doc.selectSingleNode("//url-pattern");
		String classText = servletClass.getText();
		String urlText = urlPattern.getText();
		//将两个值放入到map中
		
		//定义一个map
		Map<String,String> map = new HashMap<>();
		//向map中插入ley和value
		map.put(urlText, classText);
		//通过key获取value
		String value = map.get(urlText);
		System.out.println(value);
		//通过全限定名创建一个实例
		Class c = Class.forName(value);	
		//通过字节码对象创建一个实例对象(相当于调用空参的构造器)
		Reflect re = (Reflect) c.newInstance();
		//re.add();
		//获取方法对象
		Method method = c.getMethod("add");
		//让方法对象执行	obj调用这个方法的实例，相当于re	args是该方法执行时候所需要的参数
		method.invoke(re);
	}
}
