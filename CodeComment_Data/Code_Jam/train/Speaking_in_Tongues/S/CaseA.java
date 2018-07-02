package methodEmbedding.Speaking_in_Tongues.S.LYD57;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CaseA {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1 = new File("E:\\new c++\\Google\\codejame 2011\\2012\\inputCodejame.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f1));
        int count = Integer.parseInt(reader.readLine());
        HashMap<Character,Character> map = new HashMap();
       // String input="ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv"; 
        //String output="ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
        String input="y n f i c w l b k u o m x s e v z p d r j g a t h a q set k oset xa ynfd";
        String output="a b c d e f g h i j k l m n o p q r s t u v y w x y z now i know my abcs";
        for (int i = 0; i < input.length(); i++) {
            if(!map.containsKey(input.charAt(i))){
            map.put(input.charAt(i), output.charAt(i));
            }
        }

        for (int i = 0; i < count; i++) {
            String line=reader.readLine();
            String lineOut="";
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j)==' '){
                    lineOut+=" ";
                }
                else if(!map.containsKey(line.charAt(j))){
                lineOut+=line.charAt(j);
                }
                else{
                    lineOut+=map.get(line.charAt(j));
                }   
            }
            System.out.println("Case #"+(i+1)+": "+lineOut);
        }
    }
}
