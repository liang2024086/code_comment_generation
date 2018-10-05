package methodEmbedding.Standing_Ovation.S.LYD619;

import java.util.*;
import java.lang.*;
import java.io.*;


public class p1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\vikram\\Desktop\\A-small-attempt1.in"));
		PrintWriter pr=new PrintWriter("C:\\Users\\vikram\\Desktop\\A-small-attempt0out.txt");
		int t = Integer.parseInt(r.readLine());
		for(int j=1;j<=t;++j) {
		    String s[] = r.readLine().split(" ");
		    int sMax = Integer.parseInt(s[0]);
		    String aud = s[1];
		    int len = aud.length();
		    int arr[] = new int[len];
		    for(int i=0;i<len;++i) {
		        arr[i] = Integer.parseInt(String.valueOf(aud.charAt(i)));
		    }
		    int ans = 0;
		    int audNum = arr[0];
		    for(int i=1;i<sMax+1;++i) {
		        if(audNum>=i) {
		            audNum+=arr[i];
		        }
		        else {
		            ans++;
                    audNum++;
                    if(audNum>=i) {
		               audNum+=arr[i];
		            }
		        }
		    }
		    pr.println("Case #"+j+":"+" "+ans);
		}
		pr.close();
		r.close();
		
	}
}
