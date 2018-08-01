package com.wzy.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class reflect_demo {
	@Test
	public void run(){
		Reflect rf = new Reflect();
		rf.add();
		rf.add(12, 8);
	}
	
	@Test
	public void run_1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Class c = Class.forName("com.wzy.reflect.Reflect");	//Class c_1 = Reflect.class;
		//通过字节码对象创建一个实例对象(相当于调用空参的构造器)
		Reflect re = (Reflect) c.newInstance();
		//re.add();
		//获取方法对象
		Method method = c.getMethod("add");
		//让方法对象执行	obj调用这个方法的实例，相当于re	args是该方法执行时候所需要的参数
		method.invoke(re);
	}
}
