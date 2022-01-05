/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author USER
 */
public class Acompañante {
    private String documento;
    private String nombre;
    private String apellido;

    public Acompañante(String documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        String result = "Nombre: "+getNombre()+"\n"+
                        "Apellido: "+getApellido()+"\n"+
                        "Documento: "+getDocumento()+"\n"+
                        
                    "---------------------------------\n";
        return  result;
    }

    
    
    }

