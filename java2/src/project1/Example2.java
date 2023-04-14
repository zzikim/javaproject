package project1;

public class Example2 {
		//배열 + abstract 사용하기
		public static void main(String[] args) {
			abox a = new abox();
			a.dataload();
			abox2 b = new abox2();
			b.dataload();
			
			box[] ab = { new abox(), new abox2(), new abox3()};
			ab[0].dataload();
			ab[1].dataload();
			ab[2].dataload();
			
			int w = 0;
			while(w<ab.length) {
				if(w!=1) {
				ab[w].dataload();}
				w++;
			}

	}

}

abstract class box{
	public abstract void dataload();
}

class abox extends box{
	@Override
	public void dataload() {
		System.out.println("1번 데이터 로드");
		
	}
}
class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("2번 데이터 로드");
		
	}
}
class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("3번 데이터 로드");
		
	}
}