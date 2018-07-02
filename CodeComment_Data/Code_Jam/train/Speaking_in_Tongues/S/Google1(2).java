package methodEmbedding.Speaking_in_Tongues.S.LYD58;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Google1 {
	public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("a","y");
        map.put("A","Y");
        
        map.put("b","h");
        map.put("B","H");
        
        map.put("c","e");
        map.put("C","E");
        
        map.put("d", "s");
        map.put("D", "S");
        
        map.put("e","o");
        map.put("E","O");
        
        map.put("f","c");
        map.put("F","C");
        
        map.put("g","v");
        map.put("G","V");
        
        map.put("h", "x");
        map.put("H", "X");
        
        map.put("i", "d");
        map.put("I", "D");
        
        map.put("j", "u");
        map.put("J", "U");
        
        map.put("k", "i");
        map.put("K", "I");
        
        map.put("l", "g");
        map.put("L", "G");
        
        map.put("m", "l");
        map.put("M", "L");
        
        map.put("n", "b");
        map.put("N", "B");
        
        map.put("o", "k");
        map.put("O", "K");
        
        map.put("p", "r");
        map.put("P", "R");
        
        map.put("q", "z");
        map.put("Q", "Z");
        
        map.put("r", "t");
        map.put("R", "T");
        
        map.put("s", "n");
        map.put("S", "N");
        
        map.put("t", "w");
        map.put("T", "W");
        
        map.put("u", "j");
        map.put("U", "J");
        
        map.put("v", "p");
        map.put("V", "P");
        
        map.put("w", "f");
        map.put("W", "F");
        
        map.put("x", "m");
        map.put("X", "M");
        
        map.put("y", "a");
        map.put("Y", "A");
        
        map.put("z", "q");
        map.put("Z", "Q");
        map.put(" ", " ");
        
        FileInputStream fstream = new FileInputStream("/tmp/input.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
                                
        FileWriter outStream = new FileWriter("/tmp/out.txt");
        BufferedWriter out = new BufferedWriter(outStream);
        
        int cases = Integer.parseInt(br.readLine());
        
        for(int i=0; i<cases; i++){
        		String l = br.readLine();
        		String decoded="";
        		
        		for(int j=0; j<l.length(); j++){
        			String c = String.valueOf(l.charAt(j));
        			decoded+=map.get(c);	        			
        		}
        		
                System.out.println("Case #"+(i+1)+": "+decoded);
                out.write("Case #"+(i+1)+": "+decoded+"\n");
                
        }
        out.close();
	}
}
