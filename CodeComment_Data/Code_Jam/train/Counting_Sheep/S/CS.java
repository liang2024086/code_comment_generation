package methodEmbedding.Counting_Sheep.S.LYD628;



import java.io.*;

public class CS {
	public static void main (String args[]) throws Exception  {
		int t,iter=1,i,j,N,dummy,x,f,mul=1;
		boolean flag;
		int[] check = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(iter<=t)  {
			flag = true;
			for(i=0;i<10;i++)   //init for check array
				check[i]=0;
			N = Integer.parseInt(br.readLine());
			if(N==0)
				System.out.println("Case #"+iter+": INSOMNIA");
			else  {
				for(j=1;flag==true;j++)  {
					dummy=j*N;
					while (dummy > 0) {
						x = dummy % 10;
						check[x]++;
						dummy = dummy / 10;
					}
					f=0;
					for(i=0;i<10;i++)  {
						if(check[i]==0)  
							break;
						else
							f++;
					}
					if(f==10) {
						flag = false;
						mul=j;
					}
				}
				System.out.println("Case #"+iter+": "+mul*N);
			}	
			
			iter++;
		}
	}
}
