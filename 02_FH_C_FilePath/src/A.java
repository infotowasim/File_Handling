import java.io.File;
public class A {
	public static void main(String[] args) {
		
		try {
			File file=new File("C://12pm//test.txt");
			
			boolean createNewFile1 = file.createNewFile();
			System.out.println(createNewFile1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
