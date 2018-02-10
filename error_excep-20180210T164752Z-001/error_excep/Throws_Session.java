package error_excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Session {

	public static void main(String[] args) throws Exception  {
		FileUpload fp = new FileUpload();
		fp.checkSize("asdsad");
		try {
			fp.store("sjdHKSJAD.PNG");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		/*File f = new File("adjhajksd.png");
		FileReader fr = new FileReader(f);
		System.out.println("hello");
		sojaBeta();*/
	}
	
	public static void sojaBeta() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
