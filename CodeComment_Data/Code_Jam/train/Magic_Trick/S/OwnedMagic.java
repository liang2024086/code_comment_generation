package methodEmbedding.Magic_Trick.S.LYD1041;


import java.io.*;
import java.util.*;
public class OwnedMagic {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int numCases = scan.nextInt();
		for(int i=0; i<numCases;i++){
			int rowNum = scan.nextInt();
			ArrayList a = new ArrayList();
			for(int j=0; j<16; j++){
				int d = scan.nextInt();
				if(j>=4*(rowNum-1) && j<(4*rowNum)){
					a.add(d);
				}
			}
			int secondRowNum = scan.nextInt();
			ArrayList b = new ArrayList();
			for(int j=0; j<16; j++){
				int d = scan.nextInt();
				if(j>=4*(secondRowNum-1) && j<(4*secondRowNum)){
					b.add(d);
				}
			}
			a.retainAll(b);
			int y = i;
			y = y+1;
			if(a.size()==0){
				System.out.println("Case #"+y+": Volunteer cheated!");
			}
			else if(a.size()==1){
				System.out.println("Case #"+y+": " +a.get(0));
			}
			else
				System.out.println("Case #"+y+": Bad magician!");
		}
	}
}
