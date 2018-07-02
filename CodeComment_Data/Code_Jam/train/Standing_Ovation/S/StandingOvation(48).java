package methodEmbedding.Standing_Ovation.S.LYD1753;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
		for(int i=1;i<=T;i++){
			
			int len = in.nextInt()+1;
			String pattern = in.next();
						
			int num = 0;
			int missing = 0;
			for(int j=0;j<len;j++){
				
				if(j>num){
					int z = j-num;
					if(missing < z)
						missing = z;
				}
				
				num+= Character.getNumericValue(pattern.charAt(j));;
				
			}
			
			System.out.println("Case #"+i+": "+missing);
			
		}
		
		
	}

}
