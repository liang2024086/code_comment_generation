package methodEmbedding.Standing_Ovation.S.LYD61;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt(),result;
		String S; 
		int s,count,cur;
		for(int i=0;i<n;i++)
		{
			count=0;
			result=0;
			s=scan.nextInt();
			s++;
			
			S=scan.next();
			for(int j=0;j<s;j++)
			{
				cur=Integer.parseInt(S.charAt(j)+"");
				count+=cur;
				
				if(count<=j)
					{result++;
					count++;
					}
			}
			
			System.out.println("Case #"+(i+1)+": "+result);
		}
	}

}
