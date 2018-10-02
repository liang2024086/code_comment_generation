package methodEmbedding.Standing_Ovation.S.LYD1945;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ITSU-CDS-LAPD
 */
public class PA {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File in= new File("aSmall.in");
        File out = new File("aSmall.out");
        FileWriter fw = new FileWriter(out,false);
        BufferedWriter bw = new BufferedWriter(fw); 
        
        Scanner leer = new Scanner(in);
        int n=leer.nextInt();
        int maxA;
        String lista;
        int contarParados;
        int personasFaltantes, personasFaltantesTotales;
        int personasActuales;
        int personasNecesarias;
        String salida="";
        
        for (int i = 0; i < n; i++) {
            maxA = leer.nextInt();
            lista = leer.next();
            contarParados = 0;
            personasFaltantes=0;
            personasActuales=0;
            personasFaltantesTotales=0;
            contarParados = lista.charAt(0)-48;
            for(int k=1;k<lista.length();k++){
                personasActuales = lista.charAt(k)-48;
                if(personasActuales==0)
                    continue;
                personasNecesarias = k;
                if(personasNecesarias<=contarParados){
                    contarParados += personasActuales;
                }else{
                    
                    personasFaltantes =personasNecesarias-contarParados;
                    personasFaltantesTotales +=personasFaltantes;
                    contarParados= contarParados + personasFaltantes + personasActuales;
                }
            }
            salida= "Case #"+ (i +1) +": " + personasFaltantesTotales ;
            bw.write(salida);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}


