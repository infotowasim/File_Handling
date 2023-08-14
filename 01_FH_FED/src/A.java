import java.io.File;
public class A {
	public static void main(String[] args) {
		
		// File Finding, Existing, Deleting
		File file= new File("C://12pm//test.txt");
		System.out.println(file);
		
		boolean exists1 = file.exists();
		System.out.println(exists1);
		
		boolean delete1 = file.delete();
		System.out.println(delete1);
	}
}
