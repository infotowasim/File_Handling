import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C {

	public static void main(String[] args) {
		
		try {
			File file=new File("C://12pm//t3.txt");
			FileReader fileReader1=new FileReader(file);
			
			char[] cs= new char[(int) file.length()];
			fileReader1.read(cs);
			
			for (char c : cs) {
				System.out.println(c);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
