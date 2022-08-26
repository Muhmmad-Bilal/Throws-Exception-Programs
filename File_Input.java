import java.io.*;
class File_Input
{
	static void read()throws IOException
	{
		FileInputStream f=new FileInputStream("abc.txt");
		int size=f.available();
		byte data[]=new byte[size];
		f.read(data,0,size);
		String str=new String(data,0,size);
		System.out.println(str);
	}
	public static void main(String arg[])
	throws IOException{
					read();
		System.out.println("Good Bye");
		
	}
}