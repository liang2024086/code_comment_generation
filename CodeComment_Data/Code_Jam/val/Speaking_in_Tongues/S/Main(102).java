package methodEmbedding.Speaking_in_Tongues.S.LYD1314;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static String strLine = null;
    static String result = "_";
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("textfile.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            FileWriter ifstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(ifstream);


            int resultCounter = 0;
            // Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                if (resultCounter == 0) {
                    resultCounter = 1;
                    continue;
                }
                // Print the content on the console
                //st =
                //System.out.println(st.countTokens());
                StringTokenizer st = new StringTokenizer(strLine, " ");
                int count = st.countTokens();
                //System.out.println(count);
                String[] record = new String[st.countTokens()];
                for (int i = 0; i < count; i++) {
                    record[i] = st.nextToken();
                    //System.out.println(st.nextToken());
                    for(int k =0; k<record[i].length();k++){
                           char c = record[i].charAt(k);
                           switch (c){
                               case 'a':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "y";
                               }
                                  else {
                                 result = result +"y";
                                 }
                           break;
                               }
                               case 'b':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "h";
                               }
                                  else {
                                 result = result +"h";
                                 }
                           break;
                               }
                               case 'c':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "e";
                               }
                                  else {
                                 result = result +"e";
                                 }
                           break;
                               }
                                   case 'd':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "s";
                               }
                                  else {
                                 result = result +"s";
                                 }
                           break;
                               }
                                     
                                       case 'e':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "o";
                               }
                                  else {
                                 result = result +"o";
                                 }
                           break;
                               }
                                         case 'f':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "c";
                               }
                                  else {
                                 result = result +"c";
                                 }
                           break;
                               }

                                                 case 'g':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "v";
                               }
                                  else {
                                 result = result +"v";
                                 }
                           break;
                               }

                                                         case 'h':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "x";
                               }
                                  else {
                                 result = result +"x";
                                 }
                           break;
                               }

                                                         case 'i':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "d";
                               }
                                  else {
                                 result = result +"d";
                                 }
                           break;
                               }

                                                         case 'j':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "u";
                               }
                                  else {
                                 result = result +"u";
                                 }
                           break;
                               }
 case 'k':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "i";
                               }
                                  else {
                                 result = result +"i";
                                 }
                           break;
                               }
  case 'l':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "g";
                               }
                                  else {
                                 result = result +"g";
                                 }
                           break;
                               }
  case 'm':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "l";
                               }
                                  else {
                                 result = result +"l";
                                 }
                           break;
                               }

    case 'n':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "b";
                               }
                                  else {
                                 result = result +"b";
                                 }
                           break;
                               }
      case 'o':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "k";
                               }
                                  else {
                                 result = result +"k";
                                 }
                           break;
                               }
       case 'p':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "r";
                               }
                                  else {
                                 result = result +"r";
                                 }
                           break;
                               }
        case 'q':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "z";
                               }
                                  else {
                                 result = result +"z";
                                 }
                           break;
                               }
         case 'r':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "t";
                               }
                                  else {
                                 result = result +"t";
                                 }
                           break;
                               }
          case 's':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "n";
                               }
                                  else {
                                 result = result +"n";
                                 }
                           break;
                               }
           case 't':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "w";
                               }
                                  else {
                                 result = result +"w";
                                 }
                           break;
                               }
            case 'u':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "j";
                               }
                                  else {
                                 result = result +"j";
                                 }
                           break;
                               }
             case 'v':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "p";
                               }
                                  else {
                                 result = result +"p";
                                 }
                           break;
                               }
              case 'w':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "f";
                               }
                                  else {
                                 result = result +"f";
                                 }
                           break;
                               }
               case 'x':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "m";
                               }
                                  else {
                                 result = result +"m";
                                 }
                           break;
                               }
                case 'y':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "a";
                               }
                                  else {
                                 result = result +"a";
                                 }
                           break;
                               }
                 case 'z':{
                                 //  record[i].replace(,'y');
                               if(result.equals("_")){
                                 result = "q";
                               }
                                  else {
                                 result = result +"q";
                                 }
                           break;
                               }
                        }
                    }
                    result = result+" ";
                }
                 
                      
                  
//                for (int i = count - 1; i >= 0; i--) {
//                    if (result.equals("_")) {
//                        result = record[i];
//                    } else {
//                        result = result + " " + record[i];
//                    }
//                }
                String output = "Case #" + resultCounter + ": " + result + "\n";
                System.out.println("Case #" + resultCounter + ": " + result);
                try {
                    // Create file
                    out.write(output);
                    //Close the output stream

                } catch (Exception e) {//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                }
                result = "_";
                resultCounter++;
            }

            //System.out.println("Case 1:"+  result);
            in.close();
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}
