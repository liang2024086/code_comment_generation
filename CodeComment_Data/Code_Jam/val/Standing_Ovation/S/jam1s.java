package methodEmbedding.Standing_Ovation.S.LYD127;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Collection;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Math;
 
class jam1{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(br.readLine());
      int t;
      t = Integer.parseInt(st.nextToken());
      int m =0;
      while(t-- != 0){
      	m++;
      	int total = 0, need = 0,i;
      	st=new StringTokenizer(br.readLine(), " ");
      	int x = Integer.parseInt(st.nextToken());
      	String s = st.nextToken();
      	//char []s = shy.toCharArray();
      	total = s.charAt(0) - '0';
      //	System.out.println("tot "+total);
      	for (i =1;i<x+1 ;i++ ) {
      		if (i> total) {
      			need += (i-total);
      			total = i+(s.charAt(i)-'0');
      		//	System.out.println("shy "+i);
      		//	System.out.println("need "+need);
      		//	System.out.println("totif "+total);

      		}
      		else{
      			total += s.charAt(i)-'0';
      		//	System.out.println("tot "+total);
      		}
      	}

      	System.out.println("Case #"+m+": "+need);
      
      }
	}
}
