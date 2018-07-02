package methodEmbedding.Standing_Ovation.S.LYD1804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class A {
    public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	    int T = Integer.parseInt(br.readLine());
	    int testcase = 0;
	    while(testcase++ < T) {
		System.out.print("Case #"+testcase+": ");
		String[] line = br.readLine().split(" ");
		int smax = Integer.parseInt(line[0]);
		char[] charArr = line[1].toCharArray();
		int[] a = new int[smax+1];
		int i=0;
		for(char c: charArr)
		    a[i++] = Character.getNumericValue(c);
		
		int invites = 0;
		int audience = 0;
		if(a[0]==0) {
		    invites++;
		    audience++;
		} else 
		    audience = a[0];

		for(int j=1;j<a.length;j++) {
		    if(a[j]==0)
			continue;
		    if(audience<j) {
			int newInvites;
			newInvites = j-audience;
			invites += newInvites;
			audience = audience+newInvites+a[j];
		    } else {
			audience += a[j];
		    }

		    
		}

		System.out.println(invites);
		
	    }
	} catch(IOException e) {}
    }
}
