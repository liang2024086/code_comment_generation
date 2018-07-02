package methodEmbedding.Standing_Ovation.S.LYD2090;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		int Smax;
		int total = 0;
		int invitados=0;
		int invitadosSum=0;
		String output = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for (int i = 0; i <t; i++) {
			String [] line = br.readLine().split(" ");
			for (int j = 0; j < line[1].length(); j++) {
				int element = Character.getNumericValue(line[1].charAt(j));
				Smax = j;
				if((j!=0) && (element !=0)){
					if(total < Smax){
						invitados += Smax - total;
						invitadosSum = Smax - total;
					}
				}
				total += element+invitadosSum;
				invitadosSum = 0;
			}
			output += "Case #"+(i+1)+": "+ invitados+"\n";
			invitados = 0;
				
			total = 0;
		
	}
	    System.out.println(output);
	    br.close();

	}
	

}
