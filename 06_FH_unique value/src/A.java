import java.io.FileReader;
public class A {

	public static void main(String[] args) {
		
		try {
			FileReader fileReader1=new FileReader("C://12pm//t3.txt");
			System.out.println(fileReader1.read());
			System.out.println(fileReader1.read());
			System.out.println(fileReader1.read());
			System.out.println(fileReader1.read());
			System.out.println(fileReader1.read());
			System.out.println(fileReader1.read());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
