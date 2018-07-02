package methodEmbedding.Counting_Sheep.S.LYD1417;

import java.io.*;
import java.util.*;
class count {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for (int j=1;j<=t;j++) {
     int n=s.nextInt();
     int a[]=new int[10];
     int ans=n;
     if (n==0) {
         System.out.println("Case "+"#"+j+": "+"INSOMNIA");
     }
     else{
        boolean sleep=false;
        int count=0;
        for (int i=1;i<1000;i++) {
         ans=n*i;   
         int opr=ans;        
        while(opr>0){
        int d=opr%10;
        opr/=10;
        if (a[d]==0) {
            a[d]++;
            count++;
        }
    }
    if (count==10) {
            sleep=true;
            break;
        }
     }
     if(sleep==true)
     System.out.println("Case "+"#"+j+": "+ans);
     else
     System.out.println("Case "+"#"+j+": "+"INSOMNIA");
    }
}
	


	}	
}
