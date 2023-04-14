package java3;

public class Heap {
	//	메모리 : Stack(cpu 캐시메모리) Heap(실제 메모리/메모리제한)
	
	static int box2 = 20; //stack
	
	public static void main(String[] args) {
		int box1 = 20; // stack		20
		Integer box3 = 20; //stack	0x0002
		Integer box4 = new Integer(20); //Heap 영역	20(0x0002
		Integer box5 = new Integer(20);
		// stack영역 Integer끼리는 ==,equals 둘다 가능 / int랑 int(eger)는 ==만 사용가능
		// Heap영역 Integer 섞이면  eqauls 써야함
		if(box1 == box3) {
			System.out.println("동일함");			
		}
		if(box3 == box4) {
			System.out.println("동일함");
		}
		if(box3.equals(box4)) {
			System.out.println("동일함2");
		}
		if(box1 == box4) {
			System.out.println("동일함3");
		}
		if(box5.equals(box4)) {
			System.out.println("동일함4");
		}
		
		
	}
	

}
