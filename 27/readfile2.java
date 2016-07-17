import java.io.*;
import java.util.*;

public class readfile2
{

	private Scanner x;

	public void openFile()
	{
		try
		{
			x = new Scanner("chinese.txt");
		}
		catch(Exception e)
		{
			System.out.println("Unknown error , exiting compilation...");
		}
	}

	public void readfile()
	{
		while(x.hasNext())
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();

			System.out.printf("%s %s %s\n",a,b,c);
		}
	}

	public void closeFile()
	{
		x.close();
	}


}
