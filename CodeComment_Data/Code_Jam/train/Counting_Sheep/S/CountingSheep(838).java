package methodEmbedding.Counting_Sheep.S.LYD582;


import java.util.Scanner;

public class CountingSheep {

	public static void main(String args[]) {
		
		int T,N,i,j,k,num,cnt=0,temp,sum=0;
		int[] flag = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		T = input.nextInt();
		for(i=1;i<=T;i++) {
		
			for(j=0;j<10;j++)
				flag[j]=0;
			
			N = input.nextInt();
			if(N == 0)
				System.out.println("case #"+ i+": "+"INSOMNIA");
			else
			{
				cnt=0;
				for(k=1,num=N*k;true;k++)
				{
					temp = num;
					while(num>0)
					{
						flag[num%10] = 1;
						num = num/10;
					}
					num=N*(k+1);
					sum=0;
					if(k>3){
						for(j=0;j<10;j++)
							sum += flag[j];
						
						if(sum == 10)
						{
							System.out.println("case #"+ i+": "+temp);
							break;
						}	
					}
					
					num=N*(k+1);
				}
			}
		}
	}
}

