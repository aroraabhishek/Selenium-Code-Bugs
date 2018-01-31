package List_session;

import java.util.HashMap;

public class Example_Program2 {

	public static void main(String[] args) {
		// AMmazon interview question
		
		// To find the same number of characters in 2 char using only 1 hash-map
		// to confirm this add any char in any of the character string it will print 1 else it will print 0 if the 
		// same no. of characters are available in both char string
		// Here same no. of char means count of single char 
		
		char[] word1={'I','N','D','I','A'};
		char[] word2={'I','I','N','Z','D','A'};
		HashMap<Character,Integer> value=new HashMap<Character,Integer>();

		for(char w:word1){
			if(value.containsKey(w)){
				int i=value.get(w);
				value.put(w, i+1);
			}else{
				value.put(w, 1);
			}
		}
		
		for(char w1:word2){
			if(value.containsKey(w1)){
				int i=value.get(w1);
				value.put(w1, i-1);
			}else{
				value.put(w1, 1);
			}
		}
		System.out.println(value);
	}

}
