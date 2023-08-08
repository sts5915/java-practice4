package IO.file;

import java.io.*;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "aaa.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String msg = br.readLine();
			if(msg == null) {// text에서 파일의 끝은 null이다.
				break;
			}
			System.out.println(msg);
		}
		br.close();

	}

}
