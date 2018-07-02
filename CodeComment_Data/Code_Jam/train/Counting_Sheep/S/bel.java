package methodEmbedding.Counting_Sheep.S.LYD981;

import java.util.*;


class bel {
 public static void main(String[] args)
 {
Scanner in = new Scanner(System.in);
 int n = Integer.parseInt(in.nextLine());
 int N,r ;
 boolean zero =false,one =false,two = false,three=false,four=false,five=false,six =false,seven=false,eight=false,nine=false;
 for(int j =0 ; j < n ; j++)
	 
	 {
		  N=Integer.parseInt(in.nextLine());
		  
		  int counter = 0;
		  if(N==0)
		  {
			  System.out.println("Case #" +(j+1)+": INSOMNIA");
		  }
		  else
		  {
			  int i =0;
			  while(true)
			  {
				   i++;
				   int temp = N*i;
				   int temp1 =  N*i;
			       while(temp>0)
		          {
			       r = temp%10;
				   switch(r)
				   {
					   case 0:zero=true;break;
					   case 1:one=true;break;
					   case 2:two=true;break;
					   case 3:three=true;break;
					   case 4:four=true;break;
					   case 5:five=true;break;
					   case 6:six=true;break;
					   case 7:seven=true;break;
					   case 8:eight=true;break;
					   case 9:nine=true;break;
					   
					   
				   }
				   
			       temp = temp/10;
		          }
				  
				  if(zero && one && two && three &&four && five &&six && seven && eight && nine)
				  {
					  System.out.println("Case #" +(j+1)+": "+temp1);
					  break;
				  }
			  }
			 
		  }
		  zero =false;
		  one =false;
		  two = false;
		  three=false;
		  four=false;
		  five=false;
		  six =false;
		  seven=false;
		  eight=false;
		  nine=false;
		  
		 
	 }
 
 }



}
