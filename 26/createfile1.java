
class createfile1
{
	public static void main(String args[])
	{
	
		System.out.println("Trying to create a new file ...");
		createfile2 c = new createfile2();
		c.openFile();
		c.addRecords();
		c.closeFile();
		
	}

}
