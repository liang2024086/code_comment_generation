package methodEmbedding.Magic_Trick.S.LYD650;

import java.util.*;
public class mat
{
    public static void main(String[] argv)
    {
	Scanner in = new Scanner(System.in);
	int t,i,j;
	t=in.nextInt();

	int[][] mat=new int[4][4];
	int[][] mat2=new int[4][4];
	String[] st= new String[t];
	int m=0;
	for(m=1;m<=t;m++)
	    {
	int count=0;
	int num=0;
	int r1=in.nextInt();
	for(i=0;i<4;i++)
	    {
		for(j=0;j<4;j++)
		    {
			mat[i][j]=in.nextInt();
		    }
	    }
	int r2=in.nextInt();
	for(i=0;i<4;i++)
	    {
		for(j=0;j<4;j++)
		    {
			mat2[i][j]=in.nextInt();
		    }
	    }

	for(i=0;i<4;i++)
	    {
		for(j=0;j<4;j++)
		    {
			if(mat[r1-1][i]==mat2[r2-1][j])
			    {
				count++;
				num=mat[r1-1][i];
			    }
		    }
	    }
	if(count==1)
	    {
		//	System.out.println("Case #"+m+":"+" "+num);
		st[m-1]="Case #"+m+":"+" "+num;

	    }
	else if(count==0)
	    {
		//	System.out.println("Case #"+m+":"+" "+"Volunteer cheated!");
		st[m-1]="Case #"+m+":"+" "+"Volunteer cheated!";
	    }
	else if(count>1)
	    {
		// System.out.println("Case #"+m+":"+" "+"Bad magician!");
		st[m-1]="Case #"+m+":"+" "+"Bad magician!";
	    }
	    }
	for(m=1;m<=t;m++)
	    {
		System.out.println(st[m-1]);
	    }

      /* 	System.out.println(r1);
	for(i=0;i<4;i++)
	    {
		for(j=0;j<4;j++)
		    {
			//	mat[i][j]=in.nextInt();
			System.out.print(mat[i][j]+" ");
		    }
		System.out.println("");
	    }
	//	int r2=in.nextInt();
	System.out.println(r2);
	for(i=0;i<4;i++)
	    {
		for(j=0;j<4;j++)
		    {
			//	mat2[i][j]=in.nextInt();
			System.out.print(mat2[i][j]+" ");
		    }
		System.out.println("");
	    }*/


    }
}
