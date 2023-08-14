import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		
		try {
			FileWriter fileWriter=new FileWriter("C://12pm//t2.txt");
			
			fileWriter.write(100);
			fileWriter.write("mithu");
			fileWriter.write("100");
			
			fileWriter.flush();
			
			char[] ch= {'a','b','c','d'};
			fileWriter.write(ch);
			
			fileWriter.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
