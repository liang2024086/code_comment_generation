package methodEmbedding.Cookie_Clicker_Alpha.S.LYD470;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (new BufferedInputStream(System.in));
		 
		 int caseNum=sc.nextInt(); 
	 
		 
		 int counter=1;
		 while(counter<=caseNum)
		 { 
			 double C=sc.nextDouble();	 
			 double F=sc.nextDouble();	 
			 double X=sc.nextDouble();	 
		 
			 
			 	 double shortestTime=0;
			 if(X<C)
			 {
			 		 shortestTime=X/2;
					// System.out.println("Case #"+counter+": "+shortestTime);//??????????6??
					 System.out.printf("Case #%d: %.7f\n",counter,shortestTime);//??????????6??
					 
			 }
//			 else if(F<2)
//			 {
//				 shortestTime=X/2;
//				 //System.out.println("Case #"+counter+": "+shortestTime);//??????????6??
//				 System.out.printf("Case #%d: %.7f\n",counter,shortestTime);//??????????6??
//			 }
			 
			 
			 
			 else//??F>2??
			 {
				 int N=0;
					
				 double deta=X/(2+F*N)-X/(2+F*(N+1));
				 double cost=C/(2+F*N);
					
				 double EC=cost;
				 while(cost<deta)
							{
								N++;
								deta=X/(2+F*N)-X/(2+F*(N+1));
								cost=C/(2+F*N);
								EC+=cost;
							}
//					System.out.println("N:"+N);
//					if((X/2)<(C/F))//?? ?????????????????? 
//					{
//						shortestTime=X/2;
//						// System.out.println("Case #"+counter+": "+shortestTime);//??????????6??
//						 System.out.printf("Case #%d: %.7f\n",counter,shortestTime);//??????????6??
//					}
//					else
//					{
						shortestTime=X/(2+F*N);
					
						 for(int i=0;i<N;i++)
						 {	 
							 shortestTime=shortestTime+(C/(2+F*i));
						 }
						 
						 System.out.printf("Case #%d: %.7f\n",counter,shortestTime);//??????????6??
					//}
					
					
					
			 }
			 
			 
		
		
		
		
		
		
			
			 counter++;
		 }
		
	}
	
 

}
