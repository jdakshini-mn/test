package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Reading_Writing {

	public static void main(String[] args) throws IOException {
		// Create a Text File

			File file = new File(System.getProperty("user.dir")+"/test.txt");
			
			file.createNewFile();
			
			// Write in a text file
			
			FileWriter fw = new FileWriter(System.getProperty("user.dir")+"/test.txt");
			
			@SuppressWarnings("resource")
			BufferedWriter filewriter = new BufferedWriter(fw);
			
			filewriter.write("Please write inside this file");
			filewriter.newLine();
			filewriter.write("2nd line Please write inside this file");
			filewriter.newLine();
			filewriter.write("3rd line Please write inside this file");
			filewriter.newLine();
			filewriter.write("4th line Please write inside this file");
			filewriter.newLine();
			filewriter.write("");
			filewriter.newLine();
			filewriter.write("6th line Please write inside this file");
			
			
			filewriter.flush();
			
			
			// read a text file
			
			FileReader fr = new FileReader (System.getProperty("user.dir")+"/test.txt");
			BufferedReader fileReader = new BufferedReader (fr);
			
			String i="";
			/*System.out.println(fileReader.readLine());
			System.out.println(fileReader.readLine());*/
			
			while((i = fileReader.readLine()) != null){
				System.out.println(i);
			}
	}

}
