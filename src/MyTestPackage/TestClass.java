package MyTestPackage;

public class TestClass {

	public static void main(String[] args) {

		int i, j, k;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		System.out.println("Print Fibonaci Series:\n");
		int i=0,j=1,k,a;
		System.out.print(i+" "+j);		

		for(a=2;a<10;a++){
			k=i+j;
			System.out.print(" "+k);
			i=j;
			j=k;
		}		
		*/
	}
}