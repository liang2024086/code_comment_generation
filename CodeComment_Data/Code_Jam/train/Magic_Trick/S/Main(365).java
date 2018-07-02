package methodEmbedding.Magic_Trick.S.LYD1104;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
    	Scanner s = new Scanner(new FileReader("input.txt"));
    	PrintWriter p = new PrintWriter(new FileWriter("output.txt"));
    	int n = s.nextInt();
    	for(int i=0; i<n; i++) {
    		HashSet<Integer> set = new HashSet<Integer>();
    		int m = s.nextInt();
    		for(int j=0; j<4; j++)
    			for(int k=0; k<4; k++) {
    				if(j == m-1)
    					set.add(s.nextInt());
    				else
    					s.nextInt();
    			}
    		int num = -1;
    		int count = 0;
    		m = s.nextInt();
    		for(int j=0; j<4; j++)
    			for(int k=0; k<4; k++) {
    				if(j == m-1) {
    					int tmp = s.nextInt();
    					if(!set.add(tmp)) {
    						num = tmp;
    						count++;
    					}
    				}
    				else s.nextInt();
    			}
    		System.out.println(count + " " + num);
    		p.print("Case #" + (i+1) + ": ");
    		if(count == 0)
    			p.println("Volunteer cheated!");
    		else if(count == 1)
    			p.println(num);
    		else
    			p.println("Bad magician!");
    	}
    	p.close();
    }
}
