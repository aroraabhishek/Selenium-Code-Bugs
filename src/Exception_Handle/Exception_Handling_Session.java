package Exception_Handle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class Exception_Handling_Session {

	static int i=0;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int[] i= new int[2];
		i[3]=100;
		System.out.println(2/0);
		File f=new File("abhishek.png");
		FileReader fr=new FileReader(f);  // this is a checked exception when removing throw FileNotFoundException
		
		//Number format exception
		String s3="1sd";
		int i3 = Integer.parseInt(s3);
		
		try{
			String s2="1sd";
			int i2 = Integer.parseInt(s2);
		}catch(NumberFormatException e){
				System.out.println("Number exception");
		}
		
		//for handling two at a time
		try{
			String s1="1sd";
			System.out.println(2/0);
			int i1 = Integer.parseInt(s1);
		}catch(NumberFormatException | ArithmeticException e){
				System.out.println("Number exception");
		}
		
		/*
		// if Exception keyword is passed in catch and  NumberFormatException is also passed in another catch below previous it will not be runnable		
		//because everything is handled by exception.
		try{
			String s1="1sd";
			System.out.println(2/0);
			int i1 = Integer.parseInt(s1);
		}catch(Exception e){
		}
		catch(NumberFormatException | ArithmeticException d){
				System.out.println("Number exception");
		}
		*/
		
		//this will work
		
		try{
			String s1="1sd";
			System.out.println(2/0);
			int i1 = Integer.parseInt(s1);
		}catch(NumberFormatException | ArithmeticException g){
		System.out.println("Number exception");
		}
		catch(Exception e1){
				System.out.println("Number exception");
		}
	}
}


// to handle use try and catch



//Finally
//This will always run, irrespective of anything
//For every try we need either a catch or finally

//Finalize is used to perform clean up processing just before object is garbage collected.
//Finalize is a method.
//https://www.javatpoint.com/difference-between-final-finally-and-finalize

/*
 * 
 * 
 */
		