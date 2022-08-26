import java.io.*;
class File_Input_tryCatch
{
	static void read()
	throws IOException{
		FileInputStream f=new FileInputStream("abc.txt");
		int size=f.available();
		byte data[]=new byte[size];
		f.read(data,0,size);
		String str=new String(data,0,size);//convert byte array to into String
		System.out.println(str);
		
	}
	public static void main(String arg[])
	{
		try
		{
			read();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}