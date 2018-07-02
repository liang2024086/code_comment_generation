package methodEmbedding.Standing_Ovation.S.LYD1870;

import java.util.Scanner;


public class cja {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int[] ans=new int[t];
		int i=0;
		while(i<t){
			int sm;
			sm=s.nextInt();
			String st;
			st=s.next();
			int[] a=new int[sm+1];
			int j=0;
			while(j<(sm+1)){
				a[j]=Character.getNumericValue(st.charAt(j));
				j++;
			}
			int ep=0;
			int p=0;
			int r=0;
			while(r<(sm+1)){
				if (p>=r){
					p=p+a[r];
				}
				else{
					ep=ep+r-p;
					p=r+a[r];
				}
				r++;
				
			}
			ans[i]=ep;
			i++;
			
		}
		s.close();
		i=0;
		while(i<t){
			System.out.println("Case #"+(i+1)+": "+ans[i]);
			i++;
		}


		
	}

}
