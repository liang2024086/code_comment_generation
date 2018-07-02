package methodEmbedding.Standing_Ovation.S.LYD305;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO READER		
		//BufferedReader br= new BufferedReader(new FileReader("bum.in"));
		BufferedReader br= new BufferedReader(new FileReader("A-small-attempt0.in"));
		//BufferedReader br= new BufferedReader(new FileReader("A-large-practice(2).in"));
		
		// TODO WRITER
		PrintWriter pw = new PrintWriter("StandingOvation.txt", "UTF-8");
		int T=Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++){
			String[] tab =br.readLine().split(" ");
			int Smax = Integer.parseInt(tab[0]);
			String[] S = tab[1].split("");
			
			int a=0;
			int alreadyUp=0;
			for(int j=0; j<=Smax; j++){
				int temp = Integer.parseInt(S[j]);

				if(temp == 0) continue;
				else if(j<=alreadyUp) alreadyUp+=temp;
				else{
					a += j-alreadyUp;
					alreadyUp = j+temp;
				}
				System.out.println("j "+ j+" Sj "+temp+" up "+alreadyUp+" a "+a);	
				
				
				
				
				
				
			}
		
	
	
			System.out.print("Case #"+(i+1)+": "+a+"\n");
			pw.write("Case #"+(i+1)+": "+a+"\n");

		}
		pw.close();
	}
}
