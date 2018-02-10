package Exception_Handle;

import java.io.FileNotFoundException;

public class CustomMessage {

	public static void main(String[] args) {

		/*
		 * This will print system msg
		FileUpload fs=new FileUpload();
		fs.store("aa.png");
*/
		
		//this will print custo message
		FileUpload fs=new FileUpload();
		try {
			fs.store("aa.png");
			System.out.println("Hello");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Hello");
		}
	}
}

//difference between throw and throws

//Throw means to send the custom throw message
//throw new Exception("Custom Message")
//Throws is system msg

//Selenium custom message exception check on github
