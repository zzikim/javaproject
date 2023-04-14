package Java2;

public class Method6 {
	// 배열데이터를 이용하여 홀수 값에 대한 총 갯수 받기 (응용)
	public static void main(String[] args) {
		mysql m = new mysql();
		String number = m.check("홀수");

		System.out.printf("총 갯수는 %s 입니다.", number);
	}

}

// data 내용 15, 22, 17, 14, 32, 35, 19, 33
class mysql {
	private int data[] = { 15, 22, 17, 14, 32, 35, 19, 33 };
	int aa;

	public String check(String wh) {
		if (wh.equals("짝수")) {
			aa = 0;
		} else {
			aa = 1;
		}
		int w = 0;
		int count = 0;
		while (w < this.data.length) {
			if (data[w] % 2 == aa) {
				count++;
			}
			w++;
		}
		return Integer.toString(count);
	}
}