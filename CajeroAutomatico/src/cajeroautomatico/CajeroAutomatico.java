
package cajeroautomatico;

import models.Cliente;
import static models.Cliente.clientes;
import static models.Cliente.ingresarSaldo;
import static models.Cliente.retirarSaldo;


/**
 *
 * @author chanp
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
        //Clase explicita
        /*
       Cliente chabelo = new Cliente();
       chabelo.setNombre("Javier Lopez");
       chabelo.setNumeroCuenta("8888888888");
       chabelo.setSaldo(0.0);
       
        System.out.println(chabelo);
        
        //Clase implicita
        Cliente tarso = new Cliente("Ignacio Lopez", "7777777", 0.0);
        System.out.println(tarso);
        */
        clientes.add(new Cliente("Ignacio Lopez", "77777777", 0.0));
        clientes.add(new Cliente("Javier Lopez", "88888888", 0.0));
        
        System.out.println(clientes);
        
        ingresarSaldo(1, 100.00);
        System.out.println(clientes);
        ingresarSaldo(1, 70.00);
        System.out.println(clientes);
        
        System.out.println(retirarSaldo(1, 150.00));
        System.out.println(clientes);
        
        System.out.println(retirarSaldo(1, 50.00));
        System.out.println(clientes);
    }
    
}
