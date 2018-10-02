package methodEmbedding.Speaking_in_Tongues.S.LYD667;

import java.io.*;
import java.util.*;
import java.math.*;

public class SpeakingInTongues {
    
    public static void main (String args[]) throws Exception {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	scan.nextLine();
	for (int i = 1; i <= T; i++){
	    String line = scan.nextLine(), result = "";
	    for (int x = 0; x < line.length(); x++){
		char newb = line.charAt(x);
		if (newb == ' '){
		    result += " ";
		} else if (newb == 'a'){
		    result += "y";
		} else if (newb == 'b') {
		    result += "h";
		} else if (newb == 'c') {
		    result += "e";
		} else if (newb == 'd'){
		    result += "s";
		} else if (newb == 'e') {
		    result += "o";
		} else if (newb == 'f') {
		    result += "c";
		} else if (newb == 'g'){
		    result += "v";
		} else if (newb == 'h') {
		    result += "x";
		} else if (newb == 'i') {
		    result += "d";
		} else if (newb == 'j'){
		    result += "u";
		} else if (newb == 'k') {
		    result += "i";
		} else if (newb == 'l') {
		    result += "g";
		} else if (newb == 'm'){
		    result += "l";
		} else if (newb == 'n') {
		    result += "b";
		} else if (newb == 'o') {
		    result += "k";
		} else if (newb == 'p'){
		    result += "r";
		} else if (newb == 'q') {
		    result += "z";
		} else if (newb == 'r') {
		    result += "t";
		} else if (newb == 's'){
		    result += "n";
		} else if (newb == 't') {
		    result += "w";
		} else if (newb == 'u') {
		    result += "j";
		} else if (newb == 'v'){
		    result += "p";
		} else if (newb == 'w') {
		    result += "f";
		} else if (newb == 'x') {
		    result += "m";
		} else if (newb == 'y') {
		    result += "a";
		} else if (newb == 'z') {
		    result += "q";
		}
	    }
	    System.out.println("Case #" + i + ": " + result);
	}
    }
}
