package Files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File15 {

	public static void main(String[] args) {

		try {
			//분리를 안해놔서 한 명령어씩만 발동함
			//사용자가 한글 이미지 파일명으로 업로드시 영문파일명으로 변경 저장
			//파일 복사 기능
//			Path data1 = Paths.get("E:\\pjk\\java1\\src\\Files\\notice.txt");
//			Path data2 = Paths.get("E:\\pjk\\java1\\src\\Files\\notice2.txt");
//			Files.copy(data1, data2);
//			//notice 내용을 notice2로 복사
//			
//			
//			//파일 이동
//			Path data3 = Paths.get("E:\\pjk\\java1\\src\\Files\\notice2.txt");
//			Path directory = Paths.get("E:\\memo\\notice2.txt");
//			Files.move(data3, directory);
			
			
			//파일 삭제
			Path data4 = Paths.get("E:\\pjk\\java1\\src\\Files\\abc.txt");
			Files.delete(data4);
		} catch (Exception e) {
			
		}

	}

}
