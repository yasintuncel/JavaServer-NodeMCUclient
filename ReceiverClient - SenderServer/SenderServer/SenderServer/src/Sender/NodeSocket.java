package Sender;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class NodeSocket {
	
	Socket 				socket;
	
	DataOutputStream   	out;
    BufferedReader  	in;
    
    
	public NodeSocket(Socket s)
	{
		socket = s;
		
		try 
		{
			out = new DataOutputStream(s.getOutputStream());
	        in 	= new BufferedReader( new InputStreamReader	(	s.getInputStream()	 ));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
       
	}
	
	public String GetData() throws IOException
	{
		String data = "";
		data = (String)in.readLine();
		return data;
	}
	
	public void SendData(String data) throws IOException
	{
		out.writeChars(data);
		out.writeChar('>');
	}

}
