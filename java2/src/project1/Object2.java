package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object2 {
	//object 배열 응용
	public static void main(String[] args) {
		//object로 숫자와 문자 데이터를 각각 입력시킴
		ArrayList<Object> al = new ArrayList<>();
		al.add("hong");
		al.add(25);
		al.add("hong@nate.com");
		al.add(6000);
		al.add("01081073943");
		System.out.println(al);
		
		//2차 원시 object 배열
		Object data[][] = {
				{"hong","kim","park","jang"},
				{25,30,44,21}
		};
		//object 자료형 선언시 원시 배열도 만들수있음
		System.out.println(Arrays.toString(data[1]));
		
		//복합적 object배열
		Object userinfo[] = {"hong",25,"서울","01023456678",5000};
		

	}

}
