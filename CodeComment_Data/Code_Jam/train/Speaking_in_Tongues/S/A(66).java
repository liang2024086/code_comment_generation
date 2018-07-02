package methodEmbedding.Speaking_in_Tongues.S.LYD670;

import java.text.*;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class A
{
	public static void main(String[] args) throws Exception
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());

		char[] arr = new char[26];
		arr[0] = 'y';
		arr[1] = 'n';
		arr[2] = 'f';
		arr[3] = 'i';
		arr[4] = 'c';
		arr[5] = 'w';
		arr[6] = 'l';
		arr[7] = 'b';
		arr[8] = 'k';
		arr[9] = 'u';
		arr[10] = 'o';
		arr[11] = 'm';
		arr[12] = 'x';
		arr[13] = 's';
		arr[14] = 'e';
		arr[15] = 'v';
		arr[16] = 'z';
		arr[17] = 'p';
		arr[18] = 'd';
		arr[19] = 'r';
		arr[20] = 'j';
		arr[21] = 'g';
		arr[22] = 't';
		arr[23] = 'h';
		arr[24] = 'a';
		arr[25] = 'q';
		
		char[] arr2 = new char[26];
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				if(i == arr[j] - 'a') {
					arr2[i] = (char) (j + 'a');
					break;
				}
			}
		}
		
		for(int t = 1; t <= T; t++) {
		
			System.out.print("Case #" + t + ": ");
			String str = br.readLine();
			String out = "";
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c == ' ') out += " ";
				else out += (arr2[(c - 'a')]);
			}
			System.out.println(out);
		}
		
	}
}
