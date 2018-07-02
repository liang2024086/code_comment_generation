package methodEmbedding.Counting_Sheep.S.LYD1054;

import java.util.*;

class Sol{
	public static void main(String[] args) {
		int t=0;
		Scanner in = new Scanner(System.in);
		t=in.nextInt();
		int i=0;
		int a[] =  new int[10];
		int temp=0,n=0,flag,j;
		for (i=0;i<t;i++) {
			n = in.nextInt();
			temp=n;
			flag=0;
			if(n==0){
				System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
				continue;
			}
			for(j=0;j<10;j++){
				a[j]=0;
			}
			while(flag!=1){
				String s = Integer.toString(n);
				//System.out.println(s);
				for(j=0;j<s.length();j++){
					int x = Character.getNumericValue(s.charAt(j));
					if(a[x]==0){
						a[x]=1;
					}
				}	
				for(j=0;j<10;j++){
					if(a[j]==1){
						flag=1;
					}else{
						flag=0;
						j=100;
					}

				}

					if(flag==1){
						System.out.println("Case #"+(i+1)+": "+n);
						break;
					}else{
						n=n+temp;
					}
			}
		}
	}
}
