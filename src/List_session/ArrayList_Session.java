package List_session;

import java.util.ArrayList;

public class ArrayList_Session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Abhi");
		slist.add("Neha");
//		slist.isEmpty();
//		slist.clear();
//		slist.remove(1);
//		slist.remove("Abhi");
		System.out.println(slist.contains("Abhi"));
/**
 * Benefits of array-list;
 * Bunch of things
 * values repeat
 * order matters (example office in and out timing)
 */
		
		ArrayList<String[]> emplist=new ArrayList<String[]>();
		emplist.add(new String[]{"1","onkar"});
		emplist.add(new String[]{"2","Abhi"});
		emplist.add(new String[]{"3","neha"});
		
	}

}