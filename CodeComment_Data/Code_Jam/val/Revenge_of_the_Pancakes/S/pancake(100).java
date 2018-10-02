package methodEmbedding.Revenge_of_the_Pancakes.S.LYD279;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class pancake {

	public static void main(String[] args) throws Exception {
		try{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
		
		for(int z=1; z<=t; z++)
		{
			int happy=0,sad=0;
			int flag=0;
			int cnt=0;
			String s=br.readLine();
			int arr[]=new int[s.length()];
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='+'){
					arr[i]=1;
					happy++;
					
					if(flag!=1){
					flag=1;
					
					}
				}
				else{
					arr[i]=0;
					sad++;
					if(flag!=2){
						flag=2;
						cnt++;
					}
					
				}
			}
			
			if(happy==0){
				System.out.println("Case #"+z+": "+1);
			}
			else if(sad==0){
				System.out.println("Case #"+z+": "+0);
			}
			else{
				int sum=cnt*2;
				if(s.charAt(0)=='-'){
					System.out.println("Case #"+z+": "+(sum-1));
				}
				else{
					System.out.println("Case #"+z+": "+sum);
				}
				
			}
		}
	}
	catch(Exception e){
		return ;
	}
	}

	
}
