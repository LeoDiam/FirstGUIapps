package Lesson11ClassProgramms;

import java.io.Serializable;

public class Human implements Serializable
{
	String name;
	int age;

	public Human(String n, int a)
	{
		name = n;
		age = a;
	}

	public String toString()
	{
		return name;
	}

}