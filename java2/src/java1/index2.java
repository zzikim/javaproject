package java1;

public class index2 { // 클래스

	public static void main(String[] args) { // 메소드
		
		String user = "홍길동";
		byte level = 5;
		int point = 15000;
		
//		println = ln(line) br형태 로 출력
//		printf = f(일반출력) 한줄에 모두 출력 \n : 한줄내림
		
//		System.out.println(user+"님 레벨은:"+level+" 포인트:"+point);
		System.out.printf("%s",user);
		System.out.printf("레벨 %d",level);
		System.out.printf("포인트 %d",point);
		
		boolean ck = true; // true, false
		System.out.printf("동의함: %b\n",ck);
	}

}
