package Testng_session;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Session {

	@Test(dataProvider="getData")
	public void logintest(String username, String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("passed");
	}
	
	/*
	 * dataprovider is used for running test with multiple parameters
	 * It can be done in two ways
	 * 1. array
	 * 2. reading from file
	*/
	
	@DataProvider
	public String[][] getData(){
		String[][] data={
				{"abhi","abhi123"},
				{"neha","neha123"},
				{"onkar","onkar123"}
		};
		return data;
	}
	
}

//dataprovider