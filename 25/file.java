import java.io.File;

//creating file require util
import java.util.*;

class file
{
	public static void main(String args[])
	{
		File x = new File("hodor.txt");

		if(x.exists())
		{
			System.out.println(x.getName()+"exists!");
		}
		else System.out.println("We have been betrayed!Arrgh!");

		/*Creating a new file*/

		final Formatter y;

		try
		{
			y = new Formatter("snow.txt");
			System.out.println("A new file has been made for you , Jon");			
		}
		catch(Exception e)
		{
			System.out.println("You know nothing, And I will do nothing for ya , Jon");
		}


	}

}
