package IO.file;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file1 = new File("C:\\aaa\\aaa.txt");
		// 파일이 없어도 상관없다.
		
		File file2 = new File("C:\\aaa", "aaa.txt");
		// 파일 경로와 파일명으로 나타낼 수 있다.
		
		File file3 = new File("C:\\aaa");
		// 파일 경로까지만 만들 수 있다.
		
		File file4 = new File(file3, "aaa.txt");
		// 파일경로의 객체를 넣어서 만들 수 있다.
		
		// 윈도우 폴더구별자 : \
		// 리눅스 폴더구별자 : /
		
		// 원하는 방식으로 표현해주면 된다.
		
		// File.separator : 폴더 구별자
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "aaa.txt");
		
		
	}

}
