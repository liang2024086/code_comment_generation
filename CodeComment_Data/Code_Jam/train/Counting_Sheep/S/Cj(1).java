package methodEmbedding.Counting_Sheep.S.LYD683;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Cj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			int num = kb.nextInt();
			int step = num;
			if (num==0) {
				out.println("Case #"+(i+1)+": "+num);
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			while(hs.size() < 10) {
				int temp = num;
				while (temp > 0) {
			  		hs.add(temp %10);
			  	//	System.out.println("Set size: "+hs.size());
			  		//System.out.println(temp%10);
	    			temp = temp / 10;
				}
				if (hs.size() >= 10)
					break;
				num += step;
			//	System.out.println(num);
			}
			
			System.out.println("Case #"+(i+1)+": "+num);
			out.println("Case #"+(i+1)+": "+num);
			
		}
		out.close();

	}

}
