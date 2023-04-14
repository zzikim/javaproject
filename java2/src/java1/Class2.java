package java1;

import java.util.Scanner;

class Member{ // 외부 클래스
	String user = "홍길동"; // 인스턴스 변수
	public static void abc() { //void = return이 없는 메소드
	String user2 = "이순신";
	System.out.println(user2);
	}
}
/*
 [접근제어자]
 public : 기본으로 필요시 접근 용이 (접근제한 없음)
 private : 자신의 클래스 내에서만 접근이 됨(같은 패키지 아니어도 됨)
 protected : 같은 패키지 안에서 파생되는 클래스만 접근됨
 외부 클래스 : default (생략해서 씀) (동일한 패키지만 접근이 됨)
  */
public class Class2 {
	// 외부 Class 및 외부 Method 활용
	public static void main(String[] args) {
		Member m = new Member(); // 객체 생성
		m.abc(); //Member Class에 abc메소드 호출
		System.out.println(m.user);
		Inject i = new Inject(); // 객체 생성
		i.user("김지연", "asd1234!"); //인자값으로 해당 메소드 전송
		

		Scanner nums = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력해주세요.");
		int numa = nums.nextInt();
		int numb = nums.nextInt();		
		i.num(numa,numb);

	}

}

class Inject{
	//user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public static void user(String name,String pw) {
		System.out.println("사용자명: "+name+", 패스워드: "+pw);		
	}
	
		public static void num(int num1, int num2) {
		if(num1*num2 %2 ==0) {
			System.out.println("짝수입니다.");}
		else{
			System.out.println("홀수입니다.");}
	}
}

