package methodEmbedding.Standing_Ovation.S.LYD1367;

import java.util.Scanner;


public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int testCases = sc.nextInt();
long count;
for(int i=1;i<=testCases;i++)
{
	
	count=0;
	
	int maxShylevel = sc.nextInt();	
	String shyString = sc.next();
	int curCount = (shyString.charAt(0)) - '0';
	for(int j=1;j<=maxShylevel;j++)
	{
		
		if(curCount < j && (int)(shyString.charAt(j) - '0') >0)
		{
			
			count=count+(j-curCount);
			curCount = ((int)(shyString.charAt(j)) - '0') + curCount+(j-curCount);
		
		}
		else
		{
		curCount = ((int)(shyString.charAt(j)) - '0') + curCount ;
		}
		}
	System.out.println("Case #"+i+": "+count);
	}

	}


}
