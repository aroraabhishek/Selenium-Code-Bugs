package Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

	//BeforeTest means before all test cases, before starting all testing, it runs before all BeforeClass.(Prerequiste)
	//AfterTest means after all test cases
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("I am before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("I am after class");		
	}
	
	@BeforeMethod
	public void setup(){
		System.out.println("I am in before method");
	}
	
	
	@Test
	public void test1(){
		System.out.println("I am in test1 method");
	}
	
	@Test
	public void test2(){
		System.out.println("I am in test2 method");
	}
	
	@AfterMethod
	public void aftersetup(){
		System.out.println("I am in after method");
	}
}
