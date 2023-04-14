package Java2;

//setter, getter 
public class Method10 {
	private String name = null;
	private String subject = null;
	private String score = null;
	
	public 
	
	public void score(String name, String subject) { //setter
		this.name = name;
		this.subject = subject;
			String user[][]= {
					{"홍길동","이순신","유관순","강감찬","장보고"},
					{"80","77","92","67","100"},	//국어
					{"40","100","80","92","67"},	//수학
					{"95","88","42","98","50"},		//과학
					{"40","92","100","95","30"}		//한국사		
			};		
			System.out.println(user.length);

			int ea = user[0].length;
			int w = 0;
			while(w<ea) {
				if(name.equals(user[0][w])) {
				int ww = 0;
				while(ww<ea) {
					//과목명 체크
					switch(this.subject) {
					case "국어" : 
						break;
					case "수학" : 
						break;
					case "과학" : 
						break;
					case "한국사" : 
						break;
					case "전체" : 
						break;
					default : 
						this.sign = "해당 데이터는 찾을 수 없습니다.";
						break;
					}
					System.out.println(user[ww][w]);
					ww++;					
				}}
				w++;
			}

	}

}
