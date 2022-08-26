class Throws_Div
{
	private static int div(int a,int b)throws Exception
	{
	int result=a/b;
	return result;
	}
	private static int div(int a,int b,int c)
	throws Exception
	{
		int r=div(a,b);
		int result=r/c;
		return result;
	}
	public static void main(String arg[])
	{
		try
		{
		int result=div(10,0,2);
		System.out.println("Division:"+result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Good Bye");
	}
}