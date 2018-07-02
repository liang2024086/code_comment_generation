package methodEmbedding.Speaking_in_Tongues.S.LYD1273;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("A-small.out");
		/*BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
		FileWriter fw = new FileWriter("A-large.out");*/
                
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = new Integer(st.nextToken());
                char[] dic = new char[26];
                
                /*dic[0] = 'y';
                dic[1] = 'n';
                dic[2] = 'f';
                dic[3] = 'i';
                dic[4] = 'c';
                dic[5] = 'w';
                dic[6] = 'l';
                dic[7] = 'b';
                dic[8] = 'k';
                dic[9] = 'u';
                dic[10] = 'o';
                dic[11] = 'm';
                dic[12] = 'x';
                dic[13] = 's';
                dic[14] = 'e';
                dic[15] = 'v';
                dic[16] = 'z';
                dic[17] = 'p';
                dic[18] = 'd';
                dic[19] = 'r';
                dic[20] = 'j';
                dic[21] = 'g';
                dic[22] = 't';
                dic[23] = 'h';
                dic[24] = 'a';
                dic[25] = 'q';*/
                
                dic[0] = 'y';
                dic[1] =  'h';
                dic[2] =  'e';
                dic[3] =  's';
                dic[4] =  'o';
                dic[5] =  'c';
                dic[6] =  'v';
                dic[7] =  'x';
                dic[8] =  'd';
                dic[9] =  'u';
                dic[10] = 'i';
                dic[11] = 'g';
                dic[12] = 'l';
                dic[13] = 'b';
                dic[14] = 'k';
                dic[15] = 'r';
                dic[16] = 'z';
                dic[17] = 't';
                dic[18] = 'n';
                dic[19] = 'w';
                dic[20] = 'j';
                dic[21] = 'p';
                dic[22] = 'f';
                dic[23] = 'm';
                dic[24] = 'a';
                dic[25] = 'q';
                
                for(int i=0;i<N;i++){
                    String words = in.readLine();
                    String finalwords = "";
                    for(int j=0;j<words.length();j++){
                        char c = words.charAt(j);
                        if(c>=97 && c<=122){
                            finalwords+=dic[c-97];
                        }else{
                            finalwords+=c;
                        }
                    }
                    //System.out.println(finalwords);
                    
                    fw.write("Case #" + (i+1) + ": " + finalwords + "\n");
                }
                

		fw.flush();
		fw.close();
	}

}

