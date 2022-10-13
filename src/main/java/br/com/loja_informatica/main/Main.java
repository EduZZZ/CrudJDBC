
package br.com.loja_informatica.main;

import br.com.loja_informatica.Computador;
import br.com.loja_informatica.DAO.ComputadorDAO;

public class Main {
    public static void main (String [] args){
        
        //CREATE
        Computador computador = new Computador();
        ComputadorDAO computadorDAO = new ComputadorDAO();
        
        computador.setHd("1TB");
        computador.setProcessador("i7 - 9100F");
        computadorDAO.save(computador);
        
        //UPDATE
        Computador c1 = new Computador();
        c1.setProcessador("i3 - 2111i");
        c1.setHd("500gb");
        c1.setId(10);
        
        //computadorDAO.update(c1);
        
        //REMOVE
        //computadorDAO.deleteById(10);
        
        
        
        
        //READ
  
        for(Computador c : computadorDAO.getComputador()){
            System.out.println("Computador: "+c.getId()+" "+c.getProcessador()+" "+c.getHd());
        
        }
        
        
       
        
        
        
    
           
    
    
    
    }
    
}
