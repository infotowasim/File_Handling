import java.io.File;

public class A {

	public static void main(String[] args) {
		
		File file=new File("C://12pm");
		
		String[] list1 = file.list();
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		System.out.println(list1.length);
	}

}
