import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws Exception {
		
		
		FileWriter fileWriter1=new FileWriter("C://12pm//t5.txt");
		BufferedWriter bufferedWriter1=new BufferedWriter(fileWriter1);
		

		bufferedWriter1.write(1000);
		bufferedWriter1.write("wasim");
		bufferedWriter1.write("2000");
		
		char[] ch= {'a','b'};
		bufferedWriter1.write(ch);
		
		bufferedWriter1.close();
		fileWriter1.close();
	}

}
