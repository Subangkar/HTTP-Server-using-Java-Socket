package IO;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by Subangkar on 03-Nov-18.
 */
public class OutputWriter {
	OutputStream outputStream;
	public OutputWriter( OutputStream out ) {
		outputStream = out;
	}
	
	public void write(String msg) throws IOException {
		write( msg.getBytes( "UTF-8" ) );
	}
	public void writeLine(String msg) throws IOException {
		write( (msg+"\r\n").getBytes( "UTF-8" ) );
	}
	public void writeLine() throws IOException {
		write( ("\r\n").getBytes( "UTF-8" ) );
	}
	public void write(byte[] data) throws IOException {
		outputStream.write( data );
		outputStream.flush();
	}
	
	public void close() throws IOException {
		outputStream.close();
	}
}
