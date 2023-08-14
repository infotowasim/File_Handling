import java.io.File;

public class A {

	public static void main(String[] args) {
		
		File file=new File("C://11pm");
		boolean mkdir1 = file.mkdir();
		System.out.println(mkdir1);
		
		boolean delete1 = file.delete();
		System.out.println(delete1);

	}

}
