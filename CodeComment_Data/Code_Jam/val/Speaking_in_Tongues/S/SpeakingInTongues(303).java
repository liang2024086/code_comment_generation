package methodEmbedding.Speaking_in_Tongues.S.LYD172;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String [] args){
		FileInputStream fio = null;
		try{
			fio = new FileInputStream("A-small-attempt1.in");
		}catch(FileNotFoundException e){
			
		}
		
		//int k = 0;
		//String p = "";
		//while(ss.hasNextInt()){
			// k = ss.nextInt();
		//}
		//Scanner sss = new Scanner(fio);
		//while(ss.hasNextLine()){
	//		p = ss.nextLine();
		//}
		//System.out.println(k);
		//System.out.println(p);
		 
		//Scanner s = new Scanner(System.in);
		ArrayList lst = new ArrayList();
		Scanner ss = new Scanner(fio);
		int t = ss.nextInt();
		while(ss.hasNextLine()){
			//Sy-stem.out.println(ss.nextLine());
			lst.add(ss.nextLine());
		}
		System.out.println(t);
		lst.remove(0);
		System.out.println(lst);
		//Scanner s = new Scanner(System.in);
		String g = "";
		//int t = s.nextInt();
		if (t <= 0 || t >30){
			System.out.println("Sorry, invalid input value");
			System.exit(12);
		}
		else{
			//Scanner s2 = new Scanner(System.in);
			for(int i = 0;i < lst.size();i++){
				g = lst.get(0).toString();
				if(g.length() > 100){
					System.out.println("Sorry, invalid input value");
					System.exit(12);
				}
				else{
					//lst.add(g);
				}
					
			}
		}
		//System.out.println(lst);
		//ArrayList lstNew = new ArrayList();
		System.out.println();
		for(int i = 0; i < lst.size();i++){
			String val = lst.get(i).toString();
			//System.out.println(val);
			String phrase = "";
			for(int j = 0; j < val.length();j++){
				char getVal = val.charAt(j);
				//System.out.println(getVal);
				//Scanner reader = new Scanner(fio);
				if(getVal == 'A' || getVal == 'a'){
					phrase += 'y';
				}
				else if(getVal == 'A' || getVal == 'a'){
					phrase += 'y';
				}
				else if(getVal == 'B' || getVal == 'b'){
					phrase += 'h';
				}
				else if(getVal == 'C' || getVal == 'c'){
					phrase += 'e';
				}
				else if(getVal == 'D' || getVal == 'd'){
					phrase += 's';
				}
				else if(getVal == 'E' || getVal == 'e'){
					phrase += 'o';
				}
				else if(getVal == 'F' || getVal == 'f'){
					phrase += 'c';
				}
				else if(getVal == 'G' || getVal == 'g'){
					phrase += 'v';
				}
				else if(getVal == 'H' || getVal == 'h'){
					phrase += 'x';
				}
				else if(getVal == 'I' || getVal == 'i'){
					phrase += 'd';
				}
				else if(getVal == 'J' || getVal == 'j'){
					phrase += 'u';
				}
				else if(getVal == 'K' || getVal == 'k'){
					phrase += 'i';
				}
				else if(getVal == 'L' || getVal == 'l'){
					phrase += 'g';
				}
				else if(getVal == 'M' || getVal == 'm'){
					phrase += 'l';
				}
				else if(getVal == 'N' || getVal == 'n'){
					phrase += 'b';
				}
				else if(getVal == 'O' || getVal == 'o'){
					phrase += 'k';
				}
				else if(getVal == 'P' || getVal == 'p'){
					phrase += 'r';
				}
				else if(getVal == 'Q' || getVal == 'q'){
					phrase += 'z';
				}
				else if(getVal == 'R' || getVal == 'r'){
					phrase += 't'; 
				}
				else if(getVal == 'S' || getVal == 's'){
					phrase += 'n';
				}
				else if(getVal == 'T' || getVal == 't'){
					phrase += 'w';
				}
				else if(getVal == 'U' || getVal == 'u'){
					phrase += 'j';
				}
				else if(getVal == 'V' || getVal == 'v'){
					phrase += 'p';
				}
				else if(getVal == 'W' || getVal == 'w'){
					phrase += 'f';
				}
				else if(getVal == 'X' || getVal == 'x'){
					phrase += 'm';
				}
				else if(getVal == 'Y' || getVal == 'y'){
					phrase += 'a';
				}
				else if(getVal == 'Z' || getVal == 'z'){
					phrase += 'q';
				}
				else if(getVal == ' '){
					phrase += ' ';
				}
				/**
				while(reader.hasNextLine()){
					String a = reader.nextLine();
					System.out.println(getVal);
					if(a.substring(0, 1).equalsIgnoreCase("" + getVal)){
						phrase += a.substring(1, 2).toString();
					}
				}
				reader.reset();
				*/
				
				
			}
			//lstNew.add(phrase);
			System.out.println("Case #" + (i+1) + ": " + phrase);
			phrase = "";
			
		}
		//System.out.println(lstNew);
		
	}

}
