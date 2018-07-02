package methodEmbedding.Counting_Sheep.S.LYD845;

/* 
solution by: Hank17....
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class a {
	public static void main(String[] args) throws Exception {
		try{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
		
		for(int x=1; x<=test; x++)
		{
			String str=br.readLine();
			int temp=0;
			long n=Integer.parseInt(str);
			int a[]=new int[10];
			
			BigInteger sac =new BigInteger(""+n);
		
			
			for(int j=0;j<str.length();j++){
				a[(int) (str.charAt(j) - 48)]++;
			}
			
			for(int i=0;i<20;i++){
				
				if(a[i]>0){
					temp=1;
					continue;
				}
				else
				{
					temp=2;
					break;
				}
			}
			if(temp==1){
				System.out.println("Case #"+x+": "+str);
			}
			else{
			
				for(int j=2; j<=100; j++)
				{
					BigInteger sac2=sac.multiply(new BigInteger(""+j));
					str=sac2.toString();
					for(int i=0;i<str.length();i++){
						a[(int)(str.charAt(i)-48)]++;
					}
					
					temp=0;
						
					for(int i=0;i<10;i++){
							if(a[i]>0){
								temp=1;
								continue;
							}
							else
							{
								temp=2;
								break;
							}
						}
						if(temp==1){
							System.out.println("Case #"+x+": "+str);
							break;
						}
						
					}
				
				if(temp==0 || temp==2){
					System.out.println("Case #"+x+": "+"INSOMNIA");
				}
				
			}
		}
	}
	catch(Exception e){
		return ;
	}
	}
}
