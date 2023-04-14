package java3;

import java.util.Arrays;
import java.util.LinkedList;

public class OOP3 {
	public static void main(String[] args) {
	Integer[] data = {15,22,37,8,11,19,41};
	LinkedList<Integer> dd = new LinkedList<>(Arrays.asList(data));
	dd.addFirst(7);
	dd.remove(3);
	dd.set(5,39);
	System.out.println(dd);
		
	}

}