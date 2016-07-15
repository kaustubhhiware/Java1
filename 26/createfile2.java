import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile2
{
	private Formatter x;

	public void openFile()
	{
		try
		{
			x = new Formatter("chinese.txt");
			System.out.println("Done ");
		}
		catch(Exception e)
		{
			System.out.println("Error aaya re!");
		}
	}
	public void addRecords()
	{
		x.format("%s%s%s","Kaustubh ","Hiware ","19");
	}

	public void closeFile()
	{
		x.close();
	}

	




}
