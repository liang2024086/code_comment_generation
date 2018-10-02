package methodEmbedding.Standing_Ovation.S.LYD246;

import java.util.*;
public class prob1small {
private static Scanner sc;

public static void main(String args[])throws Exception{
	int smax;
	String[] arr;
	int arr1[];
	sc = new Scanner(System.in);
	int test=0;
	test=sc.nextInt();
	if(test<1||test>100){
		System.exit(0);
	}
	String res[]=new String[test];

	for(int i=1;i<=test;i++){
		smax=sc.nextInt();
		if(smax<0||smax>6){break;}
		arr=new String[smax+1];
		arr1=new int[smax+1];
		
		String inp=sc.next();

		arr=inp.split("");
		for(int i1=0;i1<=smax;i1++){
		arr1[i1]=Integer.parseInt(arr[i1]);
	}
		int coll=0;
		int count = 0,i2=0;
		while(i2<arr1.length){
			
			if(arr1[i2]==0&&i2>=coll){
				arr1[i2]=1;
				 count = count+1;
			}
		
			coll+=arr1[i2];
			i2=i2+1;
			/*if((i2+=arr1[i2])>arr1.length){
				res[i-1]="Case #"+i+": "+(count);
				break;
			}*/
			res[i-1]="Case #"+i+": "+(count);	
		
			
		}
	
	}
	for(int c=0;c<test;c++){
	System.out.println(res[c]);}
}
}
