package methodEmbedding.Magic_Trick.S.LYD1183;

import java.util.Scanner;
import java.util.Arrays;

public class A
{


	public static void main( String args[] ) {
		
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		int[] first_arangement = new int[4];
		int[] second_arangement = new int[4];
		int first_answer;
		int second_answer;
		boolean[] check;
		
		//long start = System.nanoTime();
		//long end;
		
		for( int i=1; i<=cases; i++ ) {
			
			first_answer = in.nextInt()-1;
			
			for( int yy=0; yy<4; yy++ ) {	
				for( int xx=0; xx<4; xx++) {
					if( first_answer != yy ) {
						 in.nextInt();
					} else {
						first_arangement[xx] = in.nextInt();
					}	
				}
			}
			
			Arrays.sort( first_arangement  );
			//System.out.println( Arrays.toString(first_arangement));
			
			second_answer = in.nextInt()-1;
			
			for( int yy=0; yy<4; yy++ ) {	
				for( int xx=0; xx<4; xx++) {
					if( second_answer != yy ) {
						 in.nextInt();
					} else {
						second_arangement[xx] = in.nextInt();
					}	
				}
			}
			
			Arrays.sort( second_arangement );
			//System.out.println( Arrays.toString(second_arangement));
			
			int diff1 = first_arangement[0] - second_arangement[0];
			int diff2 = first_arangement[3] - second_arangement[3];
			
			if( first_arangement[0] > second_arangement[3] |  second_arangement[0] > first_arangement[3] )
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
				continue;
			}
			
			int number=0;
			boolean found;
			found=false;
			boolean bad;
			bad=false;
			
			for( int jj=0; jj<4;jj++ ) {
				if( first_arangement[jj] < second_arangement[0] ) {
					continue;
				}
			
				for( int kk=0; kk<4; kk++) {
					if( first_arangement[jj] == second_arangement[kk] ){
						if( found ){ bad=true; break; }
						found=true;
						number = first_arangement[jj];
						break;
					}
				}
				
				if(bad){System.out.println("Case #"+i+": Bad magician!");break;}
			}
			
			if(number==0){System.out.println("Case #"+i+": Volunteer cheated!");}
			else if(!bad){System.out.println("Case #"+i+": "+number);}
		
		}
	
		//System.out.println((System.nanoTime() - start ));
	
	}

}
