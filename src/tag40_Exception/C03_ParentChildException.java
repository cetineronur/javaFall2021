package tag40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;

public class C03_ParentChildException {

	public static void main(String[] args) {
		
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Onur\\eclipse-workspace\\javaFall2021\\src\\tag40_Exception\\yazi.txt");
		
		int k=0;
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
		}
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("gorev tamamlandi");
	}

}
