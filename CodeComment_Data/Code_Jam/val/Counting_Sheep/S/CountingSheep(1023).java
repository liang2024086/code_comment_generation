package methodEmbedding.Counting_Sheep.S.LYD959;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String args[]){
		int T,N,pointer=0,temp=0,temp2,it=1,last;
		boolean flag=false;
		//int a[]=new int[10];
		HashSet<Integer> a=new HashSet<Integer>();
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		//System.out.println(cases);
		if(T>=1 && T<=100){
		for(int i=0;i<T;i++){
			flag=false;
			it=1;
			a.clear();
			N=in.nextInt();
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}else if(N>0 && N<=200){
				while(flag==false){
					//N=N*it;
					temp=N*it;
					temp2=temp;
					it++;
					while(temp>0){
						if(!a.contains(temp%10)){
							a.add(temp%10);
							if(a.size()==10){
								last=temp2;
								System.out.println("Case #"+(i+1)+": "+last);
								flag=true;
								break;
							}
							//pointer++;
						}
						temp=temp/10;
					}				
				}
				
			}	
			
		}
		}
	}
}
