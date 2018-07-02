package methodEmbedding.Standing_Ovation.S.LYD988;

import java.util.*;

public class Tester {
	public static void main(String args[]){
		Scanner s1=new Scanner(System.in);
		int n=Integer.parseInt(s1.nextLine());
		int temp[]=new int[n];
		String line[]=new String[n];
		for(int i=0;i<n;i++){
			int arr[]=new int[10000];
			int s[]=new int[100000];
			temp[i]=s1.nextInt();
			line[i]=s1.nextLine();
			for(int j=0;j<temp[i]+1;j++){
				arr[j]=line[i].charAt(j+1)-48;
			}
			for(int j=0;j<temp[i]+1;j++){
				s[j]=0;
				for(int k=0;k<j;k++){
					s[j]+=arr[k];
				}
			}
			int count=0;
			for(int j=0;j<temp[i]+1;j++){
				if(j>s[j] && arr[j]!=0){
					count+=j-s[j];
					for(int k=j+1;k<temp[i]+1;k++)
						s[k]+=count;
				}
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
	}
}
