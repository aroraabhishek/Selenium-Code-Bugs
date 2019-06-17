package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Read {

	public static Iterator<String[]> csv(String filename){
		ArrayList<String[]> testdata=new ArrayList<String[]>();
		try{
			FileReader fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null){
				String[] data=line.split(",");
				testdata.add(data);
			}
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return testdata.iterator();
	}
	
	@Test(dataProvider="getData")
	public void logintest(String username, String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("passed");
	}
	
	@DataProvider
	public Iterator<String[]> getData(){
		return csv("C:\\EclipseWorkspace\\JavaSelenium\\user.csv");
	}
}