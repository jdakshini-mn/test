import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrintingFiles {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("/Users/jdakshini/filewriting/myTextFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//Writing in file
		
		writer.write("First Line1");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("test India");
		
		
		//Closing stream
		writer.close();
		
		System.out.println("File created !!!");
		
	}

}