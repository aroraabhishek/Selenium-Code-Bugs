package errorException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileUpload {
	public void store(String filename) throws FileNotFoundException{
		File f = new File(filename);
		FileReader fr = new FileReader(f);
	}
	
	public void checkSize(String filename) throws Exception{
		int size = 100;
		if(size >50){
			throw new Exception("File size is greater than 50");
		}
	}
}
