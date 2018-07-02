package methodEmbedding.Speaking_in_Tongues.S.LYD5;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Googl1 {

    
    public static void main(String[] args) throws IOException {
       int t;
       String input1;
       String output2 = "";
       String[] input2;
       File input=new File("C:\\Users\\Mimo\\Desktop\\A-small-attempt1.in");
            FileWriter output=new FileWriter("output.txt");
        BufferedWriter out = new BufferedWriter(output);
        Scanner getter = null;
        try {
            getter = new Scanner(input);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Googl1.class.getName()).log(Level.SEVERE, null, ex);
        }
        t=getter.nextInt();
        getter.nextLine();
         for(int i=1;i<=t;i++)
   {
       input1=getter.nextLine();
               input2=input1.split("");
               for(int j=1;j<=input1.length();j++)
               {
                            switch(input2[j].charAt(0))
           {
  case ('a'):
      output2=output2+"y";
    break;
    case('b'):
        output2=output2+"h";
    break;
    case('c'):
        output2=output2+"e";
    break;
    case('d'):
        output2=output2+"s";
    break;
    case('e'):
   output2=output2+"o";
    break;
    case('f'):
  output2=output2+"c";
    break;
    case('g'):
    output2=output2+"v";
    break;
    case('h'):
output2=output2+"x";
    break;
    case('i'):
output2=output2+"d";
    break;
    case('j'):
   output2=output2+"u";
    break;
    case('k'):
    output2=output2+"i";
    break;
    case('l'):
    output2=output2+"g";
    break;
    case('m'):
 output2=output2+"l";
    break;
    case('n'):
    output2=output2+"b";
    break;
    case('o'):
   output2=output2+"k";
    break;
    case('p'):
output2=output2+"r";
    break;
    case('q'):
    output2=output2+"z";
    break;
    case('r'):
    output2=output2+"t";
    break;
    case('s'):
   output2=output2+"n";
    break;
    case('t'):
    output2=output2+"w";
    break;
    case('u'):
    output2=output2+"j";
    break;
    case('v'):
   output2=output2+"p";
    break;
        case('w'):
   output2=output2+"f";
    break;
    case('x'):
    output2=output2+"m";
    break;
    case('y'):
  output2=output2+"a";
    break;
    case('z'):
    output2=output2+"q";
    break;
    default:
               output2=output2+" ";
               break;
           }
               }
       out.write("Case #"+i+": "+output2);
       out.newLine();
       output2="";
    }
         out.close();
}
}
