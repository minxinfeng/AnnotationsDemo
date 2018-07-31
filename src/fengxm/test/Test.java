package fengxm.test;

import java.lang.reflect.Method;

import fengxm.annotations.AnnotationsTest;
import fengxm.logic.BusinessLogicClass;

public class Test {

	public static void main(String[] args) {
		
		test();
	}
	/**
	 * 反射机制可以提供类名、方法和实例变量对象。
	 * 所有这些对象都有getAnnotation()这个方法用来返回注解信息。
	 * 我们需要把这个对象转换为我们自定义的注释(使用 instanceOf()检查之后)，同时也可以调用自定义注释里面的方法
	 */
	public static void test(){
		Class businessLogicClass = BusinessLogicClass.class;
		for(Method method : businessLogicClass.getMethods()) {
			AnnotationsTest todoAnnotation = (AnnotationsTest)method.getAnnotation(AnnotationsTest.class);
			if (todoAnnotation != null) {
				System.out.println(" Method Name : " + method.getName());
				System.out.println(" Author : " + todoAnnotation.author());
				System.out.println(" Priority : " + todoAnnotation.priority());
				System.out.println(" Status : " + todoAnnotation.status());
				System.out.println("===========================================");
			}
		} 
	}
	
	
	public static void test2(){
		Class businessLogicClass = BusinessLogicClass.class;
		for(Method method : businessLogicClass.getMethods()) {
			
			if (method != null) {
				System.out.println(" Method Name : " + method.getName());
				System.out.println(" getModifiers : " + method.getModifiers());
				System.out.println(" getParameterCount : " + method.getParameterCount());
				System.out.println("===========================================");
			}
		} 
	}

}
