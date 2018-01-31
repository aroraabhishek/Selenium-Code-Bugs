package List_session;

import java.util.HashMap;
import java.util.Map.Entry;

public class HaspMap_session {

	public static void main(String[] args) {
		
		//Uses of Hash-map
		//Key value mapping
		//When it is unordered
		//Everything is unique
		
		HashMap<Integer, String> empMap=new HashMap<Integer, String>(); 
		empMap.put(1, "Abhi");
		empMap.put(2, "Neha");
//		empMap.remove(1);
		empMap.containsKey(1);
		empMap.get(1);
		empMap.put(2, "Puspaaaa");
//		System.out.println(empMap);
		
		for(Entry<Integer,String> e: empMap.entrySet()){
			System.out.println(e.getKey()+ " " +e.getValue());
		}
	}

}
