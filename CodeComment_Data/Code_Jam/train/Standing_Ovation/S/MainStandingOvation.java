package methodEmbedding.Standing_Ovation.S.LYD1952;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainStandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream file;
		int T;
		ArrayList<TestStandingOvation> tests;
				
		try {
			
//			file = new FileInputStream("input_StandingOvation");
			file = new FileInputStream("A-small-attempt0.in");
//			file = new FileInputStream("A-large.in");

			BufferedReader in = new BufferedReader(new InputStreamReader(file));

			
			String buff = in.readLine();
			T = Integer.parseInt(buff);
			tests = new ArrayList<TestStandingOvation>();
			
			for (int i=0; i<T; i++){
				int Smax;
				int[] S;

				buff = in.readLine();

				String[] data = buff.split(" ");				
				
				Smax = Integer.parseInt(data[0]);
				System.out.println(Smax);
				S = new int[Smax+1];
				
				for (int j=0; j<Smax+1; j++){
					char c = data[1].charAt(j);
					S[j] = Integer.parseInt(Character.toString(c));
					System.out.print(c+" ");
				}
				System.out.println();
				tests.add(new TestStandingOvation(Smax, S));
			}

			in.close();


			BufferedWriter bw = new BufferedWriter(new FileWriter("output_StandingOvation"));
			
			for (int i=0; i<T; i++) {
				int ind = i+1;
				int res = tests.get(i).getNumberInvited();
				System.out.println("Result "+ i + " : "+ res);
				bw.write("Case #"+ind+": "+res+"\n");
			}
			bw.close();

			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
