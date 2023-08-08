package IO.file;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator+"Copy.txt");
		
		byte[] byteArray = new byte[5];
		
		while(true) {
			int count = fis.read(byteArray);
			//데이터는 byte배열로 들어간다.
			//이때 반환되는 int는 몇개나 새로운 데이터를 읽었는지 count로 나온다.
			
			// a,b,c,d,e
			// f,g,c,d,e
			if(count==-1) {
				break;
			}
			fos.write(byteArray, 0, count);
			//byte 배열에 데이터를 0부터 새로 읽은 count 만큼만 쓴다
		}
		fis.close();
		fos.close();
	}

}
