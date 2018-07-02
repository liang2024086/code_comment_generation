package methodEmbedding.Standing_Ovation.S.LYD1901;

import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.lang.*;
class a{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		int total,j,b,extra,old_extra;
		int a=input.nextInt();
		for (int i=0;i<a;i++){
			b=input.nextInt();
			String people = input.next();
			extra=0;
			total=0;
			old_extra=0;
			if(b>0){
				for (j=1;j<=b;j++){
					total+=(people.charAt(j-1)-'0');
					old_extra=extra;
					if(total<j){extra+=(j-total);}
					total+=(extra-old_extra);
				}
			}
	 		System.out.printf("Case #%d: %d\n",i+1,extra);

		}
	}
}
