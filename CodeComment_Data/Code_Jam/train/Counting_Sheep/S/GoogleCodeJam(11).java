package methodEmbedding.Counting_Sheep.S.LYD172;

import java.util.*;
import java.io.*;
public class GoogleCodeJam {
	public static void main(String[] args) {
	  	int[] arr;
	  	boolean sleep = false;
	  	boolean one = false, two = false, three = false, four = false, five = false, six = false, seven = false, eight = false, nine = false, zero = false;
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    arr = new int[t+1];
	    for (int i = 1; i <= t; ++i) {
	      	int n = in.nextInt();
	      	//System.out.println(n);
	      	arr[i-1] = n;
	      	//System.out.println("Array i = " + arr[i-1] + "\n" + "i = " + i);
	    }

	    for (int i = 0; i < arr.length-1; ++i) {
	    	//System.out.println(arr[i]);
	    	if(arr[i] == 0) {
	    		System.out.println("Case #"+(i+1)+": INSOMNIA");
	    	} else {
	    		int index = 1;

	    		int num = arr[i];
	    		while(false == sleep) {
	    			int temp = num * index;
	    			//System.out.println(num + " * " + index " = " + temp);
	    			//System.out.println(num + " * " + index + " = " + temp);
	    			String s = Integer.toString(temp);
	    			// System.out.println(temp);
	    			if(s.contains("0")) {
	    				zero = true;
	    			}
	    			if(s.contains("1")) {
	    				one = true;
	    			}
	    			if(s.contains("2")) {
	    				two = true;
	    			}
	    			if(s.contains("3")) {
	    				three = true;
	    			}
	    			if(s.contains("4")) {
	    				four = true;
	    			}
	    			if(s.contains("5")) {
	    				five = true;
	    			}
	    			if(s.contains("6")) {
	    				six = true;
	    			}
	    			if(s.contains("7")) {
	    				seven = true;
	    			}
	    			if(s.contains("8")) {
	    				eight = true;
	    			}
	    			if(s.contains("9")) {
	    				nine = true;
	    			}
	    			if(one && two && three && four && five && six && seven && eight && nine && zero) {
	    				sleep = true;
	    				System.out.println("Case #"+(i+1)+": " + temp);
	    			}
	    			index++;
	    		}
	    		sleep = false;
	    		one = false;
	    		two = false;
	    		three = false;
	    		four = false;
	    		five = false;
	    		six = false;
	    		seven = false;
	    		eight = false;
	    		nine = false;
	    		zero = false;
	    	}

	    }
  	}
}
