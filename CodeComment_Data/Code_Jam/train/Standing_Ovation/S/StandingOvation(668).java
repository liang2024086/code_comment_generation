package methodEmbedding.Standing_Ovation.S.LYD996;

/* STANDING OVATION
Ci sono una serie di persone ad ogni spettacolo (linea) tutte con un livello "timidezza". Es la persona con livello i si alza solo quando si ? alzata
la persona con livello i-1. L'input ?:
- numero di casi;
- una linea con il primo numero indica il num n di persone, e gli altri numeri in sequenza indicano le n persone con livelli di timidezza da 0 a n.
  tale valore pu? essere 0 (e in caso dovr? aggiungere persone) o da 1 a 9
output:
- quante persone mi servono mancanti per effettuare una standing ovation

Limits
1 = T = 100.

Small dataset
0 = Smax = 6.

Large dataset
0 = Smax = 1000.
*/

import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class StandingOvation{
	
	public static void main(String[] args){
		//variables
		Scanner in=null;
		PrintWriter out=null;
		String s = new String();
		int cases=0, shylev, cur, tot=0, need=0;
		boolean flag;
		
		// Inizialize I/O files
		try {
			in = new Scanner(new File("A-small-attempt0.in"));
			out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
		} catch (IOException e){
			System.out.println("Impossible open input or output file");
			System.exit(1);
		}
		
		// Acquiring cases value
		try{
			cases = (int) in.nextInt();
			in.nextLine();
			if ( (cases<1) || (cases>100) ) throw new NoSuchElementException();
		} catch(NoSuchElementException e){
			System.out.println("The input file has an illegal cases value");
			System.exit(2);
		}
		
		//executing
		for (int i=0; i<cases; i++){
			
			//acquiring a line
			try{
				s = in.nextLine();
				if ( (s.length()<1) || (s.length()>9) ) throw new NoSuchElementException();
			} catch(NoSuchElementException e){
				System.out.println("There was a problem acquiring input, maybe the input file is corrupted.");
				System.exit(3);
			}
			
			//how many people have I to invite?
			shylev=s.charAt(0)-48;
			for (int j=0; j<=shylev; j++){
				cur=s.charAt(j+2)-48;
				
				if (j==0 && cur==0) need=tot=1;
				else{
					//System.out.println("pos: "+j+"tot: "+tot+"pos[x]: "+cur);
					if (cur>0){
						if ((j-tot)>0){
							need+=j-tot;
							tot+=j-tot+cur;
						}
						else tot+=cur;
					}
				}
			}
			
			//write results
			System.out.println("Case #"+(i+1)+": "+need);
			out.println("Case #"+(i+1)+": "+need);
			
			//resetting values
			need=tot=0;
			
			
		}
		
		//close i/o objects
		in.close();
		out.close();
	}
}
