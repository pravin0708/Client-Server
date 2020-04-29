import java.net.*;
import java.io.*;
public class ClientEvenOdd

{
	public static void main(String args[])throws Exception
	{
		Socket sck=new Socket("localhost",818);
		BufferedReader in=new BufferedReader(new InputStreamReader(sck.getInputStream()));
		PrintStream out=new PrintStream(sck.getOutputStream());
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a no.:");
		String msg=input.readLine();
		out.println(msg);
		String s=in.readLine();
		System.out.println(s);
	}
}