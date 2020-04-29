import java.net.*;
import java.io.*;
public class ServerPass
{
public static void main(String args[])throws Exception
{
String vpass="admin";
ServerSocket s=new ServerSocket(818);
Socket sck=s.accept();
BufferedReader in=new BufferedReader(new InputStreamReader(sck.getInputStream()));
PrintStream out=new PrintStream(sck.getOutputStream());
String pass=in.readLine();
if(vpass.equals(pass))
out.println("correct password");
else
out.println("incorrect password");
}
}
