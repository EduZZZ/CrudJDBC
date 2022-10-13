
package br.com.loja_informatica.main;

import br.com.loja_informatica.Computador;
import br.com.loja_informatica.DAO.ComputadorDAO;

public class Main {
    public static void main (String [] args){
        
        Computador computador = new Computador();
        ComputadorDAO computadorDAO = new ComputadorDAO();
        
        computador.setHd("1TB");
        computador.setProcessador("i5 - 9100F");
        
        computadorDAO.save(computador);
        
       
        
        
        
    
           
    
    
    
    }
    
}
