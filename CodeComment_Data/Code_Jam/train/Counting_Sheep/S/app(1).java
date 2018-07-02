package methodEmbedding.Counting_Sheep.S.LYD1420;

import java.util.Scanner;

public class app {
	public static void main(String[] args) throws InterruptedException{
		int T,n,i,l,v,case1;
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		case1=1;
		while(T!=0){
			n=in.nextInt();
			if(n==0)
			{
				System.out.println("Case #"+case1+": INSOMNIA");
				case1++;
				T--;
				continue;
			}
			int b[] = new int[10];
			for(i=1; ;i++){
				l=i*n;
				v=l;
				//System.out.printf("The value of n for %d ith count is %d\n",i,v);
				
				int j,d,flag=0;
				int k=String.valueOf(v).length();
				//System.out.println("The length of value if "+k);
				for(j=0;v!=0;j++){
					d=v%10;
					v=v/10;
					//System.out.println("The value of d is "+d);
					b[d]++;
				}
				for(j=0;j<10;j++){
					if(b[j]==0){
						flag=1;
						break;
					}
					//System.out.println("The value of b[j] is "+b[j]);
				}
				if(flag==0){
					System.out.println("Case #"+case1+": "+l);
					case1++;
					break;
				}
				//Thread.sleep(1000);
			}
			
			T--;
		}
		
		
	}

}
