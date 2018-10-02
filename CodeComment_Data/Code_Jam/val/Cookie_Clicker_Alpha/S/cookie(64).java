package methodEmbedding.Cookie_Clicker_Alpha.S.LYD81;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cookie 
{
	static double sum=0.0000000D, Es=0.0000000D, Bs=0.0000000D,C=0.0000000D, F=0.0000000D,X=0.0000000D,temp=0.0000000D,tempsum=0.0000000D;
	static long bcount=0L;
    static long cases,count=0L;
	public static void main(String args[]) throws FileNotFoundException
	{
		File file = new File(System.getProperty("user.dir")+"/src/"+"B-small.in");
		File fileo = new File(System.getProperty("user.dir")+"/src/"+"B-small.out");
		PrintWriter writer = new PrintWriter(fileo); //writing output to a file
		DecimalFormat df=new DecimalFormat("0.0000000");
		Scanner scanner = new Scanner(file);
		cases = scanner.nextInt(); //getting no. of test cases
		
		while (scanner.hasNextLine())
        {
			sum=0.0000000D;
			Es=0.0000000D;
			Bs=0.0000000D;
			temp=0.0000000D;
			bcount=0;
			count++;
			C=scanner.nextDouble();
			F=scanner.nextDouble();
			X=scanner.nextDouble();
			//System.out.println(C+" "+F+" "+X);
			Es=X/(2+F*bcount);
			Bs=C/(2+F*bcount);
			sum=Es;
			while(true)
			{			
				
				bcount++;
				
				temp+=Bs;
				
				Bs=C/(2+bcount*F);
				
				Es=X/(2+bcount*F);
				
				tempsum=Es+temp;
				
			if(tempsum<sum)
			{
				sum=tempsum;
				
			}
			else
			{
				break;
			}
			}//end of inner while
			
			writer.println("Case #"+count+": "+df.format(sum));
        }//end of while
		writer.close();
	}//end of main

}
