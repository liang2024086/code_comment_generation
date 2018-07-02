package methodEmbedding.Standing_Ovation.S.LYD363;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int rep = Integer.parseInt(in.readLine());
		int qtd = 0, index = 0;
		int pessoas_em_pe, need;
		
		for(int i = 0; i < rep; i++) {
			
			String s = in.readLine();
			
			pessoas_em_pe = 0;
			need = 0;
			
			for(int j = 2; j < s.length(); j++, index++) {
				qtd = Integer.parseInt(String.valueOf(s.charAt(j)));
				if(index==0) pessoas_em_pe = qtd;
				else
				{
					if(pessoas_em_pe < index) {
						need += Math.abs((pessoas_em_pe - index));
						pessoas_em_pe += Math.abs((pessoas_em_pe - index))+qtd;
					}
					else
						pessoas_em_pe += qtd;
				}
				
			}
			int iAux = i + 1;
			System.out.println("Case #" + iAux + ": " + need);
			need = 0;
			pessoas_em_pe = 0;
			index = 0;
		}		
	}

}
