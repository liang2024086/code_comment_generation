package methodEmbedding.Magic_Trick.S.LYD379;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class google_code1 {
	int max = 12;
	int hint1,hint2;
	String result[];
	int magic;
	int cardNo;
	Integer[][] cards = new Integer[4][4];
	Integer[][] cards2 = new Integer[4][4];

	
		public static void main(String[] args) throws IOException {
			new google_code1();
		}
		
		 google_code1() throws IOException {
//			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
			 Scanner sc=new Scanner(System.in);
			int cases= sc.nextInt();
			result = new String[cases];
			for(int i=0;i<result.length;i++)
			{
				hint1=sc.nextInt();
				for(int j=0 ;j<4;j++)
				{
					for(int k=0 ;k<4;k++)
				{
					cards[j][k] =sc.nextInt();
				}
				}
				hint2 = sc.nextInt();
				for(int j=0 ;j<4;j++)
				{
					for(int k=0 ;k<4;k++)
				{
					cards2[j][k] =sc.nextInt();
				}
				}
			
			int temp=0;
			magic=0;
			for(int j=0;j<4;j++)
			{
				while(temp<4)
				if(cards2[hint2-1][j] == cards[hint1-1][temp++])
				{  cardNo = cards2[hint2-1][j];
					magic++;}
			temp =0;
			}
			if(magic>1) result[i]="Bad magician!";
			if(magic == 1)result[i]= ""+cardNo+"";
			if(magic ==0) result[i] = "Volunteer cheated!";
			}
			
			int j=1;
			for(String i:result)
			{
				System.out.println("Case #"+j+": "+i);
			j++;
			}
		}
	}

