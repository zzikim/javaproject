package java3;

//예외처리 : I/O (Input & Output) 사용시 무조건 필수로 적용하게 됨
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "aaaaa12";
		try { // (1) : 해당 변수값을 숫자로 자료형 변환
			int sum = 10 + 20;
			System.out.println(sum);
			// try는 문제 발생하는 부분부터 break되고 catch로 넘어감
			a = Integer.valueOf(b); // 문제 부분
		} catch (NumberFormatException e) { // (2) : 오류 발생시 실행되는 문법
			System.out.println("숫자로 변환되지 않습니다.");
			// (3) : 어느부분에서 문제가 발생한지 체크
		} finally { // (4) : try에서 문제가 발생한 사항을 수정 후 재 실행
			b = b.replaceAll("[a-zA-Z]", "");// 문자 제거   [a-z][A-Z]-> JAVA11
			a = Integer.valueOf(b); // (5) : 숫자로 변환
		}
		System.out.println(a); // (6) : 최종 결과값 출력

	}

}
.
.abstract
......................................................................................................