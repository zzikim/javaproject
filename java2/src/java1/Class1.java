package java1;
//class만 단독으로 사용 가능
public class Class1 { //class없이 method는 불가
	//필드공간(전역변수,전역객체)
	//static : 메모리를 직접적으로 핸들링하는 속성		
	static int money = 1000; //클래스 변수
	
	public static void main(String[] args) { //main 실행 method
		Adata ad = new Adata(); //해당 클래스를 객체로 변환
		Bdata bd = new Bdata(); //해당 객체에 있는 변수값을 load
		System.out.println(ad.a);
		System.out.println(bd.a);	

		
		Cdata cd = new Cdata(); 
		cd.aa = 10; // Cdata class 안에 변수를 호출 후 값을 이관
		cd.bb = 30;
		cd.cc = cd.aa+cd.bb;
		System.out.println(cd.cc);
	}	
}

class Adata{
	String a = "홍길동";
	}
class Bdata{
	String a = "이순신";
	}
class Cdata{
	//인스턴스변수
	int aa;
	int bb;
	int cc;
}
