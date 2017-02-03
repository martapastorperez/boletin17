
package boletin17;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class DAM {
     int []notas={1,5,3,9};
     int aprobados;
     int suspensos;
     String[]nomes={"Jesus","Araceli","Laura","Marta"};
     
    
      public void calcularAprobados(){
        for(int i=0; i<notas.length; i++)
            
            if (notas[i]>=5){
                aprobados++;
            }
        System.out.println("Aprobados: " +aprobados);
        
          
    }
    
    public void calcularSuspensos(){
        for(int i=0; i<notas.length; i++)
            
            if (notas[i]<5){
                suspensos++;
            }
        System.out.println("Suspensos: " +suspensos);
    }
    
    public void notaMedia(){
        int media = 0;
        for(int i=0; i<notas.length; i++)
            media = media+notas[i];
        
        System.out.println("Media:" +media/notas.length);
    }        
    
    public void notaMasAlta(){
        int alta = notas[0];
        
        for(int i=0; i<notas.length; i++)
            if(notas[i]>alta){
                alta = notas[i];
            }
        System.out.println("Nota más alta: "+alta);
    }
    public void visualizarAlumno(){
         String nome=JOptionPane.showInputDialog("Introduce nome:");
        for(int i=0;i<notas.length;i++){
            if(nomes[i].equals(nome))
              System.out.println("Alumno "+nomes[i]+" nota "+notas[i]);
        }   
        }
        public void visualizarAprobados(){
            for(int i=0;i<notas.length;i++){
                 if (notas[i]>=5){
                System.out.println("ALumno Aprobado "+nomes[i]);
            }
        }
        }
        
        public void ordenar(){
            int aux;
            String auxNome;
            for(int i=0;i<notas.length-1;i++){
                for(int j=i+1;j<notas.length;j++){
                   if( notas[i]>notas[j]){
                aux=notas[i];
                notas[i]=notas[j];
                notas[j]=aux;
                auxNome=nomes[i];
                nomes[i]=nomes[j];
                nomes[j]=auxNome;
                
            }
      
            }
            }
           
        }
        public void visualizar (){
            for(int i=0;i<notas.length;i++){
                System.out.println("Nombre " +nomes[i]+ " notas "+notas[i]);
            }
        }
}
    
   

    

