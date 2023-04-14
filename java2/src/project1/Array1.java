package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
	//ArrayList 배열 문자, 숫자 혼합 사용하기
	public static void main(String[] args) {
		String data[] = {"hong","park"}; //문자열
		int data2[] = {10,20};	//숫자열
		
		//ArrayList에 자료형이 String 이면 int배열 받을수 없음. object사용
		
		/*
		 object = 문자, 숫자 상관없이 모든 자로형 다 받음
		 */
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);

		
		//계산방식 - 첫번째
		//int sum = (int)li.get(2) + (int)li.get(3);
		
		//계산방식 - 두번째		
		//Object sum = (int)li.get(2) + (int)li.get(3);

		//계산방식 - 세번째
		Integer sum = (Integer)li.get(2) + (Integer)li.get(3);			
		System.out.println(sum);
		
		// 추가로 ArrayList 안에 데이터가 어떤 자료형인지 알아내는 방법(object)일 경우
		System.out.println(li.get(0).getClass().getName());
		//object는 한가지 자료형만 받는형태가 아니라서 .getClass().getName()을 이용하여 해당데이터 자료형 파악가능.
		
	}

}
