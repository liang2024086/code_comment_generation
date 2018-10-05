package methodEmbedding.Standing_Ovation.S.LYD86;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ovation {
	
    public static void main(String[] args) throws Exception {
    	
    	 File file = new File("C:\\Codejam\\A-small-attempt1.in");
    	 File outFile = new File("C:\\Codejam\\A-small-practice.out");
    	 //File file = new File("C:\\Codejam\\A-large-practice.in");
    	 //File outFile = new File("C:\\Codejam\\A-large-practice.out");
    	 BufferedReader br = new BufferedReader(new FileReader(file));
    	 BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
    	 int testCases = Integer.parseInt(br.readLine());
    	 for(int t=1;t<=testCases;t++){
			 String s1 = br.readLine();
    		 String s2[] = s1.split("\\s+");
    		 int n=Integer.parseInt(s2[0]);
    		 int s3[]=new int[n+1];
    		 for (int i=0;i<=n;i++){
        		 s3[i]=Character.getNumericValue(s2[1].charAt(i));
    		 }
    		 int c=0;
    		 int f=0;
    		 for(int i=0;i<=n;i++){
   				if(i>c){
   					
   					f=f+(i-c);
   					c+=s3[i]+(i-c);
    			}
   				else{
   					c+=s3[i];
    					
    			}
    		 }
    		 bw.write("Case #" + t +": "+f);
    		 bw.write("\n");
    		
    	 }
    	 br.close();
    	 bw.close();
    }
}
