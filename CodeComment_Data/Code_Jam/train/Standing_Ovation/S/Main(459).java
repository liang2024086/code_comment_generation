package methodEmbedding.Standing_Ovation.S.LYD1583;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("/Users/westsnow/Downloads/codeJam/input/A-small-attempt0.in.txt"));
//        File file = new File("/Users/westsnow/Downloads/codeJam/output");
//        BufferedWriter output = new BufferedWriter(new FileWriter(file));
//        output.write(text);
//        output.close();
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; ++i){
        	String input = sc.nextLine();
        	String[] part = input.split("\\s+");
//        	System.out.println(part[0]);
//        	System.out.println(part[1]);
        	int max = Integer.parseInt(part[0]);
        	int[] arr = new int[max+1];
        	for(int j = 0 ; j <= max; ++j){
        		arr[j] = part[1].charAt(j) - '0';
        	}
//        	System.out.println(" ;;; " + max);
//        	for(int j = 0; j <= max; ++j){
//        		System.out.print(arr[j]);
//        	}
//    		System.out.println();
        	int sum = 0;
        	int addition = 0;
        	for(int level = 0; level<=max; ++level){
        		if(level==0)
        			sum+=arr[level];
        		else{
        			if(arr[level] == 0)
        				continue;
        			if(sum < level){
        				int ad = level - sum;
        				addition += ad;
        				sum += ad;
        				sum += arr[level];
        			}else{
        				sum += arr[level];
        			}
        		}
        	}
        	String result = "Case #" + (i+1) + ": " + addition;
        	System.out.println(result);
        }
	}

}
