package methodEmbedding.Standing_Ovation.S.LYD662;

import java.io.*;
import java.util.*;

class StandingOvation {


    public static void main(String[] args)throws Exception {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T=Integer.parseInt(br.readLine());

	for(int t=0;t<T;++t) {

	    int standing=0;
	    int res=0;

	    String S=br.readLine().split(" ")[1];
	    //	    System.out.println("The string is "+S);
	    for(int i=0;i<S.length();++i) {

		int digit=(int)(S.charAt(i)-'0');

		//		System.out.println("State res="+res+", standing="+standing+", digit="+digit);
		    if(res+standing<i) {
			res+=(i-(res+standing));
		    }
		    standing+=digit;
		    
	    }

	    System.out.println("Case #"+(t+1)+": "+res);
	}
	
	
    }
}
