package methodEmbedding.Magic_Trick.S.LYD626;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base="/Users/gremillard999/Downloads/";
        String input=base + "A-small-attempt2.in";
        String output=base + "A-small-attempt2.out";
		
		try{
	        Scanner scan = new Scanner(new FileReader(input));
	        PrintWriter pw = new PrintWriter(output);
			int[] line1 = new int[4];
			int[] line2 = new int[4];
			int answer = 0;
			boolean bm= false;
			
			int cases = scan.nextInt();
			int one = 0;
			int two = 0;
			
			for(int i=1; i<=cases; i++){
				one = scan.nextInt();
				for(int x=0; x<one;x++)
					scan.nextLine();
				line1[0]=scan.nextInt();
				line1[1]=scan.nextInt();
				line1[2]=scan.nextInt();
				line1[3]=scan.nextInt();
				for(int x=one; x<=4; x++)
					scan.nextLine();
				
				for(int x=0; x<4; x++)
					System.out.print(line1[x] + " ");
					System.out.println();
				two = scan.nextInt();
				for(int x=0; x<two;x++)
					scan.nextLine();
				for(int y=0; y<4; y++){
					line2[y]=scan.nextInt();
					for(int z=0;z<4;z++){
						if(answer != 0 && line2[y]==line1[z])
							bm = true;
						if(line2[y]==line1[z])
							answer = line2[y];
					}
				}
				for(int x=two; x<=4; x++)
					scan.nextLine();
				
				for(int x=0; x<4; x++)
					System.out.print(line2[x] + " ");
					System.out.println();
				if(answer == 0)
					pw.println("Case #"+i+": Volunteer cheated!");
				else if(bm)
					pw.println("Case #"+i+": Bad magician!");
				else
					pw.println("Case #"+i+": "+answer);
				answer = 0;
				bm = false;
				//pw.println();
	            pw.flush();
	            //pw.close();
			}
		} catch(FileNotFoundException ex){
			Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

}
