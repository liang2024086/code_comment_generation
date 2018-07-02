package methodEmbedding.Magic_Trick.S.LYD1461;

import java.io.*;
import java.util.*;

public class MagicTrick {

	public static void main (String[] args){
		int numCases;
		PrintWriter wr;
		BufferedReader br;
		try{
			br =new BufferedReader(new InputStreamReader(System.in));
			wr = new PrintWriter(new File("output.txt"));
			String input;
	 		input=br.readLine();
			numCases=Integer.parseInt(input);

			Integer answerOne,answerTwo;
			String[] rowOne=null,rowTwo=null; 
			List<Integer> result;

			for (int i=1;i<=numCases;++i){
					// Leer respuesta !
					input=br.readLine();
					answerOne=Integer.parseInt(input);
					result=new ArrayList<Integer>();

					for (int j=1;j<=4;++j){
						input=br.readLine();
						if (answerOne==j)
							rowOne=input.split(" ");
					}

					// Leer respuesta 2
					input=br.readLine();
					answerTwo=Integer.parseInt(input);
					
					for (int j=1;j<=4;++j){
						input=br.readLine();
						if (answerTwo==j)
							rowTwo=input.split(" ");
					}

					/* Codigo Aqui */
					for (int j=0;j<rowOne.length;++j)
						for (int k=0;k<rowTwo.length;++k) {
							if (rowOne[j].equals(rowTwo[k]))
								result.add(Integer.parseInt(rowTwo[k]));
						}
						
					if (result.isEmpty()){
						System.out.println("Case #"+i+": Volunteer cheated!");
						wr.println("Case #"+i+": Volunteer cheated!");	
					} else if (result.size()==1){
						System.out.println("Case #"+i+": "+result.get(0));
						wr.println("Case #"+i+": "+result.get(0));
					}else{
							System.out.println("Case #"+i+": Bad magician!");
							wr.println("Case #"+i+": Bad magician!");
					}
				}
			wr.close();

		}catch(IOException io){
			io.printStackTrace();
		}
	}
}
