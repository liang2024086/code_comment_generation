package methodEmbedding.Counting_Sheep.S.LYD1601;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class CountingSheep {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("..//inputFiles//A-small-attempt2.in"));
		int T = Integer.parseInt(br.readLine().trim());				
		for(int i = 0; i<T;i++){
			ArrayList<Integer> lt = new ArrayList<Integer>();
			lt.add(new Integer("0"));
			lt.add(new Integer("1"));
			lt.add(new Integer("2"));
			lt.add(new Integer("3"));
			lt.add(new Integer("4"));
			lt.add(new Integer("5"));
			lt.add(new Integer("6"));
			lt.add(new Integer("7"));
			lt.add(new Integer("8"));
			lt.add(new Integer("9"));
			Long pro=0L;
			int N = Integer.parseInt(br.readLine().trim()),j;
			//System.out.println("Case "+(i+1)+":");
			//System.out.println(N);
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			for(j=1;j<Integer.MAX_VALUE;j++){
				if(lt.isEmpty())break;
				pro = (long) N*j;
				//System.out.println(pro);
				for(int k = 0; k<lt.size();k++){
					if(pro.toString().contains(lt.get(k).toString())){
						lt.remove(k);
						k--;
					}					
				}
				//System.out.println(lt.toString());
				
			}
			if(j==Integer.MAX_VALUE){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			System.out.println("Case #"+(i+1)+": "+pro);
		}
		br.close();
	}
}
