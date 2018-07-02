package methodEmbedding.Revenge_of_the_Pancakes.S.LYD102;

import java.util.Arrays;
import java.util.Scanner;

public class ROP {
	public static void main(String args[]){
		int T;
		int x=0,pointer,len=0,counter=0;
		boolean flag=false;
		String str;
		char strArr[];
		char temp[]=new char[100];
		Scanner in=new Scanner(System.in);
		T=in.nextInt();
		for(int i=0;i<T;i++){
			counter=0;
			flag=false;
			str=in.next();
			strArr=str.toCharArray();
			while(flag==false){
				if(strArr.length==1){
					
					if(strArr[0]=='-'){
						strArr[0]='+';
						counter=1;
						flag=true;
					}else if(strArr[0]=='+'){
						counter=0;
						flag=true;
					}
				}else{
			for(int j=0;j<strArr.length-1;j++){
				x=0;len=0;
				if(strArr[j]==strArr[j+1]){
					if(j+1==strArr.length-1){
						flag=true;
					}
					continue;
				}else{
					counter++;
					for(int k=0;k<=j;k++){
						temp[x]=strArr[k];
						len++;
						x++;
					}
					for(int k=len-1,a=0;k>=0;k--,a++){
						strArr[a]=temp[k];
						if(strArr[a]=='+'){
							strArr[a]='-';
						}else if(strArr[a]=='-'){
							strArr[a]='+';
						}
					}
				}
			}
				}
				
			}
			if(flag==true){
				if(strArr[0]=='-'){
					for(int k=0;k<strArr.length;k++){
						strArr[k]='+';
					}
					counter++;
				}
			}
			System.out.println("Case #"+(i+1)+": "+counter);
		}
	}

}
