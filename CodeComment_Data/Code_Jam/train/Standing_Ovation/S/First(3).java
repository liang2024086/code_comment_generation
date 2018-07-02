package methodEmbedding.Standing_Ovation.S.LYD146;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			Scanner scan = new Scanner(new File("/Users/chirag/Documents/Google/Qualification/src/input.txt"));
			int t=scan.nextInt();
			for(int i=0;i<t;i++)
			{
				int sm=scan.nextInt();
				int req=0;
				int present=0;
				String shy=scan.next();
				for(int j=0;j<shy.length();j++)
				{
					int cur=shy.charAt(j)-'0';
					if(cur!=0)
					{
						if(j<=(req+present))
						{
							present=present+cur;
						}
						else
						{
							req=j-present;
							present=present+cur;
						}	
					}	
				}
				System.out.println("Case #"+(i+1)+": "+req);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	}

}
