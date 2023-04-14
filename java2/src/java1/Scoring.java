package java1;

public class Scoring {
	public void sco(String a, String a1[], String a2[]) {

		int ea = a1.length;
		int w = 0;
		int count = 0;
		while (w < ea) {
			if (a == a1[w]) {
				System.out.println(a1[w] + "님은 " + a2[w] + "점 입니다.");
				count ++;
			}
			w++;
		}
		if (count == 0) {
			System.out.println("미확인 되었습니다.");
		} 
	}

}
