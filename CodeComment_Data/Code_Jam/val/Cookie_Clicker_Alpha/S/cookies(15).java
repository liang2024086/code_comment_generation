package methodEmbedding.Cookie_Clicker_Alpha.S.LYD544;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashu
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class cookies {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader br=new  BufferedReader(new FileReader("C:/uploads/B-small-attempt0.in"));

     BufferedWriter b=new BufferedWriter(new FileWriter("C:/uploads/result1.txt",false));


     int u=0;
     int gate=0;
     String s="";
     while(((s = br.readLine()) !=null)){
     if(u==0)
     {
     u++;continue;
     }

String s1[]=s.split(" ");
double c=Double.parseDouble(s1[0]);
double x=Double.parseDouble(s1[2]);
double p=2,f=Double.parseDouble(s1[1]);
double ctemp=c/p;

if(c>x){

    if(gate==0){
    b.write("case #"+u+": "+x/p);
    gate=1;
    }
    else{
        b.newLine();
    b.write("case #"+u+": "+x/p);
    }

}
else{
    double xtemp=x/p,xtemp2=0;
    p+=f;

    while(true){

xtemp2=(x/p)+ctemp;
ctemp+=c/p;
if(xtemp2>xtemp){
    if(gate==0){
    b.write("case #"+(u)+": "+xtemp);
    gate=1;
    }
    else{
        b.newLine();
    b.write("case #"+(u)+": "+xtemp);
    }
    break;
}
else{
xtemp=xtemp2;
p+=f;
}

}
        }
u++;
        }
b.flush();
b.close();
br.close();
    }
}
