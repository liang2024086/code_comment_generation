package methodEmbedding.Counting_Sheep.S.LYD1249;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        for (int i=1;i<=t;i++) {
        	int n = cin.nextInt();
        	HashSet<Integer>hs = new HashSet<Integer>();
        	
        	int last = 0;
        	boolean forever = false;
        	for (int j=1;j<1000;j++){
	        	last = j*n;
        		int tmp = last;
	        	while (tmp>0) {
	        		hs.add(tmp%10);
	        	    tmp = tmp/10;
	        	}
	        	if (hs.size()==10) {
	        		forever = true;
	        		break;
	        	}
        	}
        	
        	if (!forever) System.out.println("Case #"+i+": INSOMNIA");
        	else System.out.println("Case #"+i+": "+last);
        }
    }
}
