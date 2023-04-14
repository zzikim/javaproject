package java1;

//해당 파일은 실행권한이 없음 Class_array1.java에서 실행 해야함
//ctr shift f => 정렬 / O => 불필요 삭제 
public class Data1 {
	// 전역 배열변수 작성
	// String user[];
	String[] user = { "hong", "kim", "park" };
	int number = 0;

	public void userlist() {
		// String user[] = {"hong","kim","park"};
		// System.out.println(Arrays.toString(user));
		this.number = 100;
		int w = 0;
		while (w < 3) {
			System.out.println(user[w]); // 반복문으로 배열값 출력
			w++;
		}
	}
}
