import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		
		try {
			File file=new File("C://12pm//t3.txt");
			FileReader reader1=new FileReader(file);
			
			for(int i=0; i<file.length(); i++) {
				System.out.println(reader1.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
