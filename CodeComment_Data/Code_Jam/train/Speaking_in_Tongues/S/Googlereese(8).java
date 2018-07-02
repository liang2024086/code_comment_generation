package methodEmbedding.Speaking_in_Tongues.S.LYD668;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Googlereese {

	public static void main (String args[]){
		if (args.length != 1){
			System.out.println ("Gimme the right arguments!");
			return;
		}
		File f = new File(args[0]);
		int testcases;
		HashMap <Character, Character> dictionary = new HashMap <Character, Character> ();
		dictionary.put('q', 'z');
		dictionary.put('z', 'q');
	
		String goo="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String tra = "our language is impossible to understand";
		for (int i =0; i<goo.length(); i++){
			if (!dictionary.containsKey(goo.charAt(i))){
				dictionary.put(goo.charAt(i), tra.charAt(i));

			}
		}


		goo="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		tra = "there are twenty six factorial possibilities";
		for (int i =0; i<goo.length(); i++){
			if (!dictionary.containsKey(goo.charAt(i))){
				dictionary.put(goo.charAt(i), tra.charAt(i));

			}
		}

		goo="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		tra = "so it is okay if you want to just give up";
		for (int i =0; i<goo.length(); i++){
			if (!dictionary.containsKey(goo.charAt(i))){
				dictionary.put(goo.charAt(i), tra.charAt(i));

			}

		}

		try{
			BufferedReader in = new BufferedReader (new FileReader(f));
			String s;
			testcases = Integer.parseInt(in.readLine());
			for (int i = 1; i<=testcases; i++){
				s = in.readLine();
				String o = "";
				for (int j =0; j<s.length(); j++){
					char c = s.charAt(j);
					if (!dictionary.containsKey(c))
						o += 'h';
					else{
						o += dictionary.get(c);
					}
				}
				
				System.out.printf ("Case #%d: %s\n", i, o);


			}

			//while ((s = in.readLine()) != null){

			//}

		}
		catch (IOException e){

		}

	}

}
