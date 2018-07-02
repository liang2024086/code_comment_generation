package methodEmbedding.Counting_Sheep.S.LYD173;



	import java.util.*;
	import java.io.*;
	public class main {
	  public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	    boolean [] m = new boolean[11];
	    boolean m0 = false;
	    int j= 0;
	    int k;
	    int p;
	      int n = in.nextInt();
	      	while(true){
	      		j++;
	      		p = j*n;
	      		k = p%10000;
	      		if(p>20000 || p==0){ m0=true; break;}
	      //		System.out.println(k);
	      		while(k>0){
	      			m[k%10] = true;
	      			k=k/10;
	      		}
	      		
	      	/*	System.out.println(
	      				"0:" + m[0] +
	      				"\n1:" + m[1] +
	      				"\n2:" + m[2] +
	      				"\n3:" + m[3] +
	      				"\n4:" + m[4] +
	      				"\n5:" + m[5] +
	      				"\n6:" + m[6] +
	      				"\n7:" + m[7] +
	      				"\n8:" + m[8] +
	      				"\n9:" + m[9] +
	      				"\n"
	      				);*/
	      		if (m[0] && m[1] && m[2] && m[3] && m[4] && m[5] && m[6] && m[7] && m[8] && m[9]) break;
	      	  
	      	}
	      
	    	
	    	  
	      
	      
	      		
	      		
	      if(m0)
	    	  System.out.println("Case #" + i + ": INSOMNIA" );
	      else
	    	  System.out.println("Case #" + i + ": " + p );
	    }
	  }
	}
