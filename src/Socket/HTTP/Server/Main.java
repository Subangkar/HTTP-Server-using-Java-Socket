package Socket.HTTP.Server;


import java.io.*;
import java.net.ServerSocket;

public class Main {
	private static final int PORT = 8080;
	static PrintWriter logFile;
	static String logger;
	
	public static void main( String[] args ) throws IOException {
		
		ServerSocket serverConnect = new ServerSocket( PORT );
		System.out.println( "Server started.\nListening for connections on port : " + PORT + " ...\n" );
		logFile = new PrintWriter( new FileOutputStream( "log.txt"));
		while (true) new ClientManager( serverConnect.accept() ).start();
	}
	
	
}




