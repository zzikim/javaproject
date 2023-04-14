package java1;

public class Class3 {
	//외부 class 생성시 static 유/무 활용 및 return 메솓
	//같은 package 안에 동일한 class 사용불가
	public static void main(String[] args) {
		Box b = new Box();
		b.abc();
		
		Class3 c= new Class3(); //같은 class라도 해당 객체 생성 후 메소드 로드함
		c.bbb();
		
		String result = c.zzz(); //리턴 (문자)
		System.out.println(result); 
		
		int result2 = c.kkk(); //리턴 (숫자)
		System.out.println(result2); 
		
		//event 메소드가 static으로 메모리에 이미 할당되어 있으므로, Coupon Class를 로드 후 바로 해당 메소드 호출 가능
		Coupon.event();		
	}	
	
	
	public void bbb() {
		int a = 10000;
		double b = a/0.5;
		System.out.println(b);
	}	
	
	//리턴 메소드 (문자형태)   리턴은 system print 불가
	public String zzz() {
		String a = "거북선";
		return a;
	}
	//리턴 메소드 (숫자형태)
	public int kkk() {
		int a = 100;
		return a;
	}
	
}

//static 메소드가 있는 경우
class Coupon{
	public static void event() {
		int cp = 30;
		System.out.println(cp);
	}
}

//static 메소드가 없는 경우
class Box{
	public void abc() { //static void 메모리에 할당되는 메소드임
		//단 static 사용하지 않을경우 같은 package 안에서는 공유가 가능함
		System.out.println("test");
	}
}
