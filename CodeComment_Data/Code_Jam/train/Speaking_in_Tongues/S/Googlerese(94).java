package methodEmbedding.Speaking_in_Tongues.S.LYD726;


import java.io.*;

public class Googlerese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "";
		int num = 0;
		 try {
		      //use buffering, reading one line at a time
		      //FileReader always assumes default encoding is OK!
		      BufferedReader input =  new BufferedReader(new FileReader("input.in"));
		      try {
		        String line = null; //not declared within while loop
		        /*
		        * readLine is a bit quirky :
		        * it returns the content of a line MINUS the newline.
		        * it returns null only for the END of the stream.
		        * it returns an empty String if two newlines appear in a row.
		        */
//		        System.out.println("Case #1: our language is impossible to understand");
//		        System.out.println("Case #2: there are twenty six factorial possibilities");
//		        System.out.println("Case #3: so it is okay if you want to just give up");

		        while (( line = input.readLine()) != null){
		        	//System.out.println(line);
		        	
		        	for (int i = 0; i < line.length(); i++) {
		        		Character character = line.charAt(i);
		        		if (character == ' ')
		        			string += ' ';
		        		else if (character == 'a')
		        			string += 'y';
		        		else if (character == 'b')
		        			string += 'h';
		        		else if (character == 'c')
		        			string += 'e';
		        		else if (character == 'd')
		        			string += 's';
		        		else if (character == 'e')
		        			string += 'o';
		        		else if (character == 'f')
		        			string += 'c';
		        		else if (character == 'g')
		        			string += 'v';
		        		else if (character == 'h')
		        			string += 'x';
		        		else if (character == 'i')
		        			string += 'd';
		        		else if (character == 'j')
		        			string += 'u';
		        		else if (character == 'k')
		        			string += 'i';
		        		else if (character == 'l')
		        			string += 'g';
		        		else if (character == 'm')
		        			string += 'l';
		        		else if (character == 'n')
		        			string += 'b';
		        		else if (character == 'o')
		        			string += 'k';
		        		else if (character == 'p')
		        			string += 'r';
		        		else if (character == 'q') //q 
		        			string += 'z';
		        		else if (character == 'r')
		        			string += 't';
		        		else if (character == 's')
		        			string += 'n';
		        		else if (character == 't')
		        			string += 'w';
		        		else if (character == 'u')
		        			string += 'j';
		        		else if (character == 'v')
		        			string += 'p';
		        		else if (character == 'w')
		        			string += 'f';
		        		else if (character == 'x') 
		        			string += 'm';
		        		else if (character == 'y') 
		        			string += 'a';
		        		else if (character == 'z') //qz
		        			string += 'q';
		        		
		    		
		        	}
		        	System.out.print("Case #" + num + ": ");
		        		System.out.println(string);
		        		num++;
		        		string = "";
		        }
		        
		      }
		      finally {
		        input.close();
		      }
		    }
		    catch (IOException ex){
		      ex.printStackTrace();
		    }
	}

}
