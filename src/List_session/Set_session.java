package List_session;

import java.util.HashSet;

public class Set_session {

	public static void main(String[] args) {		
		//Everything is unique in Set
		//Order doesn't matter in Set
		
		HashSet<String> shoes=new HashSet<String>();
		shoes.add("puma");
		shoes.add("adidas");
		shoes.add("nike");
		shoes.add("reebok");
		shoes.remove("puma");
		
		for(String s:shoes){
			System.out.println(s);
		}
	}

}
