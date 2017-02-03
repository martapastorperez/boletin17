
package boletin17;


public class Boletin17 {

  
    public static void main(String[] args) {
        Numeros num=new Numeros();
        num.cargaArray();
        num.amosar();
        
        DAM dam1=new DAM();
        dam1.calcularAprobados();
        dam1.calcularSuspensos();
        dam1.notaMasAlta();
        dam1.notaMedia();
        dam1.visualizarAlumno();
        dam1.visualizarAprobados();
        dam1.ordenar();
        dam1.visualizar();
        
        
        DNI dni=new DNI();
        dni.NIF();
    }
    
}
