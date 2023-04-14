package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Object3 {
	// 원시배열 값을 object 배열로 이관하기
	public static void main(String[] args) {
		ob1 ob = new ob1();
		ob.data1();
	}

}

class ob1{
	ArrayList<Object[]> al;	//2차배열 이상
	Object data[][]; //원시 2차배열
	//2차 원시배열 생성시 주의사항 = object를 적용 후 사용해야 한다.
	public void data1() {
		this.data = new Object[][] {
			{"hong","kim","park","hong","kang","jang"},
			{2000,5000,4000,2200,3100,4120}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
		System.out.println(Arrays.toString(this.data[0]));
		System.out.println(Arrays.toString(this.al.get(0)));
		System.out.println(this.al.size());
		
		int w = 0;
		int sum = 0;
		while(w<this.al.get(0).length) {
			sum += (int)this.al.get(1)[w];
			w++;
		}
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.printf("총 평균포인트는 : %s원 입니다.",df.format(sum/this.al.get(0).length));
	}
}