package methodEmbedding.Standing_Ovation.S.LYD311;

import java.util.Scanner;


public class StandingOvation {
	
	public static void main(String[] args){
		Scanner lectura = new Scanner(System.in);
		int cases = Integer.parseInt(lectura.nextLine());
		String[] line;
		int shyness;
		int[] standing;
		int friends;
		for(int j=1;j<=cases;j++){
			line = lectura.nextLine().split(" ");
			shyness = Integer.parseInt(line[0]);
			standing = new int[shyness+1];
			standing[0] = Character.getNumericValue(line[1].charAt(0));
			friends = 0;
			for(int i=1;i<=shyness;i++){
				standing[i] = standing[i-1];
				if(standing[i]>=i){
					standing[i]+=Character.getNumericValue(line[1].charAt(i));
				}else{
					if(Character.getNumericValue(line[1].charAt(i))==0) continue;
					while(standing[i]<i){
						standing[i]++;
						friends++;
					}
					standing[i]+=Character.getNumericValue(line[1].charAt(i));
					
				}
			}
			System.out.println("Case #"+j+": "+friends);
		}
	}

}
