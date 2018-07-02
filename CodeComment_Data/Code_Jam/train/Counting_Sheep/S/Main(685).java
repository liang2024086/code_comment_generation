package methodEmbedding.Counting_Sheep.S.LYD4;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int testCases = in.nextInt();
	for (int t = 0; t < testCases; t++) {
	    int n = in.nextInt();
	    
	    if (n < 1) {
		System.out.print("Case #" + (t+1) + ": ");
		System.out.println("INSOMNIA");
		continue;
	    }
	    
	    int lastCount = 0;
	    boolean[] digits = new boolean[10];
	    
	    int MaxCount = 800;
	    
	    for (int k = 1; k < MaxCount; k++) {
		int nk = k * n;
		lastCount = nk;
		while (nk > 0) {
		    digits[nk % 10] = true;
		    for (int i = 0; i < 10; i++) {
			if (digits[i]) {
			    if (i == 9) {
				System.out.print("Case #" + (t+1) + ": ");
				System.out.println(lastCount);
				nk = 0;
				k = MaxCount;
			    }
			} else {
			    break;
			}
		    }
		    nk = nk / 10;
		}
		if (k < MaxCount) {
		    for (int i = 0; i < 10; i++) {
			if (digits[i]) {
			    if (i == 9) {
				System.out.print("Case #" + (t+1) + ": ");
				System.out.println(lastCount);
				k = MaxCount;
			    }
			} else {
			    break;
			}
		    }
		}
	    }
	}
    }
}
