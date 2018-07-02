package methodEmbedding.Revenge_of_the_Pancakes.S.LYD948;

/*
solution by: hank17...
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;


 class b {
	public static void main(String[] args) throws Exception {
		try{
			
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
		
			for(int x=1; x<=test; x++)
			{
				int flag=0,cnt=0;
				
				String str=br.readLine();
				
				int arr[]=new int[str.length()];
				int up=0,down=0;
				
				for(int i=0;i<str.length();i++){
					if(str.charAt(i)=='+'){
						arr[i]=1;
						up++;
					
						if(flag!=1){
							flag=1;
						}
					}
					else{
						arr[i]=0;
						down++;
						if(flag!=2){
							flag=2;
							cnt++;
					}
				}
			}
			
			if(down==0){
				System.out.println("Case #"+x+": "+0);
			}
			else if(up==0){
				System.out.println("Case #"+x+": "+1);
			}
			else{
				
				int total= ( cnt * 2 );
				if( str.charAt(0)=='-'){
					System.out.println("Case #"+x+": "+(total-1));
				}
				else{
					System.out.println("Case #"+x+": "+total);
				}
			}
		}
	}
	catch(Exception e){
		return ;
	}
}

	
}
