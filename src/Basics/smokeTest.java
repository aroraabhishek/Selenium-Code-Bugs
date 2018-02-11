package Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class smokeTest {

	//If priority is not defined it will run alphabetically
	//@Test(priority=0)
	//depend on @Test(dependsOnMethods={"mulTest"})
	//irrespective of dependency 	@Test(dependsOnMethods={"mulTest"},alwaysRun=true)
	@Test(dependsOnMethods={"mulTest"},alwaysRun=true)
	public static void addTest(){
	int i=10;
	int j=20;
	int k=i+j;
	Assert.assertEquals(k, 30,"Addition is incorrect");
	}
	
	//enabled=false means it will not run
	//timeout=1000 mens it should finish in this time only
	@Test(enabled=true,description="verify subtraction",testName="Subtraction",timeOut=1000)

	public static void subTest(){
	int i=20;
	int j=10;
	int k=i-j;
	Assert.assertEquals(k, 10,"Subtraction is incorrect");
	}
	
	@Test
	public static void mulTest(){
	int i=20;
	int j=10;
	int k=i*j;
	Assert.assertEquals(k, 200,"Multiplication is incorrect");
	}
}
