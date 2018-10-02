package methodEmbedding.Counting_Sheep.S.LYD409;

import java.util.*;
public class CountingSheep{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
boolean numbers[]=new boolean[10];
int temp;
int t=sc.nextInt();
	for(int k=0;k<t;k++){
	    System.out.print("Case #"+(k+1)+": ");
		for(int i=0;i<10;i++){
			numbers[i]=false;
		}
		sc.nextLine();
		int n=sc.nextInt();
		if(n==0){
		System.out.println("INSOMNIA");
		continue;
		}
		int j=1;
		int flag=0;	
		while(true){
		 int nu=n*j++;
		 int lol=nu;
		 //System.out.println(n);
		 //int nu=n;
		while (nu > 0) {
    			temp=nu%10;
    			numbers[temp]=true;
    			nu = nu/10;
		}
		flag=1;
		for(int i=0;i<10;i++){
			if(numbers[i]==false){
				flag=0;
				break;
			}
		}
		//System.out.println(n);
		if(flag==1){
			System.out.println(lol);
			break;	
		}
		}
	}	


}

}
