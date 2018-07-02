package methodEmbedding.Speaking_in_Tongues.S.LYD1144;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
import java.io.*;
public class SpeakinginTongues
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            FileWriter output = new FileWriter("C:\\Users\\Joel\\Documents\\CSCI 221\\Netbeans Projects\\Google CodeJam\\src\\A-small-attempt1.out");
            BufferedWriter out = new BufferedWriter(output);
            FileReader reader = new FileReader("C:\\Users\\Joel\\Documents\\CSCI 221\\Netbeans Projects\\Google CodeJam\\src\\A-small-attempt1.in");
            BufferedReader in = new BufferedReader(reader);
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++)
            {
                StringBuilder googlerese = new StringBuilder(in.readLine());
                for (int j = 0; j < googlerese.length(); j++)
                {
                    switch (googlerese.charAt(j))
                    {
                        case 'a':
                            googlerese.setCharAt(j, 'y');
                            break;
                        case 'b':
                            googlerese.setCharAt(j, 'h');
                            break;
                        case 'c':
                            googlerese.setCharAt(j, 'e');
                            break;
                        case 'd':
                            googlerese.setCharAt(j, 's');
                            break;
                        case 'e':
                            googlerese.setCharAt(j, 'o');
                            break;
                        case 'f':
                            googlerese.setCharAt(j, 'c');
                            break;
                        case 'g':
                            googlerese.setCharAt(j, 'v');
                            break;
                        case 'h':
                            googlerese.setCharAt(j, 'x');
                            break;
                        case 'i':
                            googlerese.setCharAt(j, 'd');
                            break;
                        case 'j':
                            googlerese.setCharAt(j, 'u');
                            break;
                        case 'k':
                            googlerese.setCharAt(j, 'i');
                            break;
                        case 'l':
                            googlerese.setCharAt(j, 'g');
                            break;
                        case 'm':
                            googlerese.setCharAt(j, 'l');
                            break;
                        case 'n':
                            googlerese.setCharAt(j, 'b');
                            break;
                        case 'o':
                            googlerese.setCharAt(j, 'k');
                            break;
                        case 'p':
                            googlerese.setCharAt(j, 'r');
                            break;
                        case 'q':
                            googlerese.setCharAt(j, 'z');
                            break;
                        case 'r':
                            googlerese.setCharAt(j, 't');
                            break;
                        case 's':
                            googlerese.setCharAt(j, 'n');
                            break;
                        case 't':
                            googlerese.setCharAt(j, 'w');
                            break;
                        case 'u':
                            googlerese.setCharAt(j, 'j');
                            break;
                        case 'v':
                            googlerese.setCharAt(j, 'p');
                            break;
                        case 'w':
                            googlerese.setCharAt(j, 'f');
                            break;
                        case 'x':
                            googlerese.setCharAt(j, 'm');
                            break;
                        case 'y':
                            googlerese.setCharAt(j, 'a');
                            break;
                        case 'z':
                            googlerese.setCharAt(j, 'q');
                            break;
                    }
                }
                out.write("Case #" + (i+1) + ": " + googlerese.toString() + "\n");
            }
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("There seems to be some problem with your input. Please try again.");
        }
    }
}
