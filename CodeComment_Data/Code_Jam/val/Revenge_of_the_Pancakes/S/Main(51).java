package methodEmbedding.Revenge_of_the_Pancakes.S.LYD444;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("B-small-attempt3.in"));
        PrintWriter pw = new PrintWriter("B-small-attempt3.out");
    	StringTokenizer str = null;
		// str = new StringTokenizer(br.readLine());
	/*	int[] a = new int[65536];
        a[1] = 1;
        for (int i = 2; i <= 1000; i++) {
            a[i] = 0;
        }
        for (int i = 2; i <= 1000000; i++) { 
            if (a[i] == 1) 
                continue;
            for (int j = i + i; j <= 1000000; j += i) { 
                a[j] = 1;
            }
        }*/       
    	
        int t = Integer.parseInt(br.readLine());
      
        int no = 0;
      
         while(t-->0) {
        	no++;
            StringBuffer line = new StringBuffer(br.readLine());
            String answer="";
            for(int i = 0 ; i < line.length(); i++){
            	answer +="+";
            	
            }
            int cnt = 0;
            int n = 1;
            while(! line.toString().equalsIgnoreCase(answer )){
            	char temp = line.charAt(n-1);
            	
                 while(n <line.length() && line.charAt(n)==temp){
                 	n++;
                 }
                 if(temp=='-'){
                	 temp = '+';
                 }
                 else{
                	 temp = '-';
                 }
                 for(int i = 0 ; i <= n-1; i++){
            		 line.setCharAt(i, temp);
            	 }
            	 
            	 cnt++;
            }
           
          
            //  System.out.println("Case #"+no+": "+cnt);
              pw.println("Case #"+no+": "+cnt );
            
            
			 //   System.out.println("Case #"+no+": "+(n1-n));
			
			
          //  System.out.println(String.format("%.7f", temp));
          //  pw.println("Case #"+no+": "+String.format("%.7f", temp) );
            
        }
        br.close();
        pw.close();
    }
}
