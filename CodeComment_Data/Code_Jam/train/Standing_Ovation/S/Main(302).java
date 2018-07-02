package methodEmbedding.Standing_Ovation.S.LYD2088;

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args)throws IOException{
	int test,count=1;
	BufferedReader readTxt=new BufferedReader(new FileReader(new File("A-small-attempt4.in")));
    String textLine="";
    String str="";
     while(( textLine=readTxt.readLine())!=null){
            str+=textLine+" ";
      }
    String[] numbersArray=str.split(" ");
	int n=0;
	int simple=1;
	char [] a=numbersArray[0].toCharArray();
	for (int l=numbersArray[0].length()-1;l>=0;l--){
			int x=a[l] - '0';
			n+=x*simple;
			simple*=10;
		}
	//System.out.print(n);
	int [] add = new int [n+1];
	for (int i=1;i<n+1;i++){
		//System.out.println(numbersArray[i]);
		add[count] =0;
		char [] s = numbersArray[i*2].toCharArray();
		int [] people = new int [numbersArray[i*2].length()];
		for (int l=0;l<numbersArray[i*2].length();l++){
			people[l]=s[l] - '0';
		}
		if(numbersArray[i*2].length()!=1)
		{
			if(numbersArray[i*2].length()==2)
				{
					if(people[0]==0)
					add[count]=1;
				}
			else{
				int k,m;
				for (k=1;k<numbersArray[i*2].length();k++)
				{
					if(people[k]!=0){
						int sum =0;
						for (int j=0;j<k;j++){
								sum+=people[j];
							}
						m = sum+add[count];
						//System.out.println(m+" "+add[count]);
						if(k>m){
								int d = k-m;
								add[count]+=d;
						}
						else
						continue;
					}
					
				}
		    }
	    }
		count++;
	}
    FileWriter fw = new FileWriter("output.txt");  
    BufferedWriter bufw = new BufferedWriter(fw);  
        String line = null;  
        for(int i=1;i<count;i++){  
            bufw.write("Case #"+i+": "+add[i]);  
            bufw.newLine();  
            bufw.flush();  
        }  
    bufw.close();   

}  

	
	
	/*for(int i=1;i<count;i++){
		if(i==count-1)
		System.out.print("Case #"+i+": "+add[i]);
		else 
		System.out.println("Case #"+i+": "+add[i]);
	}*/
	
	
}
