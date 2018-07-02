package methodEmbedding.Speaking_in_Tongues.S.LYD557;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class SpeakingInTongues {
    
    public static void main(String[] args) throws Exception {
        String abc = "abcdefghijklmnopqrstuvwxyz ";
        String cod = "ynficwlbkuomxsevzpdrjgthaq ";
        FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
        DataInputStream in = new DataInputStream(fstream);
        FileWriter stream = new FileWriter("out.txt");
        BufferedWriter out = new BufferedWriter(stream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        String traduccion="";
        //Read File Line By Line
        int n = Integer.parseInt(br.readLine());
        for(int j=0;j<n;j++){
            strLine = br.readLine();
            for(int i=0;i<strLine.length();i++){
                traduccion += abc.charAt(cod.indexOf(strLine.charAt(i)));
            }
            out.write("Case #"+(j+1)+": "+traduccion+'\n');
            out.newLine();
            traduccion="";
        }
        //Close the input stream
        in.close();
        out.close();
    }
}
