
package App;

import Modelo.Banco;
import Modelo.Cliente;
import Modelo.Cuenta;
import Modelo.Tarjeta;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class App {
    
   
    public static void main(String[] args) {
        
        Banco banco1 = new Banco("1801115412","BCP","Av La Marina S/N",100);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        Cliente cliente1 = new Cliente("Bruno Jimenez","76353215","Calle Lerida S/N");
        Tarjeta tarjeta1= new Tarjeta("12354657",cliente1.getNombre(),478);
        Cuenta cuenta1 = new Cuenta("1255878561213",date);
        cuenta1.setCliente(cliente1);
        cuenta1.setTarjeta(tarjeta1);
        System.out.println(banco1.toString());
        System.out.println(cuenta1.toString());
        System.out.println(cliente1.toString());
}
}