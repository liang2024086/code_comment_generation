package methodEmbedding.Magic_Trick.S.LYD206;

import java.util.Scanner;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException
	{
		
		Scanner scan = new Scanner(new File("/home/jchamp/GoogleJam/QualA/src/input"));
		
		int t = scan.nextInt();
		int cases = 0;
		while(cases < t){
			cases++;
			System.out.print("Case #" + cases + ": ");
			int row = scan.nextInt();
			int x = (row * 4) - 4;
			while(x > 0){
				scan.nextInt();
				x--;
			}
			int[] values = new int[4];
			for(int i = 0; i < values.length; i++){
				values[i] = scan.nextInt();
			}
			
			x = (4 - row) * 4;
			while(x > 0){
				scan.nextInt();
				x--;
			}
			row = scan.nextInt();
			x = (row * 4) - 4;
			while(x > 0){
				scan.nextInt();
				x--;
			}
			int[] newValues = new int[4];
			for(int i = 0; i < newValues.length; i++){
				newValues[i] = scan.nextInt();
			}
		
			x = (4 - row) * 4;
			while(x > 0)
			{
				scan.nextInt();
				x--;
			}
			
			int count = 0;
			int answer = 0;
			
			for(int i = 0; i < values.length; i++)
			{
				for(int j = 0; j < newValues.length; j++)
				{
					if(values[i] ==  newValues[j]){
						count++;
						answer = values[i];
						break;
					}
				}
				if(count > 1)
				{
					break;
				}
			}
			
			switch(count)
			{
				case 0:
					System.out.println("Volunteer cheated!");
					break;
				case 1:
					System.out.println(answer);
					break;
				default:
					System.out.println("Bad magician!");
			}
		}
		scan.close();
	}
}
