package com.bridgelabz.Functional_programs;

import java.util.Scanner;

public class DistanceUsingEuclideanFormula 
{

	public static void FindDistance(int x, int y)
	{
		double distance;
		//distance=Math.sqrt(x*x+y*y);
		
		
		distance=(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) ));
		System.out.println("The distance is " +distance);
		
	
	
	
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
      	System.out.println("Enter the value for x:");
	  Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter the value for y:"); 
	int y=sc.nextInt();
	FindDistance(x, y);
	
	}

}