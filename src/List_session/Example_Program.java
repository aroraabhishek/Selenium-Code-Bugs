package List_session;

import java.util.HashMap;

public class Example_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * input: char[] word={'I','N','D','I','A'}
		 * output
		 * I=2,N=1,D=1,A=1
		 */
		
		char[] word={'I','N','D','I','A'};
		
		HashMap<Character,Integer> value=new HashMap<Character,Integer>();
		
	//	for(char s:word){
	//		value.put(s, 1);
//			System.out.println(s);
		//	for(Entry<Character, Integer> e:value.entrySet())
			//	if(value.entrySet().contains("I")){
		//			value.put(s, 2);
	//			}
		//}
		
		for(char w:word){
			if(value.containsKey(w)){
				value.put(w, 2);
			}else{
				value.put(w, 1);
			}
		}
		System.out.println(value);
	}
}