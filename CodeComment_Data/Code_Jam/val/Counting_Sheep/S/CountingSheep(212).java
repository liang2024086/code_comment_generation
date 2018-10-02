package methodEmbedding.Counting_Sheep.S.LYD1463;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CountingSheep {
	public static void main(String[] args) throws IOException{
		File fOut=new File(System.getProperty("user.dir")+"/A.out.txt");
		fOut.delete();
		fOut.createNewFile();
		Scanner in = new Scanner(new File(System.getProperty("user.dir")+"/A.txt"));
		FileWriter out=new FileWriter(fOut);
		int trials=in.nextInt();
		for(int caseNum=1;caseNum<trials+1;caseNum++){
			int num=in.nextInt();
			if(num==0){
				out.write("Case #"+caseNum+":"+" INSOMNIA"+"\n");
				continue;
			}
			short[] digits=new short[20];
			short[] original=new short[(int)Math.floor(Math.log10(num))+1];
			boolean[] countedDigits=new boolean[10];
			int count=0;
			
			for(int i=0;i<original.length;i++){
				original[i]=(short) (num%10);
				num/=10;
			}
			
			int length=original.length;
			System.out.println(length);
			while(count<10){
				for(int i=0;i<length;i++){
					if(i<original.length){
						digits[i]+=original[i];
					}
					
					if(digits[i]>9){
						digits[i]-=10;
						digits[i+1]++;
						if(i==length-1)
							length++;
					}
					
					if(!countedDigits[digits[i]]){
						countedDigits[digits[i]]=true;
						count++;
					}
				}
			}
			
			int lastNum=0;
			for(int i=length-1;i>=0;i--){
				lastNum*=10;
				lastNum+=digits[i];
			}
			
			
			
			out.write("Case #"+caseNum+": "+lastNum+"\n");
		}
		in.close();
		out.close();
	}
}
