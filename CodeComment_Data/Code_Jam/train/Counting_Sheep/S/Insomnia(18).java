package methodEmbedding.Counting_Sheep.S.LYD161;

import java.util.*;
import java.io.*;

public class Insomnia {

	public static void main(String[] args) throws IOException {

		Scanner ob = new Scanner(System.in);

		int n = Integer.parseInt(ob.nextLine());

		StringBuilder sb = new StringBuilder("");

		for(int i=0;i<n;i++) {

			int k = Integer.parseInt(ob.nextLine());

			int rem = 0,tmp=0,j=1;

			if(k==0) sb.append("Case #" + (i+1) + ": INSOMNIA\n");

			else if(k==1) sb.append("Case #" + (i+1) + ": 10\n");

			else if(k>1) {

			Set<Integer> s = new HashSet<Integer>();

			tmp=k;

			do {

				while(k!=0) {				

				try {

				rem = k%10;

				k = k/10;

				s.add(rem);

				} catch(Exception e) {}

				}

				k=++j*tmp;

			} while(s.size()<10);

			sb.append("Case #" + (i+1) + ": " + ((j-1)*tmp) + "\n");

			}

		}


      PrintWriter out = new PrintWriter(new FileWriter("output.txt"));


      out.println(sb.toString());


      out.close();

	}

}
