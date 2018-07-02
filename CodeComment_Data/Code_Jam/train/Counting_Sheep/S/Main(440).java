package methodEmbedding.Counting_Sheep.S.LYD885;


import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      	int n = in.nextInt();
	    Integer a[] = new Integer[]{0,0,0,0,0,0,0,0,0,0};
	 
	    int num = n;
	    int k = 1;
		for(k = 1; k < 83; k++){
			num = n*k;
			int j = num;
			while(j/10 != 0){
				a[j%10] = 1;
				j = j/10;
			}
			a[j%10] = 1;
			if(!Arrays.asList(a).contains(0)){
				break;
			}
		}
		if(k >= 83)
		    System.out.println("Case #" + i + ": INSOMNIA");
		else
          	System.out.println("Case #" + i + ": " + num);
    }
  }
}
