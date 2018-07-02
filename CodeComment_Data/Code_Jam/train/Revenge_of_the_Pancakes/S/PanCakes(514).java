package methodEmbedding.Revenge_of_the_Pancakes.S.LYD275;

import java.util.*;
import java.io.*;

public class PanCakes {

	public static void main(String[] args) throws IOException {

		Scanner ob = new Scanner(System.in);

		int c = Integer.parseInt(ob.nextLine());

		StringBuilder sb = new StringBuilder("");

		for(int i=0;i<c;i++) {

			int steps = 0;

			String s = ob.nextLine();

			if(s.equals("-")) sb.append("Case #" + (i+1) + ": 1\n");

			else if(s.equals("+")) sb.append("Case #" + (i+1) + ": 0\n");

			else {

			while(s.indexOf("-")!=-1) {

			if(s.indexOf("+")==-1) {

				steps+=1;

				break;

			}

			else {

			while(s.indexOf("++")!=-1) {

				s=s.replace("++","+");

			}

			while(s.indexOf("--")!=-1) {

				s=s.replace("--","-");

			}

			while(s.startsWith("-+")) {

				s="+"+s.substring(2);

				steps+=1;

			}

			while(s.startsWith("+-")) {

				s="+"+s.substring(2);

				steps+=2;

			}

			}

			}

			sb.append("Case #" + (i+1) + ": " + steps + "\n");

			}

		}

      PrintWriter out = new PrintWriter(new FileWriter("output.txt"));


      out.println(sb.toString());


      out.close();

	}

}
