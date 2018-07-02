package methodEmbedding.Cookie_Clicker_Alpha.S.LYD930;

import java.io.*;//for file and ioexception
import java.util.Scanner;//for scanner

public class Main {
	public static void main (String[] args){
	try{
		Scanner reader=new Scanner(new File("input.txt"));
		//System.out.print("no error");
		PrintWriter writer=new PrintWriter(new File("output.txt"));
		//System.out.print("no error");
		int numCases=reader.nextInt();
		//System.out.print("no error");
		for (int i=0; i<numCases;i++){
			//System.out.print("no error");
			double farmCost=reader.nextDouble();
			//System.out.print("no error");
			double rateInc=reader.nextDouble();
			//System.out.print("no error");
			double goal=reader.nextDouble();
			//System.out.print("no error");
			System.out.print("farmCost: "+farmCost+"rateInc: "+rateInc+"goal: "+goal);
			double sec1=0;
			double sec2=0;
			sec1=goal/2;
			sec2=(farmCost/2)+(goal/(2+rateInc));
			System.out.print("\n"+sec1+"\n"+sec2);
			int count=2;
			double tempSec=0;
			while (sec2<sec1){
				sec1=sec2;
				tempSec=farmCost/2;
				double newRate=2;
				for (int x=0;x<count;x++){
					newRate=newRate+rateInc;
					if (x==count-1){		//last time through
						tempSec=tempSec+(goal/newRate);
					}
					else{
						tempSec=tempSec+(farmCost/newRate);
					}
				}
				sec2=tempSec;
				count++;
				System.out.print("\n"+sec1+"\n"+sec2);
			}
			int caseNum=i+1;
			writer.println("Case #"+caseNum+": "+sec1+"\n");
			System.out.print("\n"+"Final:"+sec1);
		}
		writer.close();
	}
	catch(Exception e){
		System.out.print("File not found");
	}
}
}
