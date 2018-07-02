package methodEmbedding.Standing_Ovation.S.LYD210;

import java.io.*;
import java.util.*;
public class A {
    public static void main(String[] args)throws FileNotFoundException {
        int q=0; char t;
        String s[]=new String [0];//
        int d[],f[];//case; max shyness
        	File qq=new File("A-small-attempt0.in");
        	File ww=new File("A-small-attempt0.out");
        	Scanner x=new Scanner(qq);
        	PrintWriter lll=new PrintWriter(ww);
        	q=x.nextInt();
        	s=new String [q];
        	d=new int [q];
        	f=new int [q];
        	for(int i=0;i<q;i++){
        		f[i]=x.nextInt();
        		s[i]=x.nextLine();
        	}
        	x.close();
        for(int i=0;i<d.length;i++){
        	int e[]=new int [f[i]+1];
        	for(int o=0;o<e.length;o++){
				t=s[i].charAt(o+1);
        		e[o]=(int)t-48;
        	}
        	d[i]=e[0];
        	int dd=0;boolean ddd;
        	for(int o=1;o<e.length;o++){
        		ddd=false;
        		do{
        			if(o>(d[i]+dd)){
        				dd++;
        			}
        			else
        				ddd=true;
        		}while(!ddd);
        		d[i]+=e[o];
        	}
        	d[i]=dd;
        }
        	for(int i=0;i<d.length;i++)
        		lll.println("Case #"+(i+1)+": "+d[i]);
        	lll.close();
    }
}
