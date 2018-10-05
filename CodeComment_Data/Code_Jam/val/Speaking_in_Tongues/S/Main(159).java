package methodEmbedding.Speaking_in_Tongues.S.LYD674;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        String[] correspondance = {"y","h","e","s","o","c","v","x","d","u","i","g","l",
                                   "b","k","r","z","t","n","w","j","p","f","m","a","q"};

        //creation du flux d'entr??e fichier et ouverture du fichier input
        Scanner input = null;
        try{
            input = new Scanner(new FileReader("input.txt"));
        }catch(Exception ex){}

        //creation du flux de sortie fichier et ouverture du fichier output
        PrintWriter output = null;
        try{
            output = new PrintWriter(new FileWriter("output.txt"));
        }catch(Exception ex){}

        int T = input.nextInt();
        input.nextLine();
        String G;

        for(int i=1;i<=T;i++){
            G = input.nextLine();
            output.print("Case #"+i+": ");
            for(char c:G.toCharArray()){
                if(c!=' '){
                    output.print(correspondance[c-97]);
                }else{
                    output.print(c);
                }
            }
            output.println();
        }

        //fermeture du fichier input
        try{
           input.close();
        }
        catch(Exception e){}

        //fermeture du fichier output
        try{
           output.close();
        }
        catch(Exception e){}
    }

}
