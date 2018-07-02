package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1025;


import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class RevengeofthePancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan ;
		final Formatter x;
		try{
			scan = new Scanner (new File("B-small-attempt0.in"));
			x = new Formatter ("salma.out");
			int t = scan.nextInt();
			for (int i=0 ; i<t ; i++){
				String word = scan.next();
				if (true){
					int arranged=0 , count=0;
					boolean sign=true;
					int head=0 , tail=word.length()-1;
					while(arranged<word.length()){
						if(sign==true){
							while(arranged<word.length() && word.charAt(tail)=='+'){
								tail--;
								arranged++;
							}
							if (arranged<word.length() && word.charAt(head)=='+'){
								count++;
								while(arranged<word.length() && word.charAt(head)=='+'){
									head++;
									arranged++;
								}
							}
							if (arranged<word.length() && word.charAt(head)=='-'){
								count++;
								while(arranged<word.length() && word.charAt(head)=='-'){
									head++;
									arranged++;
								}
								//swap
								int temp = head ;
								head = tail;
								tail = temp;
								sign = false;
							}
						}
						else {
							while(arranged<word.length() && word.charAt(tail)=='-'){
								tail++;
								arranged++;
							}
							if (arranged<word.length() && word.charAt(head)=='-'){
								count++;
								while(arranged<word.length() && word.charAt(head)=='-'){
									head--;
									arranged++;
								}
							}
							if (arranged<word.length() && word.charAt(head)=='+'){
								count++;
								while(arranged<word.length() && word.charAt(head)=='+'){
									head--;
									arranged++;
								}
								//swap
								int temp = head ;
								head = tail;
								tail = temp;
								sign = true;
							}
						}
					}
					x.format("Case #%d: %d\n",i+1,count);
					System.out.println(count);
				}
			}
			x.close();
		}
		catch(Exception e){
			System.out.println(e+"error");
		}
	

	}

}
