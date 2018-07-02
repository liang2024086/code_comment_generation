package methodEmbedding.Revenge_of_the_Pancakes.S.LYD464;

import java.util.Scanner;
class gj2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int joker=1;
        int t;
        t = sc.nextInt();
        while(joker<=t)
        {
        String input_s = sc.next();
        int len=input_s.length();
        int count=0;
        int minus=0;
        for(int i=0;i<input_s.length();i++)
        {
            if(input_s.charAt(i)=='-')
                minus++;
        }
        int index=0;
        if(len==minus)
            count=1;
        else {
	    for(int i=index;i<len;i++) {
		if(input_s.charAt(i)=='+' && input_s.charAt(0)=='-') {
		  count=count+1;
		  break;
		}
	      }
            for(int i = index;i<len-1;i++)
            {
                if(input_s.charAt(i)=='+' && input_s.charAt(i+1)=='-')
                    count+=2;
                    
            }
        }
        System.out.print("Case #"+joker+": "+count+"\n");
        joker++;
    }
    
}
}
