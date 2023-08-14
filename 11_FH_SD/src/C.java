import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class C {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis=new FileInputStream("C://12pm//fileobj.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		A a2=(A) ois.readObject();
		
		System.out.println(a2.name);
		System.out.println(a2.city);
		System.out.println(a2.password);
		
	}

}
