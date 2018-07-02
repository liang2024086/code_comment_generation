package methodEmbedding.Counting_Sheep.S.LYD1400;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class counting_sheeps {
	public static void main(String[] args) throws Exception {
		try{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
		
		for(int z=1; z<=t; z++)
		{
			String s=br.readLine();
			long num=Integer.parseInt(s);
			int arr[]=new int[10];
			BigInteger fact =new BigInteger(""+num);
			
			for(int i=0;i<s.length();i++){
				//System.out.println((int)(s.charAt(i)-48));
				arr[(int)(s.charAt(i)-48)]++;
				
			}
			int flag=0;
			for(int i=0;i<20;i++){
				if(arr[i]>0){
					flag=1;
					continue;
				}
				else
				{
					flag=2;
					break;
				}
			}
			
			if(flag==1){
				System.out.println("Case #"+z+": "+s);
			}
			else{
			
				for(int j=2; j<=100; j++)
				{
					BigInteger fact2=fact.multiply(new BigInteger(""+j));
					s=fact2.toString();
					for(int i=0;i<s.length();i++){
						arr[(int)(s.charAt(i)-48)]++;
					}
					flag=0;
						for(int i=0;i<10;i++){
							if(arr[i]>0){
								flag=1;
								continue;
							}
							else
							{
								flag=2;
								break;
							}
						}
						if(flag==1){
							System.out.println("Case #"+z+": "+s);
							break;
						}
						
					}
				
				if(flag==0 || flag==2){
					System.out.println("Case #"+z+": "+"INSOMNIA");
				}
				
			}
		}
	}
	catch(Exception e){
		return ;
	}
	}
}
