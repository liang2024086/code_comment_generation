package methodEmbedding.Standing_Ovation.S.LYD96;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Standing_ovation {
	public static void main(String args[])
	{
		File file=new File("C:\\Users\\Prerak_D\\Desktop\\Question.txt");
		try {
			Scanner input=new Scanner(file);
			
			int t=input.nextInt();
			int n=t-1;
			//int i=1;
			int p=1;
			while(t-->0)
			{
				
				long count=0,sum=0;
				//int max=input.nextInt();
				//input.next();
				if(t==n)
					input.nextLine();
				String aud=input.nextLine();
				String temp[]=aud.split(" ");
				//System.out.println(temp[1]);
				for(int i=0;i<temp[1].length();i++)
				{
					//System.out.println("sum is "+sum+" i is "+i);
					if(Character.getNumericValue(temp[1].charAt(i))!=0){
						//System.out.println("aud is "+aud.charAt(i));
						//System.out.println(Character.getNumericValue(temp[1].charAt(i)));
					
					if(sum<i)
						count+=i-sum;
						sum+=count;
					}
					sum+=Character.getNumericValue(temp[1].charAt(i));
				}
				System.out.println("Case #"+p+": "+count);
				p++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
