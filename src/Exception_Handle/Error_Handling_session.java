package Exception_Handle;

public class Error_Handling_session {

	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callme();
	}
	
	public static void callme(){
		System.out.println(i++);
		callme();
	}

}
