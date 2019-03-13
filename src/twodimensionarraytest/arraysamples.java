package twodimensionarraytest;

import java.util.Random;

public class arraysamples 

{

	public static void main(String[] args) 
	{
		Random rand= new Random();
		int random= rand.nextInt(10)+1;
	//int[][] arr2D; //just a variable capable or holding an array
		int[][] arr2D= new int[5][6]; //rows, columns
		
		//statement that makes 1,4=7
		arr2D[1][4]=7;
		//series of for loops to fill the array with random numbers from 1-10;

		for(int row=0;row<arr2D.length;row++)
		{
			for(int column=0; column<arr2D[row].length;column++) 
			{
				arr2D[row][column]=rand.nextInt(10)+1;
				
			}
		}
		
		for(int row=0;row<arr2D.length;row++)
		{
			for(int column=0; column<arr2D[row].length;column++) 
			{
				System.out.print(arr2D[row][column]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
