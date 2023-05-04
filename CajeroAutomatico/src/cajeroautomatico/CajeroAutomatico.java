
package cajeroautomatico;

import models.Cliente;

/**
 *
 * @author chanp
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
        //Clase explicita
       Cliente chabelo = new Cliente();
       chabelo.setNombre("Javier Lopez");
       chabelo.setNumeroCuenta("8888888888");
       chabelo.setSaldo(0.0);
       
        System.out.println(chabelo);
        
        //Clase implicita
        Cliente tarso = new Cliente("Ignacio Lopez", "7777777", 0.0);
        System.out.println(tarso);
    }
    
}
