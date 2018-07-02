package methodEmbedding.Counting_Sheep.S.LYD385;

import java.util.*;
import java.io.*;
public class ctSheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int a = 1; a <= t; ++a) {
    	int n = in.nextInt();
    	int ct[] = new int[10];
    	int r=0;
    	int l=1;
    	boolean found = true;
    	for(int i=1;i<504;i++){
    		l = n*i;
    		found = true;
    		while(l>0)
    		{
    			r = l%10;
    			l = l/10;
    			ct[r] = 1;
    		}

    		for(int j=0;j<10;j++){
    			if(ct[j] == 0){
    				found = false;
    				break;
    			}
    		}
    		if(found == true){
    			l = n*i;
    			break;
    		}
    	}
    	if(found == true)
    		System.out.println("Case #" + a + ": " + l);
    	else
    		System.out.println("Case #" + a + ": INSOMNIA");
    }
}
}
