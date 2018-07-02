package methodEmbedding.Standing_Ovation.S.LYD1782;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
	File input = new File("input.txt");
	File output = new File("output.txt");
	PrintWriter writer = null;
	try {
		Scanner scn=new Scanner(input);
		writer = new PrintWriter(output);
		int num=scn.nextInt();
		scn.nextLine();
		int casenum=0;
		while(scn.hasNext()){
		casenum++;
		String current=scn.nextLine();
		String [] splitCurr=current.split(" ");
		int size=Integer.parseInt(splitCurr[0]);
		int res=0;
		int sum=0;
		for(int i=0;i<=size;i++){
			if(i>(sum+res)){
				res=res+(i-sum-res);
			}
			sum=sum+Integer.parseInt(splitCurr[1].charAt(i)+"");
		}
		writer.println("Case #"+casenum+": "+res);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	finally{
		writer.close();
	}
}
}
