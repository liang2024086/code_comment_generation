package methodEmbedding.Standing_Ovation.S.LYD502;



import java.util.Scanner;
import java.io.*;
public class code1 {

public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	int nooftries=0,cases=0,sum=0,count=0,temp=0,den=10;
	
	int[] ppl=null;
		File file=new File("src/input.rtf");
    Scanner scan =new Scanner(file);
    nooftries=scan.nextInt();
    for(int i=1;i<=nooftries;i++)
    {
    	cases=0;sum=0;count=0;temp=0;den=10;
    	cases=scan.nextInt();
    	ppl=new int[cases+1];
    	//
    	den=(int) Math.pow(den,cases);
    	temp=scan.nextInt();
    	for(int j=0;j<=cases;j++)
        	{
    		ppl[j]= temp/den;
    		temp=temp-(ppl[j]*den);
    		den=den/10;
        	}
        	
    	//
    	if (ppl[0]==0)
    		{ppl[0]+=1;count++;sum++;}
    	else
    		sum=ppl[0];
    	for (int j=1;j<=cases;j++)
    	{  if(ppl[j]>0 && j>sum)
    		{
    		count+=(j-sum);
    		ppl[sum]+=(j-sum);
    	    	sum+=j-sum;
    		}
    		
    	sum+=ppl[j];
    	}
    	System.out.println("Case #"+i+":"+count);    	
    	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.rtf", true)))) {
    	    out.println("Case #"+i+": "+count);
    	}catch (IOException e) {
    	    //exception handling left as an exercise for the reader
    	}
    }
	}

}
