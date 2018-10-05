package methodEmbedding.Counting_Sheep.S.LYD1060;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CodeJam {
	 public static void main(String[] args) throws NumberFormatException, IOException {
	     	BufferedReader br = new BufferedReader(new FileReader("in.txt"));
	     	BufferedWriter bw=new BufferedWriter(new FileWriter("CountingSheep.txt"));
	        int []A=new int[10];
	        int T,N=0,k,j;
	        T = Integer.valueOf(br.readLine());
	        for (int i=0;i<T;i++)
	            {
	            for(int p=0;p<10;p++)A[p]=0;
	            k=0;
	            N=Integer.valueOf(br.readLine());
	            if(N==0){bw.write("Case #"+(i+1)+": INSOMNIA");bw.newLine();}
	            else
	                  for(j=N;true;j=j+N){
	                   { 
	                    if(String.valueOf(j).contains("0"))A[0]++;
	                    if(String.valueOf(j).contains("1"))A[1]++;
	                    if(String.valueOf(j).contains("2"))A[2]++;
	                    if(String.valueOf(j).contains("3"))A[3]++;
	                    if(String.valueOf(j).contains("4"))A[4]++;
	                    if(String.valueOf(j).contains("5"))A[5]++;
	                    if(String.valueOf(j).contains("6"))A[6]++;
	                    if(String.valueOf(j).contains("7"))A[7]++;
	                    if(String.valueOf(j).contains("8"))A[8]++;
	                    if(String.valueOf(j).contains("9"))A[9]++;
	                    for(k=0;k<10;k++){if(A[k]==0)break;}
	                   }
	                    if(k==10){bw.write("Case #"+(i+1)+": "+j);bw.newLine();break;}
	                  }
	        }
	        br.close();
	        bw.close();
	   }
}
