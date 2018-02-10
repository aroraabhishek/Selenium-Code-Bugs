package error_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Session {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String msg = "User Added Succesfully";
		try{
			String s = "1.0";
			int i = Integer.parseInt(s);
			System.out.println(2/0);
			int[] ias = new int[2];
			ias[3] = 100;
		} catch(NumberFormatException e){
			msg = "Number format is incorrect!";
			//System.out.println("Number format is incorrect!");
		} catch(ArithmeticException e){
			msg = "Number is not / by zero";
			//System.out.println("Number is not / by zero");
		} catch(Exception e){
			msg = "Unknown Error";
			//e.printStackTrace();
		} finally {
			System.out.println(msg);
		}
		
		System.out.println("hello");
		//int[] i = new int[2];
		//i[3] = 100;
		//System.out.println(2/0);
		//File f = new File("adjhajksd.png");
		//FileReader fr = new FileReader(f);

	}

}
