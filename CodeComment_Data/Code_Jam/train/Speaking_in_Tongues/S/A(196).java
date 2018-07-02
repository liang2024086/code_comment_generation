package methodEmbedding.Speaking_in_Tongues.S.LYD672;


import java.util.*;
public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		char[] map = new char[256];
        for (int i = 0; i < map.length; i++) map[i] = i;
		map[' ']=' ';
		map['a']='y';
		map['b']='h';
		map['c']='e';
		map['d']='s';
		map['e']='o';
		map['f']='c';
		map['g']='v';
		map['h']='x';
		map['i']='d';
		map['j']='u';
		map['k']='i';
		map['l']='g';
		map['m']='l';
		map['n']='b';
		map['o']='k';
		map['p']='r';
		map['q']='z';
		map['r']='t';
		map['s']='n';
		map['t']='w';
		map['u']='j';
		map['v']='p';
		map['w']='f';
		map['x']='m';
		map['y']='a';
		map['z']='q';
		for (int i = 0; i < t; i++) {
			String line = s.nextLine();
			char[] ans = new char[line.length()];
			for (int j = 0; j < ans.length; j++) {
				ans[j] = map[line.charAt(j)];
			}
			System.out.printf("Case #%d: %s\n",i+1,new String(ans));
		}
	}
}
