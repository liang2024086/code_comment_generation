package methodEmbedding.Counting_Sheep.S.LYD1120;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

public class CountingSheep {
	
	static public void main(String[] args){
		try{
			File file = new File("A-small-attempt0.in");
			FileReader inFile;
			inFile = new FileReader(file);
			BufferedReader in = new BufferedReader(inFile);
			int numCases = Integer.parseInt(in.readLine());
			int n = 0;
			
			for(int i=0; i<numCases; i++){
				//n = input.nextInt();
				try{
				n = Integer.parseInt(in.readLine());
				}
				catch(Exception e){
					e.printStackTrace();
				}
				if(n == 0){
					System.out.println("Case #" + (i+1) + ": INSOMNIA");
				}
				else {
					HashSet<Integer> seen = new HashSet<Integer>();
					int sum = 0;
					int j = 1;
					int k;
					int last = 0;
					while(sum != 55){
						k = last = j*n;
						//System.out.println("k " + k);
						//System.out.println("sum " + sum);
						while (k >= 10){
							if(k%10 == 0 && !seen.contains(0)){
								sum +=10;
								seen.add(0);
							}
							else if(!seen.contains(k%10)){
								sum += k%10;
								seen.add(k%10);
								//System.out.println(k%10);
							}
							k /= 10;
						}
						if(!seen.contains(k%10)){
							sum += k%10;
							seen.add(k%10);
						}
						
						j++;
						
						//System.out.println("j " + j);
						//System.out.println("seen " + seen);
					}
					System.out.println("Case #" + (i+1) + ": " + last);
				}
			}
			in.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
