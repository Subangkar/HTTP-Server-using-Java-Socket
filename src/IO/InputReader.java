package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Subangkar on 03-Nov-18.
 */
public class InputReader {
	
	private BufferedReader bufferedReader;
	
	static final int INPUT_BUFFER_LENGTH = 1000;
	
	public InputReader( InputStream in ){
		bufferedReader = new BufferedReader( new InputStreamReader( in ) );
	}
	
	public String readNextLine() throws IOException {
		return bufferedReader.readLine();
	}
	
	public char[] read() throws IOException {
		char[] ch = new char[INPUT_BUFFER_LENGTH];
		bufferedReader.read( ch );
		return ch;
	}
	
	public void close() throws IOException {
		bufferedReader.close();
	}
}
