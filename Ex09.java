package IO.file;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print(true);
		pw.println(100);
		pw.println("안녕하세요");
		pw.println("오늘도 좋은하루 되세요~!!!");
		pw.close();
		

	}

}
