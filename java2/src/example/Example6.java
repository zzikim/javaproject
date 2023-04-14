package example;

import java.util.*; // util안에 있는 모든 라이브러리 사용

public class Example6 {
	//배열값을 생성하기 위한 인스턴스 셋팅
	Integer data[] = new Integer[5];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
 
		Example6 ex = new Example6();
		ex.abc();
	}
	
	public void abc() {
		System.out.println("숫자를 5개를 입력하세요.");
		//반복문으로 5개의 사용자가 입력한 숫자를 순차적으로 입력시킴
		int x = 0;
		int ea = data.length;
					
		while(x < ea ) {
			
			data[x] = sc.nextInt();
			x++;
		}
		Arrays.sort(data); // 배열 정렬
		System.out.println(Arrays.toString(this.data));
		
 	}

}
