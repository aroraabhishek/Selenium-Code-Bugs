package Exception_Handle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileUpload {

	/*
	 * this will not perform custome message
	public void store(String filename){
		File f=new File(filename);
		try {
			FileReader fr=new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}*/
	//this will perform custome message in try and catch
	public void store(String filename) throws FileNotFoundException{
		File f=new File(filename);
		FileReader fr=new FileReader(f);
		}  
}
