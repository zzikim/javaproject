package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> a1= new ArrayList<>(Arrays.asList(user));
		int w = 0;
		while(w < a1.size()) {
			if(a1.get(w).equals("kim")) {
				a1.remove(w);
			}
			w++;
		}
		System.out.println(a1);
		
		
		Integer number[] = {10,7,1,11,47,41,22};
		ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(number));
		w = 0;
		while(w < a2.size()) {
			if(a2.get(w) % 2==0) {
				a2.remove(w);
			}
			w++;
		}
		Collections.sort(a2); // 오름차순 
		Collections.sort(a2,Collections.reverseOrder()); // 내림차순
		System.out.println(a2);

	}

}
