package IO.file;

import java.io.*;

public class Ex11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// OX퀴즈
		// 1000개의 OX들이 있다
		// O는 1점 X는 점수가 없다
		// 만약 연속으로 O가 등장할 경우 점수가 2배!
		
		//예시
		// OOXXXXOO(1+2+1+2) 6점
		// OOOOXOOO(1+2+4+8+1+2+4) 22점
		// 1000개의 OX 점수합을 구하세요.
		// 정답 10818
		
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "ox.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String msg = br.readLine(); 

	}

}
