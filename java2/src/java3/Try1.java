package java3;

import java.util.InputMismatchException;
import java.util.Scanner;
// 예외처리 방식
public class Try1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		;
		int box;
		// try ~ catch : 예외 처리문

			try { // 오류발생시 체크
				System.out.println("숫자를 입력하세요?");
				box = sc.nextInt();
				System.out.println("사용자는 " + box + "을(를) 입력했습니다.");
			}
			catch (InputMismatchException aa) {
				System.out.println(aa);
				System.out.println("문자가 입력되었습니다.");
			}
			catch (Exception e) { // 오류발생된 사한
				System.out.println("숫자만 입력");
			}
			sc.close();
		}
	
	}
