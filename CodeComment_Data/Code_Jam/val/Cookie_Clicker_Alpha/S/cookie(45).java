package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1325;

import java.util.*;
import java.io.*;
public class cookie{
    public static void main(String[] args){
        try{
            File f = new File("B-small-attempt0.in");
            Scanner t = new Scanner(f);
            PrintWriter w = new PrintWriter("salida.txt"); 
            int casos = t.nextInt();
            t.nextLine();
            int cuenta = 1;
            while(cuenta <=casos){
                String str = t.nextLine();
                int esp = str.indexOf(' ');
                double C = Double.parseDouble(str.substring(0,esp));
                str=str.substring(esp+1,str.length());
                esp = str.indexOf(' ');
                double F = Double.parseDouble(str.substring(0,esp));
                str=str.substring(esp+1,str.length());
                double X = Double.parseDouble(str);
                boolean win=false;
                if(X<=2.0) {
                    double tiempo = X/2;
                    w.println("Case #"+cuenta+": "+tiempo);
                    win = true;
                }
                else if(X<=C){
                    double tiempo = X/2;
                    w.println("Case #"+cuenta+": "+tiempo);
                }else{

                    double va=2.0;
                    double tengo=0.0;
                    double tiempo=0.0;
                    double noCompro = 0.0;
                    double compro=0.0;
                    while(!win){
                        //inicio
                        if(va==2.0){
                            tiempo+=C/va;
                            tengo = C;
                            noCompro = (X-C)/va;
                            compro = X/(va+F);
                            if(compro<noCompro){
                                va+=F;
                                tiempo+=C/va;
                                tengo=C;
                            }else{
                                tiempo+=noCompro;
                                win=true;
                            }
                        }else{
                            noCompro = (X-tengo)/va;
                            compro = X/(va+F);
                            if(compro<noCompro){
                                va+=F;
                                tiempo+=C/va;
                                tengo=C;
                            }else{
                                tiempo+=noCompro;
                                win=true;
                            }
                        }

                    }
                    if(win)w.println("Case #"+cuenta+": "+tiempo);
                    
                }
                cuenta++;
            }
            

            t.close();
            w.close();
        }catch(Exception e){System.out.println("peta");}

    }
}
