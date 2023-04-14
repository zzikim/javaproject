package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		Integer number[] = {3,6,9,12,15};
		Integer number2[] = {2,4};
		ArrayList<Integer> a1= new ArrayList<>(Arrays.asList(number));
		ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(number2));
		a1.add(0,a2.get(0));
		a1.add(2,a2.get(1));
		//a1.addAll(a2); // 배열에 배열 추가하기
		//Collections.sort(a1);
		System.out.println(a1);
		
		//무한루프
		Scanner sc = new Scanner(System.in);
		while(true) {	//무한루프 사용형태 (while, dowhile)
			System.out.println("숫자를 입력 하세요");
			int no = sc.nextInt();
			if(no==10) {
				System.out.println("ㅊㅋ");
				break;
			}
		}
		sc.close();
	}

}
