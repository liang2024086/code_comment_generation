package methodEmbedding.Speaking_in_Tongues.S.LYD392;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kent.wangsawan
 */
public class soal1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine());
        for(int j = 0; j<tc; j++){
            String masuk = input.readLine();
            String ans = "";
            for(int i = 0; i< masuk.length(); i++){
                if(masuk.charAt(i)== 'y') ans += "a";
                else if(masuk.charAt(i)== 'n') ans += "b";
                else if(masuk.charAt(i)== 'f') ans += "c";
                else if(masuk.charAt(i)== 'i') ans += "d";
                else if(masuk.charAt(i)== 'c') ans += "e";
                else if(masuk.charAt(i)== 'w') ans += "f";
                else if(masuk.charAt(i)== 'l') ans += "g";
                else if(masuk.charAt(i)== 'b') ans += "h";
                else if(masuk.charAt(i)== 'k') ans += "i";
                else if(masuk.charAt(i)== 'u') ans += "j";
                else if(masuk.charAt(i)== 'o') ans += "k";
                else if(masuk.charAt(i)== 'm') ans += "l";
                else if(masuk.charAt(i)== 'x') ans += "m";
                else if(masuk.charAt(i)== 's') ans += "n";
                else if(masuk.charAt(i)== 'e') ans += "o";
                else if(masuk.charAt(i)== 'v') ans += "p";
                else if(masuk.charAt(i)== 'z') ans += "q";
                else if(masuk.charAt(i)== 'p') ans += "r";
                else if(masuk.charAt(i)== 'd') ans += "s";
                else if(masuk.charAt(i)== 'r') ans += "t";
                else if(masuk.charAt(i)== 'j') ans += "u";
                else if(masuk.charAt(i)== 'g') ans += "v";
                else if(masuk.charAt(i)== 't') ans += "w";
                else if(masuk.charAt(i)== 'h') ans += "x";
                else if(masuk.charAt(i)== 'a') ans += "y";
                else if(masuk.charAt(i)== 'q') ans += "z";
                else ans+=" ";
            }
            System.out.println("Case #"+(j+1)+": "+ans);
        }
    }
}
