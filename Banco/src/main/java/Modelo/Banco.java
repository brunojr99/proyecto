
package Modelo;


public class Banco {
    private String RUC;
    private String nombre;
    private String direccion;
    private Cuenta[] cuentas;
    
   
 //   private int indice;

    public Banco(String RUC, String nombre, String direccion,int numCuentas) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new Cuenta[numCuentas];
        
       // this.indice = 0;
    }

    public String getRUC() {
        return RUC;
    }

   
    public String getNombre() {
        return nombre;
    }

   
    public String getDireccion() {
        return direccion;
    }

      /* public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
*/
    public Cuenta[] getCuentas() {
        return this.cuentas;
    }
  
    
    public boolean registrarCliente(Cliente cliente,int pos){
        this.cuentas[pos].setCliente(cliente);
        return true;
    }
    public Cuenta[] getCuentasporCliente(Cliente cliente){
       Cuenta[] temporal = new Cuenta[15]; 
       
       return cliente.getCuentas();
    }
    public boolean validarTarjeta(String numTarjeta,String documento,String clave){
        
        return false;
    }
}
