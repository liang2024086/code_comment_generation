package methodEmbedding.Standing_Ovation.S.LYD290;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter("out.txt");
		int testcases = Integer.parseInt(rd.readLine());
		int test = 0;
		while(test < testcases){
			String s = rd.readLine();
			String[]input = s.split(" ");
			char[]arr = input[1].toCharArray();
			int people = 0;
			int p = 0;
			for (int i = 0; i < arr.length; i++) {
				int temp = Integer.parseInt(arr[i]+"");
				if(temp!= 0 && people < i){
					p += i - people;
					people += p;
				}
				people += temp;
			}
			out.println("Case #"+(test+1)+": "+p);
			test++;
		}
		rd.close();
         out.close();
	}

}
