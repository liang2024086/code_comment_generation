package methodEmbedding.Counting_Sheep.S.LYD1346;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter("A-small-attempt0.out");
    	StringTokenizer str = null;
		// str = new StringTokenizer(br.readLine());
		
		StringBuffer result = new StringBuffer();
                
       
        int t = Integer.parseInt(br.readLine());
      
        int no = 0;
        
        while(t-->0) {
        	no++;
            
        	long n = Long.parseLong(br.readLine());
        	int cnt=0;
        	int[] temp = new int[11];
        	long n1 = n;
        	if(n==0){
        		pw.println("Case #"+no+": INSOMNIA");
        	}
        	else{
				while (cnt < 10) {
					String aa = Long.toString(n1);
					int len = aa.length();
					for (int i = 0; i < len; i++) {
						int bb = aa.charAt(i) - 48;
						if (temp[bb] != 1) {
							temp[bb] = 1;
							cnt++;
						}

					}
					n1 += n;
				}
			 //   System.out.println("Case #"+no+": "+(n1-n));
				pw.println("Case #"+no+": "+(n1-n));
			}
        	
          //  System.out.println(String.format("%.7f", temp));
          //  pw.println("Case #"+no+": "+String.format("%.7f", temp) );
            
        }
        br.close();
        pw.close();
    }
}
