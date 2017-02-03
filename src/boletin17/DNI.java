
package boletin17;

import javax.swing.JOptionPane;


public class DNI {
     char []nif={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
     
public void NIF(){
    int dni=Integer.parseInt(JOptionPane.showInputDialog("Introduce DNI: "));
    int resto=dni%23;
   
              System.out.println("La letra de tu DNI: "+nif[resto]);
       
    }
}

     
     
     
     

