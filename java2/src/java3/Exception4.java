package java3;

public class Exception4 {

	public static void main(String[] args) {
		String data[] = {"hong3000","park1250","kang852","kim1819","lee5117"};		
		ex ex = new ex();
		try{
		ex.point(data);
		}
		catch(Exception e){
			if(e.getMessage()!=null) {
				System.out.println("Error");
			}
		}
		finally {
			String rdata[] = new String[data.length];
			
			int j = 0;
			while(j<data.length) {
				rdata[j]= data[j].replaceAll("[a-zA-Z]", "");
				j++;
				}
			try {
				ex.point(rdata);
				}
				catch(Exception e) {
					if(e.getMessage()!=null) {
						System.out.println("Error");
					}
				}

	}

}
}

class ex{
	public void point(String db[]) throws Exception{
		int w = 0;
		int ea = db.length;
		int sum = 0;
		while(w<ea) {
			sum+=Integer.valueOf(db[w]);
			w++;
		}
		System.out.println("회원 포인트 총 합계: "+sum);
		Exception ex = new Exception();
		throw ex;
	}
}