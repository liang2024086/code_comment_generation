package methodEmbedding.Magic_Trick.S.LYD1078;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc;
		try{sc = new Scanner(new File("A-small-attempt1.in"));
		int size = sc.nextInt();
		sc.nextLine();
		for (int casenb = 1; casenb<=size;casenb++){
			System.out.print("Case #"+casenb+": ");
			int l1 = sc.nextInt();
					sc.nextLine();
			Set<Integer> set = new HashSet<Integer>();
			for(int i = 0; i<4;i++){
				if(i==l1-1){
					for(int j = 0; j<4;j++){
						int next = sc.nextInt();
						set.add(next);
					}
				}
				sc.nextLine();
			}

			int l2 = sc.nextInt();
			sc.nextLine();
			int res = 0;
			boolean badMagician = false;
			for(int i = 0; i<4;i++){
				if(i==l2-1){
					for(int j = 0; j<4;j++){
						int next = sc.nextInt();
						if(set.contains(next)){
							if(res!=0){
								badMagician = true;
							}
							res = next;
						}
					}
				}
				sc.nextLine();
			}

			if(badMagician){
				System.out.println("Bad magician!");
			}
			else if (res==0){
				System.out.println("Volunteer cheated!");
			}
			else
				System.out.println(res);		
		}
		}
		catch(NoSuchElementException | FileNotFoundException e){e.printStackTrace();}
	}

}
