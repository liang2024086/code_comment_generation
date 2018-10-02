package methodEmbedding.Standing_Ovation.S.LYD1599;

import java.util.Scanner;
import java.io.*;



class ProbA{
   public static void main (String[] ar) throws Exception{
     
	  FileInputStream fi =new FileInputStream(ar[0]);
      Scanner sc=new Scanner(fi);
      int n=Integer.parseInt(sc.nextLine());


	for(int i=1;i<=n;i++){
    int smax = sc.nextInt();
	String sk = sc.nextLine().trim();
	//System.out.println(sk);
	//int levels = smax + 1;
	int minPerson = 0;
	int perPrevLevel = 0;
	//int total = 0 ;
   	for (int k =0 ;k<=smax; k++){
		int levePer = Character.getNumericValue(sk.charAt(k));
		// System.out.println(levePer);
		if( perPrevLevel < k ){
			minPerson++;
            perPrevLevel++;			
		}
		perPrevLevel+=levePer;	
	} 
	  
	  System.out.println("Case #"+i+": "+minPerson  ); 
	}  
 }
 

}
