package methodEmbedding.Revenge_of_the_Pancakes.S.LYD846;

import java.util.*;
import java.io.*;
class Main{
public static void main(String args[]){
	Scanner st=new Scanner(System.in);
	int t=st.nextInt();
	int o=1;
	while(t-->0){
	String s=st.next();
	//System.out.println(s);
	int l=s.length();
	int k=0;
	
	int count=0;
	int i=0;
	while(true){
	for(i=k;i<l-1;i++){
		if(s.charAt(i)!=s.charAt(i+1)){
			k=i+1;
			count++;
			break;
		}
		
	}
	
	if(k==l-1 || i==l-1){
		if(s.charAt(k)=='-'){
		count++;
		}
		break;
	}
	
	}
	System.out.println("Case #"+ o +": "+count);
	o++;
	
	}
}
}
