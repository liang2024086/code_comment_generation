package methodEmbedding.Speaking_in_Tongues.S.LYD337;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SIT {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fstream = new FileInputStream("A-small-attempt0.in");

        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        strLine = br.readLine();
        int size = Integer.parseInt(strLine);
        ArrayList outputLine = new ArrayList();
        ArrayList inputLines = new ArrayList();
        for (int i = 0; i < size; i++) {
            inputLines.add(br.readLine());
            
        }
        br.close();

        for (int i = 0; i < size; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < inputLines.get(i).toString().length(); j++) {
                if (inputLines.get(i).toString().charAt(j) == 'y'){
                    temp.append('a');
                } else if (inputLines.get(i).toString().charAt(j) == 'n') {
                    temp.append('b');
                } else if (inputLines.get(i).toString().charAt(j) == 'f') {
                    temp.append('c');
                } else if (inputLines.get(i).toString().charAt(j) == 'i') {
                    temp.append('d');
                } else if (inputLines.get(i).toString().charAt(j) == 'c') {
                    temp.append('e');
                } else if (inputLines.get(i).toString().charAt(j) == 'w') {
                    temp.append('f');
                } else if (inputLines.get(i).toString().charAt(j) == 'l') {
                    temp.append('g');
                } else if (inputLines.get(i).toString().charAt(j) == 'b') {
                    temp.append('h');
                } else if (inputLines.get(i).toString().charAt(j) == 'k') {
                    temp.append('i');
                } else if (inputLines.get(i).toString().charAt(j) == 'u') {
                    temp.append('j');
                } else if (inputLines.get(i).toString().charAt(j) == 'o') {
                    temp.append('k');
                } else if (inputLines.get(i).toString().charAt(j) == 'm') {
                    temp.append('l');
                } else if (inputLines.get(i).toString().charAt(j) == 'x') {
                    temp.append('m');
                } else if (inputLines.get(i).toString().charAt(j) == 's') {
                    temp.append('n');
                } else if (inputLines.get(i).toString().charAt(j) == 'e') {
                    temp.append('o');
                } else if (inputLines.get(i).toString().charAt(j) == 'v') {
                    temp.append('p');
                } else if (inputLines.get(i).toString().charAt(j) == 'z') {
                    temp.append('q');
                } else if (inputLines.get(i).toString().charAt(j) == 'p') {
                    temp.append('r');
                } else if (inputLines.get(i).toString().charAt(j) == 'd') {
                    temp.append('s');
                } else if (inputLines.get(i).toString().charAt(j) == 'r') {
                    temp.append('t');
                } else if (inputLines.get(i).toString().charAt(j) == 'j') {
                    temp.append('u');
                } else if (inputLines.get(i).toString().charAt(j) == 'g') {
                    temp.append('v');
                } else if (inputLines.get(i).toString().charAt(j) == 't') {
                    temp.append('w');
                } else if (inputLines.get(i).toString().charAt(j) == 'h') {
                    temp.append('x');
                } else if (inputLines.get(i).toString().charAt(j) == 'a') {
                    temp.append('y');
                } else if (inputLines.get(i).toString().charAt(j) == 'q') {
                    temp.append('z');
                } else if (inputLines.get(i).toString().charAt(j) == ' ') {
                    temp.append(' ');
                } else if (inputLines.get(i).toString().charAt(j) == '\n') {
                    temp.append("");
                }
            }
            outputLine.add(temp.substring(0));
        }

        FileWriter fileWriter = new FileWriter("output");
        for(int k=0;k< size;k++){
            fileWriter.write("Case #" + (k+1) + ": " + outputLine.get(k));
			if(k+1 < size) fileWriter.write("\n");
        }
        fileWriter.close();
        
    }
}
