package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1356;

     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Ideone
    {
    public static void main (String[] args) throws java.lang.Exception
    {
    // your code goes here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(br.readLine());
    for(int i=1;i<=T;i++)
    {
    double C=0.0,F=0.0,X=0.0;
    int sp=0,ep=0,j;
    String temp=br.readLine()+" ";
    for(j=sp;j<temp.length();j++)
    {
    if(temp.charAt(j)==' ')
    {
    ep=j;
    C=Double.parseDouble(temp.substring(sp,ep));
    sp=ep+1;break;
    }
    }
    for(j=sp;j<temp.length();j++)
    {
    if(temp.charAt(j)==' ')
    {
    ep=j;
    F=Double.parseDouble(temp.substring(sp,ep));
    sp=ep+1;break;
    }
    }
    for(j=sp;j<temp.length();j++)
    {
    if(temp.charAt(j)==' ')
    {
    ep=j;
    X=Double.parseDouble(temp.substring(sp,ep));
    sp=ep+1;break;
    }
    }
    double pf=2.0,tt=0.0;
    boolean t=true;
    while(t)
    {
    double s=(C/pf)+(X/(pf+F));
    double p=X/pf;
    if(p>s)
    {
    tt+=C/pf;
    pf+=F;
    }
    else
    {
    tt+=X/pf;
    break;
    }
    }
    String z=String.format("%.7f",tt);
    System.out.println("Case #"+i+": "+z);
    }
    }
    }
