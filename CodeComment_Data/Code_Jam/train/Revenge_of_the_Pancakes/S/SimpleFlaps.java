package methodEmbedding.Revenge_of_the_Pancakes.S.LYD442;

import java.io.*;
import java.util.*;
import java.math.*;
public class SimpleFlaps{



public static void main(String [] args) throws IOException{

Scanner st =null;
FileReader fr=null;
PrintWriter pr=null;
try{
fr = new FileReader("B-small-attempt2.in");
st = new Scanner(fr);
pr = new PrintWriter("B-small-out.out");
int T= st.nextInt();
for(int i=0;i<T;i++){
	String str = st.next();
	int sum=0;
	int flips=0;
	int [] arr=new int[str.length()];
	int c=0;
	for(char ct:str.toCharArray()){
		if(ct=='-') arr[c]=0;
		else arr[c]=1;
		c++;
	}

int ct=0;
int check=0;
for(int j=0;j<arr.length;j++){
if(j==0) check =arr[0];
else{
if(check==arr[j])
check=arr[j];
else{
ct+=1;
check=arr[j];
}

}
}
if(arr[arr.length-1]==0) ct+=1;

pr.println("Case #"+(i+1)+": "+ct);
//System.out.println(ct);
}
pr.close();
}
catch(Exception e){System.out.println(e);}
finally{

st.close();
fr.close();
pr.close();

}

}

}
