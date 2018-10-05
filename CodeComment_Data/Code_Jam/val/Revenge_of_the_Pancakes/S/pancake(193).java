package methodEmbedding.Revenge_of_the_Pancakes.S.LYD468;

import java.util.*;

class pancake{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
		for(int j=1; j<=t; j++){
			String s=scan.next();
			int index,cnt=0;
			String s1,s2,s3;
			while(s.contains("-")){
				index=s.lastIndexOf("-");
				s1=s.substring(0,index);
				s2="+";
				s3=s.substring(index+1,s.length());			
				s1=s1.replace("+","@");
				s1=s1.replace("-","+");
				s1=s1.replace("@","-");
				s=s1+s2+s3;
				cnt++;
			}
			
			System.out.println("Case #"+j+": "+cnt);
		}
	}
}
