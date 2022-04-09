/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author 50683
 */
public class Ordenes {
    private String nombre_C;
    private String apellido_C;
    private int telefono_C;
    private String direccion;
    private int numero_O;
    Empleado miEmpleado;


    public Ordenes(String nombre_C, String apellido_C, int telefono_C, String direccion, int numero_O) {
        this.nombre_C = nombre_C;
        this.apellido_C = apellido_C;
        this.telefono_C = telefono_C;
        this.direccion = direccion;
        this.numero_O = numero_O;
        this.miEmpleado = new Empleado();
        
    }

    
    public Ordenes (){}
    
    public String getNombre_C() {
        return nombre_C;
    }

    public String getApellido_C() {
        return apellido_C;
    }

    public int getTelefono_C() {
        return telefono_C;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumero_O() {
        return numero_O;
    }


    public void setNombre_C(String nombre_C) {
        this.nombre_C = nombre_C;
    }

    public void setApellido_C(String apellido_C) {
        this.apellido_C = apellido_C;
    }

    public void setTelefono_C(int telefono_C) {
        this.telefono_C = telefono_C;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumero_O(int numero_O) {
        this.numero_O = numero_O;
    }

    
}
