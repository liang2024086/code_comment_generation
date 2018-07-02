package methodEmbedding.Magic_Trick.S.LYD764;

import java.io.*;

public class Magician {

	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(System.out);
		PrintWriter out = new PrintWriter(new File("A.out"));

		String[] num = br.readLine().split(" ");
		int cases = Integer.parseInt(num[0]);		

		for (int k = 0; k < cases; k++) {
			out.print("Case #" + (k+1) +": ");
			int cont = 0;
			String card = "";
			num = br.readLine().split(" ");
			int first = Integer.parseInt(num[0]);

			String[] lines = new String[4];
			for (int i = 0; i < 4; i++)
				lines[i] = br.readLine(); 
			String[] cards1 = lines[first-1].split(" ");
			
			num = br.readLine().split(" ");
			int second = Integer.parseInt(num[0]);
			
			for (int i = 0; i < 4; i++)
				lines[i] = br.readLine(); 
			String[] cards2 = lines[second-1].split(" ");
			
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					if(cards1[i].equals(cards2[j])) {
						cont++;
						card = cards1[i]; 
					}

			if(cont == 0)							
				out.println("Volunteer cheated!");	
			else if (cont == 1)
				out.println(card);
			else 
				out.println("Bad magician!");						
		}
		out.flush();
	}
}
