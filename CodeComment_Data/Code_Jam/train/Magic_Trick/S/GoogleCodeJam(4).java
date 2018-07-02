package methodEmbedding.Magic_Trick.S.LYD238;


import java.util.Scanner;

public class GoogleCodeJam {

	
	public static void main(String[] args){
		 
		int [][] card1;
		card1=new int[4][4];
		int [][] card2;
		card2=new int[4][4];
		
		int [] possible1;
		possible1=new int[4];
		int []possible2;
		possible2=new int[4];
		
		int ans1=0,ans2=0;
		String T;
		
		
		System.out.print("T= ");
		Scanner getT=new Scanner(System.in);
		T=getT.nextLine();
		
		int t=Integer.parseInt(T);
		
		for(int i=1; i<=t; i++) {
			
		//first answer + first arrangement
			Scanner getAnswer1=new Scanner(System.in);
			ans1=Integer.parseInt( getT.next() );
			
			Scanner getRows1=new Scanner(System.in);
			
			for(int z=0;z<4;z++)
			  {for(int j=0;j<4;j++)
			     { card1[z][j]=Integer.parseInt ( getT.next() );}
			  }
			
	   //second answer + second arrangement
			
			Scanner getAnswer2=new Scanner(System.in);
			
		
			ans2=Integer.parseInt( getT.next() );
			Scanner getRows2=new Scanner(System.in);
			
			for(int z=0;z<4;z++)
			  {for(int j=0;j<4;j++)
			     { card2[z][j]=Integer.parseInt ( getT.next() );}
			  }
			
		//Find the card:
			for(int j=0;j<4;j++)
			  { possible1[j]=card1[(ans1-1)][j];
			    possible2[j]=card2[(ans2-1)][j];
			  }
			
			int match=0;
			int right=0;
			for(int z=0;z<4;z++)
			 {for(int j=0;j<4;j++)
		    	{ 
				  if(possible1[z]==possible2[j])
				  {  match=match+1;
				      right=possible1[z];}
		    	}   
			 }
			
			
			if(match==0) {System.out.println("Case #"+i+": "+"Volunteer cheated!");}
			else if(match==1) {System.out.println("Case #"+i+": "+right);}
			else {System.out.println("Case #"+i+": "+"Bad magician!");}
				
		//Finish matching cards
			}
	//	}

		
	
    }
}
