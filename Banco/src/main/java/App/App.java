
package App;

import Modelo.Banco;
import Modelo.Cliente;
import Modelo.Cuenta;
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
        Cuenta cuenta1 = new Cuenta("1255878561213",date);
        Cliente cliente1 = new Cliente("Bruno Jimenez","76353215","Calle Lerida S/N");
        System.out.println(banco1.toString());
        
}
}