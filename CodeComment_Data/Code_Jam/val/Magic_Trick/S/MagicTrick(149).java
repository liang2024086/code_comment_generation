package methodEmbedding.Magic_Trick.S.LYD1749;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class MagicTrick {

	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("m.txt", "UTF-8");
		String fichier = "A-small-attempt1.in.txt";
		Scanner scanner=new Scanner(new File(fichier));
		String line = scanner.nextLine();
		int nbCase = Integer.parseInt(line);
		int count = 0;
		while (count != nbCase){
			String l1 = scanner.nextLine();
		    String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			String line3 = scanner.nextLine();
			String line4 = scanner.nextLine();
			String[] arr;
			if (l1.equalsIgnoreCase("1"))
		    	 arr = line1.split(" "); 
		    else if (l1.equalsIgnoreCase("2"))
		    	arr = line2.split(" "); 
		    else if (l1.equalsIgnoreCase("3"))
		    	 arr = line3.split(" "); 
		    else
		    	 arr = line4.split(" "); 
			String l2 = scanner.nextLine();
			 line1 = scanner.nextLine();
			 line2 = scanner.nextLine();
			 line3 = scanner.nextLine();
			 line4 = scanner.nextLine();
			String[] arr2;
			if (l2.equalsIgnoreCase("1"))
		    	 arr2 = line1.split(" "); 
		    else if (l2.equalsIgnoreCase("2"))
		    	arr2 = line2.split(" "); 
		    else if (l2.equalsIgnoreCase("3"))
		    	 arr2 = line3.split(" "); 
		    else
		    	 arr2 = line4.split(" ");
			List<String> aList =  Arrays.asList(arr);
			List<String> bList =  Arrays.asList(arr2);
			int t =0;
			String val ="";
			for (int i= 0; i< aList.size();++i ){
				if (bList.contains(aList.get(i))){
					t++;
					val=aList.get(i);
				}
			}
			   count ++;
			   
			   
			if (t==0)
				writer.println("Case #"+count+": Volunteer cheated!");
			else if (t==1)
				writer.println("Case #"+count+": "+ val);
			else 
				writer.println("Case #"+count+": Bad magician!");
			  
			
			
			
			
		 
		}
		writer.close();
	}

}
