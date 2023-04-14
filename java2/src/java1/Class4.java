package java1;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	System.out.println("두개의 숫자를 입력해주세요.");
	int n1 = num.nextInt();
	int n2 = num.nextInt();		
	num.close();
	Plus p = new Plus();
	int total;	
	if(n1>n2) {
	total = p.pl(n2,n1);
	}
	else {
	total = p.pl(n1,n2);
	}
	System.out.println(total);
	}

}

class Plus{
	public int pl(int num1, int num2) {		
		
		int w = num1;
		int sum = 0;
		do {
			sum += w;
			w++;
		}while(w<=num2);
		return sum;
		
	}
}