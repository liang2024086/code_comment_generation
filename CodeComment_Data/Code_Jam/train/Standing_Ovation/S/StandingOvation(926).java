package methodEmbedding.Standing_Ovation.S.LYD1301;


import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();		
		for(int x=0; x<lines; x++){
			int smax = scanner.nextInt();
			String sstr = scanner.next();
			int[] sarray = new int[smax+1];
			if(smax+1 != sstr.length())
				System.out.println("Something wrong in input");
			for(int i=0; i<sstr.length(); i++){
				sarray[i] = Character.getNumericValue(sstr.charAt(i));				
			}
			int standing = sarray[0];
			int extrasNeeded = 0;
			for(int i=1; i<sarray.length; i++)
			{			
				//System.out.println("standing(i:"+i+"):"+standing);
				if(standing < i && sarray[i]>0){
					int temp = i-standing;
					extrasNeeded += temp;
					standing += temp + sarray[i];
				}else{
					standing += sarray[i];
				}
			}
			System.out.println("Case #"+(x+1)+": "+extrasNeeded);
		}
		scanner.close();
	}

}
