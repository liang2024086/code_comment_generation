package methodEmbedding.Standing_Ovation.S.LYD2011;

import java.io.*;


public class StandingOvation {

	public StandingOvation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new FileReader(new File("input.in")));
		BufferedWriter output = new BufferedWriter(new FileWriter(new File("output.txt")));
		
		String line = null;
		
		line = input.readLine();
		int num_of_cases = Integer.parseInt(line);
		
		int[] demand = new int[num_of_cases];
		
		for(int i=0;i<num_of_cases;i++) {
			line = input.readLine();
			String[] splited = line.split("\\s+");
			int s_max = Integer.parseInt(splited[0]);
			
			int sub_sum = 0;
			for(int j=0;j<=s_max;j++) {
				int num = Integer.parseInt(""+splited[1].charAt(j));
				if(num==0) continue;
				if(sub_sum<j) {
					demand[i]+=j-sub_sum;
					sub_sum=j;
				}
				sub_sum+=num;
			}
			
			output.write("Case #"+(i+1)+": "+demand[i]+"\n");
		}
		
		
		
		input.close();
		output.close();
	}

}
