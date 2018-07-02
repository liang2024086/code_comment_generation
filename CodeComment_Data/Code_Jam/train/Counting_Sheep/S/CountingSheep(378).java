package methodEmbedding.Counting_Sheep.S.LYD264;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class CountingSheep {

	public static void main(String[] args) {
		Scanner read = new Scanner(new BufferedReader(new InputStreamReader(System.in)));		
		
		
		int t = read.nextInt();
		boolean[] count = new boolean[10];
		Arrays.fill(count, Boolean.FALSE);
		char[] strBuff;
		int currNum = 0;
		int pastNum = 0;
		boolean countComplete = true;
		read.nextLine();
		int caseNum = 1;
		
		while(t != 0)
		{
			pastNum = currNum = read.nextInt();
			for(int i = 0;i <= 200; i++)
			{
				if(currNum <= 0 && i == 0){
					countComplete = false;
					break;
				}
				
				currNum = pastNum*(i+1);
				
				strBuff = Integer.toString(currNum).toCharArray();
				for(int j = 0; j < strBuff.length; j++)
				{
					if(!count[Integer.parseInt(String.valueOf(strBuff[j]))])
					{
						count[Integer.parseInt(String.valueOf(strBuff[j]))] = true;
					}
				}
				
				for(int k = 0; k < 10; k++)
				{
					if(!count[k])
					{
						countComplete = false;
					}
				}
				if(countComplete)
				{
					break;
				}
				
				
				
				countComplete = true;
			}
			
			Arrays.fill(count, Boolean.FALSE);

			if(countComplete == false)
			{
				countComplete = true;
				System.out.println("Case #" + caseNum++ + ": INSOMNIA" );
				
			}
			else
			{
				System.out.println("Case #" + caseNum++ + ": " +  currNum);
				
			}
			currNum++;
			t--;
		}
		read.close();
	}

}
