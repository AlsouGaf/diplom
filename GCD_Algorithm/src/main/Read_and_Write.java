package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read_and_Write {

	public static String read_from_file(String file_name) throws IOException{
		FileInputStream f = new FileInputStream(file_name + ".txt");
	    byte[] str = new byte[f.available()];
	    f.read(str);
	    f.close();
	    
	    String message = new String(str);
	    return message;
	}
	
	public static void write_in_file(String file_name, String message) throws IOException{
		FileOutputStream f_out = new FileOutputStream(file_name + ".txt");
		f_out.write(message.getBytes());
		f_out.close();
	}
}
