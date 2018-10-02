package methodEmbedding.Standing_Ovation.S.LYD30;

import java.util.Scanner;
public class PorblemA {
	
	// written by Saar Jacob-Fanani //
	
	public static void main(String[] args) {
		
		// define variables //
		
		//--input vars--//
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int [] intArr = new int[t];
		String[] strArr = new String[t];
		String temp;
		scan.nextLine();
		//-------------//
		
		//--output vars--//
		int stand=0;
		int friends=0;
		//--------------//
		
		
		
		for(int i=0;i<t;i++)
		{
			temp = scan.nextLine();
			String[] parts = temp.split(" ");
			intArr[i]=Integer.parseInt(parts[0]);
			strArr[i]=parts[1];
		}
		
		for(int k=0;k<t;k++)
		{
			stand=0;
			friends =0;
			
			for(int i=0; i<=intArr[k]; i++)
			{
				if(stand>=i)
				{
					stand=stand+Character.getNumericValue(strArr[k].charAt(i));
				}
				else
				{
					friends=friends+i-stand;
					stand=i+Character.getNumericValue(strArr[k].charAt(i));
				}
			}
			System.out.println("Case #"+(k+1)+": "+friends);
		}
		
	}

}
