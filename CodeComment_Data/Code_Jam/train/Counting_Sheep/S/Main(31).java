package methodEmbedding.Counting_Sheep.S.LYD1089;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("b-small-practice.in");
			//FileInputStream fi = new FileInputStream("b-large-practice.in");
			FileOutputStream fo = new FileOutputStream("b-small-practice.out");
			//FileInputStream fi = new FileInputStream("b-large-practice.in");
			BufferedReader br = new BufferedReader(new InputStreamReader(fi));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
			String s = br.readLine();
			int cases = Integer.parseInt(s);
			for(int i = 1; i <= cases; i++) {
				System.out.print("Case #" + i + ":");
				bw.write("Case #" + i + ":");
				int N = Integer.parseInt(br.readLine());

			    Set<Integer> set = new HashSet<Integer>();
				for(int n = 0; n < 10; n++)
					set.add(n);

				int res = N;
				int j = 0;
				boolean possible = N == 0 ? false : true;
			    while(possible && !set.isEmpty()) {
			    	res = ++j * N;
			    	int tmp = res;
			    	while(tmp > 0) {
			    		int rem = tmp < 10 ? tmp : tmp % 10;
			    		set.remove(rem);
			    		tmp /= 10;
			    	}
			    }

				if(!possible) {
					System.out.print(" INSOMNIA");
					bw.write(" INSOMNIA");
				} else {
					System.out.print(" " + res);
					bw.write(" " + res);
				}
				System.out.println("");
				bw.write("\n");
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
