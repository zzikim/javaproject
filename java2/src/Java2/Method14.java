package Java2;

public class Method14 {
//boolean 으로 return 
	public static void main(String[] args) {
		test1 t = new test1();
		t.info("홍길동", "30");
		
		boolean result = t.equals(30);
		if(result==false) {
			System.out.println("숫자를 입력하세요");
		}
		else {
			System.out.println("올바른 값 입니다.");
		}

	}

}

class test1 extends Object {
	private String name;
	private String age;

	public void info(String n, String a) { // setter
		this.name = n;
		this.age = a;
	}
	
	
	@Override 	//Override 시 인자값 자료형 및 인자값 추가를 하지 못함 (본class 메소드 수정해야함)
	public boolean equals(int z) {//boolean  숫자가 아닌 문자로 들어올 경우
		return super.equals(z);	//문자일 경우 false
	}
	
}

class Object {
	public String toString() { // 객체를 문자열로 정의하여 간단하게 내용을 확인하는 메소드
		return null;	//문자일 경우  false
	}

	public boolean equals(int z) { //같은 class의 값을 비교하는 메소드
		return true;  //기본 true(숫자로 들어오는 경우 true  반환)
	}
}