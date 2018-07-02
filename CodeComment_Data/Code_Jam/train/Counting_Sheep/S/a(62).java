package methodEmbedding.Counting_Sheep.S.LYD38;

import java.util.Scanner ;

class a  {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;

		long T = input.nextInt() ;
		long ans = 0 ;

		for(long t = 1 ; t <= T ; t++) {

			long digit[] = {-1 , -1 , -1 , -1 , -1 ,-1 , -1 , -1 , -1 , -1 } ;
			long N = input.nextInt() ;
			long tempN = N ;
			long idx = 0 ;
			long extra = 1;
			long tempIdx = 0 ;

			if(N!=0) {

				while(idx<10) {

					tempN = extra*N ; //new number
					ans = tempN ; //System.out.println("=========ans: "+ans+" , tempN: "+tempN+" , j*N: "+extra*N) ; 
					//set new number is answer 
					tempIdx = idx ; // record the next (don't have number yet) index 

					String nS = Long.toString(tempN) ; //loop equal number of digits - 1
					//System.out.println("Loop : "+nS+" times") ;
					for(int i=0 ; i<nS.length() - 1 ; i++) {
						if(idx<10 ) {
							for(int j=0 ; j<=tempIdx ; j++) {
								//System.out.println("tempN%%10 : "+tempN%10+" digit["+j+"] : "+digit[j] +" idx = "+idx) ;
								if(tempN%10==digit[j]) break ;
								else if(tempN%10!=digit[j] && digit[j]==-1) {
									digit[j] = tempN%10 ;																			
									idx++ ; 													
								}
								//System.out.println("--check each digit j: "+j+" , idx = "+ idx + " digit["+j+"] : "+digit[j]) ;
							}						
						}
						
						tempIdx = idx ;
						tempN = tempN/10 ;
					}
					//check last digit
					//System.out.println("+ last index") ;
					if(idx<10 ) {
						for(int j=0 ; j<=tempIdx ; j++) {
							//System.out.println("tempN%%10 : "+tempN%10+" digit["+j+"] : "+digit[j] +" idx = "+idx) ;
							if(tempN%10==digit[j]) break ;								
							else if(idx<10 && tempN%10!=digit[j] && digit[j]==-1) {
								digit[j] = tempN%10 ;										
								idx++ ; 												
							}
							//System.out.println("--check last indx j: "+j+" , idx = "+ idx + " digit["+j+"] : "+digit[j]) ;
						}
						
					} //System.out.println(" idx = "+ idx) ;
					extra++ ;					
				}
			}

			System.out.println("Case #"+t+": "+ (N != 0 ? ans : "INSOMNIA")) ;
		}
	}
}
