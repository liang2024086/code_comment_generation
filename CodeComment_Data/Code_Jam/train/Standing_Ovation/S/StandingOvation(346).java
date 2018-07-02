package methodEmbedding.Standing_Ovation.S.LYD409;

import java.util.Scanner;

public class StandingOvation{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++){
			
			int Smax = sc.nextInt();
			String str = sc.next();
			
			int count = 0;
			int y = 0;
			
			for(int i=0; i<Smax; i++){
				if(str.charAt(i) != '0'){
					count += Integer.parseInt(""+str.charAt(i));
				}else{
					if(count<i+1){
						y++;
						count++;
					}
				}
			}
			
			System.out.println("Case #"+(t+1)+": "+y);
			
		}
		
	}
	
}
