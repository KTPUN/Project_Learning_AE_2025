

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void readfile() throws Exception
	{
		File f =new File("./DataFolder/xyz.txt");
		FileReader fr =new FileReader(f);
		int r =fr.read();
		while (r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}
	}
	
	public static void main(String[] args) throws Exception {
		readfile();
	
	}

}
