package methodEmbedding.Standing_Ovation.S.LYD1245;

/*T
4

Smax	{Smax+1 (length)}	String
4		5					11111			
							LEVEL 0	1 stands	1
							LEVEL 1 1 needs 1 	2
							LEVEL 2 1
							LEVEL 3 1
							LEVEL 4 1 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class StandingOvation{

	// test cases
	static int T;
	// Smax
	static int smax;
	// People
	static String people;
	// People standing & people needed
	static int standing;
	// Invite
	static int invite;
	
	public static void main(String[] args){
		File f = new File(args[0]);
		try{
			Scanner s = new Scanner(f);
			PrintWriter pw = new PrintWriter("output.txt", "utf-8");
			T = Integer.parseInt(s.next());
			int c = 1; // case number
			while(c <= T){
				smax = Integer.parseInt(s.next());
				people = s.next();
				invite = 0;
				standing = 0;
				for(int i = 0; i < people.length(); i++){
					if(i > standing){
						invite += i - standing;
						standing += (i - standing) + Integer.parseInt(""+people.charAt(i));
					}
					else{
						standing += Integer.parseInt(""+people.charAt(i));
					}
				}
				pw.println("Case #"+c+": "+invite);
				c++;
			}
			pw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}

}
