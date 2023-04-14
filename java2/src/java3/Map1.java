package java3;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	//key 배열
	public static void main(String[] args) {
		//빈 key배열 생성
		//map 사용시 주의사항 
		Map<String, String> map = new HashMap<>();
				map.put("id", "hong");	//put("key이름","데이터");
				map.put("name", "홍길동");
			System.out.println(map);
			System.out.println(map.get("name"));//key이름으로 데이터값 출력
			

			Map<String, Integer> map2 = new HashMap<>();
			map2.put("number", 10);
			map2.put("tel", 1081073943);
			System.out.println(map2);
;
	}

}
