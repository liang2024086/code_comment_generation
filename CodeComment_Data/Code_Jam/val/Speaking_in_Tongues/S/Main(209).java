package methodEmbedding.Speaking_in_Tongues.S.LYD1673;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char charG[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char charE[]={'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

		File input = new File("input.txt");
		File output = new File("output.txt");
		if (!output.exists()){
			output.createNewFile();
			output.canWrite();
		}
		FileWriter fileWrite=new FileWriter(output, false);
		PrintWriter filePrint = new PrintWriter(fileWrite);
		try {

			Scanner sc = new Scanner(input);
			if (sc.hasNext()){

				int T=Integer.parseInt(sc.nextLine());
				if (T>30)
					T=30;
				if (T>0){
					for (int X=1; X<=T; X++){
						String G="";
						String S=sc.nextLine();

						int maxLength=S.length();
						if (S.length()>100)
							maxLength=100;

						for (int k=0; k<S.length(); k++){
							char c=S.charAt(k);
							if (c!=' '){
								int as=c;
								as=as-97;
								G=G+charE[as];	

							}
							else{
								G=G+" ";
							}
						}
						filePrint.printf("Case #"+X+": "+G+"\n");

					}

					filePrint.close();

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Done! Check out \"output.txt\" file!");
	}

}
