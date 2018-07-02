package methodEmbedding.Speaking_in_Tongues.S.LYD447;


import java.util.Scanner;
import java.util.TreeMap;

public class A {

	public static void main(String[] args) {
		new A();
	}

	TreeMap<Character, Character> hm = new TreeMap<Character, Character>();

	public A() {
		hm.put('a', 'y');
		hm.put('b', 'h');
		hm.put('c', 'e');
		hm.put('d', 's');
		hm.put('e', 'o');
		hm.put('f', 'c');
		hm.put('g', 'v');
		hm.put('h', 'x');
		hm.put('i', 'd');
		hm.put('j', 'u');
		hm.put('k', 'i');
		hm.put('l', 'g');
		hm.put('m', 'l');
		hm.put('n', 'b');
		hm.put('o', 'k');
		hm.put('p', 'r');
		hm.put('r', 't');
		hm.put('s', 'n');
		hm.put('t', 'w');
		hm.put('u', 'j');
		hm.put('v', 'p');
		hm.put('w', 'f');
		hm.put('x', 'm');
		hm.put('y', 'a');
		hm.put('z', 'q');
		hm.put('q', 'z');
		
		Scanner sc = new Scanner(System.in);
		int cn=1;
		int num=Integer.valueOf(sc.nextLine());
		for(int n=0;n<=num;n++) {
			String line = sc.nextLine();

			System.out.print("Case #"+cn+": ");
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c != ' ') {
					System.out.print(hm.get(c));
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
cn++;
		}
		System.out.println(hm.size());
		for (Character key : hm.keySet()) {
			System.out.println("hm.put(\'" + key + "\',\'" + hm.get(key) + "');");

		}
	}
	/*
	 * 
	 * 
	 * 
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv

	 * 
	 * 
	 * 
	 * 
	 * 
	 * hm.put('a','y'); hm.put('b','h'); hm.put('c','e'); hm.put('d','s');
	 * hm.put('e','o'); hm.put('f','c'); hm.put('g','v'); hm.put('h','x');
	 * hm.put('i','d'); hm.put('j','u'); hm.put('k','i'); hm.put('l','g');
	 * hm.put('m','l'); hm.put('n','b'); hm.put('o','k'); hm.put('p','r');
	 * hm.put('r','t'); hm.put('s','n'); hm.put('t','w'); hm.put('u','j');
	 * hm.put('v','p'); hm.put('w','f'); hm.put('x','m'); hm.put('y','a');
	 * hm.put('z','q'); hm.put('q','z');
	 */
}
