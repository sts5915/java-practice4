package IO.file;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File dir = new File("C:"+File.separator+"aaa");
		File file = new File(dir, "pororo.jpeg");
		
		FileInputStream fis = new FileInputStream(file);
		
		FileOutputStream fos = new FileOutputStream(dir + File.separator+"Copy.jpeg");
		
		while(true) {
			int data = fis.read();
			if(data==-1) {
				break;
			}
			fos.write(data);
		}
		fis.close();
		fos.close();
		
		

	}

}
