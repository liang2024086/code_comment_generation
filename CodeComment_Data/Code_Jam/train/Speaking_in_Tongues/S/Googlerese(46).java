package methodEmbedding.Speaking_in_Tongues.S.LYD293;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 *
 * @author rerngrak
 */
public class Googlerese {
    public static void main(String[] args) throws Exception {
        File input = new File("src/googlecodejam/A-small-attempt5.in");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
        //first line for number of line
        long row = Long.valueOf(reader.readLine());

        File file = new File("output.txt");
        Writer writer = new BufferedWriter(new FileWriter(file));

        for (long l=1;l<=row;l++){
            String line = reader.readLine();
            char[] in = line.toCharArray();
            char[] out = new char[100];
            for (int i=0;i<in.length;i++){
                     if (in[i]==' ')out[i]=' ';
                else if (in[i]== 'a')out[i]='y';
                else if (in[i]== 'b')out[i]='h';
                else if (in[i]== 'c')out[i]='e';
                else if (in[i]== 'd')out[i]='s';
                else if (in[i]== 'e')out[i]='o';
                else if (in[i]== 'f')out[i]='c';
                else if (in[i]== 'g')out[i]='v';
                else if (in[i]== 'h')out[i]='x';
                else if (in[i]== 'i')out[i]='d';
                else if (in[i]== 'j')out[i]='u';
                else if (in[i]== 'k')out[i]='i';
                else if (in[i]== 'l')out[i]='g';
                else if (in[i]== 'm')out[i]='l';
                else if (in[i]== 'n')out[i]='b';
                else if (in[i]== 'o')out[i]='k';
                else if (in[i]== 'p')out[i]='r';
                //*****
                else if (in[i]== 'q')out[i]='z';
                //*****
                else if (in[i]== 'r')out[i]='t';
                else if (in[i]== 's')out[i]='n';
                else if (in[i]== 't')out[i]='w';
                else if (in[i]== 'u')out[i]='j';
                else if (in[i]== 'v')out[i]='p';
                else if (in[i]== 'w')out[i]='f';
                else if (in[i]== 'x')out[i]='m';
                else if (in[i]== 'y')out[i]='a';
                //*****
                else if (in[i]== 'z')out[i]='q';
                //*****

            }
            String output = new String(out);
            
            System.out.println("Case #"+l+": "+output);
            String writeout = "Case #"+l+": "+output.trim() +"\n";
            writer.write(writeout);
        }
        reader.close();
        writer.close();
        }


    

}
