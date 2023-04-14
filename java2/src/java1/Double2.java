package java1;

public class Double2 {

	public static void main(String[] args) {
		int a = 1;
		int count = 0;
		int sum = 0;
		do {
			if ((9*a)%2==1) {
				sum+=(9*a);
				count++;
			};
			a++;
		}while(a<=64);
		System.out.println(sum/count);

	}

}
