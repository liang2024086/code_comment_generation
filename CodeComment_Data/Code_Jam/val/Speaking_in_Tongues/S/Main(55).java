package methodEmbedding.Speaking_in_Tongues.S.LYD777;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int line_counter=0;
        Map<Object,String> mp=new HashMap<Object, String>();

        FileInputStream fstream;
        try {
            fstream = new FileInputStream("textfile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            FileWriter ostream = new FileWriter("output.txt");
            BufferedWriter out = new BufferedWriter(ostream);

            String strLine;
            while ((strLine = br.readLine()) != null)   {
            

            if(line_counter==0){
            }else{

                String new_string = "";
                for(int i = 0;i<strLine.length();i++){
                    
                char alphabet = strLine.charAt(i);
                switch(alphabet){
                    case 'a':
                        new_string = new_string+"y";
                        break;
                    case 'b':
                        new_string = new_string+"h";
                        break;
                    case 'c':
                        new_string = new_string+"e";
                        break;
                    case 'd':
                        new_string = new_string+"s";
                        break;
                    case 'e':
                        new_string = new_string+"o";
                        break;
                    case 'f':
                        new_string = new_string+"c";
                        break;
                    case 'g':
                        new_string = new_string+"v";
                        break;
                    case 'h':
                        new_string = new_string+"x";
                        break;
                    case 'i':
                        new_string = new_string+"d";
                        break;
                    case 'j':
                        new_string = new_string+"u";
                        break;
                    case 'k':
                        new_string = new_string+"i";
                        break;
                    case 'l':
                        new_string = new_string+"g";
                        break;
                    case 'm':
                        new_string = new_string+"l";
                        break;
                    case 'n':
                        new_string = new_string+"b";
                        break;
                    case 'o':
                        new_string = new_string+"k";
                        break;
                    case 'p':
                        new_string = new_string+"r";
                        break;
                    case 'q':
                        new_string = new_string+"z";
                        break;
                    case 'r':
                        new_string = new_string+"t";
                        break;
                    case 's':
                        new_string = new_string+"n";
                        break;
                    case 't':
                        new_string = new_string+"w";
                        break;
                    case 'u':
                        new_string = new_string+"j";
                        break;
                    case 'v':
                        new_string = new_string+"p";
                        break;
                    case 'w':
                        new_string = new_string+"f";
                        break;
                    case 'x':
                        new_string = new_string+"m";
                        break;
                    case 'y':
                        new_string = new_string+"a";
                        break;
                    case 'z':
                        new_string = new_string+"q";
                        break;
                    case ' ':
                        new_string = new_string+" ";
                        break;



                    
                }

                }
                out.write("\nCase #"+line_counter+": "+new_string);
                out.newLine();

            }


            line_counter = line_counter+1;
            }

            in.close();
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
