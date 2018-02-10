package Exception_Handle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Session {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// this will throw the application and will end
		//this will not print hello now
		File f=new File("abhishek.png");
		FileReader fr=new FileReader(f); 
		System.out.println("hello");
		//sojaBeta(); 
		///on un-commenting this it will ay to add throws for InterruptedException, which means when calling any function
		// with throws it will always add the function on calling the func with throw.

	}
	
	public static void sojaBeta() throws InterruptedException{
		Thread.sleep(2000);
	}
}

/*
 * Real life example of throws
 * 
 * suppose i created a framework 
 * and 1 method created for drag and drop with throws exception
 * 
 * When other person calls the function he need to handle that exception
 * 
 * 
 * Other example:
 * JDBC connector is not having any exception handling
 * because we need to send out custom message, so we cant do that
 * 
 */

