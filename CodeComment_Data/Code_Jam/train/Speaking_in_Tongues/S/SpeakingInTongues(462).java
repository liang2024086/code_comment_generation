package methodEmbedding.Speaking_in_Tongues.S.LYD1560;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SpeakingInTongues {

	public static void main(String[] args){
		 File file = new File("tongues.txt");
	        BufferedReader reader = null;
	        int numberLines = 0;
	   	 char[] store = null;
	        int h=1;

	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String text = null;
       
	            for(int j=0;j<1;j++){
	            	text=reader.readLine();
	            	numberLines=Integer.parseInt(text);
	            }
	            while ((text = reader.readLine()) != null) { 
	   	            	store=text.toCharArray();

	            	for(int e=0;e<store.length;e++){	            			            	
	            	switch (store[e]) {
	            	case 'a': //System.out.println("case1");
	            		store[e]='y';
	            		break;
	            	case 'b': //System.out.println("case2");
	            		store[e]='h';
	            		break;
	            	case 'c': //System.out.println("case3");
		            	store[e]='e';
		            	break;
	            	case 'd': //System.out.println("case4");
		            	store[e]='s';
		            	break;
	            	case 'e': //System.out.println("case5");
		            	store[e]='o';
		            	break;
	            	case 'f': //System.out.println("case6");
		            	store[e]='c';
		            	break;
	            	case 'g': //System.out.println("case7");
		            	store[e]='v';
		            	break;
	            	case 'h': //System.out.println("case8");
		            	store[e]='x';
		            	break;
	            	case 'i': //System.out.println("case9");
		            	store[e]='d';
		            	break;
	            	case 'j': //System.out.println("case10");
		            	store[e]='u';
		            	break;
	            	case 'k': //System.out.println("case11");
		            	store[e]='i';
		            	break;
	            	case 'l': //System.out.println("case12");
		            	store[e]='g';
		            	break;
	            	case 'm': //System.out.println("case13");
		            	store[e]='l';
		            	break;
	            	case 'n': //System.out.println("case14");
		            	store[e]='b';
		            	break;
	            	case 'o': //System.out.println("case15");
		            	store[e]='k';
		            	break;
	            	case 'p': //System.out.println("case16");
		            	store[e]='r';
		            	break;
	            	case 'q': //System.out.println("case17");
		            	store[e]='z';
		            	break;
	            	case 'r': //System.out.println("case18");
		            	store[e]='t';
		            	break;
	            	case 's': //System.out.println("case19");
		            	store[e]='n';
		            	break;
	            	case 't': //System.out.println("case20");
		            	store[e]='w';
		            	break;
	            	case 'u': //System.out.println("case21");
		            	store[e]='j';
		            	break;
	            	case 'v': //System.out.println("case22");
		            	store[e]='p';
		            	break;
	            	case 'w': //System.out.println("case23");
		            	store[e]='f';
		            	break;
	            	case 'x': //System.out.println("case24");
		            	store[e]='m';
		            	break;
	            	case 'y': //System.out.println("case25");
		            	store[e]='a';
		            	break;
	            	case 'z': //System.out.println("case26");
		            	store[e]='q';
		            	break;		            		            	
	            	}
	            	}	            	
	            	String print=new String(store);
	            	System.out.println("Case #"+h+": "+print);
	            	h++;	            		
	            	}	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (reader != null) {
	                    reader.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }		
	}
}
