package methodEmbedding.Magic_Trick.S.LYD598;

import java.util.Scanner;
public class Cod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        	int n;
		int row1,row2,i,j,k,l;
		Scanner in=new Scanner(System.in);
		n=4;
		int a1[][]=new int[n][n];
		int a2[][]=new int[n][n];
		int pos;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int numT;
		int ro1,ro2;
		numT=in.nextInt();
		for(i=0;i<numT;i++)
		{
			int count=0;
			pos=0;
			row1=in.nextInt();
			for(j=0;j<n;j++)
				for(k=0;k<n;k++)
					a1[j][k]=in.nextInt();
			 row2=in.nextInt();
			for(j=0;j<n;j++)
				for(k=0;k<n;k++)		
					a2[j][k]=in.nextInt();
			ro1=row1-1;
			ro2=row2-1;
			
			for(k=0;k<n;k++){
					arr1[k]=a1[ro1][k];
					arr2[k]=a2[ro2][k];
			}		
			for(k=0;k<n;k++)				
				for(l=0;l<n;l++)
					if(arr1[k]==arr2[l])
					{
						count++;
						pos=k;
					}	
			if(count==1)
				System.out.println("Case #"+(i+1)+": "+arr1[pos]);
			else if(count>1)
				System.out.println("Case #"+(i+1)+": Bad magician! ");
			else
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");		
			
			
		}
    }
}

