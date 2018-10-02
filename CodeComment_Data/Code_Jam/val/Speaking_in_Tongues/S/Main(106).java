package methodEmbedding.Speaking_in_Tongues.S.LYD1485;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\fffbb\\workspace\\Qualification-A\\src\\input.txt");
        InputStreamReader istReader = new InputStreamReader(inputStream);
        BufferedReader buffReader = new BufferedReader(istReader);
        
        // T:?????????
        String tStr = buffReader.readLine();
        int t = Integer.valueOf(tStr);
        
        for(int i = 1; i <= t; i++) {
            System.out.print("Case #" + i + ": ");
            
            // G:??????
            String g = buffReader.readLine();
            
            StringBuilder sBuilder = new StringBuilder();
            
            for(int j = 0; j < g.length(); j++) {
                char c = g.charAt(j);
                
                switch(c) {
                case 'a': sBuilder.append('y');
                break;
                case 'b': sBuilder.append('h');
                break;
                case 'c': sBuilder.append('e');
                break;
                case 'd': sBuilder.append('s');
                break;
                case 'e': sBuilder.append('o');
                break;
                case 'f': sBuilder.append('c');
                break;
                case 'g': sBuilder.append('v');
                break;
                case 'h': sBuilder.append('x');
                break;
                case 'i': sBuilder.append('d');
                break;
                case 'j': sBuilder.append('u');
                break;
                case 'k': sBuilder.append('i');
                break;
                case 'l': sBuilder.append('g');
                break;
                case 'm': sBuilder.append('l');
                break;
                case 'n': sBuilder.append('b');
                break;
                case 'o': sBuilder.append('k');
                break;
                case 'p': sBuilder.append('r');
                break;
                case 'q': sBuilder.append('z');
                break;
                case 'r': sBuilder.append('t');
                break;
                case 's': sBuilder.append('n');
                break;
                case 't': sBuilder.append('w');
                break;
                case 'u': sBuilder.append('j');
                break;
                case 'v': sBuilder.append('p');
                break;
                case 'w': sBuilder.append('f');
                break;
                case 'x': sBuilder.append('m');
                break;
                case 'y': sBuilder.append('a');
                break;
                case 'z': sBuilder.append('q');
                break;
                case ' ': sBuilder.append(' ');
                break;
                }
            }
            
            System.out.print(sBuilder.toString());
            
            if(i != t)
                System.out.println();
        }
    }
}
