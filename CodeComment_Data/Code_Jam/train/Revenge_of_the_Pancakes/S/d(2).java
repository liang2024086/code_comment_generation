package methodEmbedding.Revenge_of_the_Pancakes.S.LYD94;

import java.io.*;
import java.util.Stack;

 class d {
	
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out=new PrintWriter(System.out,false);
	 //   PrintWriter out=new PrintWriter(new BufferedOutputStream(new FileOutputStream("r7.txt")), true);
	  
	String s = br.readLine();
    
    int t = Integer.parseInt(s);
    
    for(int j=0;j<t;j++)
    {
    Stack<String> s1 = new Stack<String>();
    
    Stack<String> s2 = new Stack<String>();
    
	String st= br.readLine();
    for(int i=0;i<st.length();i++)
    {
    	s1.push(st.charAt(i)+"");
    	
    }
    for(int i=0;i<st.length();i++)
    {
    	s2.push(s1.pop());
    	
    }
    cnt= 0;
	int size = s2.size();
	Stack<String> temp = new Stack<String>();
	for(int i=0;i<size;i++)
	{
		if(temp.size()>0)
		{
			if(temp.peek().equals("+") && s2.peek().equals("-"))
			{
				cnt+=2;
			}
		}
		
		String st2 = (String)s2.pop();
		if(i==0 && st2.equals("-"))
		cnt+=1;
		temp.push(st2);
	}	
		
		
	

    
	out.println("Case #"+(j+1)+": "+cnt);
	}
    out.close();
	}
static int cnt=0;
}
