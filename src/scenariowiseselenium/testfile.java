package scenariowiseselenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testfile {

	public static void main (String[] args) throws IOException {
		
		FileReader file1 = new FileReader("C:\\Users\\Punam\\Desktop\\First.txt");
		FileReader file2 = new FileReader("C:\\Users\\Punam\\Desktop\\Second.txt");
		
		
		BufferedReader r1 = new BufferedReader(file1);
		BufferedReader r2 = new BufferedReader(file2);
		
		String s1= r1.readLine();
		String s2= r2.readLine();
		
		boolean areequal=false;
		
		while (s1 !=null && s2 != null) {
			if (s1.equalsIgnoreCase(s2)) {
				areequal = true;
			}else {
				areequal=false;
			}
			break;
		}
		
		if (areequal) {
			System.out.println("Files same");
		}else {
			System.out.println("Files different");
		}
		
		
	}
}
