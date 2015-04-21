package BonusProject1;

//Program Name : date
//Author : Aaron Stahley	
//Date Written: 2/14/2015
//Class : date.java

public class date implements Comparable<date> 
{

	int month;
	int day;
	int year; 
	
	public date()
	{
		month = 1;
		day = 1;
		year = 1;
	}
	
	public date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setYear(int year)
	{
		this.year = year; 
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year; 
	}
	
	public int compareTo(date other) 
	{ 
		
		if(getDay() > other.getDay())
		{
			return 1;
		}
		else if(getDay() < other.getDay())
		{
			return -1;
		}
		else if(getMonth() > other.getMonth())
		{
			return 1;
		}
		else if(getMonth() < other.getMonth())
		{
			return -1;
		}
		else if(getYear() > other.getYear())
		{
			return 1;
		}
		else if(getYear() < other.getYear())
		{
			return -1;
		}
		else
			return 0; 
	}
	
	public String toString()
	{
		return day + "," + month + "," + year;
	}


}
