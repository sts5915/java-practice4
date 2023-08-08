package IO.file;

import java.io.*;
public class Ex03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		//파일이 없으면 만든다
		//객체 생성시 true 이면 이어쓰기, false 이면 다시 쓰기 default가 false다.
		
		//fos.write(65);
		// 아스키코드로 넣어진다
		//fos.write('B');
		
		String msg = "Hello World";
		
		byte[] byteArray=msg.getBytes();
		fos.write(byteArray);
		fos.close();
		
	}

}
