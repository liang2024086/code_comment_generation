package methodEmbedding.Magic_Trick.S.LYD333;

//Byung Joo Shin bs5ht CS 4102 hw5.java Floryan Due: March. 29, 2014
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Stack;
import java.io.File; 
import java.io.FileOutputStream; 
import java.io.PrintStream;
public class hw5
{
	
public static void main(String[] args) throws FileNotFoundException
{
    if(args.length <= 0)
	{
	    System.out.println("no file input in command line");
	    System.exit(0);
	}
    Scanner inputReader= null;
     File file = new File(args[0]);
    try
        {
	    inputReader = new Scanner(file);	
	}
	catch(FileNotFoundException e)
	{
	    System.out.println("File not found");
	    System.exit(0);
	}

	
 
	FileOutputStream out = new FileOutputStream(new File("out.txt")); 
    PrintStream f= new PrintStream(out); 
    //make sure to test for multiple inputs

	int testCases = Integer.parseInt(inputReader.nextLine());
	for( int x =1; x<= testCases; x++)
	{
		String bypass = inputReader.nextLine();
		while(bypass.length() != 1)
				{
					bypass= inputReader.nextLine();
					
				}
		int firstRow = Integer.parseInt(bypass);
		
		int lookAhead = 0;
		for( int y = 1; y<firstRow; y++)
			inputReader.nextLine();
		String goodLine = inputReader.nextLine(); //actual line
		
		String nextLine = goodLine;
		while(nextLine.length() != 1)
		{
			nextLine = inputReader.nextLine();
		}
		int secondRow = Integer.parseInt(nextLine);
		
		Scanner rowReader = new Scanner(goodLine);
		ArrayList<Integer> candidates = new ArrayList<Integer>();
		while(rowReader.hasNextInt())
			candidates.add(rowReader.nextInt());

		for( int y = 0; y<secondRow; y++)
{
			nextLine = inputReader.nextLine();
			
		}
		
		rowReader = new Scanner(nextLine);
		int numSolutions  = 0;
		ArrayList<Integer> solutions = new ArrayList<Integer>();
		//System.out.println(candidates);
		//System.out.println(nextLine);
		for( int  i =0; i<candidates.size(); i++)
		{
			int newNum = rowReader.nextInt();
			//System.out.println(newNum);
			if(candidates.contains((Integer)newNum))
			{
				numSolutions++;
				solutions.add(newNum);
				
			}
		}
		//System.out.println(numSolutions);
		if(numSolutions <= 0)
		{
			f.println("Case #" + x + ": " + "Volunteer cheated!");
		}
		else if( numSolutions == 1)
		{
			f.println("Case #" + x + ": " + solutions.get(0));
			}
		else
		{
			f.println("Case #"  +x +": "+"Bad Magician!");
			
		}
	
	}
}
}


