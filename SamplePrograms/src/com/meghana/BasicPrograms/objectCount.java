package com.meghana.BasicPrograms;

public class objectCount
{

	public static int NoOfObjectsCreated = 124;
	public String Name;
	public int size = 0;

	public objectCount(String N) 
	{
		int n = 0;
		n = n + 1;
		this.Name = N;
		NoOfObjectsCreated = NoOfObjectsCreated + 1;
		size = size + 1;
	}

	public static int GetANumber() 
	{
		int n = 10;
		return n;
	}

	public int GetSize() 
	{
		return this.size = NoOfObjectsCreated;

	}

	
}
