package java1;

public class Double1 {

	public static void main(String[] args) {
		int a = 5 ;
		do {
			int b = 5;
			do {
				System.out.printf("%d+%d=%d\n",a,b,(a+b));
				b--;
			}while(b>=1);
			a--;
		}while(a>=2);

	}

}
