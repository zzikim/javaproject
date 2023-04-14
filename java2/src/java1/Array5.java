package java1;

public class Array5 {

	public static void main(String[] args) {
		int aa[] = {15,60,11,14,27};
		int sum = 0;
		// for in과 동일한 형태의 배열전용 반복문
		for(int f: aa) {
			sum+=f;
		}
		System.out.println(sum);
		
	/*	int ea = aa.length;
		int w = 0;
		while(w<ea) {
			sum+=aa[w];
			w++;
		}
		System.out.println(sum);*/
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		for(String d: id) {
			if(d.length()>=4) {System.out.println(d);}
		}

	}

}
