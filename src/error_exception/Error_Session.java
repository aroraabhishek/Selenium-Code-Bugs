package error_exception;
public class Error_Session {
	static int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callme();
	}
	
	public static void callme(){
		System.out.println(i++);
		callme();
	}

}
