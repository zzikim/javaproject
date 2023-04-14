package java1;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array11 {

	public static void main(String[] args) {
		int Adata[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int w = 0;
		String Result[] = new String[Adata[0].length];
			while(w<Adata[0].length) {
				if((Adata[0][w]+Adata[1][w])%2==0) {
					Result[w] = "짝수";}
				else{Result[w] = "홀수";}
				w++;}

			System.out.println(Arrays.toString(Result));
		}}
	


