import java.net.*;
import java.io.*;
public class ServerEvenOdd
{
	public static void main(String args[])throws Exception
	{
		ServerSocket s=new ServerSocket(818);
		Socket sck=s.accept();
		BufferedReader in=new BufferedReader(new InputStreamReader(sck.getInputStream()));
		PrintStream out=new PrintStream(sck.getOutputStream());
		int no=Integer.parseInt(in.readLine());
		if(no%2==0)
		out.println("number is Even");
		else
		out.println("number is Odd");
	}
}