package methodEmbedding.Magic_Trick.S.LYD2061;


import java.util.Scanner;

public class MaigicCards{
	
	public static void main(String[] ards)
	{
	Scanner in = new Scanner(System.in);
	int[][] arr= new int[4][4];
	int t=0,k,l,num=0;
	int[][] array= new int[2][4];    
	int T,volans,n=0,i,j;
	T=in.nextInt();
	for(i=0;i<T;i++)
	{
	  t=0;
	  for(j=0;j<2;j++)
	  {
	   volans=in.nextInt();        
	   for(k=0;k<4;k++){
	     for(l=0;l<4;l++){
	       arr[k][l]=in.nextInt();
	     }
	    } 
	                  
	   for(k=0;k<4;k++)
	   {
	     array[t][k]=arr[volans-1][k];
	   }               
	   t++;  
	  }      
	   n=0;   
	   System.out.print("Case #"+(i+1)+": ");
	   for(k=0;k<4;k++)
	   {
	    for(l=0;l<4;l++)
	     {  
	      if(array[0][k]==array[1][l])
	        {
	        n++;num=array[0][k];              
	     }                  
	   }
	  }
	   if(n>1){
		   System.out.println("Bad magician!");      
	   }
	   else if(n==0){
		   System.out.println("Volunteer cheated!");   
	        }
	   else 
		   System.out.println(num);   
	 }
	}

	
	
}
