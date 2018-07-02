package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1116;

import java.io.*;
import java.util.*;
class cake {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for (int j=1;j<=t;j++) {
        String st=new String();
        st=s.next();
        int length=1;
        for (int i=0;i<st.length()-1;i++) {
            if (st.charAt(i)!=st.charAt(i+1)) {
                length++;
            }
        }
      
        if (st.charAt(st.length()-1)=='-') {
            System.out.println("Case "+"#"+j+": "+length);
        }
        else
            System.out.println("Case "+"#"+j+": "+(length-1));
    }
	}
}
