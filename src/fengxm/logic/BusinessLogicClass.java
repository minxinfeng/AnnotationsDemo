package fengxm.logic;

import fengxm.annotations.AnnotationsTest;

public class BusinessLogicClass {
	@AnnotationsTest(author = "test", priority = AnnotationsTest.Priority.HIGH, status = AnnotationsTest.Status.STARTED)
	public void incompleteMethod(){
		System.out.println("imcompleteMehod");
	}
	
	@AnnotationsTest
	public void incompleteMethod2(){
		System.out.println("imcompleteMehod2");
	}

}
