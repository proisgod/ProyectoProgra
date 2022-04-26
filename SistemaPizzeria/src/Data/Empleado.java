package Data;

public class Empleado {
    private String nombre_E;
    private String apellido_E;
    private int cedula_E;
    private String horario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int cedula, String horario) {
        this.nombre_E = nombre;
        this.apellido_E = apellido;
        this.cedula_E = cedula;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre_E;
    }

    public String getApellido() {
        return apellido_E;
    }

    public int getCedula() {
        return cedula_E;
    }

    public String getHorario() {
        return horario;
    }

    public void setNombre(String nombre) {
        this.nombre_E = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido_E = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula_E = cedula;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
