package methodEmbedding.Standing_Ovation.S.LYD926;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args)   throws Exception{
		
		String linea , datos[];
		int casos;
		int smax ;
		int s[];
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		casos =   Integer.parseInt(br.readLine().trim());
		for(int i = 0 ; i <  casos ;  i++){
			datos =  br.readLine().trim().split(" ");
			smax =  Integer.parseInt(datos[0]);
			s =  new int[datos[1].length()];
			for(int j = 0 ; j <  datos[1].length()  ; j ++){
				s[j] =  Integer.parseInt(datos[1].charAt(j) + "");
			}
			int res = 0;
			int sum = 0;
			for(int j= 0 ; j <  s.length ; j++){
				
				if(s[j] != 0){
					if( sum < j){
						res += (j - sum);
						sum += (j - sum);
					}
					
				}
				sum += s[j];
			}
			System.out.println("Case #"+(i+1)+": "+res);
		
		}
		
		
	}
}
