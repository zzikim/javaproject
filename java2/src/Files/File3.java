package Files;

import java.io.FileReader;

public class File3 {
	// java에서는 모든 file을 전부 로드 가능.
	// .data, .dat, .json, .xml, .exe, .bat 모든 파일 가능
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\data.dat");
			System.out.println(fr.getEncoding());
			System.out.println(fr.read());

			while (true) {
				int a = fr.read();
				if (a == -1) {
					break;
				} else {
					if (a == 32) {
						System.out.printf(" ");
					} else {
						System.out.printf("%s", (char) a);
					}
				}
			}
			fr.close();

		} catch (Exception e) {
			System.out.println("file error");
		}

	}

}
