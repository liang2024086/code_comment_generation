package methodEmbedding.Speaking_in_Tongues.S.LYD1231;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author S Shashank
 */

class A_SMALL {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        HashMap<Character, Character> english = new HashMap<Character, Character>();
        english.put('a', 'y');
        english.put('b', 'h');
        english.put('c', 'e');
        english.put('d', 's');
        english.put('e', 'o');
        english.put('f', 'c');
        english.put('g', 'v');
        english.put('h', 'x');
        english.put('i', 'd');
        english.put('j', 'u');
        english.put('k', 'i');
        english.put('l', 'g');
        english.put('m', 'l');
        english.put('n', 'b');
        english.put('o', 'k');
        english.put('p', 'r');
        english.put('q', 'z');
        english.put('r', 't');
        english.put('s', 'n');
        english.put('t', 'w');
        english.put('u', 'j');
        english.put('v', 'p');
        english.put('w', 'f');
        english.put('x', 'm');
        english.put('y', 'a');
        english.put('z', 'q');
        
        //open the file into a pointer
        FileInputStream inputStream = new FileInputStream("A-small-attempt3.in");
	DataInputStream in = new DataInputStream(inputStream);

	FileWriter outputStream = new FileWriter("A-small-output.out");

        int ch;
        int i = 0,j = 0;
        
        //save no. of test cases into no_test_cases
        int noOfTestCases = Integer.parseInt(in.readLine());

        String [] str = new String[noOfTestCases];
	str[i]="";
	outputStream.write("Case #"+(i+1)+": ");
        
         //while no_test_cases not equal to ZERO, loop
        while(i < noOfTestCases){
        //read character-by-character
            ch = inputStream.read();
	    if(ch == -1) break;
            
        //if space then add it to current string and 'continue'
            if((char)ch == ' '){
outputStream.write((char)ch);
                str[i] += (char)ch;
            }
        //if new-line then move to new output_string[] and 'continue'
            else if((char)ch == '\n'){
		outputStream.write((char)ch);
		
		i++;
		if(i<noOfTestCases){
		outputStream.write("Case #"+(i+1)+": ");
		str[i]="";
		}
            }
        //else map the character into "dictionary" to get required character
        //and add it to current string
            else{
//System.out.println("characterssss !!!"+english.get((char)ch));
try{outputStream.write(english.get((char)ch));}catch(Exception e){}
                str[i] += english.get((char)ch);
            }
        }
        outputStream.close();
        for(i=0;i<noOfTestCases;i++){
            System.out.println("Case #"+i+": "+str[i]);
        }
        //END
    }
}
