package methodEmbedding.Standing_Ovation.S.LYD1061;

import java.util.*;
import java.io.*;

public class StandingOvation{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		long ans=0,total;
		boolean found=false;
		int smax, temp;
		String s; char A[]; String g[];
		for(int c=1;c<=t;c++){
			ans=0;total=0;found=false;
			s=sc.nextLine();
			g=s.split(" ");
			smax=Integer.parseInt(g[0]);
			A=g[1].toCharArray();
			for(int j=0;j<=smax;++j){
				temp=Integer.parseInt(""+A[j]);
				if(temp==0)found=true;
				else if(found){
					found=false;
					if(total<j){
						ans+=Math.abs(j-total);
						total+=Math.abs(j-total);
					}
				}
				total+=temp;
			}
			System.out.println("Case #"+c+": "+ans);
		}
    }
}
