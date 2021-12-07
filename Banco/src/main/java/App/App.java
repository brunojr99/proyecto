
package App;

import Modelo.Banco;
import Modelo.Cajero;
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
        Cajero cajero1 = new Cajero("Cajero BCP","Av venezuela S/N");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        Cliente cliente1 = new Cliente("Bruno Jimenez","76353215","Calle Lerida S/N");
        Tarjeta tarjeta1= new Tarjeta("12354657",cliente1.getNombre(),478);
        Cuenta cuenta1 = new Cuenta("1255878561213",date,200);
        cuenta1.setCliente(cliente1);
        cuenta1.setTarjeta(tarjeta1);
        System.out.println(banco1.toString());
        System.out.println(cajero1.toString());
        System.out.println(cuenta1.toString());
        System.out.println(cliente1.toString());
        cuenta1.depositar(15);
        System.out.println(cuenta1.toString());
        Cliente cliente2 = new Cliente("Renzo Jimenez","76456115","Calle Lerida S/N");
        Tarjeta tarjeta2= new Tarjeta("123456657",cliente2.getNombre(),555);
        Cuenta cuenta2 = new Cuenta("12558789412213",date,1000);
        cuenta2.setCliente(cliente2);
        cuenta2.setTarjeta(tarjeta2);
        
        System.out.println(cuenta2.toString());
        System.out.println(cliente2.toString());
        cuenta2.retirar(50);
        System.out.println(cuenta2.toString());
        Cliente cliente3 = new Cliente("Angelo Jimenez","76452111","Calle Lerida S/N");
        Tarjeta tarjeta3= new Tarjeta("123456657",cliente2.getNombre(),555);
        Cuenta cuenta3 = new Cuenta("12558789412213",date,825);
        cuenta2.setCliente(cliente3);
        cuenta2.setTarjeta(tarjeta3);
        System.out.println(cuenta3.toString());
        System.out.println(cliente3.toString());
        cajero1.depositar(tarjeta3, cuenta3, 100);
        System.out.println(cuenta3);
        
        
}
}