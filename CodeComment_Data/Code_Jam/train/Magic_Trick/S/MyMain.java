package methodEmbedding.Magic_Trick.S.LYD1487;

import java.io.*;

public class MyMain {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/Users/JinHao Chen/Desktop/A-small-attempt0.in");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s[] = new String[10];
		int totalGame = Integer.parseInt( br.readLine() );
		for ( int i = 0 ; i < totalGame ;i ++){
				//int gameNumber =  Integer.parseInt( br.readLine() );
			
				for ( int j = 0 ; j< 10 ; j++){
					s[j] = br.readLine();
				}
			int firstRow = Integer.parseInt(s[0]);
			int secondRow = Integer.parseInt(s[5]);
			
			String[]  first= s[firstRow].split(" ");
			String[]  second= s[5+secondRow].split(" ");
			
			int result = 0;
			String resultNumber="";
			for ( int j = 0 ; j< 4 ; j++){
				for (int k = 0 ; k< 4 ; k++){
					if ( first[j].equals(second[k])) { result++ ;  resultNumber = first[j];}
				}
			}
			if ( result == 1 ) System.out.println("Case #"+(i+1)+ ": "+resultNumber);
			if ( result >1 ) System.out.println("Case #"+(i+1)+ ": Bad magician!");
			if ( result ==0 ) System.out.println("Case #"+(i+1) +": Volunteer cheated!");
		}
	
	}

}
