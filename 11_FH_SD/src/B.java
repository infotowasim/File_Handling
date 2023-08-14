import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("C://12pm//fileobj.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		A a1=new A();
		oos.writeObject(a1);
		
		oos.close();
		fos.close();
		
		

	}

}
