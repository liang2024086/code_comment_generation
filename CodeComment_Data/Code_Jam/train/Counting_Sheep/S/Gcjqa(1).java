package methodEmbedding.Counting_Sheep.S.LYD1083;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yoga1290
 */
public class Gcjqa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Scanner sc=new Scanner(System.in);
	boolean vis[] = new boolean[10];
	int T = sc.nextInt(),t, n,i,j,res=-1;
	for(t=1;t<=T;t++) {
//	    n = t;
	    n = sc.nextInt();
	    
	    Arrays.fill(vis, false);
	    res = -1;
	    
	    for(i=1;i<=100;i++) {
		String tmp = new BigInteger(n+"").multiply(new BigInteger(""+i)).toString();
//		System.out.println(i+" * "+n+" = "+(i*n));
		for(j=0;j<tmp.length();j++)
		    vis[tmp.charAt(j)-'0'] = true;
		
		for(j=0;j<10 && vis[j];j++);
		if(j==10) {
		    res = i*n;
		    break;
		}
	    }
	    
//	    if(res==-1)
//		System.err.println(t+" , "+Arrays.toString(vis));
	
	    if(res>-1) System.out.println("Case #"+t+": "+res);
	    else System.out.println("Case #"+t+": INSOMNIA");
		
	}
    }
    
}
