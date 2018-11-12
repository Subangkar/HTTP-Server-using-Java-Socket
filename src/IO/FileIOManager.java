package IO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Subangkar on 03-Nov-18.
 */
public class FileIOManager {
	
	public static String readFileToCharString( String path , Charset encoding )
			throws IOException {
		byte[] encoded = Files.readAllBytes( Paths.get( path ) );
		return new String( encoded , encoding );
	}
	
	public  static byte[] readFileBytes(String path) throws IOException {
		return Files.readAllBytes( Paths.get( path ) );
	}
	
}
