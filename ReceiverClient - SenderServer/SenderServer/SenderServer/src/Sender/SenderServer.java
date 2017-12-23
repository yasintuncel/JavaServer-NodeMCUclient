package Sender;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SenderServer
{
	static ServerSocket 	serverSocket;
	static int port = 8080;
	
	public static void main(String[] args) 
	{	
		try 
		{
			serverSocket = new ServerSocket(port);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		while (true)
		{
			try 
			{
            	System.out.println("Waiting for connection");
            	NodeSocket nodeSocket = new NodeSocket( serverSocket.accept() );
            	//System.out.println(nodeSocket.socket.getInetAddress().getHostAddress() + " is connected.");
				//System.out.println("Client> " + nodeSocket.GetData() );
				//System.out.println("");
            	String data = "I am a Server";
            	nodeSocket.SendData(data);
            	
            	try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
