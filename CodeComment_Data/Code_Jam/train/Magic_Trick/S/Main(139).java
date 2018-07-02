package methodEmbedding.Magic_Trick.S.LYD467;

import java.io.BufferedReader;
import java.io.InputStreamReader;





public class Main {
	
	public static void main(String[]  args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		
		int casos = Integer.parseInt(br.readLine().trim());
		String mat1[];
		String mat2[];
		String datos;
		String res = "-1";
		int ans1 , ans2;
		for(int i = 0 ; i <  casos ; i++){
			mat1 = new String[4];
			mat2 = new String[4];
			ans1 = Integer.parseInt(br.readLine().trim());
			for(int  j = 0 ;  j   < 4 ;j++){
				
				if(  ans1 == (j +1)) mat1 = br.readLine().trim().split(" ");
				else br.readLine();
			}
			
			ans2 = Integer.parseInt(br.readLine().trim());
			for(int j = 0 ;  j < 4 ; j++){
				if(ans2 == (j+1)) mat2 = br.readLine().trim().split(" ");
				else br.readLine();
			}
			int cont = 0;
			for(int u = 0 ; u   < 4 ; u++){
				for(int v = 0 ;  v <  4 ;v++){
					if( mat1[u].equals(mat2[v])) {
						res = mat1[u];
						cont++;
					}
				}
			}
			
			if(cont == 1){
				System.out.println("Case #"+(i + 1)+": "+ res);
			}else if(cont > 1){
				System.out.println("Case #"+(i + 1)+": Bad magician!");
			}else{
				System.out.println("Case #"+(i +1)+": Volunteer cheated!");
			}
			
			
			
			
			
		}
		
		
		
	}

}
