
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
       int contador=0;
       for(int i=0;i<this.cuentas.length;i++){
           if(this.cuentas[i].getCliente().getDocumento().equals(cliente.getDocumento())){
               temporal[contador]=this.cuentas[i];
               contador++;
               
           }
        }
       return temporal;
    }
    public boolean validarTarjeta(String numTarjeta,String documento,String clave){
        
        for(int i=0;i<this.cuentas.length;i++){
           if(this.cuentas[i].getTarjeta().getNumero().equals(numTarjeta)&&
                   this.cuentas[i].getCliente().getDocumento().equals(documento)
                   &&this.cuentas[i].getTarjeta().getClave().equals(clave)){
               return true;               
           }
        }
        return false;
    }
}
