package Lesson11ClassProgramms;

import java.io.*;

public class ObjectFiles
{
	public static void main(String[] args)
	{
		Human x = new Human("Mary", 22);
		Human y = new Human("John", 18);
		Human hr1, hr2;

		try
		{
			FileOutputStream f = new FileOutputStream("Family.dat");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(x);
			o.writeObject(y);
			o.close();

		} catch(IOException e)
		{
			System.out.println(e.getMessage());
		}


		try
		{
			FileInputStream f = new FileInputStream("Family.dat");
			ObjectInputStream o = new ObjectInputStream(f);
			hr1 = (Human)o.readObject();
			System.out.println(hr1);
			hr2 = (Human)o.readObject();
			System.out.println(hr2);
			o.close();

		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
