package methodEmbedding.Magic_Trick.S.LYD1618;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author ETEC
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int T, primeiraEscolha, segundaEscolha;
        int[] primeiraLinhaEscolhida = new int[4];
        int[] segundaLinhaEscolhida = new int[4];
        
        int bateu = 0;
        int numeroQueBateu = 0;
        
        String linha;
        String[] linhaSeparada = new String[4];
        String nomeArq = "A-small-attempt1.in";
        //String nomeArqSaida="A.out";
        
        FileWriter arqSaida = new FileWriter("A.out");
        PrintWriter gravarArq = new PrintWriter(arqSaida);

        
        
        File arq = new File(nomeArq);
        
        try{
            FileReader reader = new FileReader(arq);
            BufferedReader leitor = new BufferedReader(reader);
            
            T = Integer.parseInt(leitor.readLine());
            
            for(int k=1; k<=T; k++){
                // primeija jogada
                primeiraEscolha = Integer.parseInt(leitor.readLine());
                for(int i=0; i<4; i++){
                    linha = leitor.readLine();
                    if(i == primeiraEscolha - 1){
                        linhaSeparada = linha.split(" ");
                        for(int j=0; j<4; j++){
                            primeiraLinhaEscolhida[j] = Integer.parseInt(linhaSeparada[j]);
                        }
                    }
                }
                
                // segunda jogada
                segundaEscolha = Integer.parseInt(leitor.readLine());
                for(int i=0; i<4; i++){
                    linha = leitor.readLine();
                    if(i == segundaEscolha - 1){
                        linhaSeparada = linha.split(" ");
                        for(int j=0; j<4; j++){
                            segundaLinhaEscolhida[j] = Integer.parseInt(linhaSeparada[j]);
                        }
                    }
                }
                
                // compara linhas
                for(int i=0; i<4; i++){
                    for(int j=0; j<4; j++){
                        if(primeiraLinhaEscolhida[i] == segundaLinhaEscolhida[j]){
                            bateu++;
                            numeroQueBateu = primeiraLinhaEscolhida[i];
                        }
                    }
                }
                
                
  
          
                    
                    
                    
                  if(bateu == 1){
                    gravarArq.println("Case #" +k+ ": " + numeroQueBateu);
                    //saida.("Case #" +k+ ": " + numeroQueBateu);
                    //System.out.println("Case #" +k+ ": " + numeroQueBateu);
                }else if(bateu == 0){
                    gravarArq.println("Case #" +k+ ": Volunteer cheated!");
                    //saida.format("Case #" +k+ ": Volunteer cheated!");
                    //System.out.println("Case #" +k+ ": Volunteer cheated!");
                }else{
                    gravarArq.println("Case #" +k+ ": Bad magician!");
                    //saida.format("Case #" +k+ ": Bad magician!");
                    //System.out.println("Case #" +k+ ": Bad magician!");
                }
                            
                            
                            
                            
                   
                    
                   
                
                
                
                
                
                
                
                bateu = 0;
            }
            arqSaida.close();
        }catch(Exception erro){
            System.out.println("Erro");
        }
        
    }
     
}
